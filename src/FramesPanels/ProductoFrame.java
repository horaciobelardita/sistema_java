/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FramesPanels;

import db.MetodosSQL;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import modelos.Producto;
import modelos.Proveedor;

/**
 *
 * @author Horacio
 */
public class ProductoFrame extends javax.swing.JPanel {

    DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel<>();
    private File imgProducto;
    public boolean estaActualizando;
    /**
     * Creates new form ProductoFrame1
     */
    public ProductoFrame() {
        cargarModeloCombo();
        initComponents();
        this.estaActualizando = false;
//        if (producto != null) {
//            cargarProducto(producto, icon);
//        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCodigoProd = new javax.swing.JTextField();
        txt_nom_inv = new javax.swing.JTextField();
        txt_pre_com_inv = new javax.swing.JTextField();
        txt_pre_ven_inv = new javax.swing.JTextField();
        txt_cant_inv = new javax.swing.JTextField();
        txt_descr_inv = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JPanel();
        btn_regis2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btnGuardarProducto = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        btn_regis4 = new javax.swing.JPanel();
        cboProveedor = new javax.swing.JComboBox<Proveedor>();
        jPanel1 = new javax.swing.JPanel();
        lblImagenProducto = new javax.swing.JLabel();

        setBackground(new java.awt.Color(47, 34, 23));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCodigoProd.setBackground(new java.awt.Color(47, 34, 23));
        txtCodigoProd.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCodigoProd.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoProdActionPerformed(evt);
            }
        });
        add(txtCodigoProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 260, -1));

        txt_nom_inv.setBackground(new java.awt.Color(47, 34, 23));
        txt_nom_inv.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_nom_inv.setForeground(new java.awt.Color(255, 255, 255));
        add(txt_nom_inv, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 260, -1));

        txt_pre_com_inv.setBackground(new java.awt.Color(47, 34, 23));
        txt_pre_com_inv.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_pre_com_inv.setForeground(new java.awt.Color(255, 255, 255));
        add(txt_pre_com_inv, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 100, -1));

        txt_pre_ven_inv.setBackground(new java.awt.Color(47, 34, 23));
        txt_pre_ven_inv.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_pre_ven_inv.setForeground(new java.awt.Color(255, 255, 255));
        add(txt_pre_ven_inv, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 100, -1));

        txt_cant_inv.setBackground(new java.awt.Color(47, 34, 23));
        txt_cant_inv.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_cant_inv.setForeground(new java.awt.Color(255, 255, 255));
        txt_cant_inv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cant_invActionPerformed(evt);
            }
        });
        add(txt_cant_inv, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 80, -1));

        txt_descr_inv.setBackground(new java.awt.Color(47, 34, 23));
        txt_descr_inv.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_descr_inv.setForeground(new java.awt.Color(255, 255, 255));
        add(txt_descr_inv, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 520, 260, 90));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Codigo:");
        jLabel1.setInheritsPopupMenu(false);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre");
        jLabel2.setInheritsPopupMenu(false);
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Precio de compra");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Precio de venta");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("cantidad");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, -1, 20));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Descripción");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 520, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Proveedor");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, -1, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Imagen");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));
        jPanel2.setMinimumSize(new java.awt.Dimension(245, 345));
        jPanel2.setPreferredSize(new java.awt.Dimension(233, 575));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inventario.png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 740));

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

        add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 650, 110, 40));

        btnGuardarProducto.setBackground(new java.awt.Color(255, 102, 0));
        btnGuardarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGuardarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarProductoMouseClicked(evt);
            }
        });
        btnGuardarProducto.setLayout(new java.awt.GridBagLayout());

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Guardar");
        btnGuardarProducto.add(jLabel12, new java.awt.GridBagConstraints());

        btn_regis4.setBackground(new java.awt.Color(255, 102, 0));
        btn_regis4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_regis4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_regis4MouseClicked(evt);
            }
        });
        btn_regis4.setLayout(new java.awt.GridBagLayout());
        btnGuardarProducto.add(btn_regis4, new java.awt.GridBagConstraints());

        add(btnGuardarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 650, 110, 40));

        cboProveedor.setModel(modeloCombo);
        add(cboProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 260, -1));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        lblImagenProducto.setPreferredSize(new java.awt.Dimension(200, 200));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImagenProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImagenProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, 260, 150));
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoProdActionPerformed

    private void txt_cant_invActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cant_invActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cant_invActionPerformed

    private void btn_regis2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_regis2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_regis2MouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        
        Home.mostrarPanel(Home.INVENTARIO);

    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btn_regis4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_regis4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_regis4MouseClicked

    private void btnGuardarProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarProductoMouseClicked
//        obtener los valores ingresados en los campos
        String codigo = txtCodigoProd.getText();
        String nombre = txt_nom_inv.getText();
        Integer stock = Integer.parseInt(txt_cant_inv.getText());
        String descripcion = txt_descr_inv.getText();
        double precioVenta = Double.parseDouble(txt_pre_ven_inv.getText());
        double precioCompra = Double.parseDouble(txt_pre_com_inv.getText());
        Proveedor proveedor = (Proveedor) cboProveedor.getSelectedItem();
        int filasAfectadas = 0;
