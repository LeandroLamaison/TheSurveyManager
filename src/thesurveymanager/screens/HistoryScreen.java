package thesurveymanager.screens;

import thesurveymanager.TheSurveyManager;
import thesurveymanager.UserInterface;

public class HistoryScreen extends javax.swing.JFrame {


    public HistoryScreen() {
        UserInterface.closeOperation(this);
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        HistoryTextArea = new javax.swing.JTextArea();
        RemoveButton = new javax.swing.JButton();
        MenuButton = new javax.swing.JButton();

        HistoryTextArea.setColumns(20);
        HistoryTextArea.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        HistoryTextArea.setRows(5);
        TheSurveyManager.answers.forEach(answer -> {
            HistoryTextArea.append("Resposta " + (answer.getId()) + "\n\n");
            for(int i = 0; i <= answer.getQuestions().size() - 1; i++) {
                HistoryTextArea.append((answer.getQuestions().get(i).getId()) + " - " + answer.getQuestions().get(i).getMessage() + "\n");
                HistoryTextArea.append( answer.getAnswers().get(i).getMessage() + "\n\n");
            }
            HistoryTextArea.append("---------------------- \n");
        });

        HistoryTextArea.setEditable(false);
        jScrollPane1.setViewportView(HistoryTextArea);

        RemoveButton.setText("Remover");
        RemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveButtonActionPerformed(evt);
            }
        });

        MenuButton.setText("Menu");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 799, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(RemoveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(MenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RemoveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(MenuButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveButtonActionPerformed
       this.setVisible(false);
       UserInterface.removeAnswerScreen();
    }//GEN-LAST:event_RemoveButtonActionPerformed

    private void MenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuButtonActionPerformed
       this.setVisible(false);
       UserInterface.admScreen();
    }//GEN-LAST:event_MenuButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea HistoryTextArea;
    private javax.swing.JButton MenuButton;
    private javax.swing.JButton RemoveButton;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
