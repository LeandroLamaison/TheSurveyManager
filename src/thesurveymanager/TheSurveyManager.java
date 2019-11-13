package thesurveymanager;

import java.util.ArrayList;

public class TheSurveyManager {
    public static ArrayList<Question> questions;
    public static UserInterface user_interface = new UserInterface();
            
    public static void main(String[] args) {
       ArrayList<Alternative> alternatives1 = new ArrayList<>();
       alternatives1.add(new Alternative('a',"aternativa a"));
       alternatives1.add(new Alternative('b',"aternativa b"));
       alternatives1.add(new Alternative('c',"aternativa c"));
       alternatives1.add(new Alternative('d',"aternativa d"));
       alternatives1.add(new Alternative('e',"aternativa e"));
       
       ArrayList<Alternative> alternatives2 = new ArrayList<>();
       alternatives2.add(new Alternative('a',"aternativa a"));
       alternatives2.add(new Alternative('b',"aternativa b"));
       alternatives2.add(new Alternative('c',"aternativa c"));
       alternatives2.add(new Alternative('d',"aternativa d"));
       alternatives2.add(new Alternative('e',"aternativa e"));
       
       ArrayList<Alternative> alternatives3 = new ArrayList<>();
       alternatives3.add(new Alternative('a',"aternativa a"));
       alternatives3.add(new Alternative('b',"aternativa b"));
       alternatives3.add(new Alternative('c',"aternativa c"));
       alternatives3.add(new Alternative('d',"aternativa d"));
       alternatives3.add(new Alternative('e',"aternativa e"));
       
       TheSurveyManager.questions = new ArrayList<>();
       TheSurveyManager.questions.add(new Question("Primeira questão", alternatives1));
       TheSurveyManager.questions.add(new Question("Segunda questão", alternatives2));
       TheSurveyManager.questions.add(new Question("Terceira questão", alternatives3));
 
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
