package thesurveymanager.user_interface;

import javax.swing.JFrame;
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
       MenuButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
       MenuButton.setText("MENU");
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
