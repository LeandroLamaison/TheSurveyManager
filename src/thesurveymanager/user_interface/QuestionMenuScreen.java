package thesurveymanager.user_interface;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class QuestionMenuScreen extends JPanel{
    private UserInterface frame;
    
    private javax.swing.JButton AddQuestionButton;
    private javax.swing.JButton ChangeAlternativeButton;
    private javax.swing.JButton MenuButton;
    private javax.swing.JButton RemoveQuestionButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList jList;
    
    public QuestionMenuScreen(UserInterface frame) {
        this.frame = frame;
        initComponents();
    }
    
    public String getSelected() {
        return jList.getSelectedValue().toString();
    }
    
    private void initComponents() {
        
        ArrayList<String> questions_array = new ArrayList<>();
        frame.getSelectedSurvey().getQuestions().forEach(q -> {
            String string = q.getId() + ")" + q.getMessage();
            
            for(int i = 0; i < q.getAlternatives().size(); i++) {
                string = string + "          " + q.getAlternatives().get(i).getID() + ") " + q.getAlternatives().get(i).getMessage();
            }
            
            questions_array.add(string);
        });
        String[] question_strings = new String[questions_array.size()];
        for(int i = 0; i < questions_array.size(); i++) {
            question_strings[i] = questions_array.get(i);
        }
        jList = new javax.swing.JList(question_strings);
        
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane1.setViewportView(jList);
        
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
        ChangeAlternativeButton.setText("Editar");
        ChangeAlternativeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditQuestionButtonActionPerformed(evt);
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
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AddQuestionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26)
                        .addComponent(RemoveQuestionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26)
                        .addComponent(ChangeAlternativeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26)
                        .addComponent(MenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(AddQuestionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(RemoveQuestionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ChangeAlternativeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(MenuButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

    }
    
    private void AddQuestionButtonActionPerformed(java.awt.event.ActionEvent evt) { 
        frame.showAddQuestionScreen();
    }                                                 

    private void RemoveQuestionButtonActionPerformed(java.awt.event.ActionEvent evt) {
        frame.removeQuestionOperation();
        int delete = JOptionPane.showOptionDialog(null, "Tem certeza de que deseja deletar essa questão?", "Confirmar deleção",);
        frame.showQuestionMenuScreen();
    }                                                    

    private void EditQuestionButtonActionPerformed(java.awt.event.ActionEvent evt) {
        frame.showEditQuestionScreen(frame.getSelectedSurvey().getQuestion(Integer.parseInt(jList.getSelectedValue().toString().substring(0, 1))));
    }                                                       

    private void MenuButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        frame.showAdmScreen();
    }      
}
