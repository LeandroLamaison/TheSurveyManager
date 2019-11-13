package thesurveymanager;

import java.util.ArrayList;

public class TheSurveyManager {
    public static ArrayList<Question> questions;
    public static UserInterface user_interface = new UserInterface();
            
    public static void main(String[] args) {
  
       
       TheSurveyManager.questions = new ArrayList<>();
       
       TheSurveyManager.questions.add(new Question("Primeira questão"));
       questions.get(0).addAlternative('a',"Alternativa a");
       questions.get(0).addAlternative('b',"Alternativa b");
       questions.get(0).addAlternative('c',"Alternativa c");
       questions.get(0).addAlternative('d',"Alternativa d");
       questions.get(0).addAlternative('e',"Alternativa e");
       
       TheSurveyManager.questions.add(new Question("Segunda questão"));
       questions.get(1).addAlternative('a',"Alternativa a");
       questions.get(1).addAlternative('b',"Alternativa b");
       questions.get(1).addAlternative('c',"Alternativa c");
       questions.get(1).addAlternative('d',"Alternativa d");
       questions.get(1).addAlternative('e',"Alternativa e");
       
       TheSurveyManager.questions.add(new Question("Terceira questão"));
       questions.get(2).addAlternative('a',"Alternativa a");
       questions.get(2).addAlternative('b',"Alternativa b");
       questions.get(2).addAlternative('c',"Alternativa c");
       questions.get(2).addAlternative('d',"Alternativa d");
       questions.get(2).addAlternative('e',"Alternativa e");
 
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
