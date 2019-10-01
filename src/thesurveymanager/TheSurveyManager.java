package thesurveymanager;

//O scanner é usado na interface para dar os comandos
import java.util.Scanner;

//Classe principal
public class TheSurveyManager {
   
    //Método principal
    public static void main(String[] args) {
   
        //Registro das perguntas
        Question question1 = new Question("Como você vê o governo atual até o momento ?");
        question1.answers.add(new Answer("a","Ótimo"));
        question1.answers.add(new Answer("b","Bom"));
        question1.answers.add(new Answer("c","Regular"));
        question1.answers.add(new Answer("d","Ruim"));
        question1.answers.add(new Answer("e","Péssimo"));
        
         Question question2 = new Question("O que você acha da maneira de governar do presidente ?");
        question2.answers.add(new Answer("a","Ótimo"));
        question2.answers.add(new Answer("b","Bom"));
        question2.answers.add(new Answer("c","Regular"));
        question2.answers.add(new Answer("d","Ruim"));
        question2.answers.add(new Answer("e","Péssimo"));
        
        Question question3 = new Question("Como está sua confiança no presidente ?");
        question3.answers.add(new Answer("a","Ótimo"));
        question3.answers.add(new Answer("b","Bom"));
        question3.answers.add(new Answer("c","Regular"));
        question3.answers.add(new Answer("d","Ruim"));
        question3.answers.add(new Answer("e","Péssimo"));
        
        Question question4 = new Question("Como estão suas expectativas para o restante do governo ?");
        question4.answers.add(new Answer("a","Ótimo"));
        question4.answers.add(new Answer("b","Bom"));
        question4.answers.add(new Answer("c","Regular"));
        question4.answers.add(new Answer("d","Ruim"));
        question4.answers.add(new Answer("e","Péssimo"));
        
        Question question5 = new Question("Como você vê o governo atual em comparação com o antecessor ?");
        question5.answers.add(new Answer("a","Ótimo"));
        question5.answers.add(new Answer("b","Bom"));
        question5.answers.add(new Answer("c","Regular"));
        question5.answers.add(new Answer("d","Ruim"));
        question5.answers.add(new Answer("e","Péssimo"));
        
        Question question6 = new Question("Como você vê o governo municipal atual até o momento ?");
        question6.answers.add(new Answer("a","Ótimo"));
        question6.answers.add(new Answer("b","Bom"));
        question6.answers.add(new Answer("c","Regular"));
        question6.answers.add(new Answer("d","Ruim"));
        question6.answers.add(new Answer("e","Péssimo"));
        
        Question question7 = new Question("O que você acha da maneira da governar do prefeito ?");
        question7.answers.add(new Answer("a","Ótimo"));
        question7.answers.add(new Answer("b","Bom"));
        question7.answers.add(new Answer("c","Regular"));
        question7.answers.add(new Answer("d","Ruim"));
        question7.answers.add(new Answer("e","Péssimo"));
        
        Question question8 = new Question("Como está sua confiança no prefeito ?");
        question8.answers.add(new Answer("a","Ótimo"));
        question8.answers.add(new Answer("b","Bom"));
        question8.answers.add(new Answer("c","Regular"));
        question8.answers.add(new Answer("d","Ruim"));
        question8.answers.add(new Answer("e","Péssimo"));
        
        Question question9 = new Question("Como estão suas expectativas para o restante do governo municipal ?");
        question9.answers.add(new Answer("a","Ótimo"));
        question9.answers.add(new Answer("b","Bom"));
        question9.answers.add(new Answer("c","Regular"));
        question9.answers.add(new Answer("d","Ruim"));
        question9.answers.add(new Answer("e","Péssimo"));
        
        Question question10 = new Question("Como você vê o governo municipal atual em relação ao anterior ?");
        question10.answers.add(new Answer("a","Ótimo"));
        question10.answers.add(new Answer("b","Bom"));
        question10.answers.add(new Answer("c","Regular"));
        question10.answers.add(new Answer("d","Ruim"));
        question10.answers.add(new Answer("e","Péssimo"));
        
        //Sistema chama o método que exibe a interface
        showInterface();
        
    }
    
