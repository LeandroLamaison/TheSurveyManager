package thesurveymanager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JFrame;

public class TheSurveyManager {
    public static ArrayList<Question> questions;
    public static ArrayList<Answer> answers;
    public static UserInterface user_interface = new UserInterface();
            
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        File questions_file = new File("./data/questions");
        File answers_file = new File("./data/answers");
        
        if(questions_file.exists()) {
            FileInputStream inputFile = new FileInputStream("data.bin");
            ObjectInputStream inputObject = new ObjectInputStream(inputFile);
            questions = (ArrayList<Question>) inputObject.readObject();
            inputObject.close();
            inputFile.close();
        }
        else {
            questions = new ArrayList<Question>();
        }
        
        if(answers_file.exists()) {
            FileInputStream inputFile = new FileInputStream("data.bin");
            ObjectInputStream inputObject = new ObjectInputStream(inputFile);
            answers = (ArrayList<Answer>) inputObject.readObject();
            inputObject.close();
            inputFile.close();
        }
        else {
            answers = new ArrayList<Answer>();
        }
       
       user_interface.init();  
    }
    
    public static void saveAnswer(Question question, String alternative) {
        for (Question q : questions) {
            if(q == question) {
                q.addAnswer(alternative);
                answers.get(answers.size() - 1).add(q, alternative);
                break;
            }
        }
    }
    
    public static void addQuestion(String message, String a, String b, String c, String d, String e) {
        Question question = new Question(message);
        question.addAlternative('a', a);
        question.addAlternative('b', b);
        question.addAlternative('c', c);
        question.addAlternative('d', d);
        question.addAlternative('e', e);
        
        TheSurveyManager.questions.add(question);
    }
    
    public static int closeOperation() {
         try {
            FileOutputStream questionsOutputFile = new FileOutputStream("data");
            ObjectOutputStream questionsOutputObject = new ObjectOutputStream(questionsOutputFile);
            questionsOutputObject.writeObject(questions);
            questionsOutputObject.close();
            questionsOutputFile.close();
            
            FileOutputStream answersOutputFile = new FileOutputStream("data");
            ObjectOutputStream answersOutputObject = new ObjectOutputStream(answersOutputFile);
            answersOutputObject.writeObject(answers);
            answersOutputObject.close();
            answersOutputFile.close();
            
        } catch( Exception e) {
            System.out.println(e);
        }
         
        return JFrame.EXIT_ON_CLOSE;
    }
    
    
    
}
