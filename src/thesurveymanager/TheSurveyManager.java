package thesurveymanager;

import java.util.ArrayList;
import java.util.Scanner;

public class TheSurveyManager {
   
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        Question question1 = Question.Create();
        question1.message = "Responda a pergunta 1";
        question1.alternatives.add("a) alternativa 1");
        question1.alternatives.add("b) alternativa 2");
        question1.alternatives.add("c) alternativa 3");
        question1.alternatives.add("d) alternativa 4");
        question1.alternatives.add("e) alternativa 5");
        
        Question question2 = Question.Create();
        question2.message = "Responda a pergunta 2";
        question2.alternatives.add("a) alternativa a");
        question2.alternatives.add("b) alternativa b");
        question2.alternatives.add("c) alternativa c");
        question2.alternatives.add("d) alternativa d");
        question2.alternatives.add("e) alternativa e");
        
       
        
        
        String command = s.nextLine();
        while(!command.equals("exit")) {
            if(command.equals("answer")) {
                ApplySurvey();
            }
            else if(command.equals("check")) {
                CheckResults();
            }
            command = s.nextLine();
        }
        
    }
    
    public static void ApplySurvey() {
        Question.list.forEach(n -> n.Show());
    }
    
    public static void CheckResults() {
        Question.list.forEach(n -> n.Answers());
    }
    
    
}
