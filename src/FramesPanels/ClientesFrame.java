/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FramesPanels;

import db.MetodosSQL;
import javax.swing.JOptionPane;
import modelos.Cliente;

/**
 *
 * @author ernes
 */
public class ClientesFrame extends javax.swing.JPanel {

    /**
     * Creates new form clientes
     */
    public ClientesFrame() {
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

        txtNombreCli = new javax.swing.JTextField();
        txtTelCli = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtApellidoCli = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDniCli = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cboCatIva = new javax.swing.JComboBox<String>();
        btnCancelar = new javax.swing.JPanel();
        btn_regis2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btnGuardarCliente = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        btn_regis4 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(47, 34, 23));
        setPreferredSize(new java.awt.Dimension(1050, 575));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombreCli.setBackground(new java.awt.Color(47, 34, 23));
        txtNombreCli.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNombreCli.setForeground(new java.awt.Color(255, 255, 255));
        add(txtNombreCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 240, -1));

        txtTelCli.setBackground(new java.awt.Color(47, 34, 23));
        txtTelCli.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtTelCli.setForeground(new java.awt.Color(255, 255, 255));
        add(txtTelCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 240, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Teléfono");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, -1, -1));

        txtApellidoCli.setBackground(new java.awt.Color(47, 34, 23));
        txtApellidoCli.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtApellidoCli.setForeground(new java.awt.Color(255, 255, 255));
        txtApellidoCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoCliActionPerformed(evt);
            }
        });
        add(txtApellidoCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 240, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Apellidos");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 190, 90, -1));

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(228, 575));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clientes.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 740));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DNI");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, -1, -1));

        txtDniCli.setBackground(new java.awt.Color(47, 34, 23));
        txtDniCli.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtDniCli.setForeground(new java.awt.Color(255, 255, 255));
        add(txtDniCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 240, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Categoria IVA");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, -1, -1));

        cboCatIva.setForeground(new java.awt.Color(255, 255, 255));
        cboCatIva.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Consumidor final", "Exento", "Exterior", "Monotributista", "Responsable inscripto" }));
        add(cboCatIva, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 240, -1));

        btnCancelar.setBackground(new java.awt.Color(255, 102, 0));
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelarMouseEntered(evt);
            }
        });
        btnCancelar.setLayout(new java.awt.GridBagLayout());

        btn_regis2.setBackground(new java.awt.Color(255, 102, 0));
        btn_regis2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_regis2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_regis2MouseClicked(evt);
            }
        });
        btn_regis2.setLayout(new java.awt.GridBagLayout());
        btnCancelar.add(btn_regis2, new java.awt.GridBagConstraints());

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Cancelar");
        btnCancelar.add(jLabel11, new java.awt.GridBagConstraints());

        add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 110, 40));

        btnGuardarCliente.setBackground(new java.awt.Color(255, 102, 0));
        btnGuardarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGuardarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarClienteMouseClicked(evt);
            }
        });
        btnGuardarCliente.setLayout(new java.awt.GridBagLayout());

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Guardar");
        btnGuardarCliente.add(jLabel12, new java.awt.GridBagConstraints());

        btn_regis4.setBackground(new java.awt.Color(255, 102, 0));
        btn_regis4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_regis4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_regis4MouseClicked(evt);
            }
        });
        btn_regis4.setLayout(new java.awt.GridBagLayout());
        btnGuardarCliente.add(btn_regis4, new java.awt.GridBagConstraints());

        add(btnGuardarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, 110, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void txtApellidoCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoCliActionPerformed

    private void btn_regis2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_regis2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_regis2MouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
      Home.mostrarPanel(Home.VENTAS_FRAME);
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarMouseEntered

    private void btn_regis4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_regis4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_regis4MouseClicked

    private void btnGuardarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarClienteMouseClicked
     Cliente cliente = new Cliente();
     cliente.setDni(txtDniCli.getText());
     cliente.setNombre(txtNombreCli.getText());
     cliente.setApellido(txtApellidoCli.getText());
     cliente.setCategoriaIva((String) cboCatIva.getSelectedItem());
     int resultado = MetodosSQL.guardarCliente(cliente);
     if (resultado > 0) {
         JOptionPane.showMessageDialog(this, "Cliente Guardado con exito!");
         Home.VENTAS_FRAME.cargarModeloCboCli();
         Home.mostrarPanel(Home.VENTAS_FRAME);
     } else {
         JOptionPane.showMessageDialog(this, "Ocurrio un error intentelo nuevamente");
         txtDniCli.requestFocus();
     }
    }//GEN-LAST:event_btnGuardarClienteMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnCancelar;
    private javax.swing.JPanel btnGuardarCliente;
    private javax.swing.JPanel btn_regis2;
    private javax.swing.JPanel btn_regis4;
    private javax.swing.JComboBox<String> cboCatIva;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtApellidoCli;
    private javax.swing.JTextField txtDniCli;
    private javax.swing.JTextField txtNombreCli;
    private javax.swing.JTextField txtTelCli;
    // End of variables declaration//GEN-END:variables
}