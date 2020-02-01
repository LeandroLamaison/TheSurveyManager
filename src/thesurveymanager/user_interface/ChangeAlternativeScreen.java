package thesurveymanager.user_interface;

import javax.swing.JPanel;

public class ChangeAlternativeScreen extends JPanel{
    private UserInterface frame;
    
    public int question_id;
    public char alt_id;
    public String new_alt;
    
    private boolean isValid;
    
    private javax.swing.JTextField AlternativeIdLabelTextField;
    private javax.swing.JTextField AlternativeIdTextField;
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton ConfirmButton;
    private javax.swing.JTextField ErrorTextField;
    private javax.swing.JTextField NewAlternativeLabelTextField;
    private javax.swing.JTextField NewAlternativeTextField;
    private javax.swing.JTextField QuestionIdLabelTextField;
    private javax.swing.JTextField QuestionIdTextField;
    
    public ChangeAlternativeScreen(UserInterface frame) {
        this.frame = frame;
        initComponents();
    }
    
    private void initComponents() {
        QuestionIdLabelTextField = new javax.swing.JTextField();
        QuestionIdLabelTextField.setBackground(new java.awt.Color(204, 204, 204));
        QuestionIdLabelTextField.setText("Id da questão:");
        QuestionIdLabelTextField.setEditable(false);
        
        QuestionIdTextField = new javax.swing.JTextField();
        QuestionIdTextField.setFont(new java.awt.Font("Tahoma", 0, 14));
        
        AlternativeIdLabelTextField = new javax.swing.JTextField();
        AlternativeIdLabelTextField.setBackground(new java.awt.Color(204, 204, 204));
        AlternativeIdLabelTextField.setText("Id da alternativa");
        AlternativeIdLabelTextField.setEditable(false);
        
        AlternativeIdTextField = new javax.swing.JTextField();
        AlternativeIdTextField.setFont(new java.awt.Font("Tahoma", 0, 14));
        
        NewAlternativeLabelTextField = new javax.swing.JTextField();
        NewAlternativeLabelTextField.setBackground(new java.awt.Color(204, 204, 204));
        NewAlternativeLabelTextField.setText("Nova alternativa");
        NewAlternativeLabelTextField.setEditable(false);
        
        NewAlternativeTextField = new javax.swing.JTextField();
        NewAlternativeTextField.setFont(new java.awt.Font("Tahoma", 0, 14));
        
        ConfirmButton = new javax.swing.JButton();
        ConfirmButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ConfirmButton.setText("CONFIRMAR");
        ConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmButtonActionPerformed(evt);
            }
        });
        
        CancelButton = new javax.swing.JButton();
        CancelButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        CancelButton.setText("CANCELAR");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });
        
        ErrorTextField = new javax.swing.JTextField();
        ErrorTextField.setBackground(getBackground());
        ErrorTextField.setForeground(new java.awt.Color(255, 0, 0));
        ErrorTextField.setBorder(null);
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(QuestionIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(QuestionIdLabelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AlternativeIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(AlternativeIdLabelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)))
                .addGap(66, 66, 66))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NewAlternativeLabelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NewAlternativeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ConfirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ErrorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(QuestionIdLabelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(QuestionIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AlternativeIdLabelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AlternativeIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(67, 67, 67)
                .addComponent(NewAlternativeLabelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NewAlternativeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ErrorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConfirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }
    
    private void ConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        isValid = true;
       
        try {
            question_id = Integer.parseInt(QuestionIdTextField.getText());
        } catch (Exception e) {
            System.out.println(e);
            ErrorTextField.setText("Insira um id de questão válido");
            isValid = false;
        }
        
        if(question_id <= 0) {
            ErrorTextField.setText("Insira um id de questão válido");
            isValid = false;
        }
        
        if(AlternativeIdTextField.getText().isEmpty()) {
            ErrorTextField.setText("Insira um id de alternativa válido");
            isValid = false;
        }
        else {
             alt_id = AlternativeIdTextField.getText().charAt(0);
        }
        
        if(alt_id != 'a' && alt_id != 'b' && alt_id != 'c' && alt_id != 'd' && alt_id != 'e') {
            ErrorTextField.setText("Insira um id de alternativa válido");
            isValid = false;
        }
        
        if(NewAlternativeTextField.getText().isEmpty()) {
            ErrorTextField.setText("Insira um valor para a alternativa");
            isValid = false;
        }
        else {
             new_alt = NewAlternativeTextField.getText();
        }
       
        if(isValid) {
            frame.changeAlternativeOperation();
            frame.showQuestionMenuScreen();
        }
    }                                             

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
       frame.showQuestionMenuScreen();
    }
}
