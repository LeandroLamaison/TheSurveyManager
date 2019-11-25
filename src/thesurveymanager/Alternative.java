package thesurveymanager;

import java.io.Serializable;

public class Alternative implements Serializable{
    //Atributos da classe
    private int QUESTION_ID;
    private char ID;
    private String message;
    private int count;
    
    //Construtor da classe
    Alternative(int QUESTION_ID, char ID, String message) {
        this.QUESTION_ID = QUESTION_ID;
        this.ID = ID;
        this.message = ID + ") " + message; 
        this.count = 0;
    }
    
    //Método de acesso ao id da questão á que a alternativa pertence
    public int getQuestion() {
        return QUESTION_ID;
    }

    //Método de acesso á mensagem da alternativa
    public String getMessage() {
        return message;
    }
    
    //Método de acesso ao contador de quantas vezes ela foi selecionada
    public int getCount() {
        return count;
    }
    
    //Método de acesso ao id da alternativa
    public char getID() {
        return ID;
    }
    
    //Adiciona mais um ao contador
    public void increment() {
        count++;
    }
    
    //Método que pega a porcentagem 
    public int getPercentage() {
        if(this.count <= 0) {
            return 0;
        }
        else {
            return ( count * 100) / TheSurveyManager.questions.get(QUESTION_ID).getAnswerCount();
        }
    }
    
    //Método que define a mensagem da alternativa
    public void setMessage(String message) {
        this.message = this.ID + ") " + message;
    }
    
}
