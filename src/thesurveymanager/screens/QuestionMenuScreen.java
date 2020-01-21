package thesurveymanager.screens;

import thesurveymanager.TheSurveyManager;
import thesurveymanager.UserInterface;

public class QuestionMenuScreen extends javax.swing.JFrame {

    public QuestionMenuScreen() {
        UserInterface.closeOperation(this);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        AddQuestionButton = new javax.swing.JButton();
        RemoveQuestionButton = new javax.swing.JButton();
        ChangeAlternativeButton = new javax.swing.JButton();
        MenuButton = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jTextArea1.setRows(5);
        TheSurveyManager.selected_survey.questions.forEach(q -> {
            jTextArea1.append("      Questão " + (q.getId()) + "\n");
            jTextArea1.append(q.getMessage() + "\n");
            q.getAlternatives().forEach(alt -> {
                jTextArea1.append(alt.getMessage() + "\n");
            });
            jTextArea1.append("\n \n");
        });

        jTextArea1.setEditable(false);
        jScrollPane1.setViewportView(jTextArea1);

        AddQuestionButton.setText("Adicionar");
        AddQuestionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddQuestionButtonActionPerformed(evt);
            }
        });

        RemoveQuestionButton.setText("Remover");
        RemoveQuestionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveQuestionButtonActionPerformed(evt);
            }
        });

        ChangeAlternativeButton.setText("Alterar Alternativa");
        ChangeAlternativeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeAlternativeButtonActionPerformed(evt);
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AddQuestionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RemoveQuestionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ChangeAlternativeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(MenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(AddQuestionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(RemoveQuestionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ChangeAlternativeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(MenuButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddQuestionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddQuestionButtonActionPerformed
        this.setVisible(false);
        UserInterface.addQuestionScreen();
    }//GEN-LAST:event_AddQuestionButtonActionPerformed

    private void RemoveQuestionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveQuestionButtonActionPerformed
        this.setVisible(false);
        UserInterface.removeQuestionScreen();
    }//GEN-LAST:event_RemoveQuestionButtonActionPerformed

    private void ChangeAlternativeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeAlternativeButtonActionPerformed
       this.setVisible(false);
       UserInterface.changeAlternativeScreen();
    }//GEN-LAST:event_ChangeAlternativeButtonActionPerformed

    private void MenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuButtonActionPerformed
        this.setVisible(false);
        UserInterface.admScreen();
    }//GEN-LAST:event_MenuButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddQuestionButton;
    private javax.swing.JButton ChangeAlternativeButton;
    private javax.swing.JButton MenuButton;
    private javax.swing.JButton RemoveQuestionButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
