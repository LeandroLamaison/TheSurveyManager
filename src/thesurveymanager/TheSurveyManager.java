package thesurveymanager;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TheSurveyManager {
    public static void main(String[] args) {
      //Chamando o menu principal
       MainMenu();
               
    }
    //Método que cria o menu principal, que exibe as pesquisas disponíveis para serem respondidas
    private static void MainMenu() {
       JFrame frame = new JFrame("The Survey Manager");
       JPanel panel = new JPanel();
       
       //O método SurveyButton.create() cria uma nova pesquisa no menu
       panel.add(SurveyButton.create("Test Drive"));
       panel.add(SurveyButton.create("Test Drive 2"));
     
       frame.add(panel);
       frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
    }
    
}
