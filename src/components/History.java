package components;

import java.util.ArrayList;

public class History {
    public static ArrayList<History> list = new ArrayList<>();
   
    public ArrayList<String[]> content = new ArrayList<>();
    
    public void add(String question, String answer) {
        String[] item = new String[2];
        item[0] = question;
        item[1] = answer;
        this.content.add(item);
    }    
}
