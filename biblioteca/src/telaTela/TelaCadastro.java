
package telaTela;

import java.awt.event.KeyEvent;

/**
 *
 * @author WESLEY
 */
public class TelaCadastro extends javax.swing.JFrame {
    
    
    
    public TelaCadastro() {
        initComponents();
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entradaAutor = new javax.swing.JTextField();
        entradaTitulo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        botaoRadio = new javax.swing.JRadioButton();
        botaoLimpar = new javax.swing.JButton();
        botaoConfirma = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        escolhaGenero = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        entradaAutor.setBackground(new java.awt.Color(255, 255, 255));
        entradaAutor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                entradaAutorKeyPressed(evt);
            }
        });
        getContentPane().add(entradaAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 210, -1));

        entradaTitulo.setBackground(new java.awt.Color(255, 255, 255));
        entradaTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaTituloActionPerformed(evt);
            }
        });
        entradaTitulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                entradaTituloKeyPressed(evt);
            }
        });
        getContentPane().add(entradaTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 210, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 51));
        jLabel6.setText("Ano");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 40, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 51));
        jLabel5.setText("Gênero");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 50, -1));

        botaoRadio.setBackground(new java.awt.Color(255, 255, 255));
        botaoRadio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botaoRadio.setForeground(new java.awt.Color(0, 51, 51));
        botaoRadio.setText("jRadioButton1");
        botaoRadio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botaoRadioKeyPressed(evt);
            }
        });
        getContentPane().add(botaoRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 20, -1));

        botaoLimpar.setBackground(new java.awt.Color(255, 255, 255));
        botaoLimpar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botaoLimpar.setForeground(new java.awt.Color(0, 51, 51));
        botaoLimpar.setText("Limpar");
        botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparActionPerformed(evt);
            }
        });
        getContentPane().add(botaoLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 110, -1));

        botaoConfirma.setBackground(new java.awt.Color(255, 255, 255));
        botaoConfirma.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botaoConfirma.setForeground(new java.awt.Color(0, 51, 51));
        botaoConfirma.setText("Confirmar");
        botaoConfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConfirmaActionPerformed(evt);
            }
        });
        getContentPane().add(botaoConfirma, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 110, -1));

        jSpinner1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jSpinner1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                jSpinner1AncestorRemoved(evt);
            }
        });
        jSpinner1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jSpinner1KeyPressed(evt);
            }
        });
        getContentPane().add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 100, -1));

        escolhaGenero.setBackground(new java.awt.Color(255, 255, 255));
        escolhaGenero.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        escolhaGenero.setForeground(new java.awt.Color(0, 51, 51));
        escolhaGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fantasia", "Ficção científica", "Distopia", "Ação e aventura", "Ficção Policial", "Thriller e Suspense", "Ficção histórica", "Romance", "Ficção Feminina", "Ficção Contemporânea", "Realismo mágico", "Graphic Novel", "Conto" }));
        getContentPane().add(escolhaGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 110, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setText("Autor");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 60, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("Título");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 50, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("         Cadastro Bibliotecário");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 210, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/images4.jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 352, 287));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
       limpar();
    }//GEN-LAST:event_botaoLimparActionPerformed

    private void entradaTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaTituloActionPerformed

    private void botaoConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConfirmaActionPerformed
        limpar();
    }//GEN-LAST:event_botaoConfirmaActionPerformed

    private void entradaTituloKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_entradaTituloKeyPressed
         if(KeyEvent.VK_ENTER==evt.getKeyCode()){
            entradaAutor.requestFocus();    
        }
    }//GEN-LAST:event_entradaTituloKeyPressed

    private void jSpinner1AncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jSpinner1AncestorRemoved
        
    }//GEN-LAST:event_jSpinner1AncestorRemoved

    private void entradaAutorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_entradaAutorKeyPressed
        if(KeyEvent.VK_ENTER==evt.getKeyCode()){
            escolhaGenero.requestFocus();    
        }
    }//GEN-LAST:event_entradaAutorKeyPressed

    private void botaoRadioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botaoRadioKeyPressed
       
    }//GEN-LAST:event_botaoRadioKeyPressed

    private void jSpinner1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSpinner1KeyPressed
        
    }//GEN-LAST:event_jSpinner1KeyPressed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }
    private void limpar(){
        entradaTitulo.setText("");
        entradaAutor.setText("");
        entradaTitulo.requestFocus();
       
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoConfirma;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JRadioButton botaoRadio;
    private javax.swing.JTextField entradaAutor;
    private javax.swing.JTextField entradaTitulo;
    private javax.swing.JComboBox<String> escolhaGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSpinner jSpinner1;
    // End of variables declaration//GEN-END:variables

    void showConfirmDialog() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void showMessageDialog(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}



