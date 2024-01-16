/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

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
public class VendedorVector 
{
    // atributos
    private ArrayList<Vendedor> vendedoresVector = new ArrayList<>();
    
    // constructor
    public VendedorVector() 
    {
        cargardatos_archivo_vector();
    }
    
    //metodos
    public void  cargardatos_archivo_vector()
    {
        System.out.println("cargando datos de ListaVendedor al vector...");
        BufferedReader  lector;
        FileReader      fr;
        String          linea;
        String          partes[] = null;
        crearArchivoSEGUNDAFORMA();
        try
        {
            fr     = new FileReader("listaVendedores.csv");
            lector = new BufferedReader(fr);
            while((linea=lector.readLine())!=null)
            {              
                partes=linea.split(",");
                // crear objeto
                Vendedor objVerndedor = new Vendedor();
                
                // seteeando datos
                // === datos previos
                objVerndedor.setCodigo(partes[0]);
                objVerndedor.setNombre(partes[1]);
                objVerndedor.setTelefono(Integer.parseInt(partes[2]));
                objVerndedor.setDni(Integer.parseInt(partes[3]));
                
                // arreglando al arreglo
                agregarVendedor(objVerndedor);
            }
            lector.close();
            fr.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        
    }
    
    public void agregarVendedor(Vendedor objvendedpr)
    {
        vendedoresVector.add(objvendedpr);
    }
    
    public String correlativo()
    {
        if(vendedoresVector.size() == 0)
        {
            return "VEND-1";
        }
        else
        {
            // obetniendo codigo anterior
            String   codigoAnterior = vendedoresVector.get(vendedoresVector.size()-1).getCodigo();
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
            File myObj = new File("listaVendedores.csv");
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
    
    public void grabarEnArchivo(Vendedor vendedorObj)
    {
        crearArchivoSEGUNDAFORMA();
        try
        {           
            FileWriter f                = new FileWriter("listaVendedores.csv",true);
            BufferedWriter b            = new BufferedWriter(f);
            PrintWriter pw              = new PrintWriter(b);

            pw.println(vendedorObj.getCodigo()+ "," + vendedorObj.getNombre()+ ","
                        + vendedorObj.getTelefono() + "," + vendedorObj.getDni() );
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
      return vendedoresVector.size();
    }
    
    public Vendedor get(int pos)
    {
      return vendedoresVector.get(pos);
    }
  
    public Vendedor buscarcodigo(String cod)
    {
        
        Vendedor kardexobj = new Vendedor();
        kardexobj.setCodigo("Error");
        for(Vendedor x:vendedoresVector)
        {
            if( cod.equals( x.getCodigo()) )
            {
                return x;
            }
        }
        return kardexobj;
    }
    
    public boolean modificarNombreVendedor(Vendedor vendedorObj, String nomrbeModificado)
    {
        for(int i=0; i < rows(); i++)
        {
            if( vendedorObj.getCodigo().equals( get(i).getCodigo()) )
            {
                vendedoresVector.get(i).setNombre(nomrbeModificado);
                return true;
            }
        }
        return false;
    }
    
    public boolean modificarTELEFONOProveedor(Vendedor vendedorObj, int teleModificado)
    {
        for(int i=0; i < rows(); i++)
        {
            if( vendedorObj.getCodigo().equals( get(i).getCodigo()) )
            {
                vendedoresVector.get(i).setTelefono(teleModificado);
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
            FileWriter f = new FileWriter("listaVendedores.csv",false);
            BufferedWriter b = new BufferedWriter(f);
            PrintWriter pw = new PrintWriter(b);
            
            for(Vendedor x:vendedoresVector)
            {
               pw.println( x.getCodigo()+ "," + x.getNombre()+ ","
                           + x.getTelefono() + "," + x.getDni() ); 
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
    
    public void eliminar(Vendedor vendedorOBJ)
    {
        vendedoresVector.remove(getposarray(vendedorOBJ));
    }
    
    int getposarray(Vendedor vendedorOBJ)
    {
        for(int i=0; i<rows(); i++)
        {
            if(vendedorOBJ.getCodigo().equals(vendedoresVector.get(i).getCodigo()))
            {
                return i;
            }
        }

        return -1;
    }
}
