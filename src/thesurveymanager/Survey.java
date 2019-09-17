package thesurveymanager;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;


public class Survey {
    Question[] questions;
    String name;
    
    public Button createButton() {
        Button button = new Button();
        button.setLabel(this.name);
        button.setBackground(Color.CYAN);
        button.setPreferredSize(new Dimension(150,200));
        return button;
    }
    
    public void addQuestion(Question newQuestion) {
        for(int i=0 ; i < this.questions.length ; i++ ) {
            if(this.questions[i] == null) {
                this.questions[i] = newQuestion;
            }
        }
    }
    
    static Survey newSurvey(String name) {
        Survey survey = new Survey();
        survey.name = name;
        return survey;
    }
}
