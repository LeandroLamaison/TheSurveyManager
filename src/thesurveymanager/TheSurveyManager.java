package thesurveymanager;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TheSurveyManager {
    public static void main(String[] args) {
       Survey new_survey = Survey.newSurvey("test");
       new_survey.addQuestion(new Question());
       
       if(new_survey.questions[0] != null) {
           System.out.println("It's working!!!");
       }
       else {
           System.out.println("It's not working");
       }
               
    }
    //Método que cria o menu principal, que exibe as pesquisas disponíveis para serem respondidas
    private static void MainMenu() {
       JFrame frame = new JFrame("The Survey Manager");
       JPanel panel = new JPanel();
       
       panel.add(Survey.newSurvey("Test Drive").createButton());
       panel.add(Survey.newSurvey("Test Drive 2").createButton());
     
       frame.add(panel);
       frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
    }
    
}
