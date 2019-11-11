package thesurveymanager;

public class Alternative {
    private final char ID;
    private String message;
    private int count;
    
    Alternative(char id,String message) {
        this.ID = id;
        this.message = message;       
    }
    
    public char getID() {
        return ID;
    }

    public String getMessage() {
        return message;
    }
    
    public int getCount() {
        return count;
    }
    
    public void increment() {
        count++;
    }
    
}
