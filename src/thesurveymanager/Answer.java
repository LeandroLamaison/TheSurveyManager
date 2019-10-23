package thesurveymanager;

public class Answer {
    public String message = new String();
    public String id = new String();
    public int count = 0;
    
    Answer(String id, String message) {
        this.id = id;
        this.message = id + ") " + message;      
    }
}
