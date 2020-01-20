package thesurveymanager.screens;

import thesurveymanager.UserInterface;

public class AddQuestionScreen extends javax.swing.JFrame {
    public String message;
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    
    public AddQuestionScreen() {
        UserInterface.closeOperation(this);
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MessageTextField = new javax.swing.JTextField();
        CancelButton = new javax.swing.JButton();
        AddQuestionButton = new javax.swing.JButton();
        AltATextField = new javax.swing.JTextField();
        AltBTextField = new javax.swing.JTextField();
        AltCTextField = new javax.swing.JTextField();
        AltDTextField = new javax.swing.JTextField();
        AltETextField = new javax.swing.JTextField();

        MessageTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        MessageTextField.setText("Mensagem");

        CancelButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        CancelButton.setText("Cancelar");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        AddQuestionButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        AddQuestionButton.setText("Cadastrar");
        AddQuestionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddQuestionButtonActionPerformed(evt);
            }
        });

        AltATextField.setText("Alternativa A");

        AltBTextField.setText("Alternativa B");

        AltCTextField.setText("Alternativa C");

        AltDTextField.setText("Alternativa D");

        AltETextField.setText("Alternativa E");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AddQuestionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AltETextField, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AltDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AltCTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AltBTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AltATextField, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MessageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MessageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AltATextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AltBTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AltCTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AltDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AltETextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddQuestionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddQuestionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddQuestionButtonActionPerformed
        this.setVisible(false);
        
        message = MessageTextField.getText();
        a = AltATextField.getText();
        b = AltBTextField.getText();
        c = AltCTextField.getText();
        d = AltDTextField.getText();
        e = AltETextField.getText();
        
        UserInterface.confirmAddQuestion();
    }//GEN-LAST:event_AddQuestionButtonActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
       this.setVisible(false);
       UserInterface.questionMenuScreen();
    }//GEN-LAST:event_CancelButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddQuestionButton;
    private javax.swing.JTextField AltATextField;
    private javax.swing.JTextField AltBTextField;
    private javax.swing.JTextField AltCTextField;
    private javax.swing.JTextField AltDTextField;
    private javax.swing.JTextField AltETextField;
    private javax.swing.JButton CancelButton;
    private javax.swing.JTextField MessageTextField;
    // End of variables declaration//GEN-END:variables
}
