package thesurveymanager;

public class Alternative {
    private int QUESTION_ID;
    private char ID;
    private String message;
    private int count;
    
    Alternative(int QUESTION_ID, char ID, String message) {
        this.QUESTION_ID = QUESTION_ID;
        this.ID = ID;
        this.message = ID + ") " + message; 
        this.count = 0;
    }
    
    public int getQuestion() {
        return QUESTION_ID;
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
            return ( count * 100) / TheSurveyManager.questions.get(QUESTION_ID).getAnswerCount();
        }
    }
    
    public void setMessage(String message) {
        this.message = this.ID + ") " + message;
    }
    
}
