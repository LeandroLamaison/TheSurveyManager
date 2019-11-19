package thesurveymanager;

import java.io.Serializable;
import java.util.ArrayList;

public class Question implements Serializable{
    private static int id_count = 0;
    
    private final int ID;
    private String message;
    private ArrayList<Alternative> alternatives;
    private int answer_count;
    
    Question(String message) {
        this.ID = id_count;
        id_count++;
        
        this.message = message;
        this.answer_count = 0;
        this.alternatives = new ArrayList<>();
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
    
    public Alternative getAlternative(char id) {
        Alternative alt = null;
        
        for(int i = 0; i <= this.alternatives.size() - 1; i++) {
            if(this.alternatives.get(i).getID() == id) {
                alt = this.alternatives.get(i);
            }
        }
        
        return alt;
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
    
    public void addAlternative(char option, String alternative) {
        alternatives.add(new Alternative(this.ID,option,alternative));
    }
}
