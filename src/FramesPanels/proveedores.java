
package FramesPanels;
import javax.swing.JOptionPane;

public class proveedores extends javax.swing.JPanel {


    public proveedores() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_id_prove = new javax.swing.JTextField();
        txt_nom_prove = new javax.swing.JTextField();
        txt_rubro = new javax.swing.JTextField();
        txt_tel_prove = new javax.swing.JTextField();
        txt_dir_prove = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btn_regis1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_cuil_cuit = new javax.swing.JTextField();

        setBackground(new java.awt.Color(47, 34, 23));
        setPreferredSize(new java.awt.Dimension(1050, 575));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_id_prove.setBackground(new java.awt.Color(47, 34, 23));
        txt_id_prove.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_id_prove.setForeground(new java.awt.Color(255, 255, 255));
        txt_id_prove.setText("muestr sifguiente id");
        txt_id_prove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_proveActionPerformed(evt);
            }
        });
        add(txt_id_prove, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 80, -1));

        txt_nom_prove.setBackground(new java.awt.Color(47, 34, 23));
        txt_nom_prove.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_nom_prove.setForeground(new java.awt.Color(255, 255, 255));
        add(txt_nom_prove, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 240, -1));

        txt_rubro.setBackground(new java.awt.Color(47, 34, 23));
        txt_rubro.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_rubro.setForeground(new java.awt.Color(255, 255, 255));
        txt_rubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_rubroActionPerformed(evt);
            }
        });
        add(txt_rubro, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 240, -1));

        txt_tel_prove.setBackground(new java.awt.Color(47, 34, 23));
        txt_tel_prove.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_tel_prove.setForeground(new java.awt.Color(255, 255, 255));
        add(txt_tel_prove, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 120, -1));

        txt_dir_prove.setBackground(new java.awt.Color(47, 34, 23));
        txt_dir_prove.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_dir_prove.setForeground(new java.awt.Color(255, 255, 255));
        add(txt_dir_prove, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 240, -1));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("id");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Rubros");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Teléfono");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Dirección");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, 20));

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/proveedores.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 600));

        btn_regis1.setBackground(new java.awt.Color(255, 102, 0));
        btn_regis1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_regis1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_regis1MouseClicked(evt);
            }
        });
        btn_regis1.setLayout(new java.awt.GridBagLayout());

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Guardar");
        btn_regis1.add(jLabel11, new java.awt.GridBagConstraints());

        add(btn_regis1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 110, 40));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cuit/Cuil");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, -1, -1));

        txt_cuil_cuit.setBackground(new java.awt.Color(47, 34, 23));
        txt_cuil_cuit.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_cuil_cuit.setForeground(new java.awt.Color(255, 255, 255));
        txt_cuil_cuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cuil_cuitActionPerformed(evt);
            }
        });
        add(txt_cuil_cuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 240, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txt_id_proveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_proveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_proveActionPerformed

    private void txt_rubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_rubroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_rubroActionPerformed

    private void btn_regis1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_regis1MouseClicked

//        int i = metodos.guardar_prove(txt_nom_prove.getText(), txt_dir_prove.getText(),txt_tel_prove.getText(), txt_cuil_cuit.getText(), txt_rubro.getText());
/*
        if (i > 0) {
            JOptionPane.showMessageDialog(this, "Datos guardados corectamente");
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo guardar los datos");
        }
*/
    }//GEN-LAST:event_btn_regis1MouseClicked

    private void txt_cuil_cuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cuil_cuitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cuil_cuitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_regis1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_cuil_cuit;
    private javax.swing.JTextField txt_dir_prove;
    private javax.swing.JTextField txt_id_prove;
    private javax.swing.JTextField txt_nom_prove;
    private javax.swing.JTextField txt_rubro;
    private javax.swing.JTextField txt_tel_prove;
    // End of variables declaration//GEN-END:variables
}
