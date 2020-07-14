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
        this.message = message; 
        this.count = 0;
    }
    
//Getters ----------------------------------------------------------------------
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
    
    public int getPercentage() {
        if(this.count <= 0) {
            return 0;
        }
        else {
            return ( count * 100) / question.getAnswerCount();
        }
    }
//------------------------------------------------------------------------------
    
//Setters ----------------------------------------------------------------------
    public void increment() {
        count++;
    }
    
    public void setMessage(String message) {
        this.message =  message;
    }
//------------------------------------------------------------------------------
}
