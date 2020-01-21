package thesurveymanager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import thesurveymanager.screens.*;

public class UserInterface {
    private static InitialScreen initial_screen;
    private static AdmScreen adm_screen;
    private static QuestionScreen question_screen;
    private static ResultsScreen results_screen;
    private static QuestionMenuScreen question_menu_screen;
    private static HistoryScreen history_screen;
    private static AddQuestionScreen add_question_screen;
    private static RemoveQuestionScreen remove_question_screen;
    private static ChangeAlternativeScreen change_alternative_screen;
    private static RemoveAnswerScreen remove_answer_screen;
    private static AdmPassScreen adm_pass_screen;
    
    public static void init() {
        initialScreen();
        
        ActionListener garbage_truck = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Garbage truck is working");
                if(initial_screen != null && !initial_screen.isVisible()) {
                   initial_screen = null;
                }
                if(adm_screen != null && !adm_screen.isVisible()) {
                    adm_screen = null;
                }
                if(question_screen != null && !question_screen.isVisible()) {
                    question_screen = null;
                }
                if(results_screen != null && !results_screen.isVisible()) {
                    results_screen = null;
                }
                if(question_menu_screen != null && !question_menu_screen.isVisible()) {
                    question_menu_screen = null;
                }
                if(history_screen != null && !history_screen.isVisible()) {
                    history_screen = null;
                }
                if(add_question_screen != null && !add_question_screen.isVisible()) {
                    add_question_screen = null;
                }
                if(remove_question_screen != null && !remove_question_screen.isVisible()) {
                    remove_question_screen = null;
                }
                if(change_alternative_screen != null && !change_alternative_screen.isVisible()) {
                    change_alternative_screen = null;
                }
                if(remove_answer_screen != null && !remove_answer_screen.isVisible()) {
                    remove_answer_screen = null;
                }
                System.gc();
            }
        };
        
        Timer t = new Timer(30000,garbage_truck); 
        t.start();
    }
    public static void initialScreen() {
        if(initial_screen == null) {
            initial_screen = new InitialScreen();
        }
        
        initial_screen.setVisible(true);
    }
    
    public static void admScreen() {
        if(adm_screen == null) {
            adm_screen = new AdmScreen();
        }
        
        adm_screen.setVisible(true);
    }
    
    public static void beginSurvey() {
        if(TheSurveyManager.selected_survey.questions.size() <= 0) {
            System.out.println("There's no questions registered");
            initialScreen();
        }
        else {
            question_screen = new QuestionScreen(TheSurveyManager.selected_survey.questions.get(0), new Answer());
            question_screen.setVisible(true);
        }
    }
    
    public static void nextQuestion() {
       TheSurveyManager.selected_survey.questions.forEach(q -> {
           if(q.getId() == question_screen.getQuestion().getId()) {
               q.addAnswer(question_screen.getSelected());
           }
       });
        
        if(TheSurveyManager.selected_survey.questions.indexOf(question_screen.getQuestion()) == TheSurveyManager.selected_survey.questions.size() - 1) {
            TheSurveyManager.selected_survey.saveAnswer(question_screen.getAnswer());
            initialScreen();
        }
        else {
            question_screen = new QuestionScreen(TheSurveyManager.selected_survey.questions.get(TheSurveyManager.selected_survey.questions.indexOf(question_screen.getQuestion()) + 1),question_screen.getAnswer());
            question_screen.setVisible(true);
        }
    }
    
    public static void resultsScreen() {
        if(results_screen == null) {
            results_screen = new ResultsScreen();
        }
        
        results_screen.setVisible(true);
    }
    
    public static void questionMenuScreen() {
        if(question_menu_screen == null) {
            question_menu_screen = new QuestionMenuScreen();
        }
        
        question_menu_screen.setVisible(true);
    }
    
    public static void history() {
        if(history_screen == null) {
            history_screen = new HistoryScreen();
        }
        
        history_screen.setVisible(true);
    }
    
    public static void addQuestionScreen() {
        if(add_question_screen == null) {
            add_question_screen = new AddQuestionScreen();
        }
        
        add_question_screen.setVisible(true);
    }
    public static void confirmAddQuestion() {
        TheSurveyManager.selected_survey.addQuestion(add_question_screen.message, add_question_screen.a, add_question_screen.b, add_question_screen.c, add_question_screen.d, add_question_screen.e);
        questionMenuScreen();        
    }
    
    public static void removeQuestionScreen() {
        if(remove_question_screen == null) {
            remove_question_screen = new RemoveQuestionScreen();
        }
        
        remove_question_screen.setVisible(true);
    }
    public static void confirmRemoveQuestion() {
        TheSurveyManager.selected_survey.removeQuestion(remove_question_screen.id);
        questionMenuScreen();
    }
    
    
    public static void changeAlternativeScreen() {
        if(change_alternative_screen == null) {
            change_alternative_screen = new ChangeAlternativeScreen();
        }
        
        change_alternative_screen.setVisible(true);
    }
    
    public static void confirmChangeAlternative() {
        TheSurveyManager.selected_survey.changeAlternative(change_alternative_screen.question_id, change_alternative_screen.alt_id, change_alternative_screen.new_alternative);
        questionMenuScreen();
    }
    
    public static void removeAnswerScreen() {
        if(remove_answer_screen == null) {
            remove_answer_screen = new RemoveAnswerScreen();
        }
        
        remove_answer_screen.setVisible(true);
    }
    public static void confirmRemoveAnswer() {
        TheSurveyManager.selected_survey.removeAnswer(remove_answer_screen.id);
        history();
    }
    
    public static void admPassScreen() {
        if(adm_pass_screen == null) {
            adm_pass_screen = new AdmPassScreen();
        }
        
        adm_pass_screen.setVisible(true);
    }
   
    public static void closeOperation(JFrame frame) {
        WindowListener exitListener = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                int confirm = JOptionPane.showOptionDialog( 
                    null, 
                    "Tem certeza de que deseja encerrar o programa?",
                    "Encerrar o Programa", 
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE, 
                    null, 
                    null, 
                    null
                );
                if (confirm == 0) {
                    TheSurveyManager.saveOperation();
                    System.exit(0);
                }
            }
        };
        frame.addWindowListener(exitListener);
    }
}