package E2;

import java.util.TreeSet;

public class JfrmMenuPrincipal extends javax.swing.JFrame {
    public static TreeSet<Producto> listaProductos = new TreeSet<>();
    
    public JfrmMenuPrincipal() {
        initComponents();
        listaProductos.add(new Producto(11, "Jabon", 1500.0,100, "Perfumeria"));
        listaProductos.add(new Producto(12, "Toalla", 2000.0,50, "Perfumeria"));
        listaProductos.add(new Producto(21, "Caramelos", 500.0,20, "Comestible"));
        listaProductos.add(new Producto(22, "Arroz", 3500.0,25, "Comestible"));
        listaProductos.add(new Producto(31, "Lavandina", 4500.0,10, "Limpieza")); 
        listaProductos.add(new Producto(32, "Detergente", 3500.0,10, "Limpieza"));
        listaProductos.add(new Producto(34, "Cloro", 4500.0,10, "Limpieza"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        Administracion = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        Consultas = new javax.swing.JMenu();
        XNombre = new javax.swing.JMenuItem();
        XPrecio = new javax.swing.JMenuItem();
        XRubro = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 667, Short.MAX_VALUE)
        );

        Administracion.setText("Administracion");

        jMenuItem1.setText("Gestion de Productos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Administracion.add(jMenuItem1);

        jMenuBar1.add(Administracion);

        Consultas.setText("Consultas");

        XNombre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        XNombre.setText("Consultas por Nombre");
        XNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XNombreActionPerformed(evt);
            }
        });
        Consultas.add(XNombre);

        XPrecio.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        XPrecio.setText("Consultas por Precio");
        XPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XPrecioActionPerformed(evt);
            }
        });
        Consultas.add(XPrecio);

        XRubro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        XRubro.setText("Consultas por Rubro");
        XRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XRubroActionPerformed(evt);
            }
        });
        Consultas.add(XRubro);

        jMenuBar1.add(Consultas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        JifrmGestionProductos aux = new JifrmGestionProductos();
        aux.setVisible(true);
        Escritorio.add(aux);
        Escritorio.moveToFront(aux);
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void XNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XNombreActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        ListadoXNombre aux = new ListadoXNombre();
        aux.setVisible(true);
        Escritorio.add(aux);
        Escritorio.moveToFront(aux);
        
    }//GEN-LAST:event_XNombreActionPerformed

    private void XPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XPrecioActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        ListadoXPrecio aux = new ListadoXPrecio();
        aux.setVisible(true);
        Escritorio.add(aux);
        Escritorio.moveToFront(aux);
        
    }//GEN-LAST:event_XPrecioActionPerformed

    private void XRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XRubroActionPerformed
         Escritorio.removeAll();
        Escritorio.repaint();
        ListadoXRubro aux = new ListadoXRubro();
        aux.setVisible(true);
        Escritorio.add(aux);
        Escritorio.moveToFront(aux);
        
    }//GEN-LAST:event_XRubroActionPerformed

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
            java.util.logging.Logger.getLogger(JfrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfrmMenuPrincipal().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Administracion;
    private javax.swing.JMenu Consultas;
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenuItem XNombre;
    private javax.swing.JMenuItem XPrecio;
    private javax.swing.JMenuItem XRubro;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
