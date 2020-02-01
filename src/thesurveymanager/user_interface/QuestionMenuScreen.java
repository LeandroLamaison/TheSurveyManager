package thesurveymanager.user_interface;

import javax.swing.JPanel;

public class QuestionMenuScreen extends JPanel{
    private UserInterface frame;
    
    private javax.swing.JButton AddQuestionButton;
    private javax.swing.JButton ChangeAlternativeButton;
    private javax.swing.JButton MenuButton;
    private javax.swing.JButton RemoveQuestionButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    
    public QuestionMenuScreen(UserInterface frame) {
        this.frame = frame;
        initComponents();
    }
    
    private void initComponents() {
        jTextArea1 = new javax.swing.JTextArea();
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jTextArea1.setRows(5);
        frame.getSelectedSurvey().questions.forEach(q -> {
            jTextArea1.append("      Questão " + (q.getId()) + "\n");
            jTextArea1.append(q.getMessage() + "\n");
            q.getAlternatives().forEach(alt -> {
                jTextArea1.append(alt.getMessage() + "\n");
            });
            jTextArea1.append("\n \n");
        });
        jTextArea1.setEditable(false);
        
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane1.setViewportView(jTextArea1);
        
        AddQuestionButton = new javax.swing.JButton();
        AddQuestionButton.setText("Adicionar");
        AddQuestionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddQuestionButtonActionPerformed(evt);
            }
        });
        
        RemoveQuestionButton = new javax.swing.JButton();
        RemoveQuestionButton.setText("Remover");
        RemoveQuestionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveQuestionButtonActionPerformed(evt);
            }
        });
        
        ChangeAlternativeButton = new javax.swing.JButton();
        ChangeAlternativeButton.setText("Alterar Alternativa");
        ChangeAlternativeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeAlternativeButtonActionPerformed(evt);
            }
        });
        
        MenuButton = new javax.swing.JButton();
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

    }
    
    private void AddQuestionButtonActionPerformed(java.awt.event.ActionEvent evt) { 
        frame.showAddQuestionScreen();
    }                                                 

    private void RemoveQuestionButtonActionPerformed(java.awt.event.ActionEvent evt) {
        frame.showRemoveQuestionScreen();
    }                                                    

    private void ChangeAlternativeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        frame.showChangeAlternativeScreen();
    }                                                       

    private void MenuButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        frame.showAdmScreen();
    }      
}