//      instancia de un nuevo producto con los valores
        Producto producto;
        producto = new Producto();
        producto.setCodigo(codigo.toLowerCase());
        producto.setNombre(nombre.toLowerCase());
        producto.setDescripcion(descripcion.toLowerCase());
        producto.setPrecioCompra(precioCompra);
        producto.setPrecioVenta(precioVenta);
        producto.setIdProveedor(proveedor.getId());
        producto.setStock(stock);
        if (imgProducto == null) {
            producto.setFoto(new File(getClass().getResource("/images/no_img.png").getFile()));

        } else {
            producto.setFoto(imgProducto);
        }
        String msg = "";
        if (!estaActualizando) {
            // guardar producto
            if (producto.getFoto() == null) {
                // guardar producto sin foto
                filasAfectadas = MetodosSQL.guardarProducto(producto, false);
            } else {
                // guardar producto con foto
                filasAfectadas = MetodosSQL.guardarProducto(producto, true);
            }
            msg = "Producto agregado con exito!";
        } else {
            // actualizar
            if (producto.getFoto() == null) {
                // actualizar producto sin foto
                filasAfectadas = MetodosSQL.actualizarProducto(producto, false);
            } else {
                // actualizar producto con foto
                filasAfectadas = MetodosSQL.actualizarProducto(producto, true);
            }
            msg = "Producto actualizado con exito!";
        }
        if (filasAfectadas > 0) {
            JOptionPane.showMessageDialog(null, msg);
            Home.INVENTARIO.reiniciarPanel();
            Home.mostrarPanel(Home.INVENTARIO);

            Home.INVENTARIO.cargarModeloTabla(null);
        }
    }//GEN-LAST:event_btnGuardarProductoMouseClicked

    private void btnCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarMouseEntered

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "Archivos de imagen (.jpg, .png, .gif)", "jpg", "jpeg", "png", "gif");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            int ancho = lblImagenProducto.getWidth();
            int alto = lblImagenProducto.getHeight();

            imgProducto = chooser.getSelectedFile();
            ImageIcon icono = new ImageIcon(imgProducto.getAbsolutePath());
            Image imagen = icono.getImage();
            imagen.getScaledInstance(ancho, alto, Image.SCALE_DEFAULT);
            ImageIcon iconoRedimensionado = new ImageIcon(imagen);
            lblImagenProducto.setIcon(iconoRedimensionado);
        }
    }//GEN-LAST:event_jPanel1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnCancelar;
    private javax.swing.JPanel btnGuardarProducto;
    private javax.swing.JPanel btn_regis2;
    private javax.swing.JPanel btn_regis4;
    private javax.swing.JComboBox<Proveedor> cboProveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblImagenProducto;
    private javax.swing.JTextField txtCodigoProd;
    private javax.swing.JTextField txt_cant_inv;
    private javax.swing.JTextField txt_descr_inv;
    private javax.swing.JTextField txt_nom_inv;
    private javax.swing.JTextField txt_pre_com_inv;
    private javax.swing.JTextField txt_pre_ven_inv;
    // End of variables declaration//GEN-END:variables

    private void cargarModeloCombo() {
        ArrayList<Proveedor> proveedores = MetodosSQL.obtenerProveedores();
        for (Proveedor proveedor : proveedores) {
            modeloCombo.addElement(proveedor);
        }
    }

    public void reiniciarPanel() {
        txtCodigoProd.setText("");
        txt_nom_inv.setText("");
        txt_descr_inv.setText("");
        txt_cant_inv.setText("");
        txt_pre_com_inv.setText("");
        txt_pre_ven_inv.setText("");
        lblImagenProducto.setIcon(null);
        txtCodigoProd.setEnabled(true);
        txt_nom_inv.setEnabled(true);
        estaActualizando = false;
    }

    public void cargarProducto(Producto producto, ImageIcon icon) {
        estaActualizando = true;
        if (icon != null) {
            //Redimensión de imagen para ajustarla al tamaño del JLabel.
            Image imgProd = icon.getImage();
            int anchoEtiqueta = lblImagenProducto.getWidth(); //Obtiene ancho de la imagen
            int altoEtiqueta = lblImagenProducto.getHeight(); //Obtiene alto de la imagen
            lblImagenProducto.setPreferredSize(new Dimension(200, 200));
            //Se crea un nuevo objeto Image con la imagen redimensionada.
            Image imgRedimensionada = imgProd.getScaledInstance(200, 200, Image.SCALE_DEFAULT);

            //Se crea un nuevo objeto ImageIcon a partir de la imagen redimensionada.
            ImageIcon iconRedimensionado = new ImageIcon(imgRedimensionada);
                    
            lblImagenProducto.setIcon(iconRedimensionado);
        } else {
            lblImagenProducto.setIcon(null);
        }
        String codigo = producto.getCodigo();
        String nombre = producto.getNombre();
        String descripcion = producto.getDescripcion();
        int stock = producto.getStock();
        double precioCompra = producto.getPrecioCompra();
        double precioVenta = producto.getPrecioVenta();
        txtCodigoProd.setText(codigo);
        txt_nom_inv.setText(nombre);
        txt_descr_inv.setText(descripcion);
        txt_cant_inv.setText(String.valueOf(stock));
        txt_pre_com_inv.setText(String.valueOf(precioCompra));
        txt_pre_ven_inv.setText(String.valueOf(precioVenta));
        seleccionarProveedorCombo(producto.getIdProveedor());
        txtCodigoProd.setEnabled(false);

    }

    private void seleccionarProveedorCombo(Integer idProveedor) {
        for (int i = 0; i < cboProveedor.getItemCount(); i++) {
            Proveedor prov = cboProveedor.getItemAt(i);
            if (prov.getId() == idProveedor) {
                cboProveedor.getModel().setSelectedItem(prov);
                break;
            }
        }

    }

  
}
