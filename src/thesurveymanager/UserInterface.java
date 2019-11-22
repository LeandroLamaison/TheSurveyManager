/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thesurveymanager;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import thesurveymanager.screens.*;

public class UserInterface {
    private InitialScreen initial_screen;
    private QuestionScreen question_screen;
    private ResultsScreen results_screen;
    private AdmScreen adm_screen;
    private QuestionMenuScreen question_menu_screen;
    private AddQuestionScreen add_question_screen;
    private RemoveQuestionScreen remove_question_screen;
    private ChangeAlternativeScreen change_alternative_screen;
    private HistoryScreen history_screen;
    private RemoveAnswerScreen remove_answer_screen;
    
    
    public void init() {
        initial_screen = new InitialScreen();
        initial_screen.setVisible(true);
    }
    
    public void beginSurvey() {
        question_screen = new QuestionScreen(TheSurveyManager.questions.get(0));
        
        Answer answer = new Answer();
        
        TheSurveyManager.answers.add(answer);
        
        TheSurveyManager.answers.get(TheSurveyManager.answers.indexOf(answer)).setId(TheSurveyManager.answers.indexOf(answer));
        
        question_screen.setVisible(true);
    }
    
    public void nextQuestion() {
        if(TheSurveyManager.questions.indexOf(question_screen.getQuestion()) == TheSurveyManager.questions.size() - 1) {
            initial_screen.setVisible(true);
        }
        else {
            question_screen = new QuestionScreen(TheSurveyManager.questions.get(TheSurveyManager.questions.indexOf(question_screen.getQuestion()) + 1));
            question_screen.setVisible(true);
        }
    }
    
    public void showResults() {
        results_screen = new ResultsScreen();
        results_screen.setVisible(true);
    }
    
    public void adm() {
        adm_screen = new AdmScreen();
        adm_screen.setVisible(true);
    }
    
    public void questionMenu() {
        question_menu_screen = new QuestionMenuScreen();
        question_menu_screen.setVisible(true);
    }
    
    public void addQuestion() {
        add_question_screen = new AddQuestionScreen();
        add_question_screen.setVisible(true);
    }
    
    public void confirmAddQuestion(String message, String a, String b, String c, String d, String e) {
        TheSurveyManager.addQuestion(message, a, b, c, d, e);
        question_menu_screen.setVisible(true);        
    }
    
    
    public void removeQuestion() {
        remove_question_screen = new RemoveQuestionScreen();
        remove_question_screen.setVisible(true);
    }
    
    public void confirmRemoveQuestion(int id) {
        
        TheSurveyManager.questions.remove(id - 1);
        
        questionMenu();
    }
    
    
    public void changeAlternative() {
        change_alternative_screen = new ChangeAlternativeScreen();
        change_alternative_screen.setVisible(true);
    }
    
    public void confirmChangeAlternative(int question_id, char alt_id, String new_alternative) {
        TheSurveyManager.questions.get(question_id - 1).getAlternative(alt_id).setMessage(new_alternative);
        question_menu_screen.setVisible(true);
    }
    
    public void history() {
        history_screen = new HistoryScreen();
        history_screen.setVisible(true);
    }
    
    public void removeAnswer() {
        remove_answer_screen = new RemoveAnswerScreen();
        remove_answer_screen.setVisible(true);
    }
    
    public void confirmRemoveAnswer(int id) {
        for( int i = 0; i < TheSurveyManager.answers.size() - 1; i++) {
            if(TheSurveyManager.answers.get(i).getId() == id) {
                TheSurveyManager.answers.remove(i);
                break;
            }
        }
        
        history();
    }
    
    public void closeOperation(JFrame frame) {
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
