/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proveedor;

import Personas.Cliente;
import Personas.Vendedor;
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
public class ProveedorVector 
{
    // atributos
    private ArrayList<Proveedor> proveedoresArreglo = new ArrayList<>();
    
    // constructor
    public ProveedorVector() 
    {
        cargardatos_archivo_vector();
    }
    
    //metodos
    public void  cargardatos_archivo_vector()
    {
        System.out.println("cargando datos de ListaProveedores al vector...");
        BufferedReader  lector;
        FileReader      fr;
        String          linea;
        String          partes[] = null;
        crearArchivoSEGUNDAFORMA();
        try
        {
            fr     = new FileReader("ListaProveedores.csv");
            lector = new BufferedReader(fr);
            while((linea=lector.readLine())!=null)
            {              
                partes=linea.split(",");
                // crear objeto
                Proveedor objProveedor = new Proveedor();
                
                // seteeando datos
                // === datos previos id, nombre, ruc, cantidaProducto 
                objProveedor.setID(partes[0]);
                objProveedor.setNombre(partes[1]);
                objProveedor.setRUC(partes[2]);
                objProveedor.setCantidadDeProductos(Integer.parseInt(partes[3]));
                
                // arreglando al arreglo
                agregarProveedor(objProveedor);
            }
            fr.close();
            lector.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        
    }
    
    public void agregarProveedor(Proveedor objProveedor)
    {
        proveedoresArreglo.add(objProveedor);
    }
    
    public String correlativo()
    {
        if(proveedoresArreglo.size() == 0)
        {
            return "PROV-1";
        }
        else
        {
            // obetniendo codigo anterior
            String   codigoAnterior = proveedoresArreglo.get(proveedoresArreglo.size()-1).getID();
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
    
    public void crearArchivoSEGUNDAFORMA()
    {
        try 
        {
            File myObj = new File("ListaProveedores.csv");
            if (myObj.createNewFile()) {
              System.out.println("File created: " + myObj.getName());
            } else {
              System.out.println("Archivo ListProveedores ya existe.");
            }
        } 
        catch (IOException e) 
        {
          System.out.println("Ocurrio en un error en metodo crearSArchivo.");
          e.printStackTrace();
        }
    }
    
    public void crearArchivoProductosDeProveedor(String nombreProveedor)
    {
        String nombreArchivo = "ListaProductos" + nombreProveedor + ".csv";
        try 
        {
            File myObj = new File(nombreArchivo);
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
    
    public void grabarEnArchivo(Proveedor objProveedor)
    {
        crearArchivoSEGUNDAFORMA();
        try
        {           
            FileWriter f                = new FileWriter("ListaProveedores.csv",true);
            BufferedWriter b            = new BufferedWriter(f);
            PrintWriter pw              = new PrintWriter(b);

            pw.println(objProveedor.getID()+ "," + objProveedor.getNombre()+ "," 
                      + objProveedor.getRUC() + "," + objProveedor.getCantidadDeProductos());
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
      return proveedoresArreglo.size();
    }
    
    public Proveedor get(int pos)
    {
      return proveedoresArreglo.get(pos);
    }
    
    public Proveedor buscarPorNombre(String nombreProveedor)
    {
        
        Proveedor objProveedorError = new Proveedor();
        objProveedorError.setNombre("ERROR");
        for(Proveedor x:proveedoresArreglo)
        {
            if( nombreProveedor.equals(x.getNombre()))
            {
                return x;
            }
        }
        return objProveedorError;
    }
    
    public boolean verificarNombreExistente(String nombreNuevoProveedor)
    {
        crearArchivoSEGUNDAFORMA();
        int verificador = 0;
        boolean estado = false;
        String partesLocal[] = null;
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
                String nombreProveedorArchivo = partesLocal[1].toUpperCase();
                if ( nombreProveedorArchivo.equals(nombreNuevoProveedor) )
                {
                    verificador++;
                }
                else
                {
                    estado = false;
                }
            }
            lector.close();
            fr.close();
            if ( verificador > 0)
            {
                return true;
            }
            else
            {
                return estado;
            }
            //return true;
        }
        catch(Exception e) // lanzar un mensaje en caso de que suceda un error
        {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error de tipo: " + e);
            return false;
        }
    }
    
    public void grabarModificareliminar()
    {
        crearArchivoSEGUNDAFORMA();
        try
        {
            FileWriter f = new FileWriter("ListaProveedores.csv",false);
            BufferedWriter b = new BufferedWriter(f);
            PrintWriter pw = new PrintWriter(b);
            
            for(Proveedor x:proveedoresArreglo)
            {
               pw.println( x.getID()+ "," + x.getNombre()+ ","
                           + x.getRUC() + "," + x.getCantidadDeProductos()); 
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
    
    public void actualizarDatos()
    {
        ArrayList<Proveedor> backupProveedores = new ArrayList<>();
        // guardando los datos al archivo del backup
            for (int i = 0; i < proveedoresArreglo.size(); i++)
            {
                Proveedor objProveedor = proveedoresArreglo.get(i);
                //objAvion.setID(0);
                backupProveedores.add(objProveedor);
                
            } // para cuando termin el for ya deberia estar cargado todos los datos
            
            // tenemos q vaciar los datos 
            vaciarDatos();
            
            // ahora se tienen q volver a llenar
            for (Proveedor x: backupProveedores)
            {
                x.setID( correlativo() );
                agregarProveedor(x);
                grabarEnArchivo(x);
            }
    }
    
    public void vaciarDatos()
    {
        proveedoresArreglo.clear();
        try
        {
            FileWriter f = new FileWriter("ListaProveedores.csv",false);
            BufferedWriter b = new BufferedWriter(f);
            PrintWriter pw = new PrintWriter(b);
            
            for(Proveedor x:proveedoresArreglo)
            {
               pw.println(x.getID()+ "," + x.getNombre()+ ","
                           + x.getRUC() + "," + x.getCantidadDeProductos()); 
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
    
    public void eliminar(Proveedor objProveedor)
    {
        proveedoresArreglo.remove(getposarray(objProveedor));
    }
    
    public void eliminarArchivo(String nombreProveedor)
    {
        String nombreArchivo = "ListaProductos" + nombreProveedor + ".csv";
        try  
        {         
            File f= new File(nombreArchivo);           //file to be delete  
            if(f.delete())                      //returns Boolean value  
            {  
                System.out.println(f.getName() + " deleted");   //getting and printing the file name  
            }  
            else  
            {  
                System.out.println("failed");  
            }  
        }  
        catch(Exception e)  
        {  
            e.printStackTrace();  
        }  
    }
    
    int getposarray(Proveedor objProveedor)
    {
        for(int i=0; i<rows(); i++)
        {
            if(objProveedor.getID().equals(proveedoresArreglo.get(i).getID()))
            {
                return i;
            }
        }

        return -1;
    }
}
