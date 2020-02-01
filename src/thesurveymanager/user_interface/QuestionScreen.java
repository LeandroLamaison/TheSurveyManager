package thesurveymanager.user_interface;

import javax.swing.JPanel;
import thesurveymanager.Answer;
import thesurveymanager.Question;

public class QuestionScreen extends JPanel{
    private final UserInterface frame;
    
    private final Question question;
    private final Answer answer;
    private String selected;
    
    private javax.swing.JRadioButton Alt1TextPane;
    private javax.swing.JRadioButton Alt2TextPane;
    private javax.swing.JRadioButton Alt3TextPane;
    private javax.swing.JRadioButton Alt4TextPane;
    private javax.swing.JRadioButton Alt5TextPane;
    private javax.swing.JTextField ErrorTextField;
    private javax.swing.JButton NextButton;
    private javax.swing.JTextPane QuestionTextPanel;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JScrollPane jScrollPane;
    
    public QuestionScreen(UserInterface frame, Question question, Answer answer) {
        this.question = question;
        this.answer = answer;
        this.frame = frame;
        
        initComponents();
    }
    
//Getters and Setters ------------------------------------------------------------
    public Question getQuestion() {
        return question;
    }
    
    public Answer getAnswer() {
        return answer;
    }
    
    public String getSelected() {
        return selected;
    }
//------------------------------------------------------------------------------
    private void initComponents() {
        QuestionTextPanel = new javax.swing.JTextPane();
        QuestionTextPanel.setText(this.question.getMessage());
        QuestionTextPanel.setEditable(false);
        QuestionTextPanel.setFont(new java.awt.Font("Tahoma", 0, 18));
        jScrollPane = new javax.swing.JScrollPane();
        jScrollPane.setViewportView(QuestionTextPanel);

        Alt1TextPane = new javax.swing.JRadioButton();
        Alt1TextPane.setText(this.question.getAlternatives().get(0).getMessage());
        Alt2TextPane = new javax.swing.JRadioButton();
        Alt2TextPane.setText(this.question.getAlternatives().get(1).getMessage());
        Alt3TextPane = new javax.swing.JRadioButton();
        Alt3TextPane.setText(this.question.getAlternatives().get(2).getMessage());
        Alt4TextPane = new javax.swing.JRadioButton();
        Alt4TextPane.setText(this.question.getAlternatives().get(3).getMessage());
        Alt5TextPane = new javax.swing.JRadioButton();
        Alt5TextPane.setText(this.question.getAlternatives().get(4).getMessage());
        
        buttonGroup = new javax.swing.ButtonGroup();
        buttonGroup.add(Alt1TextPane);
        buttonGroup.add(Alt2TextPane);
        buttonGroup.add(Alt3TextPane);
        buttonGroup.add(Alt4TextPane);
        buttonGroup.add(Alt5TextPane);
        
        NextButton = new javax.swing.JButton();
        NextButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        NextButton.setText("Próxima >>>");
        NextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextButtonActionPerformed(evt);
            }
        });
        
        ErrorTextField = new javax.swing.JTextField();
        ErrorTextField.setBackground(getBackground());
        ErrorTextField.setForeground(new java.awt.Color(255, 0, 0));
        ErrorTextField.setBorder(null);
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane)
                            .addComponent(Alt1TextPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Alt2TextPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
                            .addComponent(Alt3TextPane, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
                            .addComponent(Alt5TextPane, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
                            .addComponent(Alt4TextPane, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
                            .addComponent(ErrorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(NextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(202, 202, 202))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Alt1TextPane, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Alt2TextPane, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Alt3TextPane, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Alt4TextPane, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Alt5TextPane, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(ErrorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(NextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

    }
    
    private void NextButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        if(Alt1TextPane.isSelected() == false && 
           Alt2TextPane.isSelected() == false && 
           Alt3TextPane.isSelected() == false && 
           Alt4TextPane.isSelected() == false && 
           Alt5TextPane.isSelected() == false
        ) {
            ErrorTextField.setText("Seleciona alguma das alternativas para prosseguir");
        }
        else {
        
            if(Alt1TextPane.isSelected()) {
                selected = Alt1TextPane.getText();
            }
            else if(Alt2TextPane.isSelected()) {
                selected = Alt2TextPane.getText();
            }
            else if(Alt3TextPane.isSelected()) {
                selected = Alt3TextPane.getText();
            }
            else if(Alt4TextPane.isSelected()) {
                selected = Alt4TextPane.getText();
            }
            else if(Alt5TextPane.isSelected()) {
                selected = Alt5TextPane.getText();
            }
            
            this.setVisible(false);
            this.answer.add(question, selected);
            frame.showQuestionScreen();
        }
    }      
    
}
