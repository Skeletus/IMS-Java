/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ventas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Jesus
 */
public class VentaVector 
{
    // atributos
    private ArrayList<Venta> arregloVentasGeneral = new ArrayList<>();
    
    // constructor
    public VentaVector() 
    {
        cargardatos_archivo_vector();
    }
    
    //metodos
    public void  cargardatos_archivo_vector()
    {
        BufferedReader  lector;
        FileReader      fr;
        String          linea;
        String          partes[] = null;
        crearArchivoSEGUNDAFORMA();
        System.out.println("cargando datos de  listaVentas.csv a archivovector...");
        try
        {
            fr     = new FileReader("listaVentas.csv");
            lector = new BufferedReader(fr);
            while((linea=lector.readLine())!=null)
            {              
                partes=linea.split(",");
                // crear objeto
                Venta objVenta = new Venta();
                
                // seteeando datos
                // idVenta, idProductom, cantidad total de producto
                objVenta.setID_Venta(partes[0]);
                objVenta.setID_Cliente(partes[1]);
                objVenta.setID_Vendedor(partes[2]);
                objVenta.setFecha(partes[3]);
                objVenta.setMontoTotal(Integer.parseInt(partes[4]));
                objVenta.setTotalPagar(Double.parseDouble(partes[5]));
                
                // arreglando al arreglo
                agregarVenta(objVenta);
            }
            lector.close();
            fr.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        
    }
    
    public void crearArchivoSEGUNDAFORMA()
    {
        try 
        {
            File myObj = new File("listaVentas.csv");
            if (myObj.createNewFile()) {
              System.out.println("File created: " + myObj.getName());
            } else {
              System.out.println("File listaVentas.csv exists.");
            }
        } 
        catch (IOException e) 
        {
          System.out.println("Ocurrio en un error en metodo crearSArchivo.");
          e.printStackTrace();
        }
    }
    
    public void agregarVenta(Venta venta)
    {
        arregloVentasGeneral.add(venta);
    }
    
    public String correlativo()
    {
        String codigo = "VENTA-1";
        if(arregloVentasGeneral.size() == 0)
        {
            return codigo;
        }
        else
        {
            // obetniendo codigo anterior
            String   codigoAnterior = arregloVentasGeneral.get(arregloVentasGeneral.size()-1).getID_Venta();
            // separando las partes del codigo
            String[] parts          = codigoAnterior.split("-");
            String   parteCod       = parts[0]; // cod
            String   parteNumerica  = parts[1]; // xxxxxx
            
            // convirtiendo a entero la otra  y aumentando en 1
            int numerico = Integer.parseInt(parteNumerica);
            numerico++;
            
            // retornando el codigo aumentado
            String codigoRetorno = parteCod + "-" + Integer.toString(numerico);
            
            return codigoRetorno;
        }
    }
  
    public void grabarEnArchivoGeneral(Venta venta )
    {
        crearArchivoSEGUNDAFORMA();
        try
        {
            FileWriter f = new FileWriter("listaVentas.csv",true);
            BufferedWriter b = new BufferedWriter(f);
            PrintWriter pw = new PrintWriter(b);

            pw.println(venta.getID_Venta()+ "," + venta.getID_Cliente()+ "," + venta.getID_Vendedor()
                        + "," + venta.getFecha() + "," + venta.getMontoTotal() +  "," + venta.getTotalPagar());
            
            pw.flush();
            pw.close();
            b.close();
            f.close();
        }
        catch( Exception e )
        {
            System.out.println(e);
        }
    }
    
    public int rows()
    {
        return arregloVentasGeneral.size();
    }
    
    public Venta get(int pos)
    {
        return arregloVentasGeneral.get(pos);
    }
    
    public String getIDUltimaVenta()
    {
        String codigoAnterior = arregloVentasGeneral.get(arregloVentasGeneral.size()-1).getID_Venta();
        return codigoAnterior;
    }
    
    public String encontrarUltimoIDVenta(String IdCliente)
    {
        for(int i = arregloVentasGeneral.size()-1; i >=0; i--)
        {
            if ( arregloVentasGeneral.get(i).getID_Cliente().equals(IdCliente))
            {
                return arregloVentasGeneral.get(i).getID_Venta();
            }
        }
        return "NoEncontrado";
    }
  
    public Venta buscarIDVenta(String idVenta)
    {
        
        Venta ventaError = new Venta();
        ventaError.setID_Venta("Error");
        
        for(Venta x:arregloVentasGeneral)
        {
            if( idVenta.equals( x.getID_Venta()) )
            {
                return x;
            }
        }
        return ventaError;
    }
    
    public Venta buscarIDVentaIDCliente(String idVenta, String idCLiente)
    {
        
        Venta ventaError = new Venta();
        ventaError.setID_Venta("Error");
        
        for(Venta x:arregloVentasGeneral)
        {
            if( x.getID_Venta().equals(idVenta) && x.getID_Cliente().equals(idCLiente))
            {
                System.out.println("se encontro el coso ese");
                return x;
            }
        }
        return ventaError;
    }
    
    
    public boolean verificarExistenciaIDVenta(String idVenta)
    {
        boolean estado = false;
        for(Venta x: arregloVentasGeneral)
        {
            if (x.getID_Venta().equals(idVenta))
            {
                estado = true;
                break;
            }
        }
        return estado;
    }
    
    public void grabarModificareliminar()
    {
        crearArchivoSEGUNDAFORMA();
        try
        {
            FileWriter f = new FileWriter("listaVentas.csv",false);
            BufferedWriter b = new BufferedWriter(f);
            PrintWriter pw = new PrintWriter(b);
            
            for(Venta x:arregloVentasGeneral)
            {
               pw.println( x.getID_Venta()+ "," + x.getID_Cliente()+ "," + x.getID_Vendedor()
                        + "," + x.getFecha() + "," + x.getMontoTotal() +  "," + x.getTotalPagar()); 
            }

            pw.flush();
            pw.close();
            b.close();
            f.close();
        } 
        catch ( Exception e )
        {
             System.out.println(e);
        }
    }
    
    public void eliminar(Venta venta)
    {
        arregloVentasGeneral.remove(getposarray(venta));
    }
    
    public int getposarray(Venta venta)
    {
        for(int i=0; i<rows(); i++)
        {
            if(venta.getID_Venta().equals(arregloVentasGeneral.get(i).getID_Venta()))
            {
                return i;
            }
        }

        return -1;
    }
    
    public void actualizarDetallesVenta(String idventa, String idCliente, int nuevoMonto, double nuevoTotalPagar)
    {
        Venta ventaEncontrada = buscarIDVentaIDCliente(idventa, idCliente);
        if (ventaEncontrada.getID_Venta().equals("Error"))
        {
            
        }
        else
        {
            ventaEncontrada.setMontoTotal(nuevoMonto);
            ventaEncontrada.setTotalPagar(nuevoTotalPagar);
            if ( ventaEncontrada.getMontoTotal() == 0)
            {
                eliminar(ventaEncontrada);
                System.out.println("se elimino la venta esa");
                grabarModificareliminar();
                System.out.println("se actualizo el detalle");
            }
            else
            {
                grabarModificareliminar();
            }
        }
    }
}
