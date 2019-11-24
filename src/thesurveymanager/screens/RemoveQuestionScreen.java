package thesurveymanager.screens;

import thesurveymanager.TheSurveyManager;
import thesurveymanager.UserInterface;

public class RemoveQuestionScreen extends javax.swing.JFrame {
    public int id;
    
    public RemoveQuestionScreen() {
        UserInterface.closeOperation(this);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IdTextField = new javax.swing.JTextField();
        IdLabelTextField = new javax.swing.JTextField();
        CancelButton = new javax.swing.JButton();
        ConfirmButton = new javax.swing.JButton();
        ErrorTextField = new javax.swing.JTextField();

        IdTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        IdLabelTextField.setBackground(new java.awt.Color(204, 204, 204));
        IdLabelTextField.setText("ID:");
        IdLabelTextField.setEditable(false);

        CancelButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        CancelButton.setText("CANCELAR");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        ConfirmButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ConfirmButton.setText("CONFIRMAR");
        ConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmButtonActionPerformed(evt);
            }
        });

        ErrorTextField.setForeground(new java.awt.Color(255, 0, 0));
        ErrorTextField.setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ConfirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IdLabelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ErrorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(176, 176, 176))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(IdLabelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 267, Short.MAX_VALUE)
                .addComponent(ErrorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ConfirmButton, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmButtonActionPerformed
        this.setVisible(false);
        
        try {
             id = Integer.parseInt(IdTextField.getText());
        } catch (Exception e) {
            System.out.println(e);
            ErrorTextField.setText("Insira um id de questão válido");
            ErrorTextField.setVisible(true);
        }
        
      
        if(id <= 0) {
            ErrorTextField.setText("Insira um id de questão válido");
            ErrorTextField.setVisible(true);
        }
        
        id--;
        
        UserInterface.confirmRemoveQuestion();
    }//GEN-LAST:event_ConfirmButtonActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
       this.setVisible(false);
       UserInterface.questionMenuScreen();
    }//GEN-LAST:event_CancelButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton ConfirmButton;
    private javax.swing.JTextField ErrorTextField;
    private javax.swing.JTextField IdLabelTextField;
    private javax.swing.JTextField IdTextField;
    // End of variables declaration//GEN-END:variables
}
