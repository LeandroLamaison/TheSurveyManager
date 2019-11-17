package thesurveymanager;

import java.util.ArrayList;

public class TheSurveyManager {
    public static ArrayList<Question> questions;
    public static ArrayList<Answer> answers;
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
       
       answers = new ArrayList<>();
       user_interface.init();  
    }
    
    public static void saveAnswer(Question question, String alternative) {
        for (Question q : questions) {
            if(q == question) {
                q.addAnswer(alternative);
                answers.get(answers.size() - 1).add(q, alternative);
                break;
            }
        }
    }
    
    public static void addQuestion(String message, String a, String b, String c, String d, String e) {
        Question question = new Question(message);
        question.addAlternative('a', a);
        question.addAlternative('b', b);
        question.addAlternative('c', c);
        question.addAlternative('d', d);
        question.addAlternative('e', e);
        
        TheSurveyManager.questions.add(question);
    }
    
    
}
