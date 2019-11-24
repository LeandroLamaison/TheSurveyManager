package thesurveymanager;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import thesurveymanager.screens.*;

public class UserInterface {
    private static final InitialScreen initial_screen = new InitialScreen();
    private static final AdmScreen adm_screen = new AdmScreen();
    
    private static QuestionScreen question_screen;
    private static ResultsScreen results_screen;
    private static QuestionMenuScreen question_menu_screen;
    private static HistoryScreen history_screen;
    private static AddQuestionScreen add_question_screen;
    private static ChangeAlternativeScreen change_alternative_screen;
    private static RemoveQuestionScreen remove_question_screen;
    private static RemoveAnswerScreen remove_answer_screen;
    
    
    public static void initialScreen() {
        initial_screen.setVisible(true);
    }
    
    public static void admScreen() {
        adm_screen.setVisible(true);
    }
    
    public static void addQuestionScreen() {
        add_question_screen = new AddQuestionScreen();
        add_question_screen.setVisible(true);
    }
    
    public static void removeQuestionScreen() {
        remove_question_screen = new RemoveQuestionScreen();
        remove_question_screen.setVisible(true);
    }
    
    public static void changeAlternativeScreen() {
        change_alternative_screen = new ChangeAlternativeScreen();
        change_alternative_screen.setVisible(true);
    }
    
    public static void removeAnswerScreen() {
        remove_answer_screen = new RemoveAnswerScreen();
        remove_answer_screen.setVisible(true);
    }
    
     public static void resultsScreen() {
        results_screen = new ResultsScreen();
        results_screen.setVisible(true);
    }
    
    public static void beginSurvey() {
        question_screen = new QuestionScreen(TheSurveyManager.questions.get(0), new Answer());
        question_screen.setVisible(true);
    }
    
    public static void questionMenuScreen() {
        question_menu_screen = new QuestionMenuScreen();
        question_menu_screen.setVisible(true);
    }
    
    public static void history() {
        history_screen = new HistoryScreen();
        history_screen.setVisible(true);
    }
    
    public static void nextQuestion() {
        if(TheSurveyManager.questions.indexOf(question_screen.getQuestion()) == TheSurveyManager.questions.size() - 1) {
            TheSurveyManager.saveAnswer(question_screen.getAnswer());
            initial_screen.setVisible(true);
        }
        else {
            question_screen = new QuestionScreen(TheSurveyManager.questions.get(TheSurveyManager.questions.indexOf(question_screen.getQuestion()) + 1),question_screen.getAnswer());
            question_screen.setVisible(true);
        }
    }
    
    public static void confirmAddQuestion() {
        TheSurveyManager.addQuestion(add_question_screen.message, add_question_screen.a, add_question_screen.b, add_question_screen.c, add_question_screen.d, add_question_screen.e);
        questionMenuScreen();        
    }
   
    public static void confirmRemoveQuestion() {
        TheSurveyManager.questions.remove(remove_question_screen.id);
        questionMenuScreen();
    }
    
    
    public static void confirmChangeAlternative() {
        TheSurveyManager.changeAlternative(change_alternative_screen.question_id, change_alternative_screen.alt_id, change_alternative_screen.new_alternative);
        questionMenuScreen();
    }
    
    public static void confirmRemoveAnswer() {
        TheSurveyManager.removeAnswer(remove_answer_screen.question_id);
        history();
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
