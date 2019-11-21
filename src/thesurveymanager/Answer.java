package thesurveymanager;

import java.io.Serializable;
import java.util.ArrayList;

public class Answer implements Serializable{
    private static int id_count = 0;
    private final int ID;
    private ArrayList<Question> questions;
    private ArrayList<Alternative> answers;
    boolean hasAlternative;
    
    Answer() {
        this.ID = id_count;
        id_count++;
        
        this.questions = new ArrayList<>();
        this.answers = new ArrayList<>();
    }
    
    public int getID() {
        return ID;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public ArrayList<Alternative> getAnswers() {
        return answers;
    }
    
    public void add(Question question, String alternative) {
        hasAlternative = false;
        
        question.getAlternatives().forEach(alt -> {
           if(alt.getMessage().equals(alternative)) {
               hasAlternative = true;
               questions.add(question);
               answers.add(alt);
           }
        });
        
        if(hasAlternative == false) {
            throw new Error("Alternative not found in question");
        }
        
    }
   
}
