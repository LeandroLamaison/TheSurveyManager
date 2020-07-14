package thesurveymanager.user_interface;

import javax.swing.JPanel;
import thesurveymanager.Question;


public class EditQuestionScreen extends JPanel{
    private UserInterface frame;
    private Question question;
    
    public String message;
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    
    private javax.swing.JButton ConfirmButton;
    private javax.swing.JTextField AltATextField;
    private javax.swing.JTextField AltBTextField;
    private javax.swing.JTextField AltCTextField;
    private javax.swing.JTextField AltDTextField;
    private javax.swing.JTextField AltETextField;
    private javax.swing.JButton CancelButton;
    private javax.swing.JTextField MessageTextField;
    
    public EditQuestionScreen(UserInterface frame, Question question) {
        this.frame = frame;
        this.question = question;
        initComponents();
    }
    
    public Question getQuestion() {
        return question;
    }
    
    private void initComponents() {
        
        MessageTextField = new javax.swing.JTextField();
        MessageTextField.setFont(new java.awt.Font("Tahoma", 0, 18));
        MessageTextField.setText(question.getMessage());
        
        AltATextField = new javax.swing.JTextField();
        AltATextField.setText(question.getAlternative('a').getMessage());

        AltBTextField = new javax.swing.JTextField();
        AltBTextField.setText(question.getAlternative('b').getMessage());

        AltCTextField = new javax.swing.JTextField();
        AltCTextField.setText(question.getAlternative('c').getMessage());

        AltDTextField = new javax.swing.JTextField();
        AltDTextField.setText(question.getAlternative('d').getMessage());

        AltETextField = new javax.swing.JTextField();
        AltETextField.setText(question.getAlternative('e').getMessage());
        
        CancelButton = new javax.swing.JButton();
        CancelButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        CancelButton.setText("Cancelar");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });
        
        ConfirmButton = new javax.swing.JButton();
        ConfirmButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ConfirmButton.setText("Confirmar");
        ConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmButtonActionPerformed(evt);
            }
        });
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20)
                .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ConfirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AltETextField, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AltDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AltCTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AltBTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AltATextField, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MessageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MessageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AltATextField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AltBTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AltCTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AltDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AltETextField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConfirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }
    
    private void ConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        message = MessageTextField.getText();
        a = AltATextField.getText();
        b = AltBTextField.getText();
        c = AltCTextField.getText();
        d = AltDTextField.getText();
        e = AltETextField.getText();
        
        frame.editQuestionOperation();
        frame.showQuestionMenuScreen();
    }                                                 

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {
        frame.showQuestionMenuScreen();
    }
}
