/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Kardex;

import Menu.MenuAdministrador;
import Tests.Ayudas;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jesus
 */
public class VentanaListasKardex extends javax.swing.JFrame {

    /**
     * Creates new form VentanaListasKardex
     */
    // instancia de la clase Test
    Ayudas objAyuda = new Ayudas();
    // modelo tabla producto
    DefaultTableModel modeloTablaProducto = new DefaultTableModel();
    // modelo tabla kardex
    DefaultTableModel modeloTablaKardex = new DefaultTableModel();
    
    public VentanaListasKardex() 
    {
        initComponents();
        // tabla producto
        cargarModeloTablaProducto();
        // tabla kardex
        cargarModeloTablaKardex();
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        cboBoxProveedor = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cboBoxProducto = new javax.swing.JComboBox<>();
        btnVerKardex = new javax.swing.JButton();
        btnCargarCboBoxProveedores = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaKardex = new javax.swing.JTable();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TABLA DE PRODUCTOS ");

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tablaProductos);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 763, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel4);

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Seleccionar Proveedor: ");

        cboBoxProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboBoxProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboBoxProveedorActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Seleccionar Producto: ");

        cboBoxProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnVerKardex.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnVerKardex.setText("Ver Kardex");
        btnVerKardex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerKardexActionPerformed(evt);
            }
        });

        btnCargarCboBoxProveedores.setText("Cargar Listas");
        btnCargarCboBoxProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarCboBoxProveedoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 819, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCargarCboBoxProveedores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboBoxProveedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboBoxProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerKardex, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnCargarCboBoxProveedores)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(cboBoxProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel4)
                        .addGap(40, 40, 40)
                        .addComponent(cboBoxProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(btnVerKardex, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Listado de Productos", jPanel3);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        tablaKardex.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tablaKardex);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1034, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanel6);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1098, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ver Kardex del producto", jPanel5);

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1098, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegresar)
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegresar)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void cargarModeloTablaProducto()
    {
        modeloTablaProducto.addColumn("ID PRODUCTO");
        modeloTablaProducto.addColumn("NOMBRE");
        modeloTablaProducto.addColumn("PROVEEDOR");
        modeloTablaProducto.addColumn("DESCRIPCION");
        modeloTablaProducto.addColumn("CANTIDAD");
        modeloTablaProducto.addColumn("PRECIO");
        tablaProductos.setModel(modeloTablaProducto);
        mostrarDatosTablaProducto();
    }
    
    public void cargarModeloTablaKardex()
    {
        modeloTablaKardex.addColumn("ID KARDEX");
        modeloTablaKardex.addColumn("Tipo Operacion");
        modeloTablaKardex.addColumn("Tipo Documento");
        modeloTablaKardex.addColumn("Fecha");
        modeloTablaKardex.addColumn("Tipo Compra");
        // === valor unitario
        modeloTablaKardex.addColumn("Valor Unitario");
         // === ENTRADAS
        modeloTablaKardex.addColumn("Cantidad Entrada");
        modeloTablaKardex.addColumn("Valor Entrada");
        // === SALIDAS
        modeloTablaKardex.addColumn("Cantidad Salida");
        modeloTablaKardex.addColumn("Valor Salida");
        // === SALDO
        modeloTablaKardex.addColumn("Cantidad Saldo");
        modeloTablaKardex.addColumn("Valor Saldo");
        // === Precio Producto
        modeloTablaKardex.addColumn("Precio Producto");
        tablaKardex.setModel(modeloTablaKardex);
    }
    
    public void cargarCboBoxProveedores()
    {
        cboBoxProveedor.removeAllItems();
        ArrayList<String> listaProveedores = objAyuda.obetenerListaDeProveedores();
        
        // cargando los datos de la lista proveedores al combo box
        for (int i = 0; i < listaProveedores.size(); i++)
        {
            String nombreProveedor = listaProveedores.get(i);
            cboBoxProveedor.addItem(nombreProveedor);           
        }
        cboBoxProveedor.setSelectedIndex(0);
        cboBoxProveedor.setSelectedItem(0);
    }
    
    public void cargarCboBoxProductos(String nombreProveedor)
    {
        cboBoxProducto.removeAllItems();
        ArrayList<String> listaProductos = objAyuda.obetenerListaDeProductosPorProveedores(nombreProveedor);
        
        // cargando los datos de la lista proveedores al combo box
        for (int i = 0; i < listaProductos.size(); i++)
        {
            String nombreProducto = listaProductos.get(i);
            cboBoxProducto.addItem(nombreProducto);           
        }
        cboBoxProducto.setSelectedIndex(0);
        cboBoxProducto.setSelectedItem(0);
    }
    
    public void mostrarDatosTablaProducto()
    {
        modeloTablaProducto.setRowCount(0);
        // creacion de arreglo para guardar los datos y subirlos a la tabla
        String datosMostrar[] = new String[6];
        // datos
        String partesLocal[] = null;
        try
        {
            String lineaLocal;
            FileReader     fr     = new FileReader("ListaProductos.csv");
            BufferedReader lector = new BufferedReader(fr); // el lector ya tiene el archivo
            // imprimiendo el archivo
            while( (lineaLocal = lector.readLine()) != null) 
            // obten la primera linea del archivo, y si la linea no hay nada,entonces termina
            {
                partesLocal = lineaLocal.split(","); // hasta que encuentra coma cambia de parte
                for (int i=0; i < partesLocal.length; i++)
                {
                    datosMostrar[0] = partesLocal[0]; // nombre
                    datosMostrar[1] = partesLocal[1]; // marca
                    datosMostrar[2] = partesLocal[2]; // definicion
                    datosMostrar[3] = partesLocal[3]; // cantidad
                    datosMostrar[4] = partesLocal[4]; // precio
                    datosMostrar[5] = partesLocal[5]; // precio
                    //System.out.println(partes[i] + "     ");
                }
                modeloTablaProducto.addRow(datosMostrar);
            }
            lector.close();
            fr.close();
        }
        catch(Exception e) // lanzar un mensaje en caso de que suceda un error
        {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al cargar la tabla Producto: " + e);
        }
    }
    
    public void mostrarDatosTablaKardex(String nombreProducto, String nombreProveedor)
    {
        modeloTablaKardex.setRowCount(0);
        String nombreArchivoKardex  = nombreProducto + "-" + nombreProveedor + "Kardex.csv";
        // creacion de arreglo para guardar los datos y subirlos a la tabla
        String datosMostrar[]       = new String[13];
        // datos
        String partesLocal[]        = null;
        try
        {
            String lineaLocal;
            FileReader     fr     = new FileReader(nombreArchivoKardex);
            BufferedReader lector = new BufferedReader(fr); // el lector ya tiene el archivo
            // imprimiendo el archivo
            while( (lineaLocal = lector.readLine()) != null) 
            // obten la primera linea del archivo, y si la linea no hay nada,entonces termina
            {
                partesLocal = lineaLocal.split(","); // hasta que encuentra coma cambia de parte
                for (int i=0; i < partesLocal.length; i++)
                {
                    datosMostrar[0] = partesLocal[0]; // codigo
                    datosMostrar[1] = partesLocal[1]; // tipooperacion
                    datosMostrar[2] = partesLocal[2]; // tipoDocumento
                    datosMostrar[3] = partesLocal[3]; // Fecha 
                    datosMostrar[4] = partesLocal[4]; // Tipo compra
                    // ==== entrada
                    datosMostrar[5] = partesLocal[5]; // cant Entrada
                    datosMostrar[6] = partesLocal[6]; // valor Entrada
                    // valor unitario
                    datosMostrar[7] = partesLocal[7]; // valor unitario
                    // ==== salidas
                    datosMostrar[8] = partesLocal[8]; // cant salida
                    datosMostrar[9] = partesLocal[9]; // valor salida
                    // === saldo
                    datosMostrar[10] = partesLocal[10]; // cant saldo
                    datosMostrar[11] = partesLocal[11]; // valor saldo
                    // === precio
                    datosMostrar[12] = partesLocal[12]; // precio
                }
                modeloTablaKardex.addRow(datosMostrar);
            }
            lector.close();
            fr.close();
        }
        catch(Exception e) // lanzar un mensaje en caso de que suceda un error
        {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al cargar la tabla Producto: " + e);
        }
    }
    
    private void btnCargarCboBoxProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarCboBoxProveedoresActionPerformed
        // TODO add your handling code here:
        cargarCboBoxProveedores();
    }//GEN-LAST:event_btnCargarCboBoxProveedoresActionPerformed

    private void cboBoxProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboBoxProveedorActionPerformed
        // TODO add your handling code here:
        try
        {
            String proveedorSeleccionado = cboBoxProveedor.getSelectedItem().toString();
            cargarCboBoxProductos(proveedorSeleccionado);
        }
        catch(Exception e)
        {
            System.out.println("Ezcepcin en cboBoxProveedor " + e);
        }
    }//GEN-LAST:event_cboBoxProveedorActionPerformed

    private void btnVerKardexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerKardexActionPerformed
        // TODO add your handling code here:
        try
        {
            String proveedorSeleccianado = cboBoxProveedor.getSelectedItem().toString();
            String productoSeleccianado  = cboBoxProducto.getSelectedItem().toString();
            
            mostrarDatosTablaKardex(productoSeleccianado, proveedorSeleccianado);
            jTabbedPane1.setSelectedIndex(1);
        }
        catch(Exception e)
        {
            String msgException = "Ocurrio una excepcion en btnVerKardex: " + e;
            System.out.println(msgException);
            JOptionPane.showMessageDialog(null, msgException);
        }
    }//GEN-LAST:event_btnVerKardexActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        MenuAdministrador ma = new MenuAdministrador("admin");
        ma.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaListasKardex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaListasKardex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaListasKardex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaListasKardex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaListasKardex().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargarCboBoxProveedores;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnVerKardex;
    private javax.swing.JComboBox<String> cboBoxProducto;
    private javax.swing.JComboBox<String> cboBoxProveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tablaKardex;
    private javax.swing.JTable tablaProductos;
    // End of variables declaration//GEN-END:variables
}
