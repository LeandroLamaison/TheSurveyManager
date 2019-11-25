package thesurveymanager.screens;

import thesurveymanager.Answer;
import thesurveymanager.Question;
import thesurveymanager.UserInterface;

public class QuestionScreen extends javax.swing.JFrame {
    private final Question question;
    private final Answer answer;
    private String selected;
    
    public Question getQuestion() {
        return question;
    }
    
    public Answer getAnswer() {
        return answer;
    }
    
    public String getSelected() {
        return selected;
    }
    
    public QuestionScreen(Question question, Answer answer) {
        this.question = question;
        this.answer = answer;
        UserInterface.closeOperation(this);
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        QuestionTextPanel = new javax.swing.JTextPane();
        Alt1TextPane = new javax.swing.JRadioButton();
        Alt2TextPane = new javax.swing.JRadioButton();
        Alt3TextPane = new javax.swing.JRadioButton();
        Alt5TextPane = new javax.swing.JRadioButton();
        Alt4TextPane = new javax.swing.JRadioButton();
        NextButton = new javax.swing.JButton();
        ErrorTextField = new javax.swing.JTextField();

        QuestionTextPanel.setText(this.question.getMessage());
        QuestionTextPanel.setEditable(false);
        QuestionTextPanel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(QuestionTextPanel);

        Alt1TextPane.setText(this.question.getAlternatives().get(0).getMessage());
        buttonGroup1.add(Alt1TextPane);

        Alt2TextPane.setText(this.question.getAlternatives().get(1).getMessage());
        buttonGroup1.add(Alt2TextPane);

        Alt3TextPane.setText(this.question.getAlternatives().get(2).getMessage());
        buttonGroup1.add(Alt3TextPane);

        Alt5TextPane.setText(this.question.getAlternatives().get(4).getMessage());
        buttonGroup1.add(Alt5TextPane);

        Alt4TextPane.setText(this.question.getAlternatives().get(3).getMessage());
        buttonGroup1.add(Alt4TextPane);

        NextButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        NextButton.setText("Próxima >>>");
        NextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextButtonActionPerformed(evt);
            }
        });

        ErrorTextField.setBackground(getBackground());
        ErrorTextField.setForeground(new java.awt.Color(255, 0, 0));
        ErrorTextField.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(Alt1TextPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Alt2TextPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
                            .addComponent(Alt3TextPane, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
                            .addComponent(Alt5TextPane, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
                            .addComponent(Alt4TextPane, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
                            .addComponent(ErrorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(NextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(202, 202, 202))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextButtonActionPerformed
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
            UserInterface.nextQuestion();
        }
    }//GEN-LAST:event_NextButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Alt1TextPane;
    private javax.swing.JRadioButton Alt2TextPane;
    private javax.swing.JRadioButton Alt3TextPane;
    private javax.swing.JRadioButton Alt4TextPane;
    private javax.swing.JRadioButton Alt5TextPane;
    private javax.swing.JTextField ErrorTextField;
    private javax.swing.JButton NextButton;
    private javax.swing.JTextPane QuestionTextPanel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
