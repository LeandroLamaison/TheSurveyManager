/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thesurveymanager;

import thesurveymanager.screens.InitialScreen;
import thesurveymanager.screens.QuestionScreen;
import thesurveymanager.screens.ResultsScreen;

public class UserInterface {
    private InitialScreen initial_screen;
    private ResultsScreen results_screen;
    private QuestionScreen question_screen;
    
    public void init() {
        initial_screen = new InitialScreen();
        initial_screen.setVisible(true);
    }
    
    public void beginSurvey() {
        question_screen = new QuestionScreen(TheSurveyManager.questions.get(0));
        
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
    
    
}
