package thesurveymanager;

import java.io.Serializable;
import java.util.ArrayList;

public class Answer implements Serializable{
    //Atributos da classe
    private int id;
    private final ArrayList<Question> questions;
    private final ArrayList<Alternative> answers;
    boolean hasAlternative;
    
    //Construtor da classe
    Answer() {
        this.questions = new ArrayList<>();
        this.answers = new ArrayList<>();
    }
    
    //Método de acesso ao id da resposta
    public int getId() {
        return id;
    }
    
    //Método para definir o id da resposta
    public void setId(int id) {
        this.id = id;
    }
    
    //Método de acesso á lista de questões
    public ArrayList<Question> getQuestions() {
        return questions;
    }

    //Método de acesso á lista de alternativas respondidas
    public ArrayList<Alternative> getAnswers() {
        return answers;
    }
    
    //Método para adicionar nova resposta
    //Adiciona a questão que foi respondida á lista de questões e a alternativa selecionada á lista de respostas
    public void add(Question question, String alternative) {
        hasAlternative = false;
        
        question.getAlternatives().forEach(alt -> {
           if(alt.getMessage().equals(alternative)) {
               hasAlternative = true;
               questions.add(question);
               answers.add(alt);
           }
        });
        
        if(hasAlternative == false) {
            throw new Error("Alternative not found in question");
        }
    }
}
