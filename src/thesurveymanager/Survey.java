package thesurveymanager;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;


public class Survey {
    ArrayList<Question> questions = new ArrayList<Question>();
    String name;
    
    public Button createButton() {
        Button button = new Button();
        button.setLabel(this.name);
        button.setBackground(Color.CYAN);
        button.setPreferredSize(new Dimension(150,200));
        return button;
    }
    
    public void addQuestion(Question newQuestion) {
        questions.add(newQuestion);
    }
    
    static Survey newSurvey(String name) {
        Survey survey = new Survey();
        survey.name = name;
        return survey;
    }
}
