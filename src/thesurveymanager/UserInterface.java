package thesurveymanager;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import thesurveymanager.screens.*;

public class UserInterface {
    //Telas que não precisam ser modificadas
    private static final InitialScreen INITIAL_SCREEN = new InitialScreen();
    private static final AdmScreen ADM_SCREEN = new AdmScreen();
    
    //Telas que se modificam
    private static QuestionScreen question_screen;
    private static ResultsScreen results_screen;
    private static QuestionMenuScreen question_menu_screen;
    private static HistoryScreen history_screen;
    private static AddQuestionScreen add_question_screen;
    private static RemoveQuestionScreen remove_question_screen;
    private static ChangeAlternativeScreen change_alternative_screen;
    private static RemoveAnswerScreen remove_answer_screen;
    
    //Tela ini3cial
    public static void initialScreen() {
        INITIAL_SCREEN.setVisible(true);
    }
    
    // Tela de administrador
    public static void admScreen() {
        ADM_SCREEN.setVisible(true);
    }
    
    // Inicia a pesquisa
    public static void beginSurvey() {
        //Se a lista de questões estiver vazia, loga um erro no terminal reinicia a tela inicial
        if(TheSurveyManager.questions.size() <= 0) {
            System.out.println("There's no questions registered");
            INITIAL_SCREEN.setVisible(true);
        }
        //Senão, ele abre a tela de questão com a primeira questão da lista
        else {
            question_screen = new QuestionScreen(TheSurveyManager.questions.get(0), new Answer());
            question_screen.setVisible(true);
        }
    }
    
    // Próxima questão
    public static void nextQuestion() {
       //Adiciona a alternativa selecionada a resposta do usuário 
       TheSurveyManager.questions.forEach(q -> {
           if(q.getId() == question_screen.getQuestion().getId()) {
               q.addAnswer(question_screen.getSelected());
           }
       });
        
       //Se for a última questão, ele salva a resposta na lista e abre o menu inicial
        if(TheSurveyManager.questions.indexOf(question_screen.getQuestion()) == TheSurveyManager.questions.size() - 1) {
            TheSurveyManager.saveAnswer(question_screen.getAnswer());
            INITIAL_SCREEN.setVisible(true);
        }
        //Senão, ele adiciona a alternativa á resposta do usuário e abre a próxima questão na tela
        else {
            question_screen = new QuestionScreen(TheSurveyManager.questions.get(TheSurveyManager.questions.indexOf(question_screen.getQuestion()) + 1),question_screen.getAnswer());
            question_screen.setVisible(true);
        }
    }
    
    //Tela de resultados
    public static void resultsScreen() {
        results_screen = new ResultsScreen();
        results_screen.setVisible(true);
    }
    
    // TYela de menu de questões
    public static void questionMenuScreen() {
        question_menu_screen = new QuestionMenuScreen();
        question_menu_screen.setVisible(true);
    }
    
    //Tela de histórico de respostas
    public static void history() {
        history_screen = new HistoryScreen();
        history_screen.setVisible(true);
    }
    
   // Tela de adicionar questão
    public static void addQuestionScreen() {
        add_question_screen = new AddQuestionScreen();
        add_question_screen.setVisible(true);
    }
    //Adiciona a questão á lista e abre o menu de questões
    public static void confirmAddQuestion() {
        TheSurveyManager.addQuestion(add_question_screen.message, add_question_screen.a, add_question_screen.b, add_question_screen.c, add_question_screen.d, add_question_screen.e);
        questionMenuScreen();        
    }
    
   //Tela de remover questão
    public static void removeQuestionScreen() {
        remove_question_screen = new RemoveQuestionScreen();
        remove_question_screen.setVisible(true);
    }
    //Remove a questão da lista e abre o menu de questões
    public static void confirmRemoveQuestion() {
        TheSurveyManager.removeQuestion(remove_question_screen.id);
        questionMenuScreen();
    }
    
    
    // Tela de alterar alternativa
    public static void changeAlternativeScreen() {
        change_alternative_screen = new ChangeAlternativeScreen();
        change_alternative_screen.setVisible(true);
    }
    //Adiciona a nova alternativa á questão da lista e abre o menu de questões
    public static void confirmChangeAlternative() {
        TheSurveyManager.changeAlternative(change_alternative_screen.question_id, change_alternative_screen.alt_id, change_alternative_screen.new_alternative);
        questionMenuScreen();
    }
    
    //Tela de remover resposta
    public static void removeAnswerScreen() {
        remove_answer_screen = new RemoveAnswerScreen();
        remove_answer_screen.setVisible(true);
    }
    //Remove a resposta da lista e abre o histórico de respostas
    public static void confirmRemoveAnswer() {
        TheSurveyManager.removeAnswer(remove_answer_screen.id);
        history();
    }
   
    //Operação de fechar, pega a tela como parâmetro e adiciona a operação de fechar á ela
    //Chama o método de salvar da classe principal
    public static void closeOperation(JFrame frame) {
        WindowListener exitListener = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                int confirm = JOptionPane.showOptionDialog( 
                    null, 
                    "Tem certeza de que deseja encerrar o programa?",
                    "Encerrar o Programa", 
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE, 
                    null, 
                    null, 
                    null
                );
                if (confirm == 0) {
                    TheSurveyManager.saveOperation();
                    System.exit(0);
                }
            }
        };
        frame.addWindowListener(exitListener);
    }
}