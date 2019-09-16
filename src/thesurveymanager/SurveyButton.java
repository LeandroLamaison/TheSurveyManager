//Botão configurado para ser uma pesquisa no menu principal

package thesurveymanager;

import java.awt.Dimension;
import javax.swing.JButton;

public class SurveyButton extends JButton{
    String name;
    
    //Método estático que cria uma nova pesquisa
    public static SurveyButton create(String name) {
        SurveyButton button = new SurveyButton();
        button.name = name;
        button.setText(button.name);
        button.setPreferredSize(new Dimension(150,200));
        return button;
    }
}
