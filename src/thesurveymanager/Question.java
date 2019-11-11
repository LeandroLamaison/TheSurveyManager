package thesurveymanager;

import java.io.Serializable;
import java.util.ArrayList;

public class Question implements Serializable{
    private static int id_count = 0;
    
    private final int ID;
    private String message;
    private ArrayList<Alternative> alternatives;
    private int answer_count;
    
    Question(String message, ArrayList<Alternative> alternatives) {
        this.ID = id_count;
        id_count++;
        
        this.message = message;
        this.alternatives = alternatives;
        this.answer_count = 0;
    }

    public int getId() {
        return ID;
    }

    public String getMessage() {
        return message;
    }

    public ArrayList<Alternative> getAlternatives() {
        return alternatives;
    }
    
    public int getAnswerCount() {
        return answer_count;
    }
    
    public void addAnswer(String alternative) {
        answer_count++;
        
        alternatives.forEach(alt -> {
            if(alt.getMessage().equals(alternative)) {
                alt.increment();
            };
        });
    }
}
