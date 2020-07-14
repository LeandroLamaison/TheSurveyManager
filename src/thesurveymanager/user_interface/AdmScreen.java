package thesurveymanager.user_interface;

import javax.swing.JPanel;

public class AdmScreen extends JPanel{
    private UserInterface frame;
    
    private javax.swing.JButton HistoryButton;
    private javax.swing.JButton MenuButton;
    private javax.swing.JButton QuestionsMenuButton;
 
    
   public AdmScreen(UserInterface frame) {
       this.frame = frame;
       initComponents();
   }
   
   private void initComponents(){
       QuestionsMenuButton = new javax.swing.JButton();
       QuestionsMenuButton.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
       QuestionsMenuButton.setText("Questões");
       QuestionsMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuestionsMenuButtonActionPerformed(evt);
            }
        });
       
       HistoryButton = new javax.swing.JButton();
       HistoryButton.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
       HistoryButton.setText("Histórico");
       HistoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistoryButtonActionPerformed(evt);
            }
        });
       
       MenuButton = new javax.swing.JButton();
       MenuButton.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
       MenuButton.setText("Menu");
       MenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuButtonActionPerformed(evt);
            }
        });
       
       javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(270)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(MenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QuestionsMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HistoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(270, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70)
                .addComponent(MenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(QuestionsMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70)
                .addComponent(HistoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70))
        );
   }
   
    private void QuestionsMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {  
        frame.showQuestionMenuScreen();
    }                                                   

    private void HistoryButtonActionPerformed(java.awt.event.ActionEvent evt) { 
        frame.showHistoryScreen();
    }                                             

    private void MenuButtonActionPerformed(java.awt.event.ActionEvent evt) { 
       frame.showInitialScreen();
    } 
}
