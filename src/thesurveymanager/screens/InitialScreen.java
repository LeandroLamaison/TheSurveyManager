package thesurveymanager.screens;

import thesurveymanager.UserInterface;

public class InitialScreen extends javax.swing.JFrame {

    public InitialScreen() {
       UserInterface.closeOperation(this);
        
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AdmButton = new javax.swing.JButton();
        AnswerButton = new javax.swing.JButton();
        ResultsButton = new javax.swing.JButton();

        AdmButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AdmButton.setText("Administrador");
        AdmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdmButtonActionPerformed(evt);
            }
        });

        AnswerButton.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        AnswerButton.setText("Responder");
        AnswerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnswerButtonActionPerformed(evt);
            }
        });

        ResultsButton.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        ResultsButton.setText("Resultados");
        ResultsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(AdmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ResultsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AnswerButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(165, 165, 165))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AdmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(ResultsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AnswerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void AnswerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnswerButtonActionPerformed
        this.setVisible(false);
        UserInterface.beginSurvey();
    }//GEN-LAST:event_AnswerButtonActionPerformed

    private void ResultsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultsButtonActionPerformed
        this.setVisible(false);
        UserInterface.resultsScreen();
    }//GEN-LAST:event_ResultsButtonActionPerformed

    private void AdmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdmButtonActionPerformed
        this.setVisible(false);
        UserInterface.admScreen();
    }//GEN-LAST:event_AdmButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdmButton;
    private javax.swing.JButton AnswerButton;
    private javax.swing.JButton ResultsButton;
    // End of variables declaration//GEN-END:variables
}
