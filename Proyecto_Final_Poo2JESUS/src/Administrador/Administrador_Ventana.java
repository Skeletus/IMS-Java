/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Administrador;

//import
import Menu.MenuAdministrador;
import Menu.Menu_Ventana;
import Personas.Vendedor;
import Tests.*;
import Personas.*;

import Proveedor.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//import com.csvreader.CsvWriter;
import java.util.Random;

/**
 *
 * @author Lorelay
 */
public class Administrador_Ventana extends javax.swing.JFrame {

    // instancia de la clase ayuda
    Ayudas objAyuda = new Ayudas();
    // istancia de la clase vendedorVector
    VendedorVector arregloVendedores = new VendedorVector();
    // instancia de la clase proveedorvECTOR
    ProveedorVector arregloProveedores = new ProveedorVector();
    // modelo de tabla
    DefaultTableModel   modeloDeTabla = new DefaultTableModel();
    DefaultTableModel   modeloDeTablaProveedor = new DefaultTableModel();
    
    public Administrador_Ventana() 
    {
        initComponents();
        //TABLA _ LISTA DE VENDEDORES
        modeloDeTabla.addColumn("Codigo");
        modeloDeTabla.addColumn("Nombre");
        modeloDeTabla.addColumn("Numero de Telefono");
        modeloDeTabla.addColumn("DNI");
        // escribiend el modelo en la tabla
        TablaVendedor.setModel(modeloDeTabla);
        
        cargarModeloTablaProveedor();
        // cargando datos a la lista
        mostrarDatosTablaVendedor();
        mostrarDatosTablaProveedor();
        
        // cargando combo box de proveedores
        cargarDatosComboBoxProveedores();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        btnActualizarTabla = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaProveedores = new javax.swing.JTable();
        btnTablapProveedor = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        GenerarV = new javax.swing.JButton();
        NombreVendedor = new javax.swing.JTextField();
        TelefonoVendedor = new javax.swing.JTextField();
        DNIVendedor = new javax.swing.JTextField();
        CodigoVendedor = new javax.swing.JTextField();
        BotonAgregarV = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtRUC = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TxtIDGenerado = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cboBoxProveedores = new javax.swing.JComboBox<>();
        btnEliminarProveedor = new javax.swing.JButton();
        btnActualizarListaProveedores = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaVendedor = new javax.swing.JTable();
        BotonMostrarV = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cboBoxNomVendedor = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        cboBoxCodVendedor = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtNomActual = new javax.swing.JTextField();
        txtNomNuevo = new javax.swing.JTextField();
        btnModNombreVendedor = new javax.swing.JButton();
        loadUpdateCboBoxNomVendedor = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        loadUpdateCboBoxTelVendedor = new javax.swing.JButton();
        btnModTelVendedor = new javax.swing.JButton();
        txtTelActual = new javax.swing.JTextField();
        txtTelNuevo = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        cboBoxEliminarVendedor = new javax.swing.JComboBox<>();
        txtNomEliminarVendedor = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        btnEliminarVendedor = new javax.swing.JButton();
        txtTelEliminarVendedor = new javax.swing.JTextField();
        loadUpdateCboBoxDelVendedor = new javax.swing.JButton();
        btnRegresarPanel1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnActualizarTabla.setBackground(new java.awt.Color(255, 255, 255));

        tablaProveedores.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tablaProveedores);

