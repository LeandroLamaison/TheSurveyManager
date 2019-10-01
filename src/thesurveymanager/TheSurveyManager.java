package thesurveymanager;

//O scanner é usado na interface para dar os comandos
import java.util.Scanner;

//Classe principal
public class TheSurveyManager {
   
    //Método principal
    public static void main(String[] args) {
        //Criação de um scanner 
        Scanner s = new Scanner(System.in);
        
        //Registro das perguntas
        Question question1 = new Question("Responda a primeira pergunta");
        question1.answers.add(new Answer("a","primeira altenativa"));
        question1.answers.add(new Answer("b","segunda alternativa"));
        question1.answers.add(new Answer("c","terceira alternativa"));
        question1.answers.add(new Answer("d","quarta alternativa"));
        question1.answers.add(new Answer("e","quinta alternativa"));
        
         Question question2 = new Question("Agora responda a segunda");
        question2.answers.add(new Answer("a","primeira alteternativa"));
        question2.answers.add(new Answer("b","segunda alternativa"));
        question2.answers.add(new Answer("c","terceira alternativa"));
        question2.answers.add(new Answer("d","quarta alternativa"));
        question2.answers.add(new Answer("e","quinta alternativa"));
        
             
        System.out.println("    Comandos:");
        System.out.println("habilitar -> habilitar novas respostas a pesquisa");
        System.out.println("desabilitar -> desabilitar novas respostas a pesquisa");
        System.out.println("responder-> responder pesquisa");
        System.out.println("questoes -> lista de questões registradas");
        System.out.println("resultados -> resultados da pesquisa");
        System.out.println("histórico -> histórico de respostas");
        System.out.println("exit -> sair ");
        //o usuário digita o primeiro comando        
        String command = s.nextLine();
        
        //essa variável controla se novas respostas estão habilitadas ou não
        boolean allow_new_responses = true;
        
        //Interface de comando, enquanto o comando não for 'exit', ela continua rodando
        while(!command.equals("exit")) {
            switch (command) {
                
                //Se o comanando for answer
                case "responder":
                    
                    //se novas respostas estiverem habilitadas, o programa cg=hama o método que aplica a pesquisa 
                    if(allow_new_responses) {
                        ApplySurvey();
                    }
                    
                    //senão, é exibida uma mensagem de erro
                    else {
                        System.out.println("Novas respostas á pesquisa estão desativadas");
                    }   break;
                
                //Se o comando for 'results', o programa chama o método que mostra os resultados da pesquisa    
                case "resultados":
                    CheckResults();
                    break;
                
                //Se o comando for 'history', o programa chama o método que mostra 
                //cada pesquisa respondida por cada participante    
                case "historico":
                    CheckHistory();
                    break;
                
                //Se o comando for 'list', o programa chama o método que mostra todas 
                //as perguntas registradas no sistema    
                case "questoes":
                    QuestionsList();
                    break;
                
                //Se o comando for 'end', o programa seta o valor da variavel allow_new_responses como falso,
                //desabilitando que a pesquisa seja respondida   
                case "desabilitar":
                    allow_new_responses = false;
                    System.out.println("Novas respostas á pesquisa estão agora desativadas");
                    break;
                
                //Se o comando for 'start', o programa seta o valor da variavel allow_new_responses como true,
                //habilitando que a pesquisa seja respondida
                case "habilitar":
                    allow_new_responses = true;
                    System.out.println("Novas respostas á pesquisa estão agora ativadas");
                    break;
                    
                default:
                    System.out.println("    Comandos:");
                    System.out.println("habilitar -> habilitar novas respostas a pesquisa");
                    System.out.println("desabilitar -> desabilitar novas respostas a pesquisa");
                    System.out.println("responder-> responder pesquisa");
                    System.out.println("questoes -> lista de questões registradas");
                    System.out.println("resultados -> resultados da pesquisa");
                    System.out.println("histórico -> histórico de respostas");
                    System.out.println("exit -> sair ");
                    break;
            }
            
            //O sistema pede um novo comando para o usuário
            command = s.nextLine();
        }
        
    }
    
    //Método que aplica a pesquisa
    public static void ApplySurvey() {
        //Cria-se um novo histórico para armazenar as informações da pesquisa
        History.list.add(new History());
        
        //O método que exibe a questão para ser respondida é chamado para
        //cada item da lista de questões
        Question.list.forEach(n -> n.AnswerQuestion());
    }
    
    
    //Método que mostra o histórico de cada pesquisa respondida por cada participante
    public static void CheckHistory() {
        
        //Para cada item da lista de históricos
        History.list.forEach(history -> {
            
            //Para cada item da lista de conteúdos do histórico
            history.content.forEach(content -> {
                
                //O programa obtém a questão através dos dados armazenados no item do histórico
                Question question = Question.list.get(Integer.parseInt(content[0]));
                
                //O programa chama o método que exibe a questão
                question.ShowQuestion();
                
                //O sistema mostra a letra da resposta
                System.out.println("Resposta -> " + content[1]);
                
                //Pula uma linha
                System.out.println("");
            });
            
            //Após todas as questões de uma pesquisa serem mostradas
            //deixa uma linha pontilhada para separar da próxima
            System.out.println("---------------------------------------------");
        });
    }
    
    //Método que mostra os resultados da pesquisa
    public static void CheckResults() {
        //Para cada questão da lista, o sistema chama o método que mostra os resultados
        Question.list.forEach(n -> n.getAnswers());
    }
    
    //Método que mostra todas as questões registradas no sistema
    public static void QuestionsList() {
        //Para cada questão da lista, o sistema chama o método que mostra a questão
        Question.list.forEach(n -> n.ShowQuestion());
    }
   
}
