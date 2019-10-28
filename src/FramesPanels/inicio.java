package FramesPanels;

import java.awt.event.KeyEvent;
import javafx.scene.input.KeyCode;
import javax.swing.JOptionPane;
import db.MetodosSQL;

public class inicio extends javax.swing.JFrame {

    public inicio() {
        initComponents();
        setLocationRelativeTo(null);

    }

    MetodosSQL metodos = new MetodosSQL();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor_lo = new javax.swing.JPanel();
        jpanel_main = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        txt_pass = new javax.swing.JPasswordField();
        txt_nick = new javax.swing.JTextField();
        btn_regis = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contenedor_lo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpanel_main.setBackground(new java.awt.Color(47, 34, 23));
        jpanel_main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(47, 34, 23));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NOMBRE DE USUARIO");
        jpanel_main.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, -1, -1));

        jLabel5.setBackground(new java.awt.Color(47, 34, 23));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CONTRASEÑA");
        jpanel_main.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, -1, -1));
        jpanel_main.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 230, 10));
        jpanel_main.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 230, 10));

        txt_pass.setBackground(new java.awt.Color(47, 34, 23));
        txt_pass.setForeground(new java.awt.Color(255, 255, 255));
        txt_pass.setText("jPasswordField1");
        txt_pass.setBorder(null);
        txt_pass.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txt_pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_passFocusGained(evt);
            }
        });
        txt_pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_passKeyPressed(evt);
            }
        });
        jpanel_main.add(txt_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 230, 30));

        txt_nick.setBackground(new java.awt.Color(47, 34, 23));
        txt_nick.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txt_nick.setForeground(new java.awt.Color(255, 255, 255));
        txt_nick.setText("Ingresa tu nick");
        txt_nick.setToolTipText("");
        txt_nick.setBorder(null);
        txt_nick.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txt_nick.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_nickFocusGained(evt);
            }
        });
        txt_nick.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_nickMouseClicked(evt);
            }
        });
        txt_nick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nickActionPerformed(evt);
            }
        });
        txt_nick.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_nickKeyPressed(evt);
            }
        });
        jpanel_main.add(txt_nick, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 230, 30));

        btn_regis.setBackground(new java.awt.Color(255, 102, 0));
        btn_regis.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        jpanel_main.add(btn_regis, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 110, 40));

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

        contenedor_lo.add(jpanel_main, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        getContentPane().add(contenedor_lo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_passFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_passFocusGained
        txt_pass.setText("");
    }//GEN-LAST:event_txt_passFocusGained

    private void txt_nickMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_nickMouseClicked

    }//GEN-LAST:event_txt_nickMouseClicked

    private void txt_nickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nickActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nickActionPerformed

    private void btn_regisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_regisMouseClicked

        boolean existeUsuario = MetodosSQL.buscarUsuario(txt_nick.getText(), txt_pass.getText());

        if (txt_nick.getText().equals("root") && txt_pass.getText().equals("root")) {
            JOptionPane.showMessageDialog(this, "Bienvenido iniciaste sesion como root (Administrador)");
            Home Home = new Home();
            Home.jl_nombre.setText("Administrador");
            Home.setVisible(true);
            this.dispose();

        } else if (existeUsuario) {
            String nombreUsuario = MetodosSQL.buscarNombreUsuario(txt_nick.getText());
            JOptionPane.showMessageDialog(this, "Bienvenid@ \n" + nombreUsuario);
            Home Home = new Home();
            Home.setVisible(true);
            Home.jl_nombre.setText(nombreUsuario);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Usuario no registrado");
        }


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

    private void txt_passKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_passKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btn_regisMouseClicked(null);
        }
    }//GEN-LAST:event_txt_passKeyPressed

    private void txt_nickKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nickKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txt_pass.requestFocus();
        }
    }//GEN-LAST:event_txt_nickKeyPressed

    private void txt_nickFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_nickFocusGained
        txt_nick.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nickFocusGained

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
    private javax.swing.JPanel contenedor_lo;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JPanel jpanel_main;
    private javax.swing.JTextField txt_nick;
    private javax.swing.JPasswordField txt_pass;
    // End of variables declaration//GEN-END:variables

}
