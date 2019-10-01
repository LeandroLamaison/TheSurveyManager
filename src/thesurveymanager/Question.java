package thesurveymanager;

//O ArrayList é usado para registrar as questões e suas alternativas em uma lista
import java.util.ArrayList;

//O scanner é usado para receber a mensagem do usuário
import java.util.Scanner;

//Classe questão, contém os dados de cada questão, uma lista que as armazena
// e alguns metodos 
public class Question {
    
    //Lista que armazena as questões registradas
    public static  ArrayList<Question> list = new ArrayList<>();
    
    //Identificador da questão
    public int id;
    
    //String contendo a pergunta
    public String message = new String();
    
    //Lista contendo as alternativas
    public ArrayList<Answer> answers = new ArrayList<>();
    
    
    //Construtor da questão
    Question(String message) {
        //A mensagem ´da questão é passada pelo parâmetro
        this.message = message;
        
        //Quando a questão é criada, ela é automaticamente adicionada`à lista de questões
        Question.list.add(this);
        
        //O id da questão é sempre sua posição na lista
        this.id = Question.list.indexOf(this); 
    }
  
    //Método que mostra a questão
    public void show() {
        //Exibe o id da questão
        System.out.println("     Questão " + (this.id + 1));
        
        //Exibe a pergunta
        System.out.println(this.message);
        
        //Exibe cada uma das alternativas da lista
        this.answers.forEach(n -> System.out.println(n.message));
    }
    
    //Método que valida se a resposta à questão corresponde a uma das alternativas
    public boolean validateAnswer(String answer) {
        
        //Se não for a,b,c,d ou e, retorna falso
        if(!answer.equals("a") && !answer.equals("b") && !answer.equals("c") && !answer.equals("d") && !answer.equals("e")) {
            return false;
        }
        //Se for igual a um destes, retorna verdadeiro
        else {
            return true;
        }
    }
    
    //Método que registra nova resposta á questão
    public void addAnswer(String answer) {
        
            for(int i = 0; i < this.answers.size() ; i++) {
                
                //Quando a resposta do usuário corresponder a uma das alternaivas
                if(this.answers.get(i).id.equals(answer)) {
                    //Soma mais um ao contador da alternativa selecionada
                    this.answers.get(i).count += 1;
                    
                    //E adiciona a resposta ao histórico
                    History.list.get(History.list.size() - 1).add( Integer.toString(this.id), answer);
                    break;
                }
            } 
    }
    
    
    //Método que obtém a porcentagem, auxiliar ao método getAnswers
    public String getPercent(Answer answer) {
        //Cria a variavel que representa o total de respostas
        float total = 0;
        
        //Soma os contadores de todas as alternativas da questão
        for (Answer ans: this.answers) {
            total += ans.count;
        }
        
        //Cria o método que representa a porcentagem,
        //através da fórmula da porcentagem
        float percent = (answer.count * 100) / total;
        
        //Se a porcentagem não for um número, o que acontecerá caso o número de 
        //respostas total seja zero, a porcentagem é setada como zero 
        if(Float.isNaN(percent)) {
            percent = 0;
        }
        
        //retorna a procentagem 
        return percent + "%";
    }
    
    
}
