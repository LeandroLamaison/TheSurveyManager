package thesurveymanager;

//O ArrayList é usado para registrar cada resposta de cada usuário em uma lista
import java.util.ArrayList;

//Classe histórico, armazena cada resposta de cada usuário em uma lista
public class History {
    //Lista contendo cada "histórico", ou seja uma lista com a resposta
    //dada em cada questão quando a pesquisa foi respondida
    public static ArrayList<History> list = new ArrayList<>();
   
    
    //A lista mencionada 
    //(lista com a resposta dada em cada questão quando a pesquisa foi respondida)
    public ArrayList<String[]> content = new ArrayList<>();
    
    //Método que adiciona um item a lista de conteúdo do histórico,
    //esse item contém o id da questão respondida e o id da respostaque foi dada
    //ele é chamado cada vez que uma questão e respondida através do método Question.AnswerQuestion
    //Quando todos as questões forem respondidas, o resultado é um mapa com todas as questões e respostas dadas
    public void add(String question, String answer) {
        //Criação de um array de strings com dois espaços
        String[] item = new String[2];
        
        //Adição da pergunta no primeiro espaço
        item[0] = question;
        
        //Adição da resposta no segundo espaço
        item[1] = answer;
        
        //Adição do item no conteúdo do histórico
        this.content.add(item);
    }    
}
