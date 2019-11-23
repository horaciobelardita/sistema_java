package FramesPanels;

import db.MetodosSQL;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import modelos.Usuario;
import utils.Helper;

public class inicio extends javax.swing.JFrame {

  public inicio() {
    initComponents();
    setLocationRelativeTo(null);
    txtNick.setText("root");
    txtPassword.setText("root");
  }

  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor_lo = new javax.swing.JPanel();
        jpanel_main = new javax.swing.JPanel();
        lblNombreUsuario = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        txtPassword = new javax.swing.JPasswordField();
        txtNick = new javax.swing.JTextField();
        btn_regis = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        btn_regis1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        lblMensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contenedor_lo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpanel_main.setBackground(new java.awt.Color(47, 34, 23));
        jpanel_main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombreUsuario.setBackground(new java.awt.Color(47, 34, 23));
        lblNombreUsuario.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblNombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreUsuario.setText("NOMBRE DE USUARIO");
        jpanel_main.add(lblNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, -1, -1));

        lblContraseña.setBackground(new java.awt.Color(47, 34, 23));
        lblContraseña.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(255, 255, 255));
        lblContraseña.setText("CONTRASEÑA");
        jpanel_main.add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, -1, -1));
        jpanel_main.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 230, 10));
        jpanel_main.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 230, 10));

        txtPassword.setBackground(new java.awt.Color(47, 34, 23));
        txtPassword.setFont(new java.awt.Font("Fira Sans Semi-Light", 0, 18)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setText("jPasswordField1");
        txtPassword.setBorder(null);
        txtPassword.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
        });
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordKeyReleased(evt);
            }
        });
        jpanel_main.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 230, 30));

        txtNick.setBackground(new java.awt.Color(47, 34, 23));
        txtNick.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtNick.setForeground(new java.awt.Color(255, 255, 255));
        txtNick.setText("Ingresa tu nick");
        txtNick.setToolTipText("");
        txtNick.setBorder(null);
        txtNick.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtNick.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNickFocusGained(evt);
            }
        });
        txtNick.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNickMouseClicked(evt);
            }
        });
        txtNick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNickActionPerformed(evt);
            }
        });
        txtNick.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNickKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNickKeyReleased(evt);
            }
        });
        jpanel_main.add(txtNick, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 230, 30));

        btn_regis.setBackground(new java.awt.Color(255, 102, 0));
        btn_regis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_regis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_regisMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_regisMouseEntered(evt);
            }
        });
        btn_regis.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Iniciar sesión");
        btn_regis.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jpanel_main.add(btn_regis, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, 130, 40));

        jButton2.setBackground(new java.awt.Color(255, 102, 0));
        jButton2.setForeground(new java.awt.Color(255, 102, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon/cerrar1x1.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon/cerrar1x1B.png"))); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jpanel_main.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("V 0.1");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/box blanca.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 190, 10));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 230, 10));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Sistema de gestión");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        jpanel_main.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 500));

        btn_regis1.setBackground(new java.awt.Color(255, 102, 0));
        btn_regis1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_regis1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_regis1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_regis1MouseEntered(evt);
            }
        });
        btn_regis1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Salir");
        btn_regis1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jpanel_main.add(btn_regis1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 90, 40));

        lblMensaje.setFont(new java.awt.Font("Fira Sans Semi-Light", 0, 18)); // NOI18N
        lblMensaje.setForeground(java.awt.Color.white);
        jpanel_main.add(lblMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 330, -1));

        contenedor_lo.add(jpanel_main, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        getContentPane().add(contenedor_lo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
    txtPassword.setText("");
    }//GEN-LAST:event_txtPasswordFocusGained

    private void txtNickMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNickMouseClicked

    }//GEN-LAST:event_txtNickMouseClicked

    private void txtNickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNickActionPerformed
    // TODO add your handling code here:
    }//GEN-LAST:event_txtNickActionPerformed

    private void btn_regisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_regisMouseClicked
    validar();

    }//GEN-LAST:event_btn_regisMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
    int dialog = JOptionPane.YES_NO_OPTION;
    int result = JOptionPane.showConfirmDialog(null, "Desea cerrar el programa?", "Exit", dialog);
    if (result == 0) {
      System.exit(0);
    }
    }//GEN-LAST:event_jButton2MouseClicked

    private void btn_regisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_regisMouseEntered
    // TODO add your handling code here:
    }//GEN-LAST:event_btn_regisMouseEntered

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
    // TODO add your handling code here:
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
      btn_regisMouseClicked(null);
    }
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void txtNickKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNickKeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
      txtPassword.requestFocus();
    }
    }//GEN-LAST:event_txtNickKeyPressed

    private void txtNickFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNickFocusGained
    txtNick.setText("");
    // TODO add your handling code here:
    }//GEN-LAST:event_txtNickFocusGained

    private void btn_regis1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_regis1MouseClicked
    System.exit(0);
    }//GEN-LAST:event_btn_regis1MouseClicked

    private void btn_regis1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_regis1MouseEntered
    // TODO add your handling code here:
    }//GEN-LAST:event_btn_regis1MouseEntered

    private void txtNickKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNickKeyReleased
    if (Helper.esCampoVacio(txtNick)) {
      Helper.mostrarError(txtNick, lblNombreUsuario, "NOMBRE DE USUARIO", new Color(255, 102, 0));
      lblMensaje.setText("Ingrese un usuario");
    } else {
      lblNombreUsuario.setForeground(Color.white);
      lblMensaje.setText("");
    }
    }//GEN-LAST:event_txtNickKeyReleased

    private void txtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyReleased
    String password = new String(txtPassword.getPassword());
    if (password.isEmpty()) {
      Helper.mostrarError(txtPassword, lblContraseña, "CONTRASEÑA", new Color(255, 102, 0));
      lblMensaje.setText("Ingrese su contraseña");
    } else {
      lblContraseña.setForeground(Color.white);
      lblMensaje.setText("");
    }
    }//GEN-LAST:event_txtPasswordKeyReleased

  /**
   * @param args the command line arguments
   */
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
      java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new inicio().setVisible(true);
      }
    });
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_regis;
    private javax.swing.JPanel btn_regis1;
    private javax.swing.JPanel contenedor_lo;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JPanel jpanel_main;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JTextField txtNick;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables

  private void validar() {
    String nombreUsuario = txtNick.getText();
    String password = new String(txtPassword.getPassword());
    if (nombreUsuario.isEmpty() || password.isEmpty()) {
      JOptionPane.showMessageDialog(this, "Ingrese Usuario y contraseña.",
        "Error: Ingrese sus datos de usuario", JOptionPane.ERROR_MESSAGE);
      txtNick.requestFocus();
      return;
    }

    Usuario usuario = MetodosSQL.buscarUsuario(nombreUsuario, password);

    if (usuario.getNombre() != null && usuario.getId() != null) {
      JOptionPane.showMessageDialog(this, "Bienvenid@ \n" + usuario.getNick());
      Home Home = new Home();
      Home.setVisible(true);
      Home.jl_nombre.setText(usuario.getNick());
      this.dispose();
    } else {
      JOptionPane.showMessageDialog(this, "Datos incorrectos: verifique su Nombre de usuario y contraseña\n",
        "Error: Datos no Validos", JOptionPane.ERROR_MESSAGE);
    }
  }

}