        btnTablapProveedor.setText("Actualizar tabla");
        btnTablapProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTablapProveedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout btnActualizarTablaLayout = new javax.swing.GroupLayout(btnActualizarTabla);
        btnActualizarTabla.setLayout(btnActualizarTablaLayout);
        btnActualizarTablaLayout.setHorizontalGroup(
            btnActualizarTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnActualizarTablaLayout.createSequentialGroup()
                .addGroup(btnActualizarTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnActualizarTablaLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(btnActualizarTablaLayout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(btnTablapProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        btnActualizarTablaLayout.setVerticalGroup(
            btnActualizarTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnActualizarTablaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTablapProveedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnActualizarTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnActualizarTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Lista de Proveedores", jPanel3);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Square721 BT", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("INGRESAR DATOS PARA AGREGAR UN NUEVO VENDEDOR");

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre del Vendedor:");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Número de telefono del Vendedor:");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Número de DNI del Vendedor:");

        GenerarV.setText("Generar Codigo");
        GenerarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarVActionPerformed(evt);
            }
        });

        CodigoVendedor.setEditable(false);
        CodigoVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodigoVendedorActionPerformed(evt);
            }
        });

        BotonAgregarV.setText("Agregar");
        BotonAgregarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GenerarV)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NombreVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                            .addComponent(TelefonoVendedor)
                            .addComponent(DNIVendedor)
                            .addComponent(CodigoVendedor)
                            .addComponent(BotonAgregarV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NombreVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TelefonoVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DNIVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GenerarV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CodigoVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(BotonAgregarV, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Agregar un Vendedor", jPanel6);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("AGREGAR PROVEEDOR");

        jLabel6.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Nombre: ");

        jLabel7.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("RUC :");

        jLabel8.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("ID-PROVEEDOR");

        TxtIDGenerado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtIDGenerado.setText("Autogenerado");
        TxtIDGenerado.setEditable(false);

        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtRUC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TxtIDGenerado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(441, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addGap(59, 59, 59)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TxtIDGenerado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtRUC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(131, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Agregar un Proveedor", jPanel8);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ELIMINAR PROVEEDOR ");

        jLabel10.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        jLabel10.setText("Seleccionar proveedor");

        cboBoxProveedores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnEliminarProveedor.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        btnEliminarProveedor.setText("Eliminar Proveedor");
        btnEliminarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProveedorActionPerformed(evt);
            }
        });

        btnActualizarListaProveedores.setText("Actualizar Lista de Proveedores");
        btnActualizarListaProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarListaProveedoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(141, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnActualizarListaProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                            .addComponent(cboBoxProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnEliminarProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(116, 116, 116))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel9)
                .addGap(120, 120, 120)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboBoxProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addComponent(btnEliminarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnActualizarListaProveedores)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ELIMINAR PROVEEDOR", jPanel5);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        TablaVendedor.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TablaVendedor);

        BotonMostrarV.setText("Mostrar");
        BotonMostrarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMostrarVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BotonMostrarV, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(BotonMostrarV, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Lista de Vendedores", jPanel2);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Modificar Nombre: ");

        jLabel12.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Modificar Telefono");

        cboBoxNomVendedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboBoxNomVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboBoxNomVendedorActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Selecctionar Vendedor:");

        cboBoxCodVendedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboBoxCodVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboBoxCodVendedorActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Seleccionar Vendedor:");

        jLabel15.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Nombre Actual: ");

        jLabel16.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Nombre Nuevo: ");

        txtNomActual.setEditable(false);

        btnModNombreVendedor.setText("Modificar Nombre");
        btnModNombreVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModNombreVendedorActionPerformed(evt);
            }
        });

        loadUpdateCboBoxNomVendedor.setText("Actualizar / Cargar Lista de Nombres");
        loadUpdateCboBoxNomVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadUpdateCboBoxNomVendedorActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Telefono Actual: ");

        jLabel18.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Telefono Nuevo: ");

        loadUpdateCboBoxTelVendedor.setText("Actualizar / cargar Lista de Telefonos");
        loadUpdateCboBoxTelVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadUpdateCboBoxTelVendedorActionPerformed(evt);
            }
        });

        btnModTelVendedor.setText("Modificar Telefono");
        btnModTelVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModTelVendedorActionPerformed(evt);
            }
        });

        txtTelActual.setEditable(false);

        jLabel19.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("ELIMINAR VENDEDOR: ");

        jLabel20.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Seleccionar Vendedor: ");

        jLabel21.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Nombre ");

        cboBoxEliminarVendedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboBoxEliminarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboBoxEliminarVendedorActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Telefono");

        btnEliminarVendedor.setText("Eliminar Vendedor");
        btnEliminarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarVendedorActionPerformed(evt);
            }
        });

        loadUpdateCboBoxDelVendedor.setText("Actuializar/Cargar Lista de Codigos Vendedor");
        loadUpdateCboBoxDelVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadUpdateCboBoxDelVendedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnModNombreVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNomNuevo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNomActual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboBoxNomVendedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(loadUpdateCboBoxNomVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(66, 66, 66)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(loadUpdateCboBoxTelVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnModTelVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cboBoxCodVendedor, 0, 140, Short.MAX_VALUE)
                                    .addComponent(txtTelActual)
                                    .addComponent(txtTelNuevo)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(loadUpdateCboBoxDelVendedor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEliminarVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(cboBoxEliminarVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtNomEliminarVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTelEliminarVendedor)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))))
                        .addGap(22, 22, 22)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loadUpdateCboBoxNomVendedor)
                    .addComponent(loadUpdateCboBoxTelVendedor))
                .addGap(27, 27, 27)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboBoxNomVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboBoxCodVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtNomActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModNombreVendedor)
                    .addComponent(btnModTelVendedor))
                .addGap(26, 26, 26)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(3, 3, 3)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomEliminarVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelEliminarVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboBoxEliminarVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarVendedor)
                    .addComponent(loadUpdateCboBoxDelVendedor))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        txtNomActual.setEditable(false);
        txtTelActual.setEditable(false);
        txtNomEliminarVendedor.setEditable(false);
        txtTelEliminarVendedor.setEditable(false);

        jTabbedPane1.addTab("Modificar Vendedor", jPanel10);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 810, 560));

        btnRegresarPanel1.setText("Regresar");
        btnRegresarPanel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarPanel1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresarPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 570, 110, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 848, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void cargarModeloTablaProveedor()
    {
        modeloDeTablaProveedor.addColumn("ID");
        modeloDeTablaProveedor.addColumn("NOMBRE");
        modeloDeTablaProveedor.addColumn("RUC");
        modeloDeTablaProveedor.addColumn("CANTIDAD PRODUCTOS");
        
        tablaProveedores.setModel(modeloDeTablaProveedor);
    }
    public void mostrarDatosTablaProveedor()
    {
        modeloDeTablaProveedor.setRowCount(0);
        // creacion de arreglo para guardar los datos y subirlos a la tabla
        String datosMostrar[] = new String[4];
        // datos
        String partesLocal[] = null;
        arregloProveedores.crearArchivoSEGUNDAFORMA();
        try
        {
            String lineaLocal;
            FileReader     fr     = new FileReader("ListaProveedores.csv");
            BufferedReader lector = new BufferedReader(fr); // el lector ya tiene el archivo
            // imprimiendo el archivo
            while( (lineaLocal = lector.readLine()) != null) 
            // obten la primera linea del archivo, y si la linea no hay nada,entonces termina
            {
                partesLocal = lineaLocal.split(","); // hasta que encuentra coma cambia de parte
                for (int i=0; i < partesLocal.length; i++)
                {
                    datosMostrar[0] = partesLocal[0]; // id
                    datosMostrar[1] = partesLocal[1]; // nombre 
                    datosMostrar[2] = partesLocal[2]; // ruc 
                    datosMostrar[3] = partesLocal[3]; // cantidad productos 
                    //System.out.println(partes[i] + "     ");
                }
                modeloDeTablaProveedor.addRow(datosMostrar);
            }
            lector.close();
            fr.close();
        }
        catch(Exception e) // lanzar un mensaje en caso de que suceda un error
        {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error de tipo: " + e);
        }
    }

    private void GenerarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarVActionPerformed
        // GENERAR UN CODIGO ALFA_NUMERICO
        String codigoVendedorGenerado = arregloVendedores.correlativo();
        CodigoVendedor.setText(codigoVendedorGenerado);
    }//GEN-LAST:event_GenerarVActionPerformed

    public void mostrarDatosTablaVendedor()
    {
        modeloDeTabla.setRowCount(0);
        // creacion de arreglo para guardar los datos y subirlos a la tabla
        String datosMostrar[] = new String[4];
        // datos
        String partesLocal[] = null;
        arregloVendedores.crearArchivoSEGUNDAFORMA();
        try
        {
            String lineaLocal;
            FileReader     fr     = new FileReader("listaVendedores.csv");
            BufferedReader lector = new BufferedReader(fr); // el lector ya tiene el archivo
            // imprimiendo el archivo
            while( (lineaLocal = lector.readLine()) != null) 
            // obten la primera linea del archivo, y si la linea no hay nada,entonces termina
            {
                partesLocal = lineaLocal.split(","); // hasta que encuentra coma cambia de parte
                for (int i=0; i < partesLocal.length; i++)
                {
                    datosMostrar[0] = partesLocal[0]; // codigo
                    datosMostrar[1] = partesLocal[1]; // nombre 
                    datosMostrar[2] = partesLocal[2]; // telefono 
                    datosMostrar[3] = partesLocal[3]; // dni
                    //System.out.println(partes[i] + "     ");
                }
                modeloDeTabla.addRow(datosMostrar);
            }
            lector.close();
            fr.close();
        }
        catch(Exception e) // lanzar un mensaje en caso de que suceda un error
        {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error de tipo: " + e);
        }
    }
    
    private void BotonAgregarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarVActionPerformed
        // INGRESO VENDEDOR
        if(NombreVendedor.getText().equals("") || TelefonoVendedor.getText().equals("")
            || DNIVendedor.getText().equals("") || CodigoVendedor.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Complete todos los campos para continuar");
        }
        else
        {
            String  codigo      = CodigoVendedor.getText();
            String  nombre      = NombreVendedor.getText();
            int     telefono    = Integer.parseInt(TelefonoVendedor.getText());
            int     dni         = Integer.parseInt(DNIVendedor.getText());


            //OBJETO
            Vendedor obj = new Vendedor(codigo, nombre, telefono, dni);

            // agregando datoa a la isntancia de la clase VendedorVector
            arregloVendedores.agregarVendedor(obj);
            arregloVendedores.grabarEnArchivo(obj);
            JOptionPane.showMessageDialog(null, "Vendedor agregado correctametne");
        }
        
    }//GEN-LAST:event_BotonAgregarVActionPerformed

    private void BotonMostrarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMostrarVActionPerformed
        // BOTON PARA MOSTRAR
        // vaciando tabla para q no se acumule
        modeloDeTabla.setRowCount(0);
        // llamando metoodo mostrar
        mostrarDatosTablaVendedor();
        
    }//GEN-LAST:event_BotonMostrarVActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        txtNombre.setText("");
        txtRUC.setText("");
        txtNombre.grabFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        
        if ( txtNombre.getText().equals("") || txtRUC.getText().equals("") )
        {
            JOptionPane.showMessageDialog(null, "llene todos los campos");
        }
        else
        {
            String nombre   = txtNombre.getText().toUpperCase();
            String ID       = arregloProveedores.correlativo();
            String RUC      = txtRUC.getText();
            int cantidadProducto = 0;

            
            boolean verificarExistenciProveedor = arregloProveedores.verificarNombreExistente(nombre);
            if (verificarExistenciProveedor == true)
            {
                JOptionPane.showMessageDialog(null,"Ese proveedor ya existe, digite otro");
                txtNombre.setText("");
                txtNombre.grabFocus();
            }
            else
            {
                // crear el objeto Proveedor
                Proveedor objProveedor = new Proveedor(ID,nombre, RUC, cantidadProducto);

                // agregar al vector y guardarlo en archivo
                arregloProveedores.agregarProveedor(objProveedor);
                arregloProveedores.crearArchivoProductosDeProveedor(nombre);
                arregloProveedores.grabarEnArchivo(objProveedor);
                JOptionPane.showMessageDialog(null,"Proveedor agregado exitosamente");
            }
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnTablapProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTablapProveedorActionPerformed
        // TODO add your handling code here:
        mostrarDatosTablaProveedor();
    }//GEN-LAST:event_btnTablapProveedorActionPerformed

    public void cargarDatosComboBoxProveedores()
    {
        cboBoxProveedores.removeAllItems(); // eliminar los item default
        ArrayList<String> listaProveedores = objAyuda.obetenerListaDeProveedores();
        
        // cargando los datos de la lista proveedores al combo box
        for (int i = 0; i < listaProveedores.size(); i++)
        {
            String nombreProveedor = listaProveedores.get(i);
            cboBoxProveedores.addItem(nombreProveedor);
        }
        
        cboBoxProveedores.setSelectedItem(null);
    }
    
    private void btnEliminarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProveedorActionPerformed
        // TODO add your handling code here:
        try
        {
            int confirmed = JOptionPane.showConfirmDialog(null, 
            "¿Esta seguro de elimnar este vendedor?", "Mensaje de Avertencia",
           JOptionPane.YES_NO_OPTION);

            if (confirmed == JOptionPane.YES_OPTION)
            {
                String proveedorSelecionado = cboBoxProveedores.getSelectedItem().toString();
            
                // creando el objeto a buscar para eliminar
                Proveedor proveedoEliminar = arregloProveedores.buscarPorNombre(proveedorSelecionado);
                // elimnando 
                arregloProveedores.eliminar(proveedoEliminar); // eliminando de memoria
                arregloProveedores.grabarModificareliminar();  // actualiza datos q haya en el archivo, elinminaa
                arregloProveedores.eliminarArchivo(proveedorSelecionado); // eliminar su archivo particular   

                JOptionPane.showMessageDialog(null,"Se elimino con exito");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "operacion cancelada");
            }
                       
        }
        catch(Exception e)
        {
            System.out.println("Ocurrio una excepcion en btnEliminarProveedor " + e);
        }
    }//GEN-LAST:event_btnEliminarProveedorActionPerformed

    private void btnActualizarListaProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarListaProveedoresActionPerformed
        // TODO add your handling code here:
        cargarDatosComboBoxProveedores();
    }//GEN-LAST:event_btnActualizarListaProveedoresActionPerformed

    private void CodigoVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodigoVendedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodigoVendedorActionPerformed
    
    public void cargarDatosComboBoxNombres()
    {
        cboBoxNomVendedor.removeAllItems(); // eliminar los item default
        
        ArrayList<String> listaNomVendedor = objAyuda.getListaCodigoVendedor();
        
        // cargando los datos de la lista proveedores al combo box
        for (int i = 0; i < listaNomVendedor.size(); i++)
        {
            String nomVendedor = listaNomVendedor.get(i);
            cboBoxNomVendedor.addItem(nomVendedor);            
        }
        
        cboBoxNomVendedor.setSelectedIndex(0);
        cboBoxNomVendedor.setSelectedItem(0);
    }
    
    public void cargarDatosComboBoxCodVendedor()
    {
        cboBoxCodVendedor.removeAllItems(); // eliminar los item default
        
        ArrayList<String> listaTelVendedores = objAyuda.getListaCodigoVendedor();
        
        // cargando los datos de la lista proveedores al combo box
        for (int i = 0; i < listaTelVendedores.size(); i++)
        {
            String codVendedor = listaTelVendedores.get(i);
            cboBoxCodVendedor.addItem(codVendedor);            
        }
        
        cboBoxCodVendedor.setSelectedIndex(0);
        cboBoxCodVendedor.setSelectedItem(0);
    }
    
    public void cargarDatosComboBoxEliminarVendedor()
    {
        cboBoxEliminarVendedor.removeAllItems(); // eliminar los item default
        
        ArrayList<String> listaTelVendedores = objAyuda.getListaCodigoVendedor();
        
        // cargando los datos de la lista proveedores al combo box
        for (int i = 0; i < listaTelVendedores.size(); i++)
        {
            String codVendedor = listaTelVendedores.get(i);
            cboBoxEliminarVendedor.addItem(codVendedor);            
        }
        
        cboBoxEliminarVendedor.setSelectedIndex(0);
        cboBoxEliminarVendedor.setSelectedItem(0);
    }
    
    private void loadUpdateCboBoxNomVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadUpdateCboBoxNomVendedorActionPerformed
        // TODO add your handling code here:
        cargarDatosComboBoxNombres();
    }//GEN-LAST:event_loadUpdateCboBoxNomVendedorActionPerformed

    private void loadUpdateCboBoxTelVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadUpdateCboBoxTelVendedorActionPerformed
        // TODO add your handling code here:
        cargarDatosComboBoxCodVendedor();
    }//GEN-LAST:event_loadUpdateCboBoxTelVendedorActionPerformed

    private void cboBoxNomVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboBoxNomVendedorActionPerformed
        // TODO add your handling code here:
        try
        {
            String codigoSeleccionado = cboBoxNomVendedor.getSelectedItem().toString();
            Vendedor objNombreVendedor = arregloVendedores.buscarcodigo(codigoSeleccionado);
            
            String nombreVendedor = objNombreVendedor.getNombre();
            txtNomActual.setText(nombreVendedor);
        }
        catch(Exception e)
        {
            System.out.println("Ocurrio una excepcion en cboBoxNomVendedor: " + e);
        }
    }//GEN-LAST:event_cboBoxNomVendedorActionPerformed

    private void cboBoxCodVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboBoxCodVendedorActionPerformed
        // TODO add your handling code here:
        try
        {
            String codigoSeleccionado = cboBoxCodVendedor.getSelectedItem().toString();
            Vendedor objNombreVendedor = arregloVendedores.buscarcodigo(codigoSeleccionado);
            
            String nombreVendedor = Integer.toString(objNombreVendedor.getTelefono());
            txtTelActual.setText(nombreVendedor);
        }
        catch(Exception e)
        {
            System.out.println("Ocurrio una excepcion en cboBoxCodVendedor: " + e);
        }
    }//GEN-LAST:event_cboBoxCodVendedorActionPerformed

    private void btnModNombreVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModNombreVendedorActionPerformed
        // TODO add your handling code here:
        try
        {
            if (txtNomActual.getText().equals("") || txtNomNuevo.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Escriba el campo de nuevo nombre");
            }
            else
            {
                String codigoSeleccionado    = cboBoxNomVendedor.getSelectedItem().toString();
                String nombreNuevo           = txtNomNuevo.getText();
                Vendedor objNombreVendedor   = arregloVendedores.buscarcodigo(codigoSeleccionado);
                
                boolean estadoModNombre      = arregloVendedores.modificarNombreVendedor(objNombreVendedor, nombreNuevo);
                if (estadoModNombre == true)
                {
                    arregloVendedores.grabarModificareliminar();
                    JOptionPane.showMessageDialog(null, "Nombre modificado exitosamente!");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "No se encontro el codigo en el archivo");
                }
            }
        }
        catch(Exception e)
        {
            System.out.println("Ocurrio una excepcion en btnModificarNombre: " + e);
        }
        
    }//GEN-LAST:event_btnModNombreVendedorActionPerformed

    private void btnModTelVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModTelVendedorActionPerformed
        // TODO add your handling code here:
        try
        {
            if (txtTelActual.getText().equals("") || txtTelNuevo.getText().equals(null))
            {
                JOptionPane.showMessageDialog(null, "Escriba el campo de nuevo nombre");
            }
            else
            {
                String codigoSeleccionado    = cboBoxCodVendedor.getSelectedItem().toString();
                int telefonoNuevo            = Integer.parseInt(txtTelNuevo.getText());
                Vendedor objNombreVendedor   = arregloVendedores.buscarcodigo(codigoSeleccionado);
                boolean estadoModTelefono    = arregloVendedores.modificarTELEFONOProveedor(objNombreVendedor, telefonoNuevo);
                if (estadoModTelefono == true)
                {
                    arregloVendedores.grabarModificareliminar();
                    JOptionPane.showMessageDialog(null, "Telefono modificado exitosamente!");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "No se encontro el codigo en el archivo");
                }
            }
        }
        catch(Exception e)
        {
            System.out.println("Ocurrio una excepcion en btnModificarNombre: " + e);
        }
    }//GEN-LAST:event_btnModTelVendedorActionPerformed

    private void loadUpdateCboBoxDelVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadUpdateCboBoxDelVendedorActionPerformed
        // TODO add your handling code here:
        cargarDatosComboBoxEliminarVendedor();
    }//GEN-LAST:event_loadUpdateCboBoxDelVendedorActionPerformed

    private void cboBoxEliminarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboBoxEliminarVendedorActionPerformed
        // TODO add your handling code here:
        try
        {
            String codigoSeleccionado  = cboBoxEliminarVendedor.getSelectedItem().toString();
            Vendedor objEliminarVendedor = arregloVendedores.buscarcodigo(codigoSeleccionado);
            
            String nombreVendedor  = objEliminarVendedor.getNombre();
            String telefonVendedor = Integer.toString(objEliminarVendedor.getTelefono());
            txtNomEliminarVendedor.setText(nombreVendedor);
            txtTelEliminarVendedor.setText(telefonVendedor);
        }
        catch(Exception e)
        {
            System.out.println("Ocurrio una excepcion en cboBoxCodVendedor: " + e);
        }
    }//GEN-LAST:event_cboBoxEliminarVendedorActionPerformed

    private void btnEliminarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarVendedorActionPerformed
        // TODO add your handling code here:
        try
        {
            int confirmed = JOptionPane.showConfirmDialog(null, 
            "¿Esta seguro de elimnar este vendedor?", "Mensaje de Avertencia",
           JOptionPane.YES_NO_OPTION);

            if (confirmed == JOptionPane.YES_OPTION)
            {
                String codigoSeleccionado   = cboBoxEliminarVendedor.getSelectedItem().toString();
                Vendedor objEliminarVendodr = arregloVendedores.buscarcodigo(codigoSeleccionado);
                if ( objEliminarVendodr.getCodigo().equals("Error"))
                {
                    JOptionPane.showMessageDialog(null, "No se encontro el codigo");
                }
                else
                {
                    arregloVendedores.eliminar(objEliminarVendodr);
                    arregloVendedores.grabarModificareliminar();
                    JOptionPane.showMessageDialog(null, "Vendedor eliminado satisfactoriamente");
                }
                
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Operacion cancelada");
            }
        }
        catch(Exception e)
        {
            System.out.println("Ocurrio una excepcion en btnEleiminar: " + e);
        }
    }//GEN-LAST:event_btnEliminarVendedorActionPerformed

    private void btnRegresarPanel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarPanel1ActionPerformed
        // TODO add your handling code here:
        MenuAdministrador ma = new MenuAdministrador();
        ma.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRegresarPanel1ActionPerformed

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
            java.util.logging.Logger.getLogger(Administrador_Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador_Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador_Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador_Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador_Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAgregarV;
    private javax.swing.JButton BotonMostrarV;
    public javax.swing.JTextField CodigoVendedor;
    private javax.swing.JTextField DNIVendedor;
    private javax.swing.JButton GenerarV;
    private javax.swing.JTextField NombreVendedor;
    private javax.swing.JTable TablaVendedor;
    private javax.swing.JTextField TelefonoVendedor;
    private javax.swing.JTextField TxtIDGenerado;
    private javax.swing.JButton btnActualizarListaProveedores;
    private javax.swing.JPanel btnActualizarTabla;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminarProveedor;
    private javax.swing.JButton btnEliminarVendedor;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModNombreVendedor;
    private javax.swing.JButton btnModTelVendedor;
    private javax.swing.JButton btnRegresarPanel1;
    private javax.swing.JButton btnTablapProveedor;
    private javax.swing.JComboBox<String> cboBoxCodVendedor;
    private javax.swing.JComboBox<String> cboBoxEliminarVendedor;
    private javax.swing.JComboBox<String> cboBoxNomVendedor;
    private javax.swing.JComboBox<String> cboBoxProveedores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton loadUpdateCboBoxDelVendedor;
    private javax.swing.JButton loadUpdateCboBoxNomVendedor;
    private javax.swing.JButton loadUpdateCboBoxTelVendedor;
    private javax.swing.JTable tablaProveedores;
    private javax.swing.JTextField txtNomActual;
    private javax.swing.JTextField txtNomEliminarVendedor;
    private javax.swing.JTextField txtNomNuevo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRUC;
    private javax.swing.JTextField txtTelActual;
    private javax.swing.JTextField txtTelEliminarVendedor;
    private javax.swing.JTextField txtTelNuevo;
    // End of variables declaration//GEN-END:variables
}
