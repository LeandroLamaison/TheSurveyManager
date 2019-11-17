/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thesurveymanager;

import thesurveymanager.screens.AddQuestionScreen;
import thesurveymanager.screens.AdmScreen;
import thesurveymanager.screens.InitialScreen;
import thesurveymanager.screens.QuestionMenuScreen;
import thesurveymanager.screens.QuestionScreen;
import thesurveymanager.screens.ResultsScreen;

public class UserInterface {
    private InitialScreen initial_screen;
    private QuestionScreen question_screen;
    private ResultsScreen results_screen;
    private AdmScreen adm_screen;
    private QuestionMenuScreen question_menu_screen;
    private AddQuestionScreen add_question_screen;
    
    
    public void init() {
        initial_screen = new InitialScreen();
        initial_screen.setVisible(true);
    }
    
    public void beginSurvey() {
        question_screen = new QuestionScreen(TheSurveyManager.questions.get(0));
        
        TheSurveyManager.answers.add(new Answer());
        
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
    
}
