package thesurveymanager;

import java.util.Scanner;

public class TheSurveyManager {
   
    public static void main(String[] args) {
   
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
        
        showInterface();
        
    }
    
    public static void showInterface() {
        Scanner s = new Scanner(System.in);      
        
        System.out.println("    Comandos:");
        System.out.println("habilitar -> habilitar novas respostas a pesquisa");
        System.out.println("desabilitar -> desabilitar novas respostas a pesquisa");
        System.out.println("responder-> responder pesquisa");
        System.out.println("questoes -> lista de questões registradas");
        System.out.println("resultados -> resultados da pesquisa");
        System.out.println("histórico -> histórico de respostas");
        System.out.println("exit -> sair ");
        System.out.println("");      
        
        String command = s.nextLine();
        
        boolean allow_new_responses = true;
        
        while(!command.equals("exit")) {
            switch (command) {
                
                case "responder":
                    
                    if(allow_new_responses) {
                        ApplySurvey();
                    }
                    
                    else {
                        System.out.println("Novas respostas á pesquisa estão desativadas");
                    }   break;
                
                case "resultados":
                    CheckResults();
                    break;
                    
                case "historico":
                    CheckHistory();
                    break;
                
                case "questoes":
                    QuestionsList();                            
                    break;
                
                case "desabilitar":
                    allow_new_responses = false;
                    System.out.println("Novas respostas á pesquisa estão agora desativadas");
                    break;
                
                case "habilitar":
                    allow_new_responses = true;
                    System.out.println("Novas respostas á pesquisa estão agora ativadas");
                    break;
                
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
            
            command = s.nextLine();
        }
    
    }
    
    
    public static void ApplySurvey() {
        History.list.add(new History());
        
        Question.list.forEach(n -> {
            Scanner s = new Scanner(System.in);

            n.show();

            System.out.println("Digite a letra da resposta");
            String answer = s.nextLine();

            while(n.validateAnswer(answer) == false) {
                System.out.println("Resposta invalida. Digite a letra da resposta");
                answer = s.nextLine();
            }            

            n.addAnswer(answer);

            System.out.println("");  
        });
    }
    
 
    
    
    public static void CheckHistory() {
        
        History.list.forEach(history -> {
            
            history.content.forEach(content -> {
                
                Question question = Question.list.get(Integer.parseInt(content[0]));
                
                question.show();
                
                System.out.println("Resposta -> " + content[1]);
                
                System.out.println("");
            });
            
            System.out.println("---------------------------------------------");
        });
    }
    
    public static void CheckResults() {
        Question.list.forEach(n -> {
            System.out.println("     Questão " + (n.id + 1));

            System.out.println(n.message);

            n.answers.forEach(answer -> {
                System.out.println(answer.message + " --- " + answer.count + " --- " + n.getPercent(answer));
            });

            System.out.println("");
            
        });
    }
    
    public static void QuestionsList() {
        Question.list.forEach(n -> {
            n.show();
            System.out.println("");
        });
    }  
}
