package thesurveymanager.user_interface;

import javax.swing.JPanel;


public class AddQuestionScreen extends JPanel{
    private UserInterface frame;
    
    public String message;
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    
    private javax.swing.JButton AddQuestionButton;
    private javax.swing.JTextField AltATextField;
    private javax.swing.JTextField AltBTextField;
    private javax.swing.JTextField AltCTextField;
    private javax.swing.JTextField AltDTextField;
    private javax.swing.JTextField AltETextField;
    private javax.swing.JButton CancelButton;
    private javax.swing.JTextField MessageTextField;
    
    public AddQuestionScreen(UserInterface frame) {
        this.frame = frame;
        initComponents();
    }
    
    private void initComponents() {
        
        MessageTextField = new javax.swing.JTextField();
        MessageTextField.setFont(new java.awt.Font("Tahoma", 0, 18));
        MessageTextField.setText("Mensagem");
        
        AltATextField = new javax.swing.JTextField();
        AltATextField.setText("Alternativa A");

        AltBTextField = new javax.swing.JTextField();
        AltBTextField.setText("Alternativa B");

        AltCTextField = new javax.swing.JTextField();
        AltCTextField.setText("Alternativa C");

        AltDTextField = new javax.swing.JTextField();
        AltDTextField.setText("Alternativa D");

        AltETextField = new javax.swing.JTextField();
        AltETextField.setText("Alternativa E");
        
        CancelButton = new javax.swing.JButton();
        CancelButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        CancelButton.setText("Cancelar");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });
        
        AddQuestionButton = new javax.swing.JButton();
        AddQuestionButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        AddQuestionButton.setText("Cadastrar");
        AddQuestionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddQuestionButtonActionPerformed(evt);
            }
        });
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AddQuestionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AltETextField, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AltDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AltCTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AltBTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AltATextField, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MessageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MessageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AltATextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AltBTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AltCTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AltDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AltETextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddQuestionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }
    
    private void AddQuestionButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        message = MessageTextField.getText();
        a = AltATextField.getText();
        b = AltBTextField.getText();
        c = AltCTextField.getText();
        d = AltDTextField.getText();
        e = AltETextField.getText();
        
        frame.addQuestionOperation();
        frame.showQuestionMenuScreen();
    }                                                 

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {
        frame.showQuestionMenuScreen();
    }
}
