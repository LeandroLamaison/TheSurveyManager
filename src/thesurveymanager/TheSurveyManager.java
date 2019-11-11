package thesurveymanager;

import java.util.ArrayList;

public class TheSurveyManager {
    public static UserInterface user_interface = new UserInterface();
    public static ArrayList<Question> questions;
            
    public static void main(String[] args) {
       ArrayList<Alternative> alternatives = new ArrayList<>();
       alternatives.add(new Alternative('a',"aternativa a"));
       alternatives.add(new Alternative('b',"aternativa b"));
       alternatives.add(new Alternative('c',"aternativa c"));
       alternatives.add(new Alternative('d',"aternativa d"));
       alternatives.add(new Alternative('e',"aternativa e"));
       
       TheSurveyManager.questions = new ArrayList<>();
       TheSurveyManager.questions.add(new Question("Primeira questão", alternatives));
       TheSurveyManager.questions.add(new Question("Segunda questão", alternatives));
       TheSurveyManager.questions.add(new Question("Terceira questão", alternatives));
 
       user_interface.init();
       
    }
    
    public static void saveAnswer(Question question, String alternative) {
        for (Question q : questions) {
            if(q == question) {
                q.addAnswer(alternative);
                break;
            }
        }
    }
    
    
}
