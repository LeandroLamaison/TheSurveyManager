package thesurveymanager;

import java.util.ArrayList;
import java.util.Scanner;

public class Question {
    
    public static  ArrayList<Question> list = new ArrayList<>();
    public static int ids = 0;
    public static int count = 0;
    
    public int id;
    public String message = new String();
    public ArrayList<String> alternatives = new ArrayList<>();
    public ArrayList<String> answers = new ArrayList<>();
    
    public static Question Create() {
        Question new_question = new Question();
        Question.list.add(new_question);
        new_question.id = Question.ids;
        Question.ids += 1;
        
        return new_question;
    }
  
    
    public void Show() {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Question " + this.id);
        System.out.println(this.message);
        this.alternatives.forEach(n -> System.out.println(n));
        System.out.println("Digite a letra da resposta");
        String answer = s.nextLine();
        
        for(int i = 0; i < this.alternatives.size() ; i++) {
            if(this.alternatives.get(i).contains(answer + ")")) {
                this.answers.add(this.alternatives.get(i));
            }
        }
    }
    
    public void Answers() {
        System.out.println(this.message);
        this.alternatives.forEach(alternative -> {
            this.answers.forEach(answer -> {
                if (answer.equals(alternative)) {
                    Question.count += 1;
                }
            });
            System.out.println(alternative + " --- " + Question.count );
            Question.count = 0;
        });

    }
    



    
}
