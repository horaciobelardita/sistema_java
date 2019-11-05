/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FramesPanels;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Home extends javax.swing.JFrame implements ActionListener {


    /*
   clientes clientes = new clientes();
    */
   public static final Inventario INVENTARIO = new Inventario();
   public static final ProductoFrame PRODUCTO_FRAME = new ProductoFrame(null, null, false);
   public static final VentasFrame VENTAS_FRAME = new VentasFrame();
//   ventas ventas = new ventas();
   /*
   proveedores proveedores = new proveedores();
   compras compras = new compras();
   usuarios usuarios = new usuarios();
     */
    public Home() {
        initComponents();
        setLocationRelativeTo(null);
   contenedor.setBackground(new java.awt.Color(47, 34, 23));
        contenedor.setForeground(new java.awt.Color(255, 255, 255));
        contenedor.setAlignmentX(0.0F);
        contenedor.setAlignmentY(0.0F);
        contenedor.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        contenedor.setLayout(new java.awt.BorderLayout());
        contenedor.setPreferredSize(new Dimension(1366, 768));

        btn_clientes.addActionListener(this);
        btn_inven.addActionListener(this);
        btn_ventas.addActionListener(this);
        btn_prove.addActionListener(this);
        btn_compras.addActionListener(this);
        btn_us.addActionListener(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpmenu = new javax.swing.JPanel();
        btn_inven = new javax.swing.JButton();
        btn_clientes = new javax.swing.JButton();
        btn_ventas = new javax.swing.JButton();
        btn_prove = new javax.swing.JButton();
        btn_compras = new javax.swing.JButton();
        btn_us = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        min_cer = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jl_nombre = new javax.swing.JLabel();
        contenedor = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(java.awt.Color.white);
        setMinimumSize(new java.awt.Dimension(600, 768));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1366, 768));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpmenu.setBackground(new java.awt.Color(255, 102, 0));
        jpmenu.setForeground(new java.awt.Color(255, 255, 255));
        jpmenu.setMinimumSize(new java.awt.Dimension(100, 600));
        jpmenu.setPreferredSize(new java.awt.Dimension(290, 768));
        jpmenu.setRequestFocusEnabled(false);
        jpmenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_inven.setBackground(new java.awt.Color(255, 102, 0));
        btn_inven.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_inven.setForeground(new java.awt.Color(255, 255, 255));
        btn_inven.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon/inventario2x2.png"))); // NOI18N
        btn_inven.setText("Inventario");
        btn_inven.setBorder(null);
        btn_inven.setContentAreaFilled(false);
        btn_inven.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_inven.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_inven.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon/inventario2x2B.png"))); // NOI18N
        btn_inven.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btn_inven.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_inven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_invenActionPerformed(evt);
            }
        });
        jpmenu.add(btn_inven, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 100, 90));

        btn_clientes.setBackground(new java.awt.Color(255, 102, 0));
        btn_clientes.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_clientes.setForeground(new java.awt.Color(255, 255, 255));
        btn_clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon/clientes2x2.png"))); // NOI18N
        btn_clientes.setText("Clientes");
        btn_clientes.setBorder(null);
        btn_clientes.setBorderPainted(false);
        btn_clientes.setContentAreaFilled(false);
        btn_clientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_clientes.setDefaultCapable(false);
        btn_clientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_clientes.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon/clientes2x2B.png"))); // NOI18N
        btn_clientes.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btn_clientes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_clientes.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn_clientesMouseMoved(evt);
            }
        });
        btn_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_clientesMouseClicked(evt);
            }
        });
        jpmenu.add(btn_clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 100, 90));

        btn_ventas.setBackground(new java.awt.Color(255, 102, 0));
        btn_ventas.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_ventas.setForeground(new java.awt.Color(255, 255, 255));
        btn_ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon/ventas2x2.png"))); // NOI18N
        btn_ventas.setText("Ventas");
        btn_ventas.setBorder(null);
        btn_ventas.setBorderPainted(false);
        btn_ventas.setContentAreaFilled(false);
        btn_ventas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_ventas.setDefaultCapable(false);
        btn_ventas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_ventas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon/ventas2x2B_1.png"))); // NOI18N
        btn_ventas.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon/ventas2x2B_1.png"))); // NOI18N
        btn_ventas.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btn_ventas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_ventas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn_ventasMouseMoved(evt);
            }
        });
        jpmenu.add(btn_ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 100, 90));

        btn_prove.setBackground(new java.awt.Color(255, 102, 0));
        btn_prove.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_prove.setForeground(new java.awt.Color(255, 255, 255));
        btn_prove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon/proveedores2x2.png"))); // NOI18N
        btn_prove.setText("Proveedores");
        btn_prove.setBorder(null);
        btn_prove.setBorderPainted(false);
        btn_prove.setContentAreaFilled(false);
        btn_prove.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_prove.setDefaultCapable(false);
        btn_prove.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_prove.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon/proveedores2x2B.png"))); // NOI18N
        btn_prove.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon/proveedores2x2B.png"))); // NOI18N
        btn_prove.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btn_prove.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_prove.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn_proveMouseMoved(evt);
            }
        });
        jpmenu.add(btn_prove, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 100, 90));

        btn_compras.setBackground(new java.awt.Color(255, 102, 0));
        btn_compras.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_compras.setForeground(new java.awt.Color(255, 255, 255));
        btn_compras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon/compras2x2.png"))); // NOI18N
        btn_compras.setText("Compras");
        btn_compras.setBorder(null);
        btn_compras.setBorderPainted(false);
        btn_compras.setContentAreaFilled(false);
        btn_compras.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_compras.setDefaultCapable(false);
        btn_compras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_compras.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon/compras2x2B.png"))); // NOI18N
        btn_compras.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btn_compras.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_compras.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn_comprasMouseMoved(evt);
            }
        });
        jpmenu.add(btn_compras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 100, 90));

        btn_us.setBackground(new java.awt.Color(255, 102, 0));
        btn_us.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_us.setForeground(new java.awt.Color(255, 255, 255));
        btn_us.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon/usuarios2x2.png"))); // NOI18N
        btn_us.setText("Usuarios");
        btn_us.setBorder(null);
        btn_us.setBorderPainted(false);
        btn_us.setContentAreaFilled(false);
        btn_us.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_us.setDefaultCapable(false);
        btn_us.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_us.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon/usuarios2x2b.png"))); // NOI18N
        btn_us.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon/usuarios2x2b.png"))); // NOI18N
        btn_us.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btn_us.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_us.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn_usMouseMoved(evt);
            }
        });
        jpmenu.add(btn_us, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 100, 90));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gestion V 0.1");
        jpmenu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 90, 20));

        getContentPane().add(jpmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 780));

        min_cer.setBackground(new java.awt.Color(255, 102, 0));

        jButton1.setBackground(new java.awt.Color(255, 102, 0));
        jButton1.setForeground(new java.awt.Color(255, 102, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon/minimizar1x1.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon/minimizar1x1B.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario:");

        jl_nombre.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jl_nombre.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout min_cerLayout = new javax.swing.GroupLayout(min_cer);
        min_cer.setLayout(min_cerLayout);
        min_cerLayout.setHorizontalGroup(
            min_cerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, min_cerLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jl_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 708, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap())
        );
        min_cerLayout.setVerticalGroup(
            min_cerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(min_cerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(min_cerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, min_cerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton1)
                        .addComponent(jButton2)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getContentPane().add(min_cer, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 1270, 30));

        contenedor.setBackground(new java.awt.Color(47, 34, 23));
        contenedor.setPreferredSize(new java.awt.Dimension(850, 768));

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1270, Short.MAX_VALUE)
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );

        getContentPane().add(contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 1270, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_clientesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clientesMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_clientesMouseMoved

    private void btn_ventasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ventasMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ventasMouseMoved

    private void btn_proveMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_proveMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_proveMouseMoved

    private void btn_comprasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_comprasMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_comprasMouseMoved

    private void btn_usMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_usMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_usMouseMoved

    private void btn_clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clientesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_clientesMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        this.setState(Home.ICONIFIED);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "Desea cerrar el programa?", "Exit", dialog);
        if (result == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton2MouseClicked
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_invenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_invenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_invenActionPerformed

    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clientes;
    private javax.swing.JButton btn_compras;
    private javax.swing.JButton btn_inven;
    private javax.swing.JButton btn_prove;
    private javax.swing.JButton btn_us;
    private javax.swing.JButton btn_ventas;
    public static javax.swing.JPanel contenedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jl_nombre;
    private javax.swing.JPanel jpmenu;
    private javax.swing.JPanel min_cer;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {

        Object evt = ae.getSource(); //variable comparadora

        if (evt.equals(btn_clientes)) {
            /*
            clientes.setVisible(true);
            Inventario.setVisible(false);
            ventas.setVisible(false);
            proveedores.setVisible(false);
            compras.setVisible(false);
            usuarios.setVisible(false);
            contenedor.add(clientes);
            contenedor.validate(); //actualizar el contenedor
            */
        } else if (evt.equals(btn_inven)) {
            mostrarPanel(Home.INVENTARIO);
        }else if (evt.equals(btn_ventas)) {
            
            mostrarPanel(Home.VENTAS_FRAME);
        }else if (evt.equals(btn_prove)) {
//            clientes.setVisible(false);
//            Inventario.setVisible(false);
//            ventas.setVisible(false);
//            proveedores.setVisible(true);
//            compras.setVisible(false);
//            usuarios.setVisible(false);
//            contenedor.add(proveedores);
            
//            contenedor.validate();
    }else if (evt.equals(btn_compras)) {
//            clientes.setVisible(false);
//            Inventario.setVisible(false);
//            ventas.setVisible(false);
//            proveedores.setVisible(false);
//            compras.setVisible(true);
//            usuarios.setVisible(false);
//            contenedor.add(compras);
//            
//            contenedor.validate();
    }else if (evt.equals(btn_us)) {
//            clientes.setVisible(false);
//            Inventario.setVisible(false);
//            ventas.setVisible(false);
//            proveedores.setVisible(false);
//            compras.setVisible(false);
//            usuarios.setVisible(true);
//            contenedor.add(usuarios);
//            
//            contenedor.validate();
    }
        }

    private void mostrarPanel(JPanel panel) {
            panel.setVisible(true);
            contenedor.removeAll();
            contenedor.add(panel);
            contenedor.revalidate();
            contenedor.repaint();//actualizar el contenedor
    }
}
