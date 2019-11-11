/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thesurveymanager;

import thesurveymanager.screens.InitialScreen;
import thesurveymanager.screens.QuestionScreen;

public class UserInterface {
    private InitialScreen initial_screen = new InitialScreen();
    private QuestionScreen question_screen;
    
    public void init() {
        initial_screen.setVisible(true);
    }
    
    public void beginSurvey() {
        question_screen = new QuestionScreen(TheSurveyManager.questions.get(0));
        
        initial_screen.setVisible(false);
        question_screen.setVisible(true);
    }
    
    public void nextQuestion() {
        question_screen.setVisible(false);
        if(TheSurveyManager.questions.indexOf(question_screen.getQuestion()) == TheSurveyManager.questions.size() - 1) {
            initial_screen.setVisible(true);
        }
        else {
            question_screen = new QuestionScreen(TheSurveyManager.questions.get(TheSurveyManager.questions.indexOf(question_screen.getQuestion()) + 1));
            question_screen.setVisible(true);
        }
    }
    
    
}
