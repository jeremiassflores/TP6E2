package E2;

import javax.swing.table.DefaultTableModel;

public class ListadoXPrecio extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel();

    public ListadoXPrecio() {
        initComponents();
        armarCabeceraPorNombre();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        precio2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaXNombre = new javax.swing.JTable();
        Icono = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        precio1 = new javax.swing.JTextField();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Listado por Precio");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("y");

        precio2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                precio2KeyReleased(evt);
            }
        });

        TablaXNombre.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Descripcion", "Precio", "Categoria", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaXNombre);

        Icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-magnifying-glass-tilted-right-48.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Entre $");

        precio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precio1ActionPerformed(evt);
            }
        });
        precio1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                precio1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(precio1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(precio2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(17, 17, 17)
                        .addComponent(Icono, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(precio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(precio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Icono, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void precio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precio1ActionPerformed

    private void precio1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precio1KeyReleased
        filtrarPorPrecio();
    }//GEN-LAST:event_precio1KeyReleased

    private void precio2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precio2KeyReleased
        filtrarPorPrecio();
    }//GEN-LAST:event_precio2KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Icono;
    private javax.swing.JTable TablaXNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField precio1;
    private javax.swing.JTextField precio2;
    // End of variables declaration//GEN-END:variables

    private void armarCabeceraPorNombre() {
        modelo.addColumn("Codigo");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Precio");
        modelo.addColumn("Categoria");
        modelo.addColumn("Stock");
        TablaXNombre.setModel(modelo);
    }

    private void filtrarPorPrecio(){
        modelo.setRowCount(0);
        if (!precio1.getText().isEmpty() && !precio2.getText().isEmpty()){
            for (Producto auxi : JfrmMenuPrincipal.listaProductos) {
                Double prec1 = Double.parseDouble(precio1.getText());
                Double prec2 = Double.parseDouble(precio2.getText());
                if (auxi.getPrecio() >= prec1 && auxi.getPrecio() <= prec2) {
                    modelo.addRow(new Object[]{auxi.getCodigo(), auxi.getDescripcion(), auxi.getPrecio(), auxi.getRubro(), auxi.getStock()});
                }
            }
        }else if(precio1.getText().isEmpty() && !precio2.getText().isEmpty()){
            for (Producto auxi : JfrmMenuPrincipal.listaProductos) {
                Double prec2 = Double.parseDouble(precio2.getText());
                if (auxi.getPrecio() <= prec2) {
                    modelo.addRow(new Object[]{auxi.getCodigo(), auxi.getDescripcion(), auxi.getPrecio(), auxi.getRubro(), auxi.getStock()});
                }
            }
        }else if(!precio1.getText().isEmpty() && precio2.getText().isEmpty()){
            for (Producto auxi : JfrmMenuPrincipal.listaProductos) {
                Double prec1 = Double.parseDouble(precio1.getText());
                if (auxi.getPrecio() >= prec1) {
                    modelo.addRow(new Object[]{auxi.getCodigo(), auxi.getDescripcion(), auxi.getPrecio(), auxi.getRubro(), auxi.getStock()});
                }
            }
        }
    }
}
