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
    //Lista de questões
    public static ArrayList<Question> questions;
    
    //Lista de respostas
    public static ArrayList<Answer> answers;
    
    //Método principal, ativado quando o programa inicia
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        //Ponteiro para o arquivo com as questões salvas
        File questions_file = new File("data/questions");
        
        //Ponteiro para o arquivo com as respostas salvas
        File answers_file = new File("data/answers");
        
        //Se o arquivo das questões existir, o programa carrega a lista de questões
        if(questions_file.exists()) {
            FileInputStream inputFile = new FileInputStream("data/questions");
            ObjectInputStream inputObject = new ObjectInputStream(inputFile);
            questions = (ArrayList<Question>) inputObject.readObject();
            inputObject.close();
            inputFile.close();
        }
        //Senão, ele cria uma nova lista vazia
        else {
            questions = new ArrayList<>();
        }
        
        //Se o arquivo das respostas existir, o programa carrega a lista de respostas
        if(answers_file.exists()) {
            FileInputStream inputFile = new FileInputStream("data/answers");
            ObjectInputStream inputObject = new ObjectInputStream(inputFile);
            answers = (ArrayList<Answer>) inputObject.readObject();
            inputObject.close();
        }
        //Senão, ele cria uma nova lista vazia
        else {
            answers = new ArrayList<>();
        }
        
       //Chama a interface de usuário
       UserInterface.initialScreen();  
    }
    
    //Método para adicionar questão á lista
    public static void addQuestion(String message, String a, String b, String c, String d, String e) {
        //Cria uma nova questão com os parâmetros passados
        Question question = new Question(message);
        question.addAlternative('a', a);
        question.addAlternative('b', b);
        question.addAlternative('c', c);
        question.addAlternative('d', d);
        question.addAlternative('e', e);
        
        //Se a lista estive vazia, o id da questão é 1
        if(questions.size() <= 0) {
            question.setId(1);
        } 
        //Senão, o id é o id da última questão da lista mais um
        else {
            question.setId(questions.get(questions.size() - 1).getId() + 1);
        }
        
        //Adiciona a questão á lista
        questions.add(question);
    }
    
    //Método para remover questão da lista
    public static void removeQuestion(int id) {
        //Para cada questão da lista
        for( int i = 0; i < questions.size(); i++) {
            //Quando o id da questão for igual o id passado pelo parâmetro, remove a questão da lista e quebra o loop
            if(questions.get(i).getId() == id) {
                questions.remove(i);
                break;
            }
        }
    }
    
    //Método para alterar alternativa de uma questão
    public static void changeAlternative(int question_id, char alt_id, String new_alt) {
        //Para cada questão da lista
        questions.forEach(q -> {
            //Quando o id da questão for igual o id passado pelo parâmetro, redefine a alternativa especificada com a nova mensagem
            if(q.getId() == question_id) {
                q.getAlternative(alt_id).setMessage(new_alt);
            }
        });
    }
    
    //Método para adicionar resposta á lista
    public static void saveAnswer(Answer answer) {
        //Se a lista de respostas estiver vazia, o id da resposta é 1
        if(answers.size() <= 0) {
            answer.setId(1);
        } 
        //Senão, o id é o id da última resposta da lista mais um
        else {
            answer.setId(answers.get(answers.size() - 1).getId() + 1);
        }
        
        //Adiciona a resposta á lista
        answers.add(answer);
    }
    
    //Método para remover resposta da lista
    public static void removeAnswer(int id) {
        //Para cada resposta da lista
        for( int i = 0; i < answers.size(); i++) {
            //Quando o id da resposta for igual ao id do parâmetro, remove a resposta da lista e quebra o loop
            if(answers.get(i).getId() == id) {
                answers.remove(i);
                break;
            }
        }
    }
    
    //Método para salvar os dados das listas de questão e resposta
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