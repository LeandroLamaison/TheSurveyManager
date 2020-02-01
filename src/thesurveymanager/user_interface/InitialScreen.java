package thesurveymanager.user_interface;

import javax.swing.JPanel;

public class InitialScreen extends JPanel{
    private UserInterface frame;
    
    private javax.swing.JButton AdmButton;
    private javax.swing.JButton AnswerButton;
    private javax.swing.JButton ResultsButton;
    
    public InitialScreen(UserInterface frame) {
        this.frame = frame;
        initComponents();
    }
    
    private void initComponents() {
        AdmButton = new javax.swing.JButton();
        AdmButton.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        AdmButton.setText("Administrador");
        AdmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdmButtonActionPerformed(evt);
            }
        });
        
        AnswerButton = new javax.swing.JButton();
        AnswerButton.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        AnswerButton.setText("Responder");
        AnswerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnswerButtonActionPerformed(evt);
            }
        });
        
        ResultsButton = new javax.swing.JButton();
        ResultsButton.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        ResultsButton.setText("Resultados");
        ResultsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultsButtonActionPerformed(evt);
            }
        });
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
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
    }
    
    private void AdmButtonActionPerformed(java.awt.event.ActionEvent evt) {
        frame.showAdmScreen();
    } 
    
    private void AnswerButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        frame.showQuestionScreen();
    }
    
    private void ResultsButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        frame.showResultsScreen();
    } 
}
