package thesurveymanager.screens;

import thesurveymanager.TheSurveyManager;
import thesurveymanager.UserInterface;

public class ChangeAlternativeScreen extends javax.swing.JFrame {
    public int question_id;
    public char alt_id;
    public String new_alternative;
    
    public ChangeAlternativeScreen() {
        UserInterface.closeOperation(this);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        QuestionIdLabelTextField = new javax.swing.JTextField();
        QuestionIdTextField = new javax.swing.JTextField();
        AlternativeIdLabelTextField = new javax.swing.JTextField();
        AlternativeIdTextField = new javax.swing.JTextField();
        NewAlternativeLabelTextField = new javax.swing.JTextField();
        NewAlternativeTextField = new javax.swing.JTextField();
        ConfirmButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        ErrorTextField = new javax.swing.JTextField();

        QuestionIdLabelTextField.setBackground(new java.awt.Color(204, 204, 204));
        QuestionIdLabelTextField.setText("Id da questão:");
        QuestionIdLabelTextField.setEditable(false);

        QuestionIdTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        AlternativeIdLabelTextField.setBackground(new java.awt.Color(204, 204, 204));
        AlternativeIdLabelTextField.setText("Id da alternativa");
        AlternativeIdLabelTextField.setEditable(false);

        AlternativeIdTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        NewAlternativeLabelTextField.setBackground(new java.awt.Color(204, 204, 204));
        NewAlternativeLabelTextField.setText("Nova alternativa");
        NewAlternativeLabelTextField.setEditable(false);

        NewAlternativeTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        ConfirmButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ConfirmButton.setText("CONFIRMAR");
        ConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmButtonActionPerformed(evt);
            }
        });

        CancelButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        CancelButton.setText("CANCELAR");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        ErrorTextField.setForeground(new java.awt.Color(255, 0, 0));
        ErrorTextField.setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(QuestionIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(QuestionIdLabelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AlternativeIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(AlternativeIdLabelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)))
                .addGap(66, 66, 66))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NewAlternativeLabelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NewAlternativeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ConfirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ErrorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(QuestionIdLabelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(QuestionIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AlternativeIdLabelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AlternativeIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(67, 67, 67)
                .addComponent(NewAlternativeLabelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NewAlternativeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(ErrorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConfirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmButtonActionPerformed
       this.setVisible(false);
       
        try {
            question_id = Integer.parseInt(QuestionIdTextField.getText());
        } catch (Exception e) {
            System.out.println(e);
            ErrorTextField.setText("Insira um id de questão válido");
            ErrorTextField.setVisible(true);
        }
        
        if(question_id <= 0) {
            ErrorTextField.setText("Insira um id de questão válido");
            ErrorTextField.setVisible(true);
        }
        
        question_id--;
           
        
        alt_id = AlternativeIdTextField.getText().charAt(0);
        
        if(alt_id != 'a' && alt_id != 'b' && alt_id != 'c' && alt_id != 'd' && alt_id != 'e') {
            ErrorTextField.setText("Insira um id de alternativa válido");
            ErrorTextField.setVisible(true);
        }
        
        new_alternative = NewAlternativeTextField.getText();
        
        UserInterface.confirmChangeAlternative();
    }//GEN-LAST:event_ConfirmButtonActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
       this.setVisible(false);
       UserInterface.questionMenuScreen();
    }//GEN-LAST:event_CancelButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AlternativeIdLabelTextField;
    private javax.swing.JTextField AlternativeIdTextField;
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton ConfirmButton;
    private javax.swing.JTextField ErrorTextField;
    private javax.swing.JTextField NewAlternativeLabelTextField;
    private javax.swing.JTextField NewAlternativeTextField;
    private javax.swing.JTextField QuestionIdLabelTextField;
    private javax.swing.JTextField QuestionIdTextField;
    // End of variables declaration//GEN-END:variables
}
