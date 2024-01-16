/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProductoArray;

import java.util.ArrayList;
import Producto.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Jesus
 */
public class ProductArreglo 
{
    // atributos
    private ArrayList<Producto> arregloProductos = new ArrayList<>();
    
    // constructor
    public ProductArreglo() 
    {
        cargardatos_archivo_vector();
    }
    
    //metodos
    public void  cargardatos_archivo_vector()
    {
        System.out.println("cargando datos de listaProductos.csv a archivovector...");
        BufferedReader  lector;
        FileReader      fr;
        String          linea;
        String          partes[] = null;
        crearArchivoSEGUNDAFORMA();
        try
        {
            fr     = new FileReader("ListaProductos.csv");
            lector = new BufferedReader(fr);
            while((linea=lector.readLine())!=null)
            {              
                partes=linea.split(",");
                // crear objeto
                Producto objProducto = new Producto();
                
                // seteeando datos
                // codigo-nombre-proveedor-descripcion-cantidad-precio
                objProducto.setCodigoProducto(partes[0]);
                objProducto.setNombre(partes[1]);
                objProducto.setProveedor(partes[2]);
                objProducto.setDescripcion(partes[3]);
                objProducto.setCantidad(Integer.parseInt(partes[4]));
                objProducto.setPrecio(Double.parseDouble(partes[5]));
                
                // arreglando al arreglo
                agregarProducto(objProducto);
            }
            lector.close();
            fr.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        
    }
    
    public ArrayList<Producto> getVectorDeArchivoTemporal()
    {
        System.out.println("copiando datos ListaProductosTemporal.csv Temporalkardex al vector...");
        ArrayList<Producto> arrayRetorno = new ArrayList<>();
        BufferedReader  lector;
        FileReader      fr;
        String          linea;
        String          partes[] = null;
        try
        {
            fr = new FileReader("ListaProductosTemporal.csv");
            lector = new BufferedReader(fr);
            while((linea=lector.readLine())!=null)
            {              
                partes=linea.split(",");
                // crear objeto
                Producto objProducto = new Producto();
                
                /// seteeando datos
                // codigo-nombre-proveedor-descripcion-cantidad-precio
                objProducto.setCodigoProducto(partes[0]);
                objProducto.setNombre(partes[1]);
                objProducto.setProveedor(partes[2]);
                objProducto.setDescripcion(partes[3]);
                objProducto.setCantidad(Integer.parseInt(partes[4]));
                objProducto.setPrecio(Double.parseDouble(partes[5]));
                
                // arreglando al arreglo
                arrayRetorno.add(objProducto);
                
            }
            lector.close();
            fr.close();
            return arrayRetorno;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
        
    }
    
    public void crearArchivoSEGUNDAFORMA()
    {
        try 
        {
            File myObj = new File("ListaProductos.csv");
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
    
    public void crearArchivoTemporal()
    {
        try 
        {
            File myObj = new File("ListaProductosTemporal.csv");
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
    
    public ArrayList<Producto> getProductosEnMemoria()
    {
        ArrayList<Producto> arregloProductosMemoria = new ArrayList<>();
        for(Producto x: arregloProductos)
        {
            arregloProductosMemoria.add(x);
        }
        return arregloProductosMemoria;
    }
    
    public void agregarProducto(Producto product)
    {
        arregloProductos.add(product);
    }
    
    public String correlativo()
    {
        if(arregloProductos.size() == 0)
        {
            return "PRO-1";
        }
        else
        {
            // obetniendo codigo anterior
            String   codigoAnterior = arregloProductos.get(arregloProductos.size()-1).getCodigoProducto();
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
    
    public void guardarDatosTemporal(ArrayList<Producto> arrayProTemporal)
    {
        for(Producto x: arrayProTemporal)
        {
            grabarEnArchivoTemporal(x);
        }
        System.out.println("Se copiaron lso datos al archivoTemporal ListaProductosTemporal.csv");
    }
    
    public void cambiarStockTemporal(ArrayList<Producto> arrayProTemporal, Producto proMod, int nuevoStock)
    {
        for(Producto x: arrayProTemporal)
        {
            if (proMod.getCodigoProducto().equals(x.getCodigoProducto()))
            {
                x.setCantidad(nuevoStock);
            }
        }
        System.out.println("Se edito el stock en  ListaProductosTemporal.csv");
    }
    
    public void copiarDtosTemporalesAPrincipal()
    {
        ArrayList<Producto> productosMemoria = getVectorDeArchivoTemporal();
        vaciarDatos();
        for(Producto x: productosMemoria)
        {
            agregarProducto(x);
            grabarEnArchivoGeneral(x);
        }
    }
    
    
    public void grabarEnArchivoGeneral(Producto product)
    {
        crearArchivoSEGUNDAFORMA();
        try
        {
            FileWriter f = new FileWriter("ListaProductos.csv",true);
            BufferedWriter b = new BufferedWriter(f);
            PrintWriter pw = new PrintWriter(b);

            pw.println(product.getCodigoProducto() + "," + product.getNombre()+ "," + product.getProveedor()
                        + "," + product.getDescripcion() + "," + product.getCantidad() + "," + product.getPrecio());
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
    
    public void grabarEnArchivoTemporal(Producto product)
    {
        crearArchivoTemporal();
        try
        {
            FileWriter f = new FileWriter("ListaProductosTemporal.csv",true);
            BufferedWriter b = new BufferedWriter(f);
            PrintWriter pw = new PrintWriter(b);

            pw.println(product.getCodigoProducto() + "," + product.getNombre()+ "," + product.getProveedor()
                        + "," + product.getDescripcion() + "," + product.getCantidad() + "," + product.getPrecio());
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
      return arregloProductos.size();
    }
    
    public Producto get(int pos)
    {
      return arregloProductos.get(pos);
    }
  
    public Producto buscarcodigo(String cod)
    {
        
        Producto product = new Producto();
        product.setCodigoProducto("Error");
        for(Producto x:arregloProductos)
        {
            if( cod.equals( x.getCodigoProducto() ) )
            {
                return x;
            }
        }
        return product;
    }
    
    public Producto encontrarProductoEnMemoria(ArrayList<Producto> arregloProductosMemoria,
                                            String nombreProducto, String proveedor)
    {
        
        Producto productoError = new Producto();
        productoError.setCodigoProducto("Error");
        for(Producto x:arregloProductosMemoria)
        {
            if( nombreProducto.equals( x.getNombre()) &&  proveedor.equals(x.getProveedor()))
            {
                return x;
            }
        }
        return productoError;
    }
    
    public void actualizarDatos()
    {
        ArrayList<Producto> bakcupProductos = new ArrayList<>();
        // guardando los datos al archivo del backup
            for (int i = 0; i < arregloProductos.size(); i++)
            {
                Producto objProducto = arregloProductos.get(i);
                //objAvion.setID(0);
                bakcupProductos.add(objProducto);
                
            } // para cuando termin el for ya deberia estar cargado todos los datos
            
            // tenemos q vaciar los datos 
            vaciarDatos();
            
            // ahora se tienen q volver a llenar
            for (Producto x: bakcupProductos)
            {
                x.setCodigoProducto(correlativo() );
                agregarProducto(x);
                grabarEnArchivoGeneral(x);
            }
    }
    
    public void vaciarDatos()
    {
        arregloProductos.clear();
        try
        {
            FileWriter f = new FileWriter("ListaProductos.csv",false);
            BufferedWriter b = new BufferedWriter(f);
            PrintWriter pw = new PrintWriter(b);
            
            for(Producto x:arregloProductos)
            {
               pw.println(x.getCodigoProducto() + "," + x.getNombre()+ "," + x.getProveedor()
                           + "," + x.getDescripcion() + "," + x.getCantidad() + "," + x.getPrecio() ); 
            }

            pw.flush();
            pw.close();
            b.close();
            f.close();
            System.out.println("se han eliminado todos los datos de ListaProductos.csv exitosamente");
        } 
        catch ( Exception e )
        {
             System.out.println(e);
        }
    }
    
    public Producto buscarNombreProveedor(String nombre, String proveedor)
    {
        
        Producto product = new Producto();
        product.setNombre("Errorxd");
        for(Producto x:arregloProductos)
        {
            if( nombre.equals( x.getNombre())  && proveedor.equals(x.getProveedor()))
            {
                return x;
            }
        }
        return product;
    }
    
    public boolean verificarExistenciaProducto(String codigoProducto)
    {
        boolean estado = false;
        for(Producto x: arregloProductos)
        {
            if (x.getCodigoProducto().equals(codigoProducto))
            {
                estado = true;
                break;
            }
        }
        return estado;
    }
    
    public boolean modificarNombre(Producto prdoucto, String newNombre)
    {
        for(int i=0; i < rows(); i++)
        {
            if( prdoucto.getProveedor().equals( get(i).getProveedor()) )
            {
                arregloProductos.get(i).setNombre(newNombre);
                return true;
            }
        }
        return false;
    }
    
    public boolean modificarPrecio(Producto prdoucto, double newPrecio, String proveedor)
    {
        for(int i=0; i < rows(); i++)
        {
            if( prdoucto.getProveedor().equals( proveedor) )
            {
                arregloProductos.get(i).setPrecio(newPrecio);
                return true;
            }
        }
        return false;
    }
    
    public boolean modificarCantidad(Producto prdoucto, double newPrecio, String proveedor)
    {
        for(int i=0; i < rows(); i++)
        {
            if( prdoucto.getProveedor().equals( proveedor) )
            {
                arregloProductos.get(i).setPrecio(newPrecio);
                return true;
            }
        }
        return false;
    }
    
    public boolean modificarCantidadPrecio(Producto prdoucto, int cantidad, double precio)
    {
        for(int i=0; i < rows(); i++)
        {
            if( prdoucto.getCodigoProducto().equals( get(i).getCodigoProducto() ) )
            {
                arregloProductos.get(i).setCantidad(cantidad);
                arregloProductos.get(i).setPrecio(precio);
                return true;
            }
        }
        return false;
    }
   
    public void grabarModificareliminar()
    {
        crearArchivoSEGUNDAFORMA();
        try
        {
            FileWriter f = new FileWriter("ListaProductos.csv",false);
            BufferedWriter b = new BufferedWriter(f);
            PrintWriter pw = new PrintWriter(b);
            
            for(Producto x:arregloProductos)
            {
               pw.println( x.getCodigoProducto() + "," + x.getNombre()+ "," + x.getProveedor()
                           + "," + x.getDescripcion() + "," + x.getCantidad() + "," + x.getPrecio() ); 
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
    
    public void eliminar(Producto product)
    {
        arregloProductos.remove(getposarray(product));
    }
    
    int getposarray(Producto product)
    {
        for(int i=0; i<rows(); i++)
        {
            if(product.getCodigoProducto().equals(arregloProductos.get(i).getCodigoProducto()))
            {
                return i;
            }
        }

        return -1;
    }
}
