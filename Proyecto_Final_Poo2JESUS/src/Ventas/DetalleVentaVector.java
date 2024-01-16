/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ventas;

import Producto.Producto;
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
public class DetalleVentaVector 
{
    // atributos
    private ArrayList<DetalleVenta> arregloVentasRealizada = new ArrayList<>();
    
    // constructor
    public DetalleVentaVector() 
    {
        //cargardatos_archivo_vector();
    }
    
    //metodos
    public void  cargardatos_archivo_vector(String ID_CLiente)
    {
        String nomrbeArchivo = "detalleVenta" + ID_CLiente + ".csv";
        BufferedReader  lector;
        FileReader      fr;
        String          linea;
        String          partes[] = null;
        crearArchivoSEGUNDAFORMA(ID_CLiente);
        System.out.println("cargando datos de  detalleVen" + ID_CLiente + ".csv a archivovector...");
        try
        {
            fr     = new FileReader(nomrbeArchivo);
            lector = new BufferedReader(fr);
            while((linea=lector.readLine())!=null)
            {              
                partes=linea.split(",");
                // crear objeto
                DetalleVenta objDetalleVenta = new DetalleVenta();
                
                // seteeando datos
                // idVenta, idProductom, cantidad total de producto
                objDetalleVenta.setID_Venta(partes[0]);
                objDetalleVenta.setID_Producto(partes[1]);
                objDetalleVenta.setCantidadVendidaProducto(Integer.parseInt(partes[2]));
                objDetalleVenta.setCodigoBoleta(partes[3]);
                
                // arreglando al arreglo
                agregarDetalle(objDetalleVenta);
            }
            lector.close();
            fr.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        
    }
    
    public void crearArchivoSEGUNDAFORMA(String IDCliente)
    {
        try 
        {
            String nomrbeArchivo = "detalleVenta" + IDCliente + ".csv";
            File myObj = new File(nomrbeArchivo);
            if (myObj.createNewFile()) {
              System.out.println("File created: " + myObj.getName());
            } else {
              System.out.println("File " + nomrbeArchivo + " exists.");
            }
        } 
        catch (IOException e) 
        {
          System.out.println("Ocurrio en un error en metodo crearSArchivo.");
          e.printStackTrace();
        }
    }
    
    public void agregarDetalle(DetalleVenta deVenta)
    {
        arregloVentasRealizada.add(deVenta);
    }
    
    public void vaciarVector()
    {
        arregloVentasRealizada.clear();
    }
  
    public void grabarEnArchivoEspecifico(DetalleVenta deVenta, String idCliente )
    {
        crearArchivoSEGUNDAFORMA(idCliente);
        String nomrbeArchivo = "detalleVenta" + idCliente + ".csv";
        try
        {
            FileWriter f = new FileWriter(nomrbeArchivo,true);
            BufferedWriter b = new BufferedWriter(f);
            PrintWriter pw = new PrintWriter(b);

            pw.println(deVenta.getID_Venta()+ "," + deVenta.getID_Producto()+ "," + deVenta.getCantidadVendidaProducto()
                        + "," + deVenta.getCodigoBoleta());
            
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
      return arregloVentasRealizada.size();
    }
    
    public DetalleVenta get(int pos)
    {
      return arregloVentasRealizada.get(pos);
    }
  
    public DetalleVenta buscarIDVentaIDProducto(String idVenta, String IDProducto)
    {
        
        DetalleVenta detalleErrorVenta = new DetalleVenta();
        detalleErrorVenta.setID_Venta("Error");
        detalleErrorVenta.setID_Producto("Error");
        
        for(DetalleVenta x:arregloVentasRealizada)
        {
            if( idVenta.equals( x.getID_Venta())  && IDProducto.equals(x.getID_Producto()))
            {
                return x;
            }
        }
        return detalleErrorVenta;
    }
    
    public boolean detectarNuevaVenta(String IDVentaActual)
    {
        boolean estado = false;
        if(arregloVentasRealizada.size() == 0)
        {
            if ( IDVentaActual.equals("VENTA-1"))
            {
                estado = true;
                return estado;
            }
        }
        else
        {
            String idVentaAnterior = arregloVentasRealizada.get(arregloVentasRealizada.size()-1).getID_Venta();
            if(IDVentaActual.equals(idVentaAnterior))
            {
                estado = false;
                return estado;
            }
            else
            {
                estado = true;
                return estado;
            }
        }
        return false;
    }
    
    public boolean verificarExistenciaIDProducto(String idVenta, String idProducto)
    {
        boolean estado = false;
        for(DetalleVenta x: arregloVentasRealizada)
        {
            if (x.getID_Producto().equals(idProducto) && x.getID_Venta().equals(idVenta))
            {
                estado = true;
                break;
            }
        }
        return estado;
    }
    
    public void eliminarDetalleVenta(String idVenta, String idProducto, String idCliente)
    {
        DetalleVenta dvEncontrado = buscarIDVentaIDProducto(idVenta, idProducto);
        if(dvEncontrado.getID_Venta().equals("Error") || dvEncontrado.getID_Producto().equals("Error"))
        {
            
        }
        else
        {
            System.out.println("se encontro el detalle venta: " + idVenta + "," + 
                                idProducto + "," + idCliente);
            eliminar(dvEncontrado);
            System.out.println("Se elimino el detalle del arreglo");
            grabarModificareliminar(idCliente);
            System.out.println("Se actualizaorn los datos");
        }
    }
    
    public void aumentarCantidadVendida(String idVenta, String idProducto, int nuevaCantidad)
    {
        for(DetalleVenta x: arregloVentasRealizada)
        {
            if (x.getID_Producto().equals(idProducto) &&
                x.getID_Venta().equals(idVenta))
            {
                x.setCantidadVendidaProducto(nuevaCantidad);
            }
        }
    }
    
    public void grabarModificareliminar(String idCliente)
    {
        crearArchivoSEGUNDAFORMA(idCliente);
        String nomrbeArchivo = "detalleVenta" + idCliente + ".csv";
        try
        {
            FileWriter f = new FileWriter(nomrbeArchivo,false);
            BufferedWriter b = new BufferedWriter(f);
            PrintWriter pw = new PrintWriter(b);
            
            for(DetalleVenta x:arregloVentasRealizada)
            {
               pw.println( x.getID_Venta()+ "," + x.getID_Producto()+ "," + x.getCantidadVendidaProducto()
                            + "," + x.getCodigoBoleta()); 
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
    
    public void vaciarDatos(String idCliente)
    {
        crearArchivoSEGUNDAFORMA(idCliente);
        String nomrbeArchivo = "detalleVenta" + idCliente + ".csv";
        arregloVentasRealizada.clear();
        try
        {
            FileWriter f = new FileWriter(nomrbeArchivo,false);
            BufferedWriter b = new BufferedWriter(f);
            PrintWriter pw = new PrintWriter(b);
            
            for(DetalleVenta x:arregloVentasRealizada)
            {
               pw.println( x.getID_Venta()+ "," + x.getID_Producto()+ "," + x.getCantidadVendidaProducto()
                            + "," + x.getCodigoBoleta()); 
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
    
    public void actualizarDatos(String IDcliente)
    {
        ArrayList<DetalleVenta> baculpDetalleVentaVector = new ArrayList<>();
        // guardando los datos al archivo arregloVentasRealizada backup
        for (int i = 0; i < arregloVentasRealizada .size(); i++)
        {
            DetalleVenta objName = arregloVentasRealizada.get(i);
            baculpDetalleVentaVector.add(objName);

        } // para cuando termin el for ya deberia estar cargado todos los datos

        // tenemos q vaciar los datos 
        vaciarDatos(IDcliente);

        // ahora se tienen q volver a llenar
        for (DetalleVenta x: baculpDetalleVentaVector )
        {
            agregarDetalle(x);  // llamar a metodo agregarObjetct() que hace ClassNameMainArreglo .add(Object);
            grabarEnArchivoEspecifico(x, IDcliente);
        }
    }
    
    public void eliminar(DetalleVenta deVenta)
    {
        arregloVentasRealizada.remove(getposarray(deVenta));
    }
    
    public int getposarray(DetalleVenta deVenta)
    {
        for(int i=0; i<rows(); i++)
        {
            if(deVenta.getID_Venta().equals(arregloVentasRealizada.get(i).getID_Venta()))
            {
                return i;
            }
        }

        return -1;
    }
    
    public int getCantidadComprada (String IDVentaActual, String IDProductoActual)
    {
        for(DetalleVenta x: arregloVentasRealizada)
        {
            if(x.getID_Venta().equals(IDVentaActual) && x.getID_Producto().equals(IDProductoActual))
            {
                return x.getCantidadVendidaProducto();
            }
        }

        return -1;
    }
    
    
    public String getBoletaBuscada (String IDVentaActual, String IDProductoActual)
    {
        for(DetalleVenta x: arregloVentasRealizada)
        {
            if(x.getID_Venta().equals(IDVentaActual) && x.getID_Producto().equals(IDProductoActual))
            {
                return x.getCodigoBoleta();
            }
        }

        return "NoBoleta";
    }
    
}
