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
    public static ArrayList<Question> questions;
    public static ArrayList<Answer> answers;
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        File questions_file = new File("data/questions");
        File answers_file = new File("data/answers");
        
        if(questions_file.exists()) {
            FileInputStream inputFile = new FileInputStream("data/questions");
            ObjectInputStream inputObject = new ObjectInputStream(inputFile);
            questions = (ArrayList<Question>) inputObject.readObject();
            inputObject.close();
            inputFile.close();
        } 
        else {
           questions = new ArrayList<>();
        }
        
        if(answers_file.exists()) {
            FileInputStream inputFile = new FileInputStream("data/answers");
            ObjectInputStream inputObject = new ObjectInputStream(inputFile);
            answers = (ArrayList<Answer>) inputObject.readObject();
            inputObject.close();
        }
        else {
            answers = new ArrayList<>();
        }
        
       UserInterface.init();  
    }
    
    public static void addQuestion(String message, String a, String b, String c, String d, String e) {
        Question question = new Question(message);
        question.addAlternative('a', a);
        question.addAlternative('b', b);
        question.addAlternative('c', c);
        question.addAlternative('d', d);
        question.addAlternative('e', e);
        
        if(questions.size() <= 0) {
            question.setId(1);
        } 
        else {
            question.setId(questions.get(questions.size() - 1).getId() + 1);
        }
        
        questions.add(question);
    }
    
    public static void removeQuestion(int id) {
        for( int i = 0; i < questions.size(); i++) {
            if(questions.get(i).getId() == id) {
                questions.remove(i);
                break;
            }
        }
    }
    
    public static void changeAlternative(int question_id, char alt_id, String new_alt) {
        questions.forEach(q -> {
            if(q.getId() == question_id) {
                q.getAlternative(alt_id).setMessage(new_alt);
            }
        });
    }
    
    public static void saveAnswer(Answer answer) {
        if(answers.size() <= 0) {
            answer.setId(1);
        } 
        else {
            answer.setId(answers.get(answers.size() - 1).getId() + 1);
        }
        
        answers.add(answer);
    }
    
    public static void removeAnswer(int id) {
        for( int i = 0; i < answers.size(); i++) {
            if(answers.get(i).getId() == id) {
                answers.remove(i);
                break;
            }
        }
    }
    
    public static void saveOperation() {
         try {
            FileOutputStream questionsOutputFile = new FileOutputStream("data/questions");
            ObjectOutputStream questionsOutputObject = new ObjectOutputStream(questionsOutputFile);
            questionsOutputObject.writeObject(questions);
            questionsOutputObject.close();
            questionsOutputFile.close();
            
            FileOutputStream answersOutputFile = new FileOutputStream("data/answers");
            ObjectOutputStream answersOutputObject = new ObjectOutputStream(answersOutputFile);
            answersOutputObject.writeObject(answers);
            answersOutputObject.close();
            answersOutputFile.close();
            
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}