/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tests;

import Kardex.kardex;
import Personas.Vendedor;
import Producto.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author alumnoc2laba60626
 */
public class Ayudas 
{

    public Ayudas() {
    }
    
    public double redondearPrecio(double precioActual)
    {
        double precioRedondeado = Math.round(precioActual * 100.0) / 100.0;
        return precioRedondeado;
    }
    
    // ==== METDO PARA OBTENER FECHA ACTUAL
    public String getFecha()
    {
        // obtener fecha actual
        Date             date       = new Date();
        SimpleDateFormat formatter  = new SimpleDateFormat("dd/MM/yy");
        String           strDate    = formatter.format(date);
        System.out.print("Current date: " + strDate);
        
        return strDate;
    }
    
    // === METODO PARA OBETNER UN CODIGO DE BOLETA: B02-4854M
    public String generarCodigoBoleta()
    {
        // GENERAR UN CODIGO ALFA_NUMERICO
        
        Random rnd          = new Random();
        String abecedario   = "ABCDEFGHIJKLMJOPQRSTUVWXZ";
        String cadena       = "B01-";
        int pos = 0, num;
        
        //  saca un numero de entre el 1 al 27 y lo guarda para seleccionarlo en el abecedario
        pos         = (int) (rnd.nextDouble() * abecedario.length()-1 + 0);
        // genera un numero aleatorio de 4 cifras
        num         = (int) (rnd.nextDouble() * 9999 + 1000);
        // concatenando con la letra obetnida de pos y un numero aleatorio de 3 cifras
        cadena      = cadena + abecedario.charAt(pos) + num;

        // imprimiendo x consola
        System.out.println("Cadena :" + cadena + "\n");

        return cadena;
        
    }
    
    // === METODO PARA OBETNER UN CODIGO DE FACTURA: F02-4854M
    public String generarCodigoFactura()
    {
        // GENERAR UN CODIGO ALFA_NUMERICO
        
        Random rnd          = new Random();
        String abecedario   = "ABCDEFGHIJKLMJOPQRSTUVWXZ";
        String cadena       = "F01-";
        int pos = 0, num;
        
        //  saca un numero de entre el 1 al 27 y lo guarda para seleccionarlo en el abecedario
        pos         = (int) (rnd.nextDouble() * abecedario.length()-1 + 0);
        // genera un numero aleatorio de 4 cifras
        num         = (int) (rnd.nextDouble() * 9999 + 1000);
        // concatenando con la letra obetnida de pos y un numero aleatorio de 3 cifras
        cadena      = cadena + abecedario.charAt(pos) + num;
            
        // imprimiendo x consola
        System.out.println("Cadena :" + cadena + "\n");

        return cadena;
        
    }
    
    // ==== METODO PARA CREAR UN ARCHIVO, en el parametro se tiene q espicifar el tipo: file.txt fil.csv 
    public void crearArchivoSEGUNDAFORMA(String nombreArchivo)
    {
       
        String nombreArchivoKardex  = nombreArchivo;
        try 
        {
            File myObj = new File(nombreArchivoKardex);
            if (myObj.createNewFile()) {
              System.out.println("File created: " + myObj.getName());
            } else {
              System.out.println("File already exists.");
            }
        } 
        catch (IOException e) 
        {
          System.out.println("Ocurrio en un error en metodo crearSArchivo.");
          e.printStackTrace();
        }
    }
    
    // ==== METODO PARA OBETENER UN ARRAYLIST DEL NOMBRE DE LOS PRODUCTOS DE UN DETERMINADO PROVEEDOR
    //       buscando en el archivo general de los productos
    public ArrayList<String> getProductoDeProveedor(String nombreProveedor)
    {
        ArrayList<String> listaDeProductos = new ArrayList<>();
        System.out.println("obteniendo nombres de Producto de proveedor: "
                            + nombreProveedor + " de ListaProductosGeneral...");
        BufferedReader  lector;
        FileReader      fr;
        String          linea;
        String          partes[] = null;
        int contador=0;
        //crearArchivoSEGUNDAFORMA();
        try
        {
            fr     = new FileReader("ListaProductos.csv");
            lector = new BufferedReader(fr);
            
            while((linea=lector.readLine())!=null)
            {              
                partes=linea.split(",");
                // verificar si el nombre del provedoor es el que estamos buscando
                if (nombreProveedor.equals(partes[2]))
                {
                    // crear string para almacenar el nombre de manera lolca
                    String nombreProduto = partes[1];
                    // agregando el string al arreglo 
                    listaDeProductos.add(nombreProduto);
                    contador++;
                }
            }
            lector.close();
            fr.close();
            
            System.out.println("Se encontraron: " + (contador) + " productos del proveedor: " + nombreProveedor );
            return listaDeProductos;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
   
    // ==== METODO Q RETORNA UN ARRAYLIST DE LOS NOMBRES DE LOS PROVEEDORES
    public ArrayList<String> obetenerListaDeProveedores()
    {
        ArrayList<String> listaDeProveedores= new ArrayList<>();
        System.out.println("obteniendo lista de nombresProveedor de ListaProveedores...");
        BufferedReader  lector;
        FileReader      fr;
        String          linea;
        String          partes[] = null;
        //crearArchivoSEGUNDAFORMA();
        try
        {
            fr     = new FileReader("ListaProveedores.csv");
            lector = new BufferedReader(new FileReader("ListaProveedores.csv"));
            while((linea=lector.readLine())!=null)
            {              
                partes=linea.split(",");
                // crear string para almacenar el nombre de manera lolca
                String nombreProveedor= partes[1];
                
                // agregando el string al arreglo 
                listaDeProveedores.add(nombreProveedor);

            }
            lector.close();
            fr.close();
            return listaDeProveedores;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
    
    // === METODO Q RETORNA UN ARRAYLIST CON LOS NOMBRES DE LOS PRODUCTOS DEL PROVEEDOR SELECCIONADO 8en parametro)
    public ArrayList<String> obetenerListaDeProductosPorProveedores(String nombreProveedor)
    {
        ArrayList<String> listaDeProductos= new ArrayList<>();
        String nombreArchivo = "ListaProductos" + nombreProveedor + ".csv";
        System.out.println("obteniendo lista de Productos del proveedor: " + nombreProveedor + "...");
        BufferedReader  lector;
        FileReader      fr;
        String          linea;
        String          partes[] = null;
        //crearArchivoSEGUNDAFORMA();
        try
        {
            fr     = new FileReader(nombreArchivo);
            lector = new BufferedReader(fr);
            while((linea=lector.readLine())!=null)
            {              
                partes=linea.split(",");
                // crear string para almacenar el nombre de manera lolca
                String nombreProducto= partes[1];
                
                // agregando el string al arreglo 
                listaDeProductos.add(nombreProducto);
            }
            lector.close();
            fr.close();
            return listaDeProductos;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
    
    // === RETORNA UN ARRAYLIST DE LOS CODIGOS DE LOS CLIENTES
    public ArrayList<String> cargarCodigosClientes()
    {
        ArrayList<String> arregloCodigosCLientes = new ArrayList<>();
        System.out.println("obteniendo codigos de ListaCliente...");
        
        BufferedReader  lector;
        FileReader      fr;
        String          linea;
        String          partes[] = null;
        String codigoCLiente="";
        try
        {
            fr     = new FileReader("ListaClientes.csv");
            lector = new BufferedReader(fr);
            while((linea=lector.readLine())!=null)
            {              
                partes=linea.split(",");
                codigoCLiente = partes[0];
                arregloCodigosCLientes.add(codigoCLiente);
            }
            lector.close();
            fr.close();
            return arregloCodigosCLientes;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        return null;
    }
    
    // == OBTIENE EL  STOCK ACTUAL DEL REGISTRO KARDEX, especificar nomberProductp y probeedor para la busquead del archivo
    public String cargarDatoAarchivoKardexGetSTOCK(String nombreProducto, String nombreProveedor)
    {       
        BufferedReader  lector;
        FileReader      fr;
        String          linea;
        String          partes[] = null;
        String          nombreCSV = "Kardex.csv";
        String          nombreArchivoKardex = nombreProducto + "-" + nombreProveedor + nombreCSV;
        System.out.println("obteniendo stock de " + nombreArchivoKardex);
        String Stock="";
        try
        {
            fr     = new FileReader(nombreArchivoKardex);
            lector = new BufferedReader(fr);
            while((linea=lector.readLine())!=null)
            {              
                partes=linea.split(",");
                Stock = partes[10];
            }
            lector.close();
            fr.close();
            return Stock;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        return null;
    }
    
    
    public ArrayList<String> getListaNombresVendedor()
    {
        ArrayList<String> arregloNomVendedores = new ArrayList<>();
        System.out.println("obteniendo lsita de nombres de ListaVendedor...");
        
        BufferedReader  lector;
        FileReader      fr;
        String          linea;
        String          partes[] = null;
        String          nomVendedor ="";
        try
        {
            fr     = new FileReader("listaVendedores.csv");
            lector = new BufferedReader(fr);
            
            while((linea=lector.readLine())!=null)
            {              
                partes=linea.split(",");
                nomVendedor = partes[1];
                arregloNomVendedores.add(nomVendedor);
            }
            
            lector.close();
            fr.close();
            
            return arregloNomVendedores;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        return null;
    }
    
    public ArrayList<String> getListaCodigoVendedor()
    {
        ArrayList<String> arregloTelsVendedores = new ArrayList<>();
        System.out.println("obteniendo lista de codigos de ListaVendedor...");
        
        BufferedReader  lector;
        FileReader      fr;
        String          linea;
        String          partes[] = null;
        String          codVendedor ="";
        try
        {
            fr     = new FileReader("listaVendedores.csv");
            lector = new BufferedReader(fr);
            
            while((linea=lector.readLine())!=null)
            {              
                partes=linea.split(",");
                codVendedor = partes[0];
                arregloTelsVendedores.add(codVendedor);
            }
            
            lector.close();
            fr.close();
            
            return arregloTelsVendedores;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        return null;
    }
    
    public ArrayList<String> getListaIDProductos(String IDVentaActual, String IDClienteActual)
    {
        ArrayList<String> arregloIDProdutos = new ArrayList<>();
        System.out.println("obteniendo lista de codigos de productos del detalle de Venta: " + IDVentaActual);
        
        BufferedReader  lector;
        FileReader      fr;
        String          linea;
        String          partes[] = null;
        String          idProducto ="";
        String nomrbeArchivo = "detalleVenta" + IDClienteActual + ".csv";
        try
        {
            fr     = new FileReader(nomrbeArchivo);
            lector = new BufferedReader(fr);
            
            while((linea=lector.readLine())!=null)
            {              
                partes=linea.split(",");
                String idVentaArchivo = partes[0];
                if ( idVentaArchivo.equals(IDVentaActual))
                {
                    idProducto = partes[1];
                    arregloIDProdutos.add(idProducto);
                }
            }
            
            lector.close();
            fr.close();
            
            return arregloIDProdutos;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        return null;
    }
    
}
