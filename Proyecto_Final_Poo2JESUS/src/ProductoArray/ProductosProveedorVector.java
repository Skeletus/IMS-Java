/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProductoArray;

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
public class ProductosProveedorVector 
{
    // atributos
    private ArrayList<Producto> arregloProductos = new ArrayList<>();
    
    // constructor
    public ProductosProveedorVector() 
    {
        // cargardatos_archivo_vector( String nombreArchivo); este metodo debe ser llamado ya q no se iniicia con el contructor
        // el motivo de esto es ya q aca se selecciona q datos de X archivo cargar al arraylist
    }
    
    //metodos
    public void  cargardatos_archivo_vector(String nombreProveedor)
    {        
        String nombreArchivo = "ListaProductos" + nombreProveedor + ".csv";
        System.out.println("cargando datos de " + nombreArchivo + " al vector...");
        
        BufferedReader  lector;
        FileReader      fr;
        String          linea;
        String          partes[] = null;
        
        try
        {
            fr     = new FileReader(nombreArchivo);
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
    
    
    public void agregarProducto(Producto product)
    {
        arregloProductos.add(product);
    }
    
    public String correlativo(String nombreProveedor)
    {
        if(arregloProductos.size() == 0)
        {
            String codigoRelativo = nombreProveedor + "X-1";
            return codigoRelativo;
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
    
    public void grabarEnArchivoEspcefico(Producto product, String nombreProveedor)
    {
        String nombreArchivo = "ListaProductos" + nombreProveedor + ".csv";
        try
        {
            FileWriter f        = new FileWriter(nombreArchivo,true);
            BufferedWriter b    = new BufferedWriter(f);
            PrintWriter pw      = new PrintWriter(b);

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
    
    public void actualizarDatos(String nombreProveedor)
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
            vaciarDatos(nombreProveedor);
            
            // ahora se tienen q volver a llenar
            for (Producto x: bakcupProductos)
            {
                x.setCodigoProducto(correlativo(nombreProveedor));
                agregarProducto(x); // agregando al arreglo en memoria
                grabarEnArchivoEspcefico(x, nombreProveedor);
            }
    }
    
    public void vaciarArreglo( )
    {
        arregloProductos.clear();
    }
    
    public void vaciarDatos(String nombreProveedor)
    {
        arregloProductos.clear();
        String nombreArchivo = "ListaProductos" + nombreProveedor + ".csv";
        try
        {
            FileWriter f = new FileWriter(nombreArchivo,false);
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
            System.out.println("se han eliminado todos los datos exitosamente");
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
        //boolean estado = false;
        for(Producto x: arregloProductos)
        {
            if (x.getCodigoProducto().equals(codigoProducto))
            {
                return true;
            }
        }
        return false;
    }
    
    public boolean verificarNombreRepetidoProducto(String nombreProducto)
    {
        boolean estado = false;
        String nombreProductoLower = nombreProducto.toLowerCase();
        
        for(Producto x: arregloProductos)
        {
            String nombreMemoriaLower = x.getNombre().toLowerCase();
            if (nombreProductoLower.equals(nombreMemoriaLower))
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
   
    public void grabarModificareliminar(String nombreProveedor)
    {
        String nombreArchivo = "ListaProductos" + nombreProveedor + ".csv";
        try
        {
            FileWriter f = new FileWriter(nombreArchivo,false);
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
    
    
    public int getposarray(Producto product)
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
