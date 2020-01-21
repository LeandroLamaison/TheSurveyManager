package thesurveymanager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class TheSurveyManager {
    public static ArrayList<Survey> surveys;
    public static Survey selected_survey;
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        File surveys_file = new File("data/surveys");
        
        if(surveys_file.exists()) {
            FileInputStream inputFile = new FileInputStream("data/surveys");
            ObjectInputStream inputObject = new ObjectInputStream(inputFile);
            surveys = (ArrayList<Survey>) inputObject.readObject();
            inputObject.close();
            inputFile.close();
        } 
        else {
           surveys = new ArrayList<>();
        }
        
        surveys.add(new Survey(0,"abc"));
        
        selected_survey = surveys.get(0);
       
        
       UserInterface.init();  
    }
    
    public static void saveOperation() {
         try {
            FileOutputStream surveysOutputFile = new FileOutputStream("data/surveys");
            ObjectOutputStream questionsOutputObject = new ObjectOutputStream(surveysOutputFile);
            questionsOutputObject.writeObject(surveys);
            questionsOutputObject.close();
            surveysOutputFile.close();
            
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}