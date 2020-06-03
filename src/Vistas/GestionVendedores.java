/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controladores.UsuarioJpaController;
import Entidades.Usuario;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jramirez
 */
public class GestionVendedores extends javax.swing.JFrame {

    UsuarioJpaController controlUsuario = new UsuarioJpaController();
    Usuario user = new Usuario();
    DefaultTableModel modelo2;
    List<Usuario> listaUsuario;
    Usuario documento;

    public GestionVendedores() {
        initComponents();
        setTitle("Inventario SisInf");
        setResizable(false);
        setLocationRelativeTo(null);
        LlenarTabla();
        TextPrompt texto = new TextPrompt("Buscar Usuario", buscar);
    }

    public void LlenarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) tablaAgregarUsuario.getModel();
        listaUsuario = controlUsuario.findUsuarioEntities();
        for (Usuario obj : listaUsuario) {
            if(obj.getRol().equalsIgnoreCase("Vendedor")){
            modelo.addRow(new Object[]{obj.getId(), obj.getNombre(), obj.getTelefono(), obj.getDireccion(), obj.getCiudad(), obj.getUser(), obj.getRol(), obj.getPassword(), obj.getEstado()});
            }
        }
    }

    public void limpiarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) tablaAgregarUsuario.getModel();
        int a = modelo.getRowCount() - 1;
        for (int i = a; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    public void filtrarTabla() {
        if (buscar.getText().equals("")) {
            limpiarTabla();
            LlenarTabla();

        } else {
            limpiarTabla();
            DefaultTableModel modelo = (DefaultTableModel) tablaAgregarUsuario.getModel();
            for (Usuario obj : listaUsuario) {
                if (obj.getNombre().contains(buscar.getText()) && obj.getRol().matches("Vendedor") ) {
                    modelo.addRow(new Object[]{obj.getId(), obj.getNombre(), obj.getTelefono(), obj.getDireccion(), obj.getCiudad(), obj.getUser(), obj.getRol(), obj.getPassword(), obj.getEstado()});
                }
            }
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAgregarUsuario = new javax.swing.JTable();
        buscar = new javax.swing.JTextField();
        btn_Inhabilitar1 = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_Inhabilitar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablaAgregarUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Telefono", "Dirección", "Ciudad", "User", "Rol", "Contraseña", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaAgregarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaAgregarUsuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaAgregarUsuario);
        tablaAgregarUsuario.getTableHeader().setReorderingAllowed(false);

        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscarKeyReleased(evt);
            }
        });

        btn_Inhabilitar1.setText("Regresar");
        btn_Inhabilitar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Inhabilitar1ActionPerformed(evt);
            }
        });

        btn_editar.setText("Editar");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        btn_Inhabilitar.setText("Inhabilitar");
        btn_Inhabilitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InhabilitarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Vendedores");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 723, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(97, 97, 97)
                                    .addComponent(btn_Inhabilitar1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(132, 132, 132)
                                    .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(113, 113, 113)
                                    .addComponent(btn_Inhabilitar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(129, 129, 129))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jScrollPane1)
                            .addContainerGap()))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(399, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(64, 64, 64)
                    .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn_Inhabilitar1, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btn_Inhabilitar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(757, 757, 757)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaAgregarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaAgregarUsuarioMouseClicked
        user = controlUsuario.findUsuario((Long) tablaAgregarUsuario.getValueAt(tablaAgregarUsuario.getSelectedRow(), 0));
        if (user.getEstado().equals(true)) {
            btn_Inhabilitar.setText("Inhabilitar");
        } else {
            btn_Inhabilitar.setText("Habilitar");
        }
    }//GEN-LAST:event_tablaAgregarUsuarioMouseClicked

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarActionPerformed

    private void buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarKeyReleased
        filtrarTabla();
    }//GEN-LAST:event_buscarKeyReleased

    private void btn_Inhabilitar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Inhabilitar1ActionPerformed
        InicioAdmonSupremo i = new InicioAdmonSupremo();
        i.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Inhabilitar1ActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        if (tablaAgregarUsuario.getSelectedRow() == (-1)) {
            JOptionPane.showMessageDialog(null, "Debe de selecionar un valor de la tabla");
        } else {

            user = controlUsuario.findUsuario((Long) tablaAgregarUsuario.getValueAt(tablaAgregarUsuario.getSelectedRow(), 0));
            CrearVendedores ca = new CrearVendedores(user);
            ca.setVisible(true);
            this.dispose();
        }

    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_InhabilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InhabilitarActionPerformed
        if (tablaAgregarUsuario.getSelectedRow() == (-1)) {
            JOptionPane.showMessageDialog(null, "Debe de selecionar un valor de la tabla");
        } else {
            user = controlUsuario.findUsuario((Long) tablaAgregarUsuario.getValueAt(tablaAgregarUsuario.getSelectedRow(), 0));
            try {
                if (btn_Inhabilitar.getText().equals("Inhabilitar")) {
                    user.setEstado(false);
                    controlUsuario.edit(user);
                    JOptionPane.showMessageDialog(null, "Usuario Deshabilitado correctamente");
                    limpiarTabla();
                    LlenarTabla();

                } else {
                    user.setEstado(true);
                    controlUsuario.edit(user);
                    JOptionPane.showMessageDialog(null, "Usuario Habilitado correctamente");
                    limpiarTabla();
                    LlenarTabla();
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, " " + e.getMessage());
            }

        }

    }//GEN-LAST:event_btn_InhabilitarActionPerformed

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
            java.util.logging.Logger.getLogger(GestionVendedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionVendedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionVendedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionVendedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionVendedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Inhabilitar;
    private javax.swing.JButton btn_Inhabilitar1;
    private javax.swing.JButton btn_editar;
    private javax.swing.JTextField buscar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaAgregarUsuario;
    // End of variables declaration//GEN-END:variables
}