    //Método que exibe a interface
    public static void showInterface() {
        //Criação de um scanner 
        Scanner s = new Scanner(System.in);      
        
        //Sistema exibe a lista de comandos     
        System.out.println("    Comandos:");
        System.out.println("habilitar -> habilitar novas respostas a pesquisa");
        System.out.println("desabilitar -> desabilitar novas respostas a pesquisa");
        System.out.println("responder-> responder pesquisa");
        System.out.println("questoes -> lista de questões registradas");
        System.out.println("resultados -> resultados da pesquisa");
        System.out.println("histórico -> histórico de respostas");
        System.out.println("exit -> sair ");
        System.out.println("");      
        
        //o usuário digita o primeiro comando        
        String command = s.nextLine();
        
        //essa variável controla se novas respostas estão habilitadas ou não
        boolean allow_new_responses = true;
        
        //Interface de comando, enquanto o comando não for 'exit', ela continua rodando
        while(!command.equals("exit")) {
            switch (command) {
                
                //Se o comanando for 'responder'
                case "responder":
                    
                    //se novas respostas estiverem habilitadas, o programa chama o método que aplica a pesquisa 
                    if(allow_new_responses) {
                        ApplySurvey();
                    }
                    
                    //senão, é exibida uma mensagem de erro
                    else {
                        System.out.println("Novas respostas á pesquisa estão desativadas");
                    }   break;
                
                //Se o comando for 'resultados', o programa chama o método que mostra os resultados da pesquisa    
                case "resultados":
                    CheckResults();
                    break;
                
                //Se o comando for 'historico', o programa chama o método que mostra 
                //cada pesquisa respondida por cada participante    
                case "historico":
                    CheckHistory();
                    break;
                
                //Se o comando for 'questoes', o programa chama o método que mostra todas 
                //as perguntas registradas no sistema    
                case "questoes":
                    QuestionsList();                            
                    break;
                
                //Se o comando for 'desabilitar', o programa seta o valor da variavel allow_new_responses como falso,
                //desabilitando que a pesquisa seja respondida   
                case "desabilitar":
                    allow_new_responses = false;
                    System.out.println("Novas respostas á pesquisa estão agora desativadas");
                    break;
                
                //Se o comando for 'habilitar', o programa seta o valor da variavel allow_new_responses como true,
                //habilitando que a pesquisa seja respondida
                case "habilitar":
                    allow_new_responses = true;
                    System.out.println("Novas respostas á pesquisa estão agora ativadas");
                    break;
                
                //Se o ccalor for outro qualquer, o sistema alerta que não é um comando válido
                // e exibe a lista de comandos
                default:
                    System.out.println(command + " não é um comando válido");
                    System.out.println("    Comandos:");
                    System.out.println("habilitar -> habilitar novas respostas a pesquisa");
                    System.out.println("desabilitar -> desabilitar novas respostas a pesquisa");
                    System.out.println("responder-> responder pesquisa");
                    System.out.println("questoes -> lista de questões registradas");
                    System.out.println("resultados -> resultados da pesquisa");
                    System.out.println("histórico -> histórico de respostas");
                    System.out.println("exit -> sair ");
                    System.out.println("");
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
        Question.list.forEach(n -> {
            
       
            //Criação de um scanner
            Scanner s = new Scanner(System.in);

            //Chama o método que mostra a questão
            n.show();

            //Solicita a resposta do usuário
            System.out.println("Digite a letra da resposta");
            String answer = s.nextLine();

            //Enquanto o método da classe Question que valida a resposta retornar falso,
            //exibe uma mensagem de erro e solicita a resposta de novo
            while(n.validateAnswer(answer) == false) {
                System.out.println("Resposta invalida. Digite a letra da resposta");
                answer = s.nextLine();
            }            

            //Chama o método da classa Question que adiciona a resposta ao histórico e ao contador
            n.addAnswer(answer);

            //Linha em branco
            System.out.println("");  
        });
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
                question.show();
                
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
        Question.list.forEach(n -> {
            //Exibe o id da questão
            System.out.println("     Questão " + (n.id + 1));

            //Exibe a pergunta
            System.out.println(n.message);

            //Exibe cada uma das alternativas, juntamente com o 
            //número de vezes que foram selecionadas e a porcentagem
            n.answers.forEach(answer -> {
                System.out.println(answer.message + " --- " + answer.count + " --- " + n.getPercent(answer));
            });

            //Linha em branco
            System.out.println("");
            
        });
    }
    
    //Método que mostra todas as questões registradas no sistema
    public static void QuestionsList() {
        //Para cada questão da lista, o sistema chama o método que mostra a questão
        Question.list.forEach(n -> {
            n.show();
            System.out.println("");
        });
    }
    
   
}
