package thesurveymanager;

import java.io.Serializable;
import java.util.ArrayList;

public class Question implements Serializable{  
    //Atributos da classe
    private int id;
    private String message;
    private ArrayList<Alternative> alternatives;
    private int answer_count;
    
    //Construtor da classe
    Question(String message) {
        this.message = message;
        this.answer_count = 0;
        this.alternatives = new ArrayList<>();
    }
    
   
    //Métodos de acesso ao id da questão
    public int getId() {
        return id;
    }
    
    //Método para definir o id da questão
    public void setId(int id) {
        this.id = id;
    }
    
    //Método de acesso á mensagem da questão
    public String getMessage() {
        return message;
    }
    
    //Método de acesso á lista de alternativa
    public ArrayList<Alternative> getAlternatives() {
        return alternatives;
    }
    
    //Método de acesso ao contador de respostas
    public int getAnswerCount() {
        return answer_count;
    }

    //Método para pegar uma alternativa específica pelo id dela
    public Alternative getAlternative(char id) {
        Alternative alt = null;
        
        for(int i = 0; i <= this.alternatives.size() - 1; i++) {
            if(this.alternatives.get(i).getID() == id) {
                alt = this.alternatives.get(i);
            }
        }
        
        return alt;
    }
    
    //Método para adicionar resposta
    public void addAnswer(String alternative) {
        answer_count++;
        
        alternatives.forEach(alt -> {
            if(alt.getMessage().equals(alternative)) {
                alt.increment();
            };
        });
    }
    
    //Método para cadastrar alternativa
    public void addAlternative(char option, String alternative) {
        alternatives.add(new Alternative(this.id,option,alternative));
    }
    
    
}
