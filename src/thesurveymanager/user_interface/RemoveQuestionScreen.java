package thesurveymanager.user_interface;

import javax.swing.JPanel;

public class RemoveQuestionScreen extends JPanel{
    private UserInterface frame;
    
    public int id;
    private boolean isValid;
    
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton ConfirmButton;
    private javax.swing.JTextField ErrorTextField;
    private javax.swing.JTextField IdLabelTextField;
    private javax.swing.JTextField IdTextField;
    
    public RemoveQuestionScreen(UserInterface frame) {
        this.frame = frame;
        initComponents();
    }
    
    private void initComponents() {
        IdTextField = new javax.swing.JTextField();
        IdTextField.setFont(new java.awt.Font("Tahoma", 0, 14));
        
        IdLabelTextField = new javax.swing.JTextField();
        IdLabelTextField.setBackground(new java.awt.Color(204, 204, 204));
        IdLabelTextField.setText("ID:");
        IdLabelTextField.setEditable(false);
        
        CancelButton = new javax.swing.JButton();
        CancelButton.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        CancelButton.setText("CANCELAR");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });
        
        ConfirmButton = new javax.swing.JButton();
        ConfirmButton.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        ConfirmButton.setText("CONFIRMAR");
        ConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmButtonActionPerformed(evt);
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
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IdLabelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ErrorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ConfirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(IdLabelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 244, Short.MAX_VALUE)
                .addComponent(ErrorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ConfirmButton, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                .addContainerGap())
        );
    }
    
    private void ConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        isValid = true;
        
        try {
             id = Integer.parseInt(IdTextField.getText());
        } catch (Exception e) {
            System.out.println(e);
            ErrorTextField.setText("Insira um id de questão válido");
            isValid = false;
        } 
      
        if(id <= 0) {
            ErrorTextField.setText("Insira um id de questão válido");
            isValid = false;
        }
        
        if(isValid) {
            frame.removeQuestionOperation();
            frame.showQuestionMenuScreen();
        }
    }                                             

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
       frame.showQuestionMenuScreen();
    }
}
