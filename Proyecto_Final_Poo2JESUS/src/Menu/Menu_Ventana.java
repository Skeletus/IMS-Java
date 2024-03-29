/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Menu;

import Administrador.*;
import Cliente.Cliente_Ventana;
import Proveedor.Proveedor_Ventana;
import Vendedor.Vendedor_Ventana;

/**
 *
 * @author Lorelay
 */
public class Menu_Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Menu_Ventana
     */
    public String rol = "";
    public Menu_Ventana() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAdmin = new javax.swing.JButton();
        btnCliente = new javax.swing.JButton();
        btnProveedor = new javax.swing.JButton();
        btnVendedor = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono1.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 130, 180));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 3, 24)); // NOI18N
        jLabel2.setText("SELECCIONE COMO QUIERE INGRESAR");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 440, -1));

        btnAdmin.setFont(new java.awt.Font("Swis721 BT", 3, 14)); // NOI18N
        btnAdmin.setText("ADMINISTRADOR");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 160, 40));

        btnCliente.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnCliente.setText("CLIENTE");
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 160, 40));

        btnProveedor.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnProveedor.setText("PROVEEDOR");
        btnProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedorActionPerformed(evt);
            }
        });
        jPanel1.add(btnProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 320, 160, 40));

        btnVendedor.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnVendedor.setText("VENDEDOR");
        btnVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendedorActionPerformed(evt);
            }
        });
        jPanel1.add(btnVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 160, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Autopartes3.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, -10, 920, 620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendedorActionPerformed
        //IR A LA VENTANA VENDEDOR
        
        Vendedor_Ventana jf1 = new Vendedor_Ventana();
        jf1.show(); 

        dispose();
       
    }//GEN-LAST:event_btnVendedorActionPerformed

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        //IR A LA VENTANA CLIENTE
        
        Cliente_Ventana jf2 = new Cliente_Ventana();
        jf2.show(); 

        dispose();
    }//GEN-LAST:event_btnClienteActionPerformed

    private void btnProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedorActionPerformed
        //IR A LA VENTANA PROVEEDOR
        
        Proveedor_Ventana jf3 = new Proveedor_Ventana();
        jf3.show(); 

        dispose();
    }//GEN-LAST:event_btnProveedorActionPerformed

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        // IR A VENTANA Login para verificar que sea administrador
        VentanaLogin loginWindow = new VentanaLogin();
        //Administrador_Ventana jf4 = new Administrador_Ventana();
        loginWindow.show();
        // cerrar ventana actual
        dispose();
    }//GEN-LAST:event_btnAdminActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnProveedor;
    private javax.swing.JButton btnVendedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
