/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controladores.ProductoJpaController;
import Entidades.Producto;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author warriors
 */
public class Vista_Producto extends javax.swing.JFrame {

    ProductoJpaController controlproducto = new ProductoJpaController();
    Producto producto = new Producto();

    public Vista_Producto() {
        initComponents();
        CrearModelo();
        cargarDatos();

    }

    DefaultTableModel modelo2;

    private void CrearModelo() {
        try {
            modelo2 = (new DefaultTableModel(
                    null, new String[]{
                        "Id", "Descripción",
                        "Unidad_medida", "valor_compra", "Valor_venta", "Ganancia", "Estado", "Cantidad_Stock"}) {
                Class[] types = new Class[]{
                    java.lang.Integer.class,
                    java.lang.String.class,
                    java.lang.String.class,
                    java.lang.Double.class,
                    java.lang.Double.class,
                    java.lang.Double.class,
                    java.lang.Boolean.class,
                    java.lang.Double.class
                };
                boolean[] canEdit = new boolean[]{
                    false, false, false, false, false, false, false, false
                };

                @Override
                public Class getColumnClass(int columnIndex) {
                    return types[columnIndex];
                }

                @Override
                public boolean isCellEditable(int rowIndex, int colIndex) {
                    return canEdit[colIndex];
                }
            });
            tabla.setModel(modelo2);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString() + "error2");
        }
        tabla.getColumnModel().getColumn(0).setPreferredWidth(140);
        tabla.getColumnModel().getColumn(0).setMaxWidth(140);
    }

    public void cargarDatos() {
        try {
            Object o[] = null;
            List<Producto> lisp = controlproducto.findProductoEntities();
            for (int i = 0; i < lisp.size(); i++) {
                modelo2.addRow(o);
                modelo2.setValueAt(lisp.get(i).getId(), i, 0);
                modelo2.setValueAt(lisp.get(i).getDescripcion(), i, 1);
                modelo2.setValueAt(lisp.get(i).getUnidadMedida(), i, 2);
                modelo2.setValueAt(lisp.get(i).getValorCompra(), i, 3);
                modelo2.setValueAt(lisp.get(i).getValorVenta(), i, 4);
                modelo2.setValueAt(lisp.get(i).getGanancia(), i, 5);
                modelo2.setValueAt(lisp.get(i).getEstado(), i, 6);
                modelo2.setValueAt(lisp.get(i).getCantidadStock(), i, 7);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "el error es: " + e.getMessage());
        }
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtdesc = new javax.swing.JTextField();
        txtunidad = new javax.swing.JTextField();
        txtvalor_compra = new javax.swing.JTextField();
        txtvalor_venta = new javax.swing.JTextField();
        txtcantidad = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 227, 475, 180));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Crear Producto");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 276, -1));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Descripción:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 100, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Unidad_medida:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 110, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Valor_compra:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 100, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Valor_venta:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 90, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Cantidad_stock:\t");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 110, -1));
        getContentPane().add(txtdesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 130, -1));
        getContentPane().add(txtunidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 130, -1));
        getContentPane().add(txtvalor_compra, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 130, -1));
        getContentPane().add(txtvalor_venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 130, -1));
        getContentPane().add(txtcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 130, -1));

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 80, -1));

        jButton2.setText("Editar");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 80, -1));

        jButton3.setText("Inhabilitar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            producto.setDescripcion(txtdesc.getText());
            producto.setUnidadMedida(txtunidad.getText());
            producto.setValorCompra(Double.parseDouble(txtvalor_compra.getText()));
            producto.setValorVenta(Double.parseDouble(txtvalor_venta.getText()));
            producto.setGanancia((producto.getValorVenta() - producto.getValorCompra()));
            producto.setCantidadStock(Double.parseDouble(txtcantidad.getText()));
            if (producto.getCantidadStock() > 0) {
                producto.setEstado(true);
            } else {
                producto.setEstado(false);
            }
            controlproducto.create(producto);
            JOptionPane.showMessageDialog(null, "Producto creado exitosamente");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            producto = (Producto) tabla.getValueAt(tabla.getSelectedRow(), 0);
            producto.setEstado(false);
            controlproducto.edit(producto);
            JOptionPane.showMessageDialog(null, "Producto Deshabilitado correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " " + e.getMessage());
        }


    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Vista_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_Producto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtdesc;
    private javax.swing.JTextField txtunidad;
    private javax.swing.JTextField txtvalor_compra;
    private javax.swing.JTextField txtvalor_venta;
    // End of variables declaration//GEN-END:variables
}
