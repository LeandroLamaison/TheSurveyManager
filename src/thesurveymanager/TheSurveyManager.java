package thesurveymanager;

import java.util.ArrayList;
import java.util.Scanner;

public class TheSurveyManager {
   
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        Question question1 = new Question("Responda a primeira pergunta");
        question1.answers.add(new Answer("a","primeira altenativa"));
        question1.answers.add(new Answer("b","segunda alternativa"));
        question1.answers.add(new Answer("c","terceira alternativa"));
        question1.answers.add(new Answer("d","quarta alternativa"));
        question1.answers.add(new Answer("e","quinta alternativa"));
        
         Question question2 = new Question("Agora responda a segunda");
        question2.answers.add(new Answer("a","primeira alteternativa"));
        question2.answers.add(new Answer("b","segunda alternativa"));
        question2.answers.add(new Answer("c","terceira alternativa"));
        question2.answers.add(new Answer("d","quarta alternativa"));
        question2.answers.add(new Answer("e","quinta alternativa"));
        
        
        String command = s.nextLine();
        boolean allow_new_responses = false;
        while(!command.equals("exit")) {
            if(command.equals("answer")) {
                if(allow_new_responses) {
                    ApplySurvey();
                }
                else {
                    System.out.println("Novas respostas á pesquisa estão desativadas");
                }             
            }
            else if(command.equals("check")) {
                CheckResults();
            }
            else if(command.equals("list")) {
                QuestionsList();
            }
            
            
            
            else if(command.equals("end")) {
                allow_new_responses = false;
                System.out.println("Novas respostas á pesquisa estão agora desativadas");
            }
            else if(command.equals("start")) {
                allow_new_responses = true;
                System.out.println("Novas respostas á pesquisa estão agora ativadas");
            }
            
            
            command = s.nextLine();
        }
        
    }
    
    public static void ApplySurvey() {
        Question.list.forEach(n -> n.AnswerQuestion());
    }
    
    public static void CheckResults() {
        Question.list.forEach(n -> n.getAnswers());
    }
    
    public static void QuestionsList() {
        Question.list.forEach(n -> n.ShowQuestion());
    }
   
}
