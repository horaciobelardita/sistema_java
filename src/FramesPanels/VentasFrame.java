/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FramesPanels;

import db.MetodosSQL;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import javax.management.openmbean.KeyAlreadyExistsException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import modelos.Cliente;
import modelos.DetalleVenta;
import modelos.Producto;
import modelos.Venta;

/**
 *
 * @author ernes
 */
public class VentasFrame extends javax.swing.JPanel {

    DefaultTableModel modeloTablaProd = new DefaultTableModel() {
        // desabilitar edicion tabla
        @Override
        public boolean isCellEditable(int i, int i1) {
            return false;
        }

    };
    DefaultListModel<Producto> modeloListaProd = new DefaultListModel<>();
    public static DefaultComboBoxModel<Cliente> modeloCboCliente = new DefaultComboBoxModel<Cliente>();

    /**
     * Creates new form ventas
     */
    public VentasFrame() {
        cargarColumnasTabla();
        cargarModeloCboCli();
        initComponents();
        setListenerModeloTabla();
    }
    
    public static void cargarModeloCboCli() {
        ArrayList<Cliente> clientes = MetodosSQL.obtenerClientes();
        for (Cliente cliente : clientes) {
            modeloCboCliente.addElement(cliente);
        }
    }

    private void cargarColumnasTabla() {
        modeloTablaProd.addColumn("Codigo");
        modeloTablaProd.addColumn("Nombre");
        modeloTablaProd.addColumn("Precio Venta");
        modeloTablaProd.addColumn("Cantidad");
        modeloTablaProd.addColumn("Importe");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtBuscarProd = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jPanel1 = new javax.swing.JPanel();
        lblImagenProd = new javax.swing.JLabel();
        btnQuitarProd1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblTotalVenta = new javax.swing.JLabel();
        btnRealizarVta = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtPagaCon = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnNuevoCli = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<Cliente>();
        btnCancelarVta2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(47, 34, 23));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        tabla.setForeground(new java.awt.Color(255, 255, 255));
        tabla.setModel(modeloTablaProd);
        tabla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tablaKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 730, 290));

        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Cliente:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, -1, -1));

        txtBuscarProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarProdKeyReleased(evt);
            }
        });
        add(txtBuscarProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 350, -1));

        jList1.setModel(modeloListaProd);
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jList1MousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(jList1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 350, -1));

        lblImagenProd.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImagenProd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImagenProd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 100, 320, 190));

        btnQuitarProd1.setBackground(new java.awt.Color(255, 102, 0));
        btnQuitarProd1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQuitarProd1MouseClicked(evt);
            }
        });
        btnQuitarProd1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Quitar Producto");
        btnQuitarProd1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 150, -1));

        add(btnQuitarProd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 640, 200, 40));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Fira Sans Semi-Light", 0, 36)); // NOI18N
        jLabel2.setText("Total Venta");

        lblTotalVenta.setFont(new java.awt.Font("Fira Sans Semi-Light", 1, 58)); // NOI18N
        lblTotalVenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotalVenta.setText("0.0");

        btnRealizarVta.setBackground(new java.awt.Color(255, 102, 0));
        btnRealizarVta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRealizarVtaMouseClicked(evt);
            }
        });
        btnRealizarVta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Realizar Venta");
        btnRealizarVta.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 150, -1));

        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Paga con:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTotalVenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRealizarVta, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPagaCon, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addComponent(lblTotalVenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtPagaCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRealizarVta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 310, 320, 340));

        btnNuevoCli.setBackground(new java.awt.Color(255, 102, 0));
        btnNuevoCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevoCliMouseClicked(evt);
            }
        });
        btnNuevoCli.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Nuevo");
        btnNuevoCli.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 60, -1));

        add(btnNuevoCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 110, 90, 40));

        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Buscar Producto:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        jComboBox1.setModel(modeloCboCliente);
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 310, -1));

        btnCancelarVta2.setBackground(new java.awt.Color(255, 102, 0));
        btnCancelarVta2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarVta2MouseClicked(evt);
            }
        });
        btnCancelarVta2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Cancelar Venta");
        btnCancelarVta2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 150, -1));

        add(btnCancelarVta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 640, 200, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRealizarVtaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRealizarVtaMouseClicked
//        obtener total venta y fecha actual
        double totalVenta = Double.parseDouble(lblTotalVenta.getText());
        Date fecha = obtenerFechaActual();
        Cliente cliente =  (Cliente) modeloCboCliente.getSelectedItem();
        String dni = cliente.getDni();
        
        String pagaCon = txtPagaCon.getText();
        double cambio = 0;
        if (!pagaCon.isEmpty()) {
            cambio = Double.parseDouble(pagaCon) - totalVenta;
        }
        
//        insertar en la bd nueva venta
        Venta venta = new Venta(dni, fecha, totalVenta);
        Integer idVenta = MetodosSQL.insertarVenta(venta);
//        insertar detalle venta
        int numRows = modeloTablaProd.getRowCount();
        for (int i = 0; i < numRows; i++) {
            String codigoProd = (String) modeloTablaProd.getValueAt(i, 0);
            String strCantidad = (String) modeloTablaProd.getValueAt(i, 3);
            int cantidad = Integer.parseInt(strCantidad);
            DetalleVenta detalleVenta = new DetalleVenta(
                    idVenta, codigoProd, cantidad
            );
            MetodosSQL.insertarDetalleVenta(detalleVenta);

        }
        if (idVenta != null) {
            JOptionPane.showMessageDialog(this, "Venta generada con exito!");
        }
        eliminarFilasTabla();
        lblTotalVenta.setText("0.0");
        
        if (!pagaCon.isEmpty()) {
            JOptionPane.showMessageDialog(this, String.valueOf(cambio), "Cambio:", JOptionPane.OK_OPTION);
        }
        
    }//GEN-LAST:event_btnRealizarVtaMouseClicked

    private void txtBuscarProdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarProdKeyReleased
        String cadenaBusqueda = txtBuscarProd.getText().toLowerCase();
        if (cadenaBusqueda.isEmpty()) {
            limpiarListaProductos();
        } else {
            ArrayList<Producto> productos = MetodosSQL.obtenerProductosPorCriterio(cadenaBusqueda);
            int numeroProductos = productos.size();
            limpiarListaProductos();

            for (Producto producto : productos) {
                modeloListaProd.addElement(producto);
            }
        }

    }//GEN-LAST:event_txtBuscarProdKeyReleased

    private void jList1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MousePressed
        JList jlist = (JList) evt.getSource();
        // verificar si es doble click
        if (evt.getClickCount() == 2) {
            // obtener indice seleccionado
            int indice = jlist.locationToIndex(evt.getPoint());
            // obtener producto seleccionado
            Producto producto = (Producto) jlist.getSelectedValue();
            agregarProductoAVenta(producto);
        }
    }//GEN-LAST:event_jList1MousePressed

    private void tablaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ADD) {
            int filaSeleccionada = tabla.getSelectedRow();
            String cantidad = JOptionPane.showInputDialog("Ingrese nueva cantidad: ");
            String precioVenta = (String) modeloTablaProd.getValueAt(filaSeleccionada, 2);
//            calcular nuevo importe
            double importe = Double.parseDouble(cantidad) * Double.parseDouble(precioVenta);
            String importeStr = String.valueOf(importe);
//            actualizar la tabla
            modeloTablaProd.setValueAt(cantidad, filaSeleccionada, 3);
            modeloTablaProd.setValueAt(importeStr, filaSeleccionada, 4);
        }
    }//GEN-LAST:event_tablaKeyReleased

    private void btnQuitarProd1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuitarProd1MouseClicked
        int filaSeleccionada = tabla.getSelectedRow();
        int nroFilas = modeloTablaProd.getRowCount();
        if (nroFilas > 0) {
            int opcion = JOptionPane.showConfirmDialog(this, "Seguro de borrar el producto?");
            if (opcion == 0) {
                modeloTablaProd.removeRow(filaSeleccionada);
            }
        }

    }//GEN-LAST:event_btnQuitarProd1MouseClicked

    private void btnNuevoCliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoCliMouseClicked
       Home.mostrarPanel(Home.CLIENTES_FRAME);

    }//GEN-LAST:event_btnNuevoCliMouseClicked

    private void btnCancelarVta2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarVta2MouseClicked
         int nroFilas = modeloTablaProd.getRowCount();
        if (nroFilas > 0) {
            int opcion = JOptionPane.showConfirmDialog(this, "Seguro de cancelar la venta");
            if (opcion == 0) {
                eliminarFilasTabla();
            }
        }
    }//GEN-LAST:event_btnCancelarVta2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnCancelarVta2;
    private javax.swing.JPanel btnNuevoCli;
    private javax.swing.JPanel btnQuitarProd1;
    private javax.swing.JPanel btnRealizarVta;
    private javax.swing.JComboBox<Cliente> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblImagenProd;
    private javax.swing.JLabel lblTotalVenta;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtBuscarProd;
    private javax.swing.JTextField txtPagaCon;
    // End of variables declaration//GEN-END:variables

    private void limpiarListaProductos() {
        modeloListaProd.clear();
    }

    private void agregarProductoAVenta(Producto producto) {
        String[] dataProducto = {
            producto.getCodigo(),
            producto.getNombre(),
            String.valueOf(producto.getPrecioVenta()),
            "1",
            String.valueOf(producto.getPrecioVenta())
        };
        modeloTablaProd.addRow(dataProducto);
    }

    private void setListenerModeloTabla() {
        modeloTablaProd.addTableModelListener(new TableModelListener() {

            @Override
            public void tableChanged(TableModelEvent tme) {
                int nroFilas = modeloTablaProd.getRowCount();
                double total = 0;
                for (int i = 0; i < nroFilas; i++) {
                    String importe = (String) modeloTablaProd.getValueAt(i, 4);
                    total += Double.parseDouble(importe);
                }
                lblTotalVenta.setText(String.valueOf(total));
            }
        });
    }

    private Date obtenerFechaActual() {
        Calendar calendar = Calendar.getInstance();
        java.util.Date fechaActual = calendar.getTime();
        long fechaMilisegundos = fechaActual.getTime();
        return new Date(fechaMilisegundos);
    }

    private void eliminarFilasTabla() {
        for (int i = modeloTablaProd.getRowCount() - 1; i >= 0; i--) {
            modeloTablaProd.removeRow(i);
        }
    }
}
