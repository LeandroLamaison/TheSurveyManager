package thesurveymanager.screens;


import thesurveymanager.UserInterface;

public class AdmScreen extends javax.swing.JFrame {

    
    public AdmScreen() {
        UserInterface.closeOperation(this);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        QuestionsMenuButton = new javax.swing.JButton();
        HistoryButton = new javax.swing.JButton();
        MenuButton = new javax.swing.JButton();

        jButton1.setText("jButton1");

        QuestionsMenuButton.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        QuestionsMenuButton.setText("Questões");
        QuestionsMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuestionsMenuButtonActionPerformed(evt);
            }
        });

        HistoryButton.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        HistoryButton.setText("Histórico");
        HistoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistoryButtonActionPerformed(evt);
            }
        });

        MenuButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        MenuButton.setText("MENU");
        MenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(QuestionsMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HistoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(306, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(QuestionsMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(HistoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void QuestionsMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuestionsMenuButtonActionPerformed
        this.setVisible(false);
        UserInterface.questionMenuScreen();
    }//GEN-LAST:event_QuestionsMenuButtonActionPerformed

    private void HistoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistoryButtonActionPerformed
       this.setVisible(false);
       UserInterface.history();
    }//GEN-LAST:event_HistoryButtonActionPerformed

    private void MenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuButtonActionPerformed
       this.setVisible(false);
       UserInterface.initialScreen();
    }//GEN-LAST:event_MenuButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HistoryButton;
    private javax.swing.JButton MenuButton;
    private javax.swing.JButton QuestionsMenuButton;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
