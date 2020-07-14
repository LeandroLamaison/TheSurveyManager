package thesurveymanager.user_interface;

import javax.swing.JPanel;

public class ResultsScreen extends JPanel {
    private UserInterface frame;
    
    private javax.swing.JButton MenuButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea TextArea;
    
    public ResultsScreen(UserInterface frame) {
        this.frame = frame;
        initComponents();
    }
    
    private void initComponents() {
        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();
        TextArea.setColumns(20);
        TextArea.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        TextArea.setRows(5);
        frame.getSelectedSurvey().getQuestions().forEach(question -> {
            TextArea.append("     " + question.getMessage() + "\n");
            question.getAlternatives().forEach(alt -> {
                TextArea.append(alt.getMessage() + " --- " + alt.getCount() + " --- " + alt.getPercentage() + "% \n");
            });
            TextArea.append("\n \n");
        });
        TextArea.setEditable(false);
        jScrollPane1.setViewportView(TextArea);
        
        MenuButton = new javax.swing.JButton();
        MenuButton.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
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
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(152, Short.MAX_VALUE)
                .addComponent(MenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(163, 163, 163))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }
    
    private void MenuButtonActionPerformed(java.awt.event.ActionEvent evt) {
        frame.showInitialScreen();
    } 
    
}
