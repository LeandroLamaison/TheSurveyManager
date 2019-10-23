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
  
    public void show() {
        System.out.println("     Questão " + (this.id + 1));
        System.out.println(this.message);
        this.answers.forEach(n -> System.out.println(n.message));
    }
    
    public boolean validateAnswer(String answer) {
        if(!answer.equals("a") && !answer.equals("b") && !answer.equals("c") && !answer.equals("d") && !answer.equals("e")) {
            return false;
        }
        else {
            return true;
        }
    }
    
    public void addAnswer(String answer) {
        for(int i = 0; i < this.answers.size() ; i++) {
            if(this.answers.get(i).id.equals(answer)) {
                this.answers.get(i).count += 1;
                History.list.get(History.list.size() - 1).add( Integer.toString(this.id), answer);
                break;
            }
        } 
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
        return percent + "%";
    }
}
