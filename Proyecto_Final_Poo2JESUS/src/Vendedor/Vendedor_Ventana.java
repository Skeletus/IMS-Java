/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vendedor;

//import package menu
import Menu.Menu_Ventana;
import Tests.*;
// import package producto
import Producto.Producto;
import ProductoArray.*;
// import porduct kardex
import Kardex.*;
import KardexVector.*;
import Menu.MenuAdministrador;
import Menu.MenuProveedor;
import Menu.MenuVendedor;
import Proveedor.Proveedor;
import Proveedor.ProveedorVector;
import Tests.Ayudas;
// import para fechas
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

// import lectores de archivo
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
// import arraylist
import java.util.ArrayList;
//import swing
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//import csvreader jar
//import com.csvreader.CsvWriter;
import java.util.Random;

/**
 *
 * @author Lorelay
 */
public class Vendedor_Ventana extends javax.swing.JFrame {

    // instancia de la clase objeto ayuda 
    Ayudas objAyuda = new Ayudas();
    // instancia de la clase proveedor
    ProveedorVector vectorproveedor = new ProveedorVector();
    // instancia de la clase producto Arreglo
    ProductArreglo vectorProductos = new ProductArreglo();
    // instancia de la clase producto Arreglo
    kardexVector vectorKardex = new kardexVector();
    // instancia de la clase ProductosProveedorVector
    ProductosProveedorVector vectorProductosProveedores = new ProductosProveedorVector();
    
    // modelo de tabla
    DefaultTableModel   modeloDeTabla = new DefaultTableModel();
    // modelo de tabla ventas
    DefaultTableModel   modeloDeTablaVentas = new DefaultTableModel();
    // areglo de objetos personDefaultTableModel
    ArrayList<Producto> arregloProductos = new ArrayList();
    
    int timePressedBtnUpdateCboBoxProveedores = 0;
    int btnActualizarDatos = 0;
    
    public String rol = "";
    
    public Vendedor_Ventana(String str) 
    {
        initComponents();
        setRol(str);
        System.out.println("rol: " + str);
        modeloDeTabla.addColumn("Nombre");
        modeloDeTabla.addColumn("Marca");
        modeloDeTabla.addColumn("Descripcion");
        modeloDeTabla.addColumn("Cantidad");
        modeloDeTabla.addColumn("Precio");
        // escribiend el modelo en la tabla
        TablaP.setModel(modeloDeTabla);
        
        modeloDeTablaVentas.addColumn("ID VENTA");
        modeloDeTablaVentas.addColumn("ID CLIENTE");
        modeloDeTablaVentas.addColumn("ID VENDEDOR");
        modeloDeTablaVentas.addColumn("FECHA");
        modeloDeTablaVentas.addColumn("CANTIDAD COMPRADA");
        modeloDeTablaVentas.addColumn("TOTAL PAGAR");
        // setting modelo en tabla venta
        TablaB.setModel(modeloDeTablaVentas);
        
        cargarcboBoxProveedores();
        /*
        cargarDatosComboBoxProveedores();
        iniciarListaProductosProveedor();
        */
    }
    
    public Vendedor_Ventana() 
    {
        initComponents();
        
        modeloDeTabla.addColumn("Nombre");
        modeloDeTabla.addColumn("Marca");
        modeloDeTabla.addColumn("Descripcion");
        modeloDeTabla.addColumn("Cantidad");
        modeloDeTabla.addColumn("Precio");
        // escribiend el modelo en la tabla
        TablaP.setModel(modeloDeTabla);
        
        cargarcboBoxProveedores();
        /*
        cargarDatosComboBoxProveedores();
        iniciarListaProductosProveedor();
        */
    }
    
