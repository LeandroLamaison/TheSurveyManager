package thesurveymanager;

import java.io.Serializable;
import java.util.ArrayList;

public class Survey implements Serializable {
    private final int ID;
    private ArrayList<Question> questions;
    private ArrayList<Answer> answers;
    private String password;
    
    public Survey(int id, String password) {
        this.ID = id;
        this.password = password;
        this.questions = new ArrayList<Question>();
        this.answers = new ArrayList<Answer>();
    }
    
//Getters ----------------------------------------------------------------------
    public int getID() {
        return ID;
    }
    
    public ArrayList<Question> getQuestions() {
        return questions;
    }
    
    public Question getQuestion(int id) {
        Question question = null;
        
        for(int i=0; i < questions.size(); i++) {
            if(questions.get(i).getId() == id ) {
                question = questions.get(i);
            }
        }
        
        if(question == null) {
            throw new Error("Question not found");
        }
        
        return question;   
    }    
    
    public ArrayList<Answer> getAnswers() {
        return answers;
    }
    
    public Answer getAnswer(int id) {
        Answer answer = null;
        
        for(int i=0; i < answers.size(); i++) {
            if(answers.get(i).getId() == id ) {
                answer = answers.get(i);
            }
        }
        
        if(answer == null) {
            throw new Error("Question not found");
        }
        
        return answer;
    }
    
    
//------------------------------------------------------------------------------
    
//Setters ----------------------------------------------------------------------
    public void addQuestion(String message, String a, String b, String c, String d, String e) {
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
        
       this.questions.add(question);
    }
    
    public void editQuestion(int question_id, String message) {
        questions.forEach(q -> {
            if(q.getId() == question_id) {
                q.setMessage(message);
            }
        });
    }
    
    public void changeAlternative(int question_id, char alt_id, String new_alt) {
        questions.forEach(q -> {
            if(q.getId() == question_id) {
                q.getAlternative(alt_id).setMessage(new_alt);
            }
        });
    }
    
    public void saveAnswer(Answer answer) {
        if(answers.size() <= 0) {
            answer.setId(1);
        } 
        else {
            answer.setId(answers.get(answers.size() - 1).getId() + 1);
        }
        
        answers.add(answer);
    }
    
//------------------------------------------------------------------------------
    
//Removers ---------------------------------------------------------------------
    public void removeQuestion(int id) {
        for( int i = 0; i < questions.size(); i++) {
            if(questions.get(i).getId() == id) {
                questions.remove(i);
                break;
            }
        }
    }
    public void removeQuestion(Question question) {
        questions.remove(question);
    }
    
    public void removeAnswer(int id) {
        for( int i = 0; i < answers.size(); i++) {
            if(answers.get(i).getId() == id) {
                answers.remove(i);
                break;
            }
        }
    }
    public void removeAnswer(Answer answer) {
        answers.remove(answer);
    }
//------------------------------------------------------------------------------
}
