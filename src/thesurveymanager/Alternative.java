package thesurveymanager;

import java.io.Serializable;

public class Alternative implements Serializable{
    private final Question question;
    private final char ID;
    private String message;
    private int count;
    
    Alternative(Question question, char ID, String message) {
        this.question = question;
        this.ID = ID;
        this.message = ID + ") " + message; 
        this.count = 0;
    }
    
    public Question getQuestion() {
        return question;
    }

    public String getMessage() {
        return message;
    }
    
    public int getCount() {
        return count;
    }
    
    public char getID() {
        return ID;
    }
    
    public void increment() {
        count++;
    }
    
    public int getPercentage() {
        if(this.count <= 0) {
            return 0;
        }
        else {
            return ( count * 100) / question.getAnswerCount();
        }
    }
    
    public void setMessage(String message) {
        this.message = this.ID + ") " + message;
    }
    
}
