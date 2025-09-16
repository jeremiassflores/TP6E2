package E2;

import java.awt.event.ItemEvent;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;

public class JifrmGestionProductos extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel();

    public JifrmGestionProductos() {
        initComponents();
        armarCabeceraPorNombre();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorioGProductos = new javax.swing.JDesktopPane();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ComboBuscarCategoria1 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaProductos1 = new javax.swing.JTable();
        BotonCerrar1 = new javax.swing.JButton();
        BotonBuscar1 = new javax.swing.JButton();
        BotonActualizar1 = new javax.swing.JButton();
        BotonNuevo1 = new javax.swing.JButton();
        BotonGuardar1 = new javax.swing.JButton();
        BotonEliminar1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        SpinStock1 = new javax.swing.JSpinner();
        ComboRubro1 = new javax.swing.JComboBox<>();
        IngresarCodigo1 = new javax.swing.JTextField();
        IngresarDescripcion1 = new javax.swing.JTextField();
        IngresarPrecio1 = new javax.swing.JTextField();

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Gestión de Productos");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Filtrar por Categoía:");

        ComboBuscarCategoria1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Perfumeria", "Comestible", "Limpieza" }));
        ComboBuscarCategoria1.setSelectedIndex(-1);
        ComboBuscarCategoria1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboBuscarCategoria1ItemStateChanged(evt);
            }
        });
        ComboBuscarCategoria1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBuscarCategoria1ActionPerformed(evt);
            }
        });

        TablaProductos1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Descripción", "Precio", "Perfumeria", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaProductos1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaProductos1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TablaProductos1);

        BotonCerrar1.setText("Cerrar");
        BotonCerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCerrar1ActionPerformed(evt);
            }
        });

        BotonBuscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-magnifying-glass-tilted-right-48.png"))); // NOI18N
        BotonBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscar1ActionPerformed(evt);
            }
        });

        BotonActualizar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-marca-doble-30.png"))); // NOI18N
        BotonActualizar1.setText("Actualizar");
        BotonActualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonActualizar1ActionPerformed(evt);
            }
        });

        BotonNuevo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-caja-de-producto-de-pelo-corto-50.png"))); // NOI18N
        BotonNuevo1.setText("Nuevo");
        BotonNuevo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonNuevo1ActionPerformed(evt);
            }
        });

        BotonGuardar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        BotonGuardar1.setText("Guardar");
        BotonGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardar1ActionPerformed(evt);
            }
        });

        BotonEliminar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        BotonEliminar1.setText("Eliminar");
        BotonEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminar1ActionPerformed(evt);
            }
        });

        jLabel11.setText("Codigo:");

        jLabel12.setText("Descripción:");

        jLabel13.setText("Precio:");

        jLabel14.setText("Rubro:");

        jLabel15.setText("Stock:");

        ComboRubro1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comestible", "Limpieza", "Perfumeria" }));
        ComboRubro1.setSelectedIndex(-1);

        IngresarPrecio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarPrecioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14)
                            .addComponent(jLabel11))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ComboRubro1, 0, 246, Short.MAX_VALUE)
                            .addComponent(SpinStock1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IngresarCodigo1)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IngresarDescripcion1)
                            .addComponent(IngresarPrecio1))))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(IngresarCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(IngresarDescripcion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(IngresarPrecio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(ComboRubro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(SpinStock1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        escritorioGProductos.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioGProductos.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioGProductos.setLayer(ComboBuscarCategoria1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioGProductos.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioGProductos.setLayer(BotonCerrar1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioGProductos.setLayer(BotonBuscar1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioGProductos.setLayer(BotonActualizar1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioGProductos.setLayer(BotonNuevo1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioGProductos.setLayer(BotonGuardar1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioGProductos.setLayer(BotonEliminar1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorioGProductos.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioGProductosLayout = new javax.swing.GroupLayout(escritorioGProductos);
        escritorioGProductos.setLayout(escritorioGProductosLayout);
        escritorioGProductosLayout.setHorizontalGroup(
            escritorioGProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioGProductosLayout.createSequentialGroup()
                .addGroup(escritorioGProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritorioGProductosLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(BotonNuevo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonGuardar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonActualizar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonEliminar1))
                    .addGroup(escritorioGProductosLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(escritorioGProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(escritorioGProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel9)
                                .addGroup(escritorioGProductosLayout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addGap(42, 42, 42)
                                    .addComponent(ComboBuscarCategoria1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(escritorioGProductosLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(escritorioGProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BotonCerrar1)
                                    .addComponent(BotonBuscar1))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        escritorioGProductosLayout.setVerticalGroup(
            escritorioGProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioGProductosLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(escritorioGProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(ComboBuscarCategoria1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(escritorioGProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(escritorioGProductosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(escritorioGProductosLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(BotonBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonCerrar1)
                        .addGap(105, 105, 105)))
                .addGroup(escritorioGProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonActualizar1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonNuevo1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonGuardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escritorioGProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorioGProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IngresarPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IngresarPrecioActionPerformed

    private void ComboBuscarCategoria1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBuscarCategoria1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBuscarCategoria1ActionPerformed

    private void BotonBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonBuscar1ActionPerformed

    private void BotonCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCerrar1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_BotonCerrar1ActionPerformed

    private void BotonNuevo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonNuevo1ActionPerformed
        modelo.setRowCount(0);
        IngresarCodigo1.setText("");
        IngresarDescripcion1.setText("");
        IngresarPrecio1.setText("");
        ComboBuscarCategoria1.setSelectedIndex(0);
        SpinStock1.setValue(0);
        JOptionPane.showMessageDialog(this, "Se limpiaron las casillas", "LIMPIADO", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_BotonNuevo1ActionPerformed

    private void ComboBuscarCategoria1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboBuscarCategoria1ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            modelo.setRowCount(0);
        }
        String rubroSelec = (String) ComboBuscarCategoria1.getSelectedItem();
        for (Producto auxil : JfrmMenuPrincipal.listaProductos) {
            if (rubroSelec.equalsIgnoreCase(auxil.getRubro())) {
                modelo.addRow(new Object[]{auxil.getCodigo(), auxil.getDescripcion(), auxil.getPrecio(), auxil.getRubro(), auxil.getStock()});
            }
        }
    }//GEN-LAST:event_ComboBuscarCategoria1ItemStateChanged

    private void TablaProductos1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaProductos1MouseClicked
        int filaSelec = TablaProductos1.getSelectedRow();
        String code = modelo.getValueAt(filaSelec, 0).toString();
        String descr = modelo.getValueAt(filaSelec, 1).toString();
        String price = modelo.getValueAt(filaSelec, 2).toString();
        String rubro = modelo.getValueAt(filaSelec, 3).toString();
        String stock = modelo.getValueAt(filaSelec, 4).toString();
        IngresarCodigo1.setText(code);
        IngresarDescripcion1.setText(descr);
        IngresarPrecio1.setText(price);
        ComboRubro1.setSelectedItem(rubro);
        SpinStock1.setValue(Integer.parseInt(stock));
    }//GEN-LAST:event_TablaProductos1MouseClicked

    private void BotonEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminar1ActionPerformed
        if (!IngresarCodigo1.getText().isEmpty() && !IngresarDescripcion1.getText().isEmpty() && !IngresarPrecio1.getText().isEmpty()
                && ComboRubro1.getSelectedItem() != null && 0 <= Integer.parseInt(SpinStock1.getValue().toString())) {
            String codi = IngresarCodigo1.getText();
            for (Producto aux : JfrmMenuPrincipal.listaProductos) {
                if (aux.getCodigo() == Integer.parseInt(codi)) {
                    JfrmMenuPrincipal.listaProductos.remove(aux);
                    modelo.setRowCount(0);
                    IngresarCodigo1.setText("");
                    IngresarDescripcion1.setText("");
                    IngresarPrecio1.setText("");
                    ComboBuscarCategoria1.setSelectedIndex(0);
                    SpinStock1.setValue(0);
                    JOptionPane.showMessageDialog(this, "Producto eliminado\nElija nueva categoría para seleccionar nuevo producto", "ELIMINADO", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
            }

        } else {
            JOptionPane.showMessageDialog(this, "Ningun casillero puede estar vacio\nRellene todos los campos", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BotonEliminar1ActionPerformed

    private void BotonGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardar1ActionPerformed
        try {
            Integer codigo = Integer.parseInt(IngresarCodigo1.getText().toString());
            String descripc = IngresarDescripcion1.getText().toString();
            Double precio = Double.parseDouble(IngresarPrecio1.getText().toString());
            String rubro = ComboRubro1.getSelectedItem().toString();
            int stock = (int) SpinStock1.getValue();

            Producto p1 = new Producto(codigo, descripc, precio, stock, rubro);
            JfrmMenuPrincipal.listaProductos.add(p1);

            JOptionPane.showMessageDialog(this, "Producto agregado con éxito\nProducto: " + descripc, "CORRECTO", JOptionPane.INFORMATION_MESSAGE);
            IngresarCodigo1.setText("");
            IngresarDescripcion1.setText("");
            IngresarPrecio1.setText("");
            ComboBuscarCategoria1.setSelectedIndex(0);
            SpinStock1.setValue(0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Algo salió mal...\nIntente nuevamente", "ERROR_404 | NOT FOUND", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BotonGuardar1ActionPerformed

    private void BotonActualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActualizar1ActionPerformed
        try {
            Integer codigo = Integer.parseInt(IngresarCodigo1.getText().toString());
            String descripc = IngresarDescripcion1.getText().toString();
            Double precio = Double.parseDouble(IngresarPrecio1.getText().toString());
            String rubro = ComboRubro1.getSelectedItem().toString();
            int stock = (int) SpinStock1.getValue();
            Boolean ver = true;
            for(Producto x : JfrmMenuPrincipal.listaProductos) {
                if (codigo == x.getCodigo()) {
                    JfrmMenuPrincipal.listaProductos.remove(x);
                    JfrmMenuPrincipal.listaProductos.add(new Producto(codigo, descripc, precio, stock, rubro));
                    ver = false;
                    JOptionPane.showMessageDialog(this, "Modificado con éxito", "CORRECTO", JOptionPane.INFORMATION_MESSAGE);
                    IngresarCodigo1.setText("");
                    IngresarDescripcion1.setText("");
                    IngresarPrecio1.setText("");
                    ComboBuscarCategoria1.setSelectedIndex(0);
                    SpinStock1.setValue(0);
                }
            }
            if(ver){
                JOptionPane.showMessageDialog(this, "No se puede modificar el codigo", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }catch(Exception e) {
            JOptionPane.showMessageDialog(this, "Algo salió mal...\nIntente nuevamente", "ERROR_404 | NOT FOUND", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_BotonActualizar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonActualizar1;
    private javax.swing.JButton BotonBuscar1;
    private javax.swing.JButton BotonCerrar1;
    private javax.swing.JButton BotonEliminar1;
    private javax.swing.JButton BotonGuardar1;
    private javax.swing.JButton BotonNuevo1;
    private javax.swing.JComboBox<String> ComboBuscarCategoria1;
    private javax.swing.JComboBox<String> ComboRubro1;
    private javax.swing.JTextField IngresarCodigo1;
    private javax.swing.JTextField IngresarDescripcion1;
    private javax.swing.JTextField IngresarPrecio1;
    private javax.swing.JSpinner SpinStock1;
    private javax.swing.JTable TablaProductos1;
    private javax.swing.JDesktopPane escritorioGProductos;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private void armarCabeceraPorNombre() {
        modelo.addColumn("Codigo");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Precio");
        modelo.addColumn("Categoria");
        modelo.addColumn("Stock");
        TablaProductos1.setModel(modelo);
    }
}
