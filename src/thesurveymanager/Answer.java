package thesurveymanager;

import java.io.Serializable;
import java.util.ArrayList;

public class Answer implements Serializable{
    private int id;
    private final ArrayList<Question> questions;
    private final ArrayList<Alternative> answers;
    boolean hasAlternative;
    
    public Answer() {
        this.questions = new ArrayList<>();
        this.answers = new ArrayList<>();
    }
    
//Getters ----------------------------------------------------------------------
    public int getId() {
        return id;
    }
    
    public ArrayList<Question> getQuestions() {
        return questions;
    }
    
    public ArrayList<Alternative> getAnswers() {
        return answers;
    }
    
//------------------------------------------------------------------------------
    
//Setters ----------------------------------------------------------------------
    public void setId(int id) {
        this.id = id;
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
//------------------------------------------------------------------------------
}