    public void setRol(String str)
    {
        rol = str;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        BotonRegresar1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaB = new javax.swing.JTable();
        btnMostrarVentas = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        BotonRegresar2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        NombreP = new javax.swing.JTextField();
        DescripcionP = new javax.swing.JTextField();
        PrecioP = new javax.swing.JTextField();
        CantidadP = new javax.swing.JTextField();
        BotonMostrarProductos = new javax.swing.JButton();
        BotonAñadir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaP = new javax.swing.JTable();
        cboBoxProveedores = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        BotonRegresar3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        listProductoNombre = new javax.swing.JComboBox<>();
        listProvedorNombre = new javax.swing.JComboBox<>();
        txtNomActual = new javax.swing.JTextField();
        txtNuevoNombre = new javax.swing.JTextField();
        btnModificarNombre = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        listProveedorPrecio = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        listProductoPrecio = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        txtPriceActual = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtNuevoPrecio = new javax.swing.JTextField();
        btnModificarPrecio = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btnEliminarProducto = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtPrecioEliminar = new javax.swing.JTextField();
        listEliminarProveedor = new javax.swing.JComboBox<>();
        listEliminarProducto = new javax.swing.JComboBox<>();
        txtCantidadEliminar = new javax.swing.JTextField();
        btnActualizarCboBox = new javax.swing.JButton();
        btnMostrarDatosModPrecio = new javax.swing.JButton();
        btnMostrarDatosEliminar = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        BotonRegresar1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        BotonRegresar1.setText("Regresar");
        BotonRegresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegresar1ActionPerformed(evt);
            }
        });

        TablaB.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(TablaB);

        btnMostrarVentas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnMostrarVentas.setText("Mostrar");
        btnMostrarVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarVentasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMostrarVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonRegresar1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(587, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonRegresar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrarVentas))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Balance de Venta", jPanel2);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        BotonRegresar2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        BotonRegresar2.setText("Regresar");
        BotonRegresar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegresar2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Swis721 BT", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("INGRESAR NUEVO PRODUCTO");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Nombre del Producto:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Descripcion del Producto:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Precio del Producto:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Cantidad del Producto:");

        BotonMostrarProductos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BotonMostrarProductos.setText("Mostrar");
        BotonMostrarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMostrarProductosActionPerformed(evt);
            }
        });

        BotonAñadir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BotonAñadir.setText("Añadir");
        BotonAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAñadirActionPerformed(evt);
            }
        });

        jLabel7.setText("Proveedor");

        TablaP.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(TablaP);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanel9);

        cboBoxProveedores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboBoxProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboBoxProveedoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NombreP, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(DescripcionP, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(PrecioP, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(CantidadP, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(cboBoxProveedores, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(BotonMostrarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(BotonAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 886, Short.MAX_VALUE)
                .addComponent(BotonRegresar2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1)
                        .addGap(58, 58, 58)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(NombreP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cboBoxProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DescripcionP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PrecioP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CantidadP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(76, 76, 76))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BotonRegresar2)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BotonMostrarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BotonAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Agregar un Producto", jPanel3);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        BotonRegresar3.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        BotonRegresar3.setText("Regresar");
        BotonRegresar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegresar3ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Swis721 BT", 2, 24)); // NOI18N
        jLabel6.setText("MODIFICAR DATOS DE UN PRODUCTO");

        jLabel8.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Modificar Nombre");

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Seleccionar Proveedor");

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Nombre Actual");

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Seleccionar Producto");

        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Nuevo Nombre: ");

        listProductoNombre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        listProductoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listProductoNombreActionPerformed(evt);
            }
        });

        listProvedorNombre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        listProvedorNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listProvedorNombreActionPerformed(evt);
            }
        });

        txtNomActual.setEditable(false);
        txtNomActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomActualActionPerformed(evt);
            }
        });

        btnModificarNombre.setText("MODIFICAR NOMBRE");
        btnModificarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarNombreActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial Black", 2, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Modificar Precio");

        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Seleccionar Proveedor");

        listProveedorPrecio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        listProveedorPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listProveedorPrecioActionPerformed(evt);
            }
        });

        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Seleccionar Producto");

        listProductoPrecio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        listProductoPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listProductoPrecioActionPerformed(evt);
            }
        });

        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Precio Actual");

        txtPriceActual.setEditable(false);

        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Nuevo Precio");

        btnModificarPrecio.setText("MODIFICAR PRECIO");
        btnModificarPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarPrecioActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Eliminar Producto");

        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Seleccionar proveedor");

        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Seleccionar producto");

        btnEliminarProducto.setText("ELIMINAR");
        btnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductoActionPerformed(evt);
            }
        });

        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Precio: ");

        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Stock: ");

        txtPrecioEliminar.setEditable(false);

        listEliminarProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        listEliminarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listEliminarProveedorActionPerformed(evt);
            }
        });

        listEliminarProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        listEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listEliminarProductoActionPerformed(evt);
            }
        });

        txtCantidadEliminar.setEditable(false);

        btnActualizarCboBox.setText("Actualizar listas productos");
        btnActualizarCboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarCboBoxActionPerformed(evt);
            }
        });

        btnMostrarDatosModPrecio.setText("Mostrar Datos");
        btnMostrarDatosModPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarDatosModPrecioActionPerformed(evt);
            }
        });

        btnMostrarDatosEliminar.setText("Mostrar Datos");
        btnMostrarDatosEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarDatosEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(27, 27, 27)
                        .addComponent(btnActualizarCboBox, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnModificarNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNomActual, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(listProductoNombre, javax.swing.GroupLayout.Alignment.TRAILING, 0, 95, Short.MAX_VALUE)
                                    .addComponent(listProvedorNombre, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNuevoNombre))))
                        .addGap(131, 131, 131)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(83, 83, 83)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(listProveedorPrecio, 0, 107, Short.MAX_VALUE)
                                    .addComponent(listProductoPrecio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPriceActual)
                                    .addComponent(txtNuevoPrecio)))
                            .addComponent(btnModificarPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMostrarDatosModPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(118, 118, 118)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPrecioEliminar)
                            .addComponent(listEliminarProveedor, 0, 103, Short.MAX_VALUE)
                            .addComponent(listEliminarProducto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCantidadEliminar))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnMostrarDatosEliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminarProducto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonRegresar3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(236, 236, 236)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(182, 182, 182)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(197, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(btnActualizarCboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(listProvedorNombre)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(listProveedorPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(listEliminarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(listProductoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(listProductoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(listEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtNomActual)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPriceActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel21)
                                .addComponent(txtPrecioEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNuevoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCantidadEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(btnModificarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                .addComponent(BotonRegresar3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnMostrarDatosModPrecio)
                                    .addComponent(btnMostrarDatosEliminar))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnModificarPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33))))))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Modificar un Producto", jPanel4);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1340, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void cargarDatosComboBoxProveedores()
    {
        cboBoxProveedores.removeAllItems(); // eliminar los item default
        listProvedorNombre.removeAllItems(); // CBO BOX MODIFICAR NOMBRE
        listProveedorPrecio.removeAllItems(); // CBO BOX MODIFICAR PRECIO
        listEliminarProveedor.removeAllItems(); // CBO BOZ ELIMINAR PRODUCTO
        
        ArrayList<String> listaProveedores = objAyuda.obetenerListaDeProveedores();
        
        // cargando los datos de la lista proveedores al combo box
        for (int i = 0; i < listaProveedores.size(); i++)
        {
            String nombreProveedor = listaProveedores.get(i);
            cboBoxProveedores.addItem(nombreProveedor);
            listProvedorNombre.addItem(nombreProveedor);
            listProveedorPrecio.addItem(nombreProveedor);
            listEliminarProveedor.addItem(nombreProveedor);
            
        }
        
        cboBoxProveedores.setSelectedIndex(0);
        cboBoxProveedores.setSelectedItem(0);
        
        listProvedorNombre.setSelectedItem(2);
        
        listProveedorPrecio.setSelectedIndex(0);
        listProveedorPrecio.setSelectedItem(0);
        
        listEliminarProveedor.setSelectedIndex(0);
        listEliminarProveedor.setSelectedItem(0);
    }
    
    public void cargarcboBoxProveedores()
    {
        cboBoxProveedores.removeAllItems(); // eliminar los item default
        ArrayList<String> listaProveedores = objAyuda.obetenerListaDeProveedores();
        // cargando los datos de la lista proveedores al combo box
        for (int i = 0; i < listaProveedores.size(); i++)
        {
            String nombreProveedor = listaProveedores.get(i);
            cboBoxProveedores.addItem(nombreProveedor);
        }
        cboBoxProveedores.setSelectedIndex(0);
        cboBoxProveedores.setSelectedItem(0);
    }
    
    public void iniciarListaProductosProveedor()
    {
        listProductoNombre.removeAllItems();
        listProductoPrecio.removeAllItems();
        listEliminarProducto.removeAllItems();
        
        listProductoNombre.addItem("...");
        listProductoPrecio.addItem("...");
        listEliminarProducto.addItem("...");
    }
    
    public void cargarCboBoxModNombreListaDeProductoProveedor(String proveedorSeleccionado)
    {
        listProductoNombre.removeAllItems();  // modificar nombre
        ArrayList<String> listaProductos = objAyuda.obetenerListaDeProductosPorProveedores(proveedorSeleccionado);
        // cargando los datos de la lista proveedores al combo box
        for (int i = 0; i < listaProductos.size(); i++)
        {
            String nombreProducto = listaProductos.get(i);
            listProductoNombre.addItem(nombreProducto);            
        }
        listProductoNombre.setSelectedIndex(0);
        //listProductoNombre.setSelectedItem(0);
    }
    
    public void cargarCboBoxModPrecioListaDeProductoProveedor(String proveedorSeleccionado)
    {
        listProductoPrecio.removeAllItems();  // modificar nombre
        ArrayList<String> listaProveedores = objAyuda.obetenerListaDeProductosPorProveedores(proveedorSeleccionado);
        // cargando los datos de la lista proveedores al combo box
        for (int i = 0; i < listaProveedores.size(); i++)
        {
            String nombreProveedor = listaProveedores.get(i);
            listProductoPrecio.addItem(nombreProveedor);            
        }
        listProductoPrecio.setSelectedItem(0);
    }
    
    public void cargarCboBoxElmiminarProductoListaDeProductoProveedor(String proveedorSeleccionado)
    {
        listEliminarProducto.removeAllItems();  // modificar nombre
        ArrayList<String> listaProveedores = objAyuda.obetenerListaDeProductosPorProveedores(proveedorSeleccionado);
        // cargando los datos de la lista proveedores al combo box
        for (int i = 0; i < listaProveedores.size(); i++)
        {
            String nombreProveedor = listaProveedores.get(i);
            listEliminarProducto.addItem(nombreProveedor);            
        }
        listEliminarProducto.setSelectedItem(0);
    }
    
    
    private void BotonRegresar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegresar2ActionPerformed
        // REGRESAR AL MENU PRINCIPAL
        System.out.println("rol actual: " + rol);
        if ( rol.equals("admin"))
        {
            MenuAdministrador jf1 = new MenuAdministrador("admin");
            jf1.show();

            dispose();
        }
        if( rol.equals("vendedor"))
        {
            MenuVendedor jf1 = new MenuVendedor("vendedor");
            jf1.show();

            dispose();
        }
        if( rol.equals("proveedor"))
        {
            MenuProveedor jf1 = new MenuProveedor("proveedor");
            jf1.show();

            dispose();
        }
    }//GEN-LAST:event_BotonRegresar2ActionPerformed

    private void BotonRegresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegresar1ActionPerformed
        // REGRESAR AL MENU PRINCIPAL
        System.out.println("rol actual: " + rol);
        if ( rol.equals("admin"))
        {
            MenuAdministrador jf1 = new MenuAdministrador("admin");
            jf1.show();

            dispose();
        }
        if( rol.equals("vendedor"))
        {
            MenuVendedor jf1 = new MenuVendedor("vendedor");
            jf1.show();

            dispose();
        }
        if( rol.equals("proveedor"))
        {
            MenuProveedor jf1 = new MenuProveedor("proveedor");
            jf1.show();

            dispose();
        }
    }//GEN-LAST:event_BotonRegresar1ActionPerformed

    private void BotonRegresar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegresar3ActionPerformed
        // REGRESAR AL MENU PRINCIPAL
        System.out.println("rol actual: " + rol);
        if ( rol.equals("admin"))
        {
            MenuAdministrador jf1 = new MenuAdministrador("admin");
            jf1.show();

            dispose();
        }
        if( rol.equals("vendedor"))
        {
            MenuVendedor jf1 = new MenuVendedor("vendedor");
            jf1.show();

            dispose();
        }
        if( rol.equals("proveedor"))
        {
            MenuProveedor jf1 = new MenuProveedor("proveedor");
            jf1.show();

            dispose();
        }
    }//GEN-LAST:event_BotonRegresar3ActionPerformed

    public void verRepeticion()
    {
        try
        {
            // vaciar datos en caso se haya usado previamente
            vectorKardex.vaciarVector();
            String nombreProduct = NombreP.getText();
            String proveedor     = cboBoxProveedores.getSelectedItem().toString();
            vectorProductosProveedores.cargardatos_archivo_vector(proveedor);
            
            boolean estadoRepeticionNombre = vectorProductosProveedores.verificarNombreRepetidoProducto(nombreProduct);
            if ( estadoRepeticionNombre == true)
            {
                JOptionPane.showMessageDialog(null, "Este nombre ya existe");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Nuevo Nombre ");
            }
        }
        catch(Exception e)
        {
            String msgException = "Ocurrio una excepcion en brnAgregarProducto: " + e;
            System.out.println(msgException);
            JOptionPane.showMessageDialog(null, msgException);
        }
    }
    
    public void ingresarProducto()
    {
        try
        {
            // INGRESO PRODUCTOS
            String nombreProduct = NombreP.getText();
            String descripcion   = DescripcionP.getText();
            String proveedor     = cboBoxProveedores.getSelectedItem().toString();
            double precio        = Double.parseDouble(PrecioP.getText());       
            int    cantidad      = Integer.parseInt(CantidadP.getText());
            
            // vaciar datos en caso se haya usado previamente
            vectorKardex.vaciarVector();
            vectorProductosProveedores.vaciarArreglo();
            
            // cargando datos del archivo al vector
            vectorKardex.cargardatos_archivo_vector(nombreProduct, proveedor);
            vectorProductosProveedores.cargardatos_archivo_vector(proveedor);
            
            // sacar los codigos respectivos de productoProveedor y kardexProducto
            String codigoProductoProveedor = vectorProductosProveedores.correlativo(proveedor);
            String codigoKardex  = vectorKardex.correlativo();
            
            // obtener fecha actual
            String fecha = objAyuda.getFecha();

            // calculos adicionales
            double valorEntrada             = precio * cantidad;
            double valorEntradaRedondeado   = objAyuda.redondearPrecio(valorEntrada);
            double precioConGanancia        = precio + 0.2*(precio);
            precioConGanancia               = precioConGanancia + (0.18 * precioConGanancia); // igv
            double precioGananciaRedondeado = objAyuda.redondearPrecio(precioConGanancia);
            String tipoDocumento            = objAyuda.generarCodigoFactura();

            // AGREGANDO EL OBJETO a la listaGeneral de Productos
            Producto objProducto = new Producto(codigoProductoProveedor, nombreProduct, proveedor,
                                                descripcion, cantidad, precioGananciaRedondeado);
            // agregando el objeto producto para guardarlo con archivo especifico por proveedor
            Producto objProductoPorProveedor = new Producto(codigoProductoProveedor, nombreProduct, proveedor,
                                                descripcion, cantidad, precioGananciaRedondeado);
            
            // !!!! verificar si el nombre del produycto ya existe
            boolean estadoRepeticionNombre = vectorProductosProveedores.verificarNombreRepetidoProducto(nombreProduct);
            if ( estadoRepeticionNombre == true)
            {
                JOptionPane.showMessageDialog(null, "Este producto ya existe, ingrese otro");
                NombreP.setText("");
                NombreP.grabFocus();
            }
            else
            {
                //JOptionPane.showMessageDialog(null, "Nuevo Nombre ");
                vectorProductos.agregarProducto(objProducto); // aca se agrega a la lsita general de todos los productos
                vectorProductosProveedores.agregarProducto(objProductoPorProveedor); // aca se agrega al archivo por Proveedor
                // AGREGANDO DATOS AL KARDEX
                /*
                // constructor para cuando se agrega un nuevo producto
                    public kardex(String codigo, String tipoDocumento, String fecha,
                        int entradaCant, double entradaValor,
                         double valorUnitario, double precioProducto) 
                */
                kardex objKardex = new kardex(codigoKardex, tipoDocumento, fecha,
                                               cantidad, valorEntradaRedondeado,
                                                precio, precioConGanancia);
                vectorKardex.agregarRegistroAlKardex(objKardex);
                Proveedor proveEncontrado = vectorproveedor.buscarPorNombre(proveedor);
                System.out.println("proveedor nomrbe:  " + proveEncontrado);
                proveEncontrado.setCantidadDeProductos(cantidad);
                
                // GUARDANDO EN ARCHIVO
                vectorProductos.grabarEnArchivoGeneral(objProducto);
                vectorProductosProveedores.grabarEnArchivoEspcefico(objProductoPorProveedor, proveedor);
                vectorKardex.grabarEnArchivo(objKardex, nombreProduct, proveedor);
                vectorproveedor.grabarModificareliminar();
                JOptionPane.showMessageDialog(null, "PRODUCTO AGREGADO EXITOSAMENTE!!!");
                LimpiarFields();
            }
            
        }
        catch(Exception e)
        {
            String msgException = "Ocurrio una excepcion en brnAgregarProducto: " + e;
            System.out.println(msgException);
            JOptionPane.showMessageDialog(null, msgException);
        }
        
    }
    
    public void LimpiarFields()
    {
        NombreP.setText("");
        DescripcionP.setText("");
        cboBoxProveedores.setSelectedItem(null);
        PrecioP.setText("");
        CantidadP.setText("");
        NombreP.grabFocus();
    }
    
    private void BotonAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAñadirActionPerformed
        //verRepeticion();
        
        if( NombreP.getText().equals("") || DescripcionP.getText().equals("") 
           || PrecioP.getText().equals(null) || CantidadP.getText().equals(null) )
        {
            JOptionPane.showMessageDialog(null, "LLENE TODO LOS CAMPOS");
        }
        else
        {
            ingresarProducto();
        }
        
    }//GEN-LAST:event_BotonAñadirActionPerformed

    public void cargarDatosTablaProducto()
    {
        // creacion de arreglo para guardar los datos y subirlos a la tabla
        String datosMostrar[] = new String[5];
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
                    datosMostrar[0] = partesLocal[1]; // nombre
                    datosMostrar[1] = partesLocal[2]; // marca
                    datosMostrar[2] = partesLocal[3]; // definicion
                    datosMostrar[3] = partesLocal[4]; // cantidad
                    datosMostrar[4] = partesLocal[5]; // precio
                    //System.out.println(partes[i] + "     ");
                }
                modeloDeTabla.addRow(datosMostrar);
            }
            lector.close();
            fr.close();
        }
        catch(Exception e) // lanzar un mensaje en caso de que suceda un error
        {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al cargar la tabla Producto de tipo: " + e);
        }
    }
    
    private void BotonMostrarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMostrarProductosActionPerformed

        // eliminar las filas anteriores para que no se acumulen
        modeloDeTabla.setRowCount(0);
        // mostrar nombre-marca--descripcion-precio-cantidad en la tabla de productos
        cargarDatosTablaProducto();
    }//GEN-LAST:event_BotonMostrarProductosActionPerformed

    public void cargarDatosTablaVenta()
    {
        modeloDeTablaVentas.setRowCount(0);
        // creacion de arreglo para guardar los datos y subirlos a la tabla
        String datosMostrar[] = new String[6];
        // datos
        String partesLocal[] = null;
        try
        {
            String lineaLocal;
            FileReader     fr     = new FileReader("listaVentas.csv");
            BufferedReader lector = new BufferedReader(fr); // el lector ya tiene el archivo
            // imprimiendo el archivo
            while( (lineaLocal = lector.readLine()) != null) 
            // obten la primera linea del archivo, y si la linea no hay nada,entonces termina
            {
                partesLocal = lineaLocal.split(","); // hasta que encuentra coma cambia de parte
                for (int i=0; i < partesLocal.length; i++)
                {
                    datosMostrar[0] = partesLocal[0]; // ID VENTA
                    datosMostrar[1] = partesLocal[1]; // ID CLIENTE
                    datosMostrar[2] = partesLocal[2]; // ID VENDEDOR
                    datosMostrar[3] = partesLocal[3]; // FECHA
                    datosMostrar[4] = partesLocal[4]; // CANTIDAD
                    datosMostrar[5] = partesLocal[5]; // PAGO TOTAL
                    //System.out.println(partes[i] + "     ");
                }
                modeloDeTablaVentas.addRow(datosMostrar);
            }
            lector.close();
            fr.close();
        }
        catch(Exception e) // lanzar un mensaje en caso de que suceda un error
        {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al cargar la tabla Producto de tipo: " + e);
        }
    }
    
    private void btnMostrarVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarVentasActionPerformed
        // TODO add your handing code here:
        cargarDatosTablaVenta();
    }//GEN-LAST:event_btnMostrarVentasActionPerformed

    private void txtNomActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomActualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomActualActionPerformed

    private void btnModificarPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarPrecioActionPerformed
        // TODO add your handling code here:
        // ===== MODIFICAR PRECIO
        try
        {
            // vaciar los datos guardados en memoria en caso ya se hayan cargado
            vectorProductosProveedores.vaciarArreglo();
            vectorKardex.vaciarVector();
            
            String proveedorSeleccionado    = listProveedorPrecio.getSelectedItem().toString();
            String productoSelecionado      = listProductoPrecio.getSelectedItem().toString();
            double precioNuevo              = Double.parseDouble(txtNuevoPrecio.getText());
            
            double precioConGnancia = precioNuevo + 0.2*precioNuevo;
            precioConGnancia = precioConGnancia + 0.18*precioConGnancia;
            double precioGananciaRedondeado = objAyuda.redondearPrecio(precioConGnancia);
            
            // volviendo a cargar los datos
            vectorProductosProveedores.cargardatos_archivo_vector(proveedorSeleccionado);
            vectorKardex.cargardatos_archivo_vector(productoSelecionado, proveedorSeleccionado);
            
            Producto objModPrecioEspecifico = vectorProductosProveedores.buscarNombreProveedor(productoSelecionado, proveedorSeleccionado);
            objModPrecioEspecifico.setPrecio(precioGananciaRedondeado);
            
            Producto objModPrecioGeneral = vectorProductos.buscarNombreProveedor(productoSelecionado, proveedorSeleccionado);
            objModPrecioGeneral.setPrecio(precioGananciaRedondeado);

            
            // grabando del archivo  listaProductosPROVEEDOR y actualizando datos
            vectorProductosProveedores.grabarModificareliminar(proveedorSeleccionado);
                
            // grabado del archivo y actulizando listaProductos   general
            vectorProductos.grabarModificareliminar();
            
                
            // cambiar los datos del kardex
            kardex kardexModificarPrecio = vectorKardex.obtenerUltimoKardex();
            kardexModificarPrecio.setPrecioProducto(precioConGnancia);
            vectorKardex.grabarModificareliminar(productoSelecionado, proveedorSeleccionado);
            //System.out.println(kardexModificarPrecio.toString());
            
            JOptionPane.showMessageDialog(null,"Precio modificado exitosamente");
        }
        catch(Exception e)
        {
            String msgException = "ocurrio un eror en boton modificar precio" + e;
            System.out.println(msgException);
            JOptionPane.showMessageDialog(null,msgException);
        }
    }//GEN-LAST:event_btnModificarPrecioActionPerformed

    private void listProvedorNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listProvedorNombreActionPerformed
        // TODO add your handling code here:
        try
        {
            //cargarDatosComboBoxProveedores();
            if ( btnActualizarDatos > 0)
            {
                String proveedorSeleccionado = listProvedorNombre.getSelectedItem().toString();
                cargarCboBoxModNombreListaDeProductoProveedor(proveedorSeleccionado);
                
            }
        }
        catch(Exception e)
        {
            System.out.println("error en lista proveedor modificar nombre: "+e);
        }
    }//GEN-LAST:event_listProvedorNombreActionPerformed

    private void listProveedorPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listProveedorPrecioActionPerformed
        // TODO add your handling code here:
        try
        {
            if ( btnActualizarDatos > 0)
            {
                String proveedorSeleccionado = listProveedorPrecio.getSelectedItem().toString();
                cargarCboBoxModPrecioListaDeProductoProveedor(proveedorSeleccionado);
            }
        }
        catch(Exception e)
        {
            System.out.println("error en lista proveedor modificar precio: "+e);
        }
    }//GEN-LAST:event_listProveedorPrecioActionPerformed

    private void listEliminarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listEliminarProveedorActionPerformed
        // TODO add your handling code here:
        try
        {
            if ( btnActualizarDatos > 0)
            {
                String productoNombre = listEliminarProveedor.getSelectedItem().toString();
                cargarCboBoxElmiminarProductoListaDeProductoProveedor(productoNombre);
            }
        }
        catch(Exception e)
        {
            System.out.println("error en lista proveedor elimnar producto: "+e);
        }
    }//GEN-LAST:event_listEliminarProveedorActionPerformed

    private void listProductoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listProductoNombreActionPerformed
        // TODO add your handling code here:
        try
        {
            
            if ( btnActualizarDatos >0)
            {               
                String productoSelecionado = listProductoNombre.getSelectedItem().toString();
                txtNomActual.setText(productoSelecionado);
            }
            
        }
        catch(Exception e)
        {
            System.out.println("Ocurrio un error en la lista Proudcto Nombre: "+e);
        }
    }//GEN-LAST:event_listProductoNombreActionPerformed

    private void listProductoPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listProductoPrecioActionPerformed
        // TODO add your handling code here:
        try
        {
            
        }
        catch(Exception e)
        {
            System.out.println("ocurrio un error en la lista Producto Precio"+e);
        }
    }//GEN-LAST:event_listProductoPrecioActionPerformed

    private void listEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listEliminarProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listEliminarProductoActionPerformed

    private void btnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductoActionPerformed
        // TODO add your handling code here:
        try
        {
            
            int confirmed = JOptionPane.showConfirmDialog(null, 
         "¿Esta seguro de elimnar este producto?", "Mensaje de Avertencia",
        JOptionPane.YES_NO_OPTION);

            if (confirmed == JOptionPane.YES_OPTION) 
            {
                          
                String proveedorSeleccionado = listEliminarProveedor.getSelectedItem().toString();
                String productoSerleccionado = listEliminarProducto.getSelectedItem().toString();
                System.out.println("Proveedor: " +  proveedorSeleccionado + "\nProducto: " + productoSerleccionado);
                
                vectorProductosProveedores.vaciarArreglo(); // en caso ya se haya agregado algo previamente
                vectorProductosProveedores.cargardatos_archivo_vector(proveedorSeleccionado); // volver a cargar los datos
 
                Producto objEliminarEspecifico = vectorProductosProveedores.buscarNombreProveedor(productoSerleccionado, proveedorSeleccionado);
                Producto objeEliminarGeneral = vectorProductos.buscarNombreProveedor(productoSerleccionado, proveedorSeleccionado);
                Proveedor proveEncontrado = vectorproveedor.buscarPorNombre(proveedorSeleccionado);
                System.out.println("proveedor encontrado: "  + proveEncontrado.getNombre());
                // eliminado del archivo  listaProductosPROVEEDOR y actualizando datos
                vectorProductosProveedores.eliminar(objEliminarEspecifico);
                vectorProductosProveedores.grabarModificareliminar(proveedorSeleccionado);
                
                int cantidadProductosInicial = proveEncontrado.getCantidadDeProductos();
                int cantidadRestante = objEliminarEspecifico.getCantidad();
                int totalRestante = cantidadProductosInicial - cantidadRestante;
                proveEncontrado.setCantidadDeProductos(totalRestante);
                
                // elminiado del archivo y actulizando listaProductos   general
                vectorProductos.eliminar(objeEliminarGeneral);
                vectorProductos.grabarModificareliminar();
                vectorproveedor.grabarModificareliminar();
                
                // eliminar el kardex del producto seleccionado
                vectorKardex.eliminarArchivoKardex(productoSerleccionado, proveedorSeleccionado);                
                
                JOptionPane.showMessageDialog(null, "Producto eliminado satisfactoriamente");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Operacion cancelada");
            }
            
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnEliminarProductoActionPerformed

    private void btnModificarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarNombreActionPerformed
        // TODO add your handling code here:
        // ======= MODIFICAR NOMBRE 
        try
        {
            String proveedorSeleccionado = listProvedorNombre.getSelectedItem().toString();
            String productoSerleccionado = listProductoNombre.getSelectedItem().toString();   
            String nuevoNombre           = txtNuevoNombre.getText();
            String nombreProductoActual  = txtNomActual.getText();
            
            System.out.println("OLD nombre:  "  + nombreProductoActual); 
            System.out.println("Nuevo nombre:  "  + nuevoNombre); 
            System.out.println("Proveedor: " +  proveedorSeleccionado + "\nProducto: " + productoSerleccionado);
            
            // vaciar arreglos en caso se haya agregado algo previamente
            vectorProductosProveedores.vaciarArreglo(); 
            // volviendo a cargar los datos
            vectorProductosProveedores.cargardatos_archivo_vector(proveedorSeleccionado);
            
            Producto objModNombreEspecifico = vectorProductosProveedores.buscarNombreProveedor(productoSerleccionado, proveedorSeleccionado);
            objModNombreEspecifico.setNombre(nuevoNombre);
            Producto objModNombreGeneral = vectorProductos.buscarNombreProveedor(productoSerleccionado, proveedorSeleccionado);
            objModNombreGeneral.setNombre(nuevoNombre);
            
                
            // grabando del archivo  listaProductosPROVEEDOR y actualizando datos
            vectorProductosProveedores.grabarModificareliminar(proveedorSeleccionado);
                
            // grabado del archivo y actulizando listaProductos   general
            vectorProductos.grabarModificareliminar();
                
            // renombrar el antiguo archivo ya q se modifico el nombre
            vectorKardex.renombrarArchivoKardex(productoSerleccionado,proveedorSeleccionado,nuevoNombre);
            
            JOptionPane.showMessageDialog(null,"Nombre modificado exitosamente");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnModificarNombreActionPerformed

    private void btnActualizarCboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarCboBoxActionPerformed
        // TODO add your handling code here:
        cargarDatosComboBoxProveedores();
        iniciarListaProductosProveedor();
        btnActualizarDatos++;
        timePressedBtnUpdateCboBoxProveedores++;
    }//GEN-LAST:event_btnActualizarCboBoxActionPerformed

    private void btnMostrarDatosModPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarDatosModPrecioActionPerformed
        // TODO add your handling code here:
        try
        {
            String proveedorSeleccionado    = listProveedorPrecio.getSelectedItem().toString();
            String productoSelecionado      = listProductoPrecio.getSelectedItem().toString();
            Producto objMostrarPrecio       = vectorProductos.buscarNombreProveedor(productoSelecionado, proveedorSeleccionado);
            String precioActual             = Double.toString(objMostrarPrecio.getPrecio());

            txtPriceActual.setText(precioActual);
        }
        catch (Exception e)
        {
            System.out.println("Excepcion en btnMostrarDatos Precios: " + e);
        }
        
        
        
    }//GEN-LAST:event_btnMostrarDatosModPrecioActionPerformed

    private void btnMostrarDatosEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarDatosEliminarActionPerformed
        // TODO add your handling code here:
        try
        {
            String proveedorSeleccionado = listEliminarProveedor.getSelectedItem().toString();
            String productoSeleccionado  = listEliminarProducto.getSelectedItem().toString();
            
            Producto objBuscarElminar = vectorProductosProveedores.buscarNombreProveedor(
                                        productoSeleccionado, proveedorSeleccionado);
            boolean estadoEncontrado = vectorProductosProveedores.verificarExistenciaProducto(
                                        objBuscarElminar.getCodigoProducto());
            if ( estadoEncontrado == true)
            {
                String precio = Double.toString(objBuscarElminar.getPrecio());
                String stock  = Integer.toString(objBuscarElminar.getCantidad());
                
                txtPrecioEliminar.setText(precio);
                txtCantidadEliminar.setText(stock);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No se encontro el producto");
            }
        }
        catch(Exception e)
        {
            String msgException = "Ocurrio una excepcion en btnMostrarDatosEliminar: " + e;
            System.out.println(msgException);
            JOptionPane.showMessageDialog(null, msgException);
        }
    }//GEN-LAST:event_btnMostrarDatosEliminarActionPerformed

    private void cboBoxProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboBoxProveedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboBoxProveedoresActionPerformed

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
            java.util.logging.Logger.getLogger(Vendedor_Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vendedor_Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vendedor_Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vendedor_Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vendedor_Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAñadir;
    private javax.swing.JButton BotonMostrarProductos;
    private javax.swing.JButton BotonRegresar1;
    private javax.swing.JButton BotonRegresar2;
    private javax.swing.JButton BotonRegresar3;
    private javax.swing.JTextField CantidadP;
    private javax.swing.JTextField DescripcionP;
    private javax.swing.JTextField NombreP;
    private javax.swing.JTextField PrecioP;
    private javax.swing.JTable TablaB;
    private javax.swing.JTable TablaP;
    private javax.swing.JButton btnActualizarCboBox;
    private javax.swing.JButton btnEliminarProducto;
    private javax.swing.JButton btnModificarNombre;
    private javax.swing.JButton btnModificarPrecio;
    private javax.swing.JButton btnMostrarDatosEliminar;
    private javax.swing.JButton btnMostrarDatosModPrecio;
    private javax.swing.JButton btnMostrarVentas;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox<String> listEliminarProducto;
    private javax.swing.JComboBox<String> listEliminarProveedor;
    private javax.swing.JComboBox<String> listProductoNombre;
    private javax.swing.JComboBox<String> listProductoPrecio;
    private javax.swing.JComboBox<String> listProvedorNombre;
    private javax.swing.JComboBox<String> listProveedorPrecio;
    private javax.swing.JTextField txtCantidadEliminar;
    private javax.swing.JTextField txtNomActual;
    private javax.swing.JTextField txtNuevoNombre;
    private javax.swing.JTextField txtNuevoPrecio;
    private javax.swing.JTextField txtPrecioEliminar;
    private javax.swing.JTextField txtPriceActual;
    // End of variables declaration//GEN-END:variables
}
