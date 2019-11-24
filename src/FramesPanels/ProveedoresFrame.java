package FramesPanels;

import db.MetodosSQL;
import java.awt.Color;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import modelos.Proveedor;
import utils.Helper;
import utils.Paginador;

public class ProveedoresFrame extends javax.swing.JPanel {

  private DefaultTableModel modeloTablaProveedores = null;

  private int registrosXPag = 6;
  private Paginador<Proveedor> paginador;
  private List<Proveedor> listaProveedores;
  private final SpinnerNumberModel modeloSpinner;
  private int numPagina;
  private Proveedor proveedorSeleccionado = null;
  private String accion;

  public ProveedoresFrame() {
    modeloSpinner = new SpinnerNumberModel(registrosXPag, 1, 100, 1);
    configurarTabla();
    initComponents();
    numPagina = 1;
    restablecer();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    jLabel9 = new javax.swing.JLabel();
    jPanel2 = new javax.swing.JPanel();
    lblNombre = new javax.swing.JLabel();
    txtNombreProv = new javax.swing.JTextField();
    lblIdentificacion = new javax.swing.JLabel();
    txtIdentificacionProv = new javax.swing.JTextField();
    lblTelefono = new javax.swing.JLabel();
    txtTelProv = new javax.swing.JTextField();
    lblDomicilio = new javax.swing.JLabel();
    txtDirProv = new javax.swing.JTextField();
    btn_regis1 = new javax.swing.JPanel();
    jLabel11 = new javax.swing.JLabel();
    btn_regis2 = new javax.swing.JPanel();
    jLabel12 = new javax.swing.JLabel();
    btn_regis3 = new javax.swing.JPanel();
    jLabel13 = new javax.swing.JLabel();
    lblEmail = new javax.swing.JLabel();
    txtEmailProv = new javax.swing.JTextField();
    jLabel1 = new javax.swing.JLabel();
    jPanel3 = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    tablaProveedores = new javax.swing.JTable();
    jLabel3 = new javax.swing.JLabel();
    lblPaginacion = new javax.swing.JLabel();
    btnPrimerPag = new javax.swing.JButton();
    btnPagAnterior = new javax.swing.JButton();
    btnPagSig = new javax.swing.JButton();
    btnPagUlt = new javax.swing.JButton();
    spinnerPaginacion = new javax.swing.JSpinner();
    jLabel4 = new javax.swing.JLabel();

    setBackground(new java.awt.Color(47, 34, 23));
    setPreferredSize(new java.awt.Dimension(1050, 575));
    setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jPanel1.setBackground(new java.awt.Color(255, 102, 0));
    jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/proveedores.png"))); // NOI18N
    jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, -1, -1));

    add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 740));

    jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

    lblNombre.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
    lblNombre.setForeground(new java.awt.Color(255, 255, 255));
    lblNombre.setText("Nombre");

    txtNombreProv.setBackground(new java.awt.Color(47, 34, 23));
    txtNombreProv.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
    txtNombreProv.setForeground(new java.awt.Color(255, 255, 255));
    txtNombreProv.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyReleased(java.awt.event.KeyEvent evt) {
        txtNombreProvKeyReleased(evt);
      }
      public void keyTyped(java.awt.event.KeyEvent evt) {
        txtNombreProvKeyTyped(evt);
      }
    });

    lblIdentificacion.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
    lblIdentificacion.setForeground(new java.awt.Color(255, 255, 255));
    lblIdentificacion.setText("CUIT/CUIL/DNI");

    txtIdentificacionProv.setBackground(new java.awt.Color(47, 34, 23));
    txtIdentificacionProv.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
    txtIdentificacionProv.setForeground(new java.awt.Color(255, 255, 255));
    txtIdentificacionProv.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtIdentificacionProvActionPerformed(evt);
      }
    });
    txtIdentificacionProv.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyReleased(java.awt.event.KeyEvent evt) {
        txtIdentificacionProvKeyReleased(evt);
      }
      public void keyTyped(java.awt.event.KeyEvent evt) {
        txtIdentificacionProvKeyTyped(evt);
      }
    });

    lblTelefono.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
    lblTelefono.setForeground(new java.awt.Color(255, 255, 255));
    lblTelefono.setText("Teléfono");

    txtTelProv.setBackground(new java.awt.Color(47, 34, 23));
    txtTelProv.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
    txtTelProv.setForeground(new java.awt.Color(255, 255, 255));
    txtTelProv.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyReleased(java.awt.event.KeyEvent evt) {
        txtTelProvKeyReleased(evt);
      }
      public void keyTyped(java.awt.event.KeyEvent evt) {
        txtTelProvKeyTyped(evt);
      }
    });

    lblDomicilio.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
    lblDomicilio.setForeground(new java.awt.Color(255, 255, 255));
    lblDomicilio.setText("Domicilio");

    txtDirProv.setBackground(new java.awt.Color(47, 34, 23));
    txtDirProv.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
    txtDirProv.setForeground(new java.awt.Color(255, 255, 255));

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
    jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon/baseline_save_white_24dp.png"))); // NOI18N
    jLabel11.setToolTipText("Guardar");
    jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jLabel11MouseClicked(evt);
      }
    });
    btn_regis1.add(jLabel11, new java.awt.GridBagConstraints());

    btn_regis2.setBackground(new java.awt.Color(255, 102, 0));
    btn_regis2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    btn_regis2.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        btn_regis2MouseClicked(evt);
      }
    });
    btn_regis2.setLayout(new java.awt.GridBagLayout());

    jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
    jLabel12.setForeground(new java.awt.Color(255, 255, 255));
    jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon/baseline_remove_circle_white_24dp.png"))); // NOI18N
    jLabel12.setToolTipText("Eliminar");
    jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jLabel12MouseClicked(evt);
      }
    });
    btn_regis2.add(jLabel12, new java.awt.GridBagConstraints());

    btn_regis3.setBackground(new java.awt.Color(255, 102, 0));
    btn_regis3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    btn_regis3.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        btn_regis3MouseClicked(evt);
      }
    });
    btn_regis3.setLayout(new java.awt.GridBagLayout());

    jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
    jLabel13.setForeground(new java.awt.Color(255, 255, 255));
    jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon/baseline_cancel_white_24dp.png"))); // NOI18N
    jLabel13.setToolTipText("Cancelar");
    jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jLabel13MouseClicked(evt);
      }
    });
    btn_regis3.add(jLabel13, new java.awt.GridBagConstraints());

    lblEmail.setForeground(new java.awt.Color(255, 255, 255));
    lblEmail.setText("E-mail");

    txtEmailProv.setBackground(new java.awt.Color(47, 34, 23));
    txtEmailProv.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    txtEmailProv.setForeground(new java.awt.Color(255, 255, 255));

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(txtDirProv)
          .addComponent(txtEmailProv)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
            .addGap(0, 12, Short.MAX_VALUE)
            .addComponent(btn_regis3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(28, 28, 28)
            .addComponent(btn_regis2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(btn_regis1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(txtTelProv)
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(lblNombre)
              .addComponent(lblIdentificacion)
              .addComponent(lblTelefono)
              .addComponent(lblDomicilio)
              .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(0, 0, Short.MAX_VALUE))
          .addComponent(txtIdentificacionProv)
          .addComponent(txtNombreProv))
        .addGap(20, 20, 20))
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(lblNombre)
        .addGap(18, 18, 18)
        .addComponent(txtNombreProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(lblIdentificacion)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(txtIdentificacionProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(lblTelefono)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(txtTelProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(lblDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(txtDirProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(lblEmail)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txtEmailProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(btn_regis2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(btn_regis3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(btn_regis1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(204, 204, 204))
    );

    add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 290, 440));

    jLabel1.setForeground(new java.awt.Color(255, 255, 255));
    jLabel1.setText("Registro de Proveedores");
    add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

    jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

    tablaProveedores.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {

      }
    ));
    tablaProveedores.getSelectionModel().addListSelectionListener(
      new ListSelectionListener() {
        public void valueChanged(ListSelectionEvent event) {
          if (!event.getValueIsAdjusting() && (tablaProveedores.getSelectedRow()>= 0)) {//This line prevents double events
            int filaSeleccionada = tablaProveedores.getSelectedRow();
            Proveedor prov = (Proveedor)modeloTablaProveedores.getValueAt(filaSeleccionada, 1);
            txtNombreProv.setText(prov.getNombre());
            txtIdentificacionProv.setText(prov.getId());
            txtEmailProv.setText(prov.getEmail());
            txtTelProv.setText(prov.getTelefono());
            txtDirProv.setText(prov.getDireccion());

            proveedorSeleccionado = prov;
            accion = "actualizar";
          }
        }
      }
    );
    jScrollPane1.setViewportView(tablaProveedores);

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
        .addGap(0, 2, Short.MAX_VALUE)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 794, javax.swing.GroupLayout.PREFERRED_SIZE))
    );
    jPanel3Layout.setVerticalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
    );

    add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 800, 440));

    jLabel3.setForeground(new java.awt.Color(255, 255, 255));
    jLabel3.setText("Listado de Proveedores");
    add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, -1, -1));

    lblPaginacion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    lblPaginacion.setForeground(new java.awt.Color(255, 255, 255));
    lblPaginacion.setText("jLabel2");
    add(lblPaginacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 510, -1, -1));

    btnPrimerPag.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon/baseline_first_page_white_24dp.png"))); // NOI18N
    btnPrimerPag.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnPrimerPagActionPerformed(evt);
      }
    });
    add(btnPrimerPag, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 550, -1, -1));

    btnPagAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon/baseline_chevron_left_white_24dp.png"))); // NOI18N
    btnPagAnterior.setToolTipText("");
    btnPagAnterior.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnPagAnteriorActionPerformed(evt);
      }
    });
    add(btnPagAnterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 550, -1, -1));

    btnPagSig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon/baseline_chevron_right_white_24dp.png"))); // NOI18N
    btnPagSig.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnPagSigActionPerformed(evt);
      }
    });
    add(btnPagSig, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 550, -1, -1));

    btnPagUlt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon/baseline_last_page_white_24dp.png"))); // NOI18N
    btnPagUlt.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnPagUltActionPerformed(evt);
      }
    });
    add(btnPagUlt, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 550, -1, -1));

    spinnerPaginacion.setModel(modeloSpinner);
    spinnerPaginacion.addChangeListener(new javax.swing.event.ChangeListener() {
      public void stateChanged(javax.swing.event.ChangeEvent evt) {
        spinnerPaginacionStateChanged(evt);
      }
    });
    add(spinnerPaginacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 540, 70, -1));

    jLabel4.setForeground(new java.awt.Color(255, 255, 255));
    jLabel4.setText("Registros por página:");
    add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 510, -1, -1));
  }// </editor-fold>//GEN-END:initComponents

    private void btn_regis1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_regis1MouseClicked

    }//GEN-LAST:event_btn_regis1MouseClicked

    private void txtIdentificacionProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdentificacionProvActionPerformed
    // TODO add your handling code here:
    }//GEN-LAST:event_txtIdentificacionProvActionPerformed

  private void btn_regis2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_regis2MouseClicked
    // TODO add your handling code here:
  }//GEN-LAST:event_btn_regis2MouseClicked

  private void btn_regis3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_regis3MouseClicked
  }//GEN-LAST:event_btn_regis3MouseClicked

  private void txtNombreProvKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreProvKeyTyped
    Helper.validarAlphanumerico(evt);
  }//GEN-LAST:event_txtNombreProvKeyTyped

  private void txtIdentificacionProvKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdentificacionProvKeyTyped
    Helper.validarSoloNumero(evt);
  }//GEN-LAST:event_txtIdentificacionProvKeyTyped

  private void txtTelProvKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelProvKeyTyped
    Helper.validarSoloNumero(evt);
  }//GEN-LAST:event_txtTelProvKeyTyped

  private void txtNombreProvKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreProvKeyReleased
    if (Helper.esCampoVacio(txtNombreProv)) {
      lblNombre.setForeground(Color.white);
    } else {
      lblNombre.setText("Nombre:");
      lblNombre.setForeground(new Color(255, 102, 0));
    }
  }//GEN-LAST:event_txtNombreProvKeyReleased

  private void txtIdentificacionProvKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdentificacionProvKeyReleased
    if (Helper.esCampoVacio(txtIdentificacionProv)) {
      lblIdentificacion.setForeground(Color.white);
    } else {
      lblIdentificacion.setText("CUIT/CUIL/DNI:");
      lblIdentificacion.setForeground(new Color(255, 102, 0));
    }
  }//GEN-LAST:event_txtIdentificacionProvKeyReleased

  private void txtTelProvKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelProvKeyReleased
    if (Helper.esCampoVacio(txtTelProv)) {
      lblTelefono.setForeground(Color.white);
    } else {
      lblTelefono.setText("Telefono:");
      lblTelefono.setForeground(new Color(255, 102, 0));
    }
  }//GEN-LAST:event_txtTelProvKeyReleased

  private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
    if (Helper.esCampoVacio(txtNombreProv)) {
      Helper.mostrarError(txtNombreProv, lblNombre, "Debe ingresar Nombre del Proveedor", Color.red);
      return;
    }
    if (Helper.esCampoVacio(txtIdentificacionProv)) {
      Helper.mostrarError(txtIdentificacionProv, lblIdentificacion, "Debe ingresar CUIT/CUIL/DNI", Color.red);
      return;
    }
    if (Helper.esCampoVacio(txtTelProv)) {
      Helper.mostrarError(txtTelProv, lblTelefono, "Debe ingresar Telefono de contacto", Color.red);
      return;
    }
    // obtener clientes y filtrar si ya hay un proveedor registrado
    List<Proveedor> listaIdentificacion = MetodosSQL.obtenerProveedores()
      .stream().filter(c -> c.getId().equals(txtIdentificacionProv.getText()))
      .collect(Collectors.toList());
    Proveedor prov = new Proveedor(
      txtIdentificacionProv.getText(),
      txtNombreProv.getText(),
      txtDirProv.getText(),
      txtTelProv.getText(),
      txtEmailProv.getText()
    );

    switch (accion) {
      case "nuevo":
        if (listaIdentificacion.isEmpty()) {

          int resultado = MetodosSQL.guardarProveedor(prov);
          if (resultado > 0) {
            JOptionPane.showMessageDialog(this, "Proveedor Guardado con exito!");
            restablecer();
//            Home.VENTAS_FRAME.cargarModeloCboCli();
            // Home.mostrarPanel(Home.VENTAS_FRAME);
          } else {
            JOptionPane.showMessageDialog(this, "Ocurrio un error intentelo nuevamente");
            txtIdentificacionProv.requestFocus();
          }
        } else {
          Helper.mostrarError(txtIdentificacionProv, lblIdentificacion, "El CUIT/CUIL/DNI ya esta registrado", Color.red);
        }
        break;
      case "actualizar":
        if (Home.rol.equals("Admin")) {
          if (!listaIdentificacion.isEmpty()) {
            if (listaIdentificacion.get(0).getId().equals(proveedorSeleccionado.getId())) {
              int resultado = MetodosSQL.actualizarProveedor(prov);
              if (resultado > 0) {
                JOptionPane.showMessageDialog(this, "Proveedor actualizado con exito!");
                restablecer();
              } else {
                JOptionPane.showMessageDialog(this, "Ocurrio un error intentelo nuevamente");
              }
            } else {
              Helper.mostrarError(txtIdentificacionProv, lblIdentificacion, "El CUIT/CUIL/DNI ya esta registrado", Color.red);

            }
          }
        } else {
          JOptionPane.showMessageDialog(this, "No tiene permisos para realizar la operación");
        }
        break;
    }
  }//GEN-LAST:event_jLabel11MouseClicked

  private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
    restablecer();

  }//GEN-LAST:event_jLabel13MouseClicked

  private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
    if (Home.rol.equals("Admin")) {

      if (proveedorSeleccionado != null) {

        int opcion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de borrar el proveedor "
          + proveedorSeleccionado + " ?", "Eliminar?", JOptionPane.YES_NO_OPTION);

        if (opcion == 0) {
          modeloTablaProveedores.removeRow(tablaProveedores.getSelectedRow());
          MetodosSQL.borrarProveedor(proveedorSeleccionado);
          restablecer();
        }
      } else {
        JOptionPane.showMessageDialog(this, "Debe seleccionar un proveedor de la tabla");
      }
    } else {
      JOptionPane.showMessageDialog(this, "No tiene permisos para realizar la operación");
    }
  }//GEN-LAST:event_jLabel12MouseClicked

  private void btnPrimerPagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimerPagActionPerformed
    paginacion("primero");
  }//GEN-LAST:event_btnPrimerPagActionPerformed

  private void btnPagAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagAnteriorActionPerformed
    paginacion("anterior");
  }//GEN-LAST:event_btnPagAnteriorActionPerformed

  private void btnPagSigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagSigActionPerformed
    paginacion("siguiente");
  }//GEN-LAST:event_btnPagSigActionPerformed

  private void btnPagUltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagUltActionPerformed
    paginacion("ultimo");
  }//GEN-LAST:event_btnPagUltActionPerformed

  private void spinnerPaginacionStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerPaginacionStateChanged
    numPagina = 1;
    Number valorSpinner = (Number) spinnerPaginacion.getValue();
    registrosXPag = valorSpinner.intValue();
    listaProveedores = MetodosSQL.obtenerProveedores();
    if (!listaProveedores.isEmpty()) {
      paginador = new Paginador<>(listaProveedores, lblPaginacion, registrosXPag);
      listaProveedores = obtenerProveedores(null);

      cargarProveedoresEnTabla(listaProveedores);
    }
  }//GEN-LAST:event_spinnerPaginacionStateChanged

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnPagAnterior;
  private javax.swing.JButton btnPagSig;
  private javax.swing.JButton btnPagUlt;
  private javax.swing.JButton btnPrimerPag;
  private javax.swing.JPanel btn_regis1;
  private javax.swing.JPanel btn_regis2;
  private javax.swing.JPanel btn_regis3;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel11;
  private javax.swing.JLabel jLabel12;
  private javax.swing.JLabel jLabel13;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JLabel lblDomicilio;
  private javax.swing.JLabel lblEmail;
  private javax.swing.JLabel lblIdentificacion;
  private javax.swing.JLabel lblNombre;
  private javax.swing.JLabel lblPaginacion;
  private javax.swing.JLabel lblTelefono;
  private javax.swing.JSpinner spinnerPaginacion;
  private javax.swing.JTable tablaProveedores;
  private javax.swing.JTextField txtDirProv;
  private javax.swing.JTextField txtEmailProv;
  private javax.swing.JTextField txtIdentificacionProv;
  private javax.swing.JTextField txtNombreProv;
  private javax.swing.JTextField txtTelProv;
  // End of variables declaration//GEN-END:variables

  private void configurarTabla() {
    String[] titulos = {"Identificación", "Proveedor", "Telefono", "Direccion"};
    modeloTablaProveedores = new DefaultTableModel(null, titulos) {
      @Override
      public boolean isCellEditable(int i, int i1) {
        return false;
      }

    };
  }

  private void restablecer() {
    accion = "nuevo";
    restablecerLabel(lblNombre, "Nombre:");
    restablecerLabel(lblIdentificacion, "CUIT/CUILDNI:");
    restablecerLabel(lblDomicilio, "Domicilio:");
    restablecerLabel(lblTelefono, "Telefono:");
    restablecerLabel(lblEmail, "E-mail:");
//    txtBuscarCliente.setText("");
    txtDirProv.setText("");
    txtEmailProv.setText("");
    txtIdentificacionProv.setText("");
    txtTelProv.setText("");
    txtNombreProv.setText("");
    txtNombreProv.requestFocus();

    registrosXPag = 6;
    modeloSpinner.setValue(new Integer(registrosXPag));
    numPagina = 1;
    listaProveedores = MetodosSQL.obtenerProveedores();
    if (!listaProveedores.isEmpty()) {
      paginador = new Paginador<>(listaProveedores, lblPaginacion, registrosXPag);
    }
    listaProveedores = obtenerProveedores(null);

    cargarProveedoresEnTabla(listaProveedores);
  }

  private void restablecerLabel(JLabel label, String texto) {
    label.setText(texto);
    label.setForeground(Color.white);
  }

  private List<Proveedor> obtenerProveedores(String filtro) {
    List<Proveedor> proveedores;
    int inicio = (numPagina - 1) * registrosXPag;
    if (filtro == null) {
      proveedores = MetodosSQL
        .obtenerProveedores()
        .stream()
        .skip(inicio)
        .limit(registrosXPag)
        .collect(Collectors.toList());
    } else {
      proveedores = MetodosSQL
        .obtenerProveedoresPorCriterio(filtro)
        .stream()
        .skip(inicio)
        .limit(registrosXPag)
        .collect(Collectors.toList());

    }
    return proveedores;
  }

  private void cargarProveedoresEnTabla(List<Proveedor> proveedores) {
    limpiarTabla();
    if (!proveedores.isEmpty()) {
      proveedores.forEach(prov -> {
        Object[] registro = {
          prov.getId(),
          prov,
          prov.getTelefono(),
          prov.getDireccion()
        };
        modeloTablaProveedores.addRow(registro);
      });

    }
    tablaProveedores.setModel(modeloTablaProveedores);
    tablaProveedores.setRowHeight(30);
  }

  private void limpiarTabla() {
    int numFilas = modeloTablaProveedores.getRowCount();
    if (numFilas > 0) {
      for (int i = numFilas - 1; i >= 0; i--) {
        modeloTablaProveedores.removeRow(i);
      }
    }
  }

  private void paginacion(String accion) {
    switch (accion) {
      case "primero":
        if (!listaProveedores.isEmpty()) {
          numPagina = paginador.primero();
        }
        break;
      case "siguiente":
        if (!listaProveedores.isEmpty()) {
          numPagina = paginador.siguiente();
        }
        break;
      case "anterior":
        if (!listaProveedores.isEmpty()) {
          numPagina = paginador.anterior();
        }
        break;
      case "ultimo":
        if (!listaProveedores.isEmpty()) {
          numPagina = paginador.ultimo();
        }
        break;
    }
    listaProveedores = obtenerProveedores(null);
    cargarProveedoresEnTabla(listaProveedores);
  }
}
