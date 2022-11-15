
package telaTela;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;


public class LoginTela extends javax.swing.JFrame {
   

   
    public LoginTela() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        senhaLog = new javax.swing.JTextField();
        loginLog = new javax.swing.JTextField();
        butaoCom = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        senhaLog.setBackground(new java.awt.Color(255, 255, 255));
        senhaLog.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        senhaLog.setForeground(new java.awt.Color(102, 0, 0));
        getContentPane().add(senhaLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 90, 20));

        loginLog.setBackground(new java.awt.Color(255, 255, 255));
        loginLog.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loginLog.setForeground(new java.awt.Color(102, 0, 0));
        loginLog.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginLogKeyPressed(evt);
            }
        });
        getContentPane().add(loginLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 90, 20));

        butaoCom.setBackground(new java.awt.Color(255, 255, 255));
        butaoCom.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        butaoCom.setForeground(new java.awt.Color(0, 0, 51));
        butaoCom.setText("Confirmar");
        butaoCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butaoComActionPerformed(evt);
            }
        });
        butaoCom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                butaoComKeyPressed(evt);
            }
        });
        getContentPane().add(butaoCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 130, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("Senha");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 70, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("Login");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 80, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Tela de Login");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 120, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/images1.jpeg"))); // NOI18N
        jLabel2.setText("Confrimar");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 314, 195));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butaoComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butaoComActionPerformed
        if(loginLog.getText().equals("cefet")&& senhaLog.getText().equals("2021")){
             TelaCadastro cadastrar=new TelaCadastro();
             
            cadastrar.setVisible(true);
            this.dispose();
             //TelaCadastro cadastro=new TelaCadastro();
              cadastrar.setLocationRelativeTo(null);
              
        }else{
            JOptionPane.showMessageDialog(this,"Dados Inválidos");
           
        }
        
        
    }//GEN-LAST:event_butaoComActionPerformed

    private void loginLogKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginLogKeyPressed
        if(KeyEvent.VK_ENTER==evt.getKeyCode()){
            senhaLog.requestFocus();    
        }
    }//GEN-LAST:event_loginLogKeyPressed

    private void butaoComKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_butaoComKeyPressed
         
    }//GEN-LAST:event_butaoComKeyPressed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginTela().setVisible(true);
               
              
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butaoCom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField loginLog;
    private javax.swing.JTextField senhaLog;
    // End of variables declaration//GEN-END:variables
}
