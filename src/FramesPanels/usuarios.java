package FramesPanels;

import javax.swing.JOptionPane;
import db.MetodosSQL;

public class usuarios extends javax.swing.JPanel {

    public usuarios() {
        initComponents();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txt_nick = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_email_user = new javax.swing.JTextField();
        txt_pass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_regis = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        cb_permisos = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(47, 34, 23));
        setMinimumSize(new java.awt.Dimension(580, 500));
        setPreferredSize(new java.awt.Dimension(580, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usuarios.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 600));

        txt_nick.setBackground(new java.awt.Color(47, 34, 23));
        txt_nick.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_nick.setForeground(new java.awt.Color(255, 255, 255));
        txt_nick.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_nick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nickActionPerformed(evt);
            }
        });
        add(txt_nick, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 240, -1));

        txt_nombre.setBackground(new java.awt.Color(47, 34, 23));
        txt_nombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(255, 255, 255));
        txt_nombre.setCaretColor(new java.awt.Color(255, 255, 255));
        add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 240, -1));

        txt_email_user.setBackground(new java.awt.Color(47, 34, 23));
        txt_email_user.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_email_user.setForeground(new java.awt.Color(255, 255, 255));
        txt_email_user.setCaretColor(new java.awt.Color(255, 255, 255));
        add(txt_email_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 240, -1));

        txt_pass.setBackground(new java.awt.Color(47, 34, 23));
        txt_pass.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_pass.setForeground(new java.awt.Color(255, 255, 255));
        txt_pass.setText("jPasswordField1");
        txt_pass.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_passFocusGained(evt);
            }
        });
        add(txt_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 240, -1));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre completo");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("E-mail");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Contraseña");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombre de usuario");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Permisos:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, -1, -1));

        btn_regis.setBackground(new java.awt.Color(255, 102, 0));
        btn_regis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_regis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_regisMouseClicked(evt);
            }
        });
        btn_regis.setLayout(new java.awt.GridBagLayout());

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Guardar");
        btn_regis.add(jLabel10, new java.awt.GridBagConstraints());

        add(btn_regis, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, 110, 40));

        cb_permisos.setBackground(new java.awt.Color(47, 34, 23));
        cb_permisos.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cb_permisos.setForeground(new java.awt.Color(255, 255, 255));
        cb_permisos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Compras, Proveedores", "Inventario", "Ventas" }));
        add(cb_permisos, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 240, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nickActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nickActionPerformed

    private void btn_regisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_regisMouseClicked
        int filasAfectadas = MetodosSQL.guardarUsuario(txt_nick.getText(), txt_nombre.getText(), txt_email_user.getText(), txt_pass.getText(),(String) cb_permisos.getSelectedItem());
        if (filasAfectadas > 0) {
            JOptionPane.showMessageDialog(this, "Datos guardados corectamente");
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo guardar los datos");
        }
    }//GEN-LAST:event_btn_regisMouseClicked

    private void txt_passFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_passFocusGained
        txt_pass.setText("");
    }//GEN-LAST:event_txt_passFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_regis;
    private javax.swing.JComboBox<String> cb_permisos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_email_user;
    private javax.swing.JTextField txt_nick;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JPasswordField txt_pass;
    // End of variables declaration//GEN-END:variables
}
