package thesurveymanager;

import java.util.ArrayList;
import java.util.Scanner;

public class Question {
    public static  ArrayList<Question> list = new ArrayList<>();
    
    public int id;
    public String message = new String();
    public ArrayList<Answer> answers = new ArrayList<>();
    
    Question(String message) {
        this.message = message;
        Question.list.add(this);
        this.id = Question.list.indexOf(this); 
    }
  
    
    public void ShowQuestion() {
        System.out.println("     Question " + this.id);
        System.out.println(this.message);
        this.answers.forEach(n -> System.out.println(n.message));
    }
    
    public void AnswerQuestion() {
        Scanner s = new Scanner(System.in);
        
        this.ShowQuestion();
        
        System.out.println("Digite a letra da resposta");
        String answer = s.nextLine();
        
        if(!answer.equals("a") && !answer.equals("b") && !answer.equals("c") && !answer.equals("d") && !answer.equals("e")) {
            System.out.println("Resposta invalida. Digite a letra da resposta");
            answer = s.nextLine();
        }
        
        for(int i = 0; i < this.answers.size() ; i++) {
            if(this.answers.get(i).id.equals(answer)) {
                this.answers.get(i).count += 1;
            }
        }
        
        System.out.println("");   
    }
    
    
    public void getAnswers() {
        System.out.println("     Question " + this.id);
        System.out.println(this.message);
        this.answers.forEach(answer -> {
            System.out.println(answer.message + " --- " + answer.count + " --- " + this.getPercent(answer));
        });
        System.out.println("");
    }
    
    public String getPercent(Answer answer) {
        float total = 0;
        for (Answer ans: this.answers) {
            total += ans.count;
        }
        
        float percent = (answer.count * 100) / total;
        
        if(Float.isNaN(percent)) {
            percent = 0;
        }
        
        return new String(percent + "%");
    }
    
    
}
