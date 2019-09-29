package thesurveymanager;

//Classe resposta, contém os dados de cada alternativa e uma lista que as armazena
public class Answer {
    //Alternativa
    public String message = new String();
    
    //Identificador, que sempre será a letra da alternativa
    public String id = new String();
    
    //Contador
    public int count = 0;
    
    //Construtor da classe, tem dois parametros: a alternativa e a letra dela
    Answer(String id, String message) {
        this.id = id;
        this.message = id + ") " + message;      
    }
    
}
