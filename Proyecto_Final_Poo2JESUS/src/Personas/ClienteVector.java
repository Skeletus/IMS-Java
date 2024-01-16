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
public class ClienteVector 
{
    // atributos
    private ArrayList<Cliente> clienteVectores = new ArrayList<>();
    
    // constructor
    public ClienteVector() 
    {
        cargardatos_archivo_vector();
    }
    
    //metodos
    public void  cargardatos_archivo_vector()
    {
        System.out.println("cargando datos de ListaClientes al vector...");
        BufferedReader  lector;
        FileReader      fr;
        String          linea;
        String          partes[] = null;
        crearArchivoSEGUNDAFORMA();
        try
        {
            fr     = new FileReader("ListaClientes.csv");
            lector = new BufferedReader(fr);
            while((linea=lector.readLine())!=null)
            {              
                partes=linea.split(",");
                // crear objeto
                Cliente objCliente = new Cliente();
                
                // seteeando datos
                // === datos previos codigoRelativo, codigoGenrerado, dni, nombre, telefono
                objCliente.setCodigoCliente(partes[0]);
                objCliente.setDNI(partes[1]);
                objCliente.setNombre(partes[2]);
                objCliente.setTelefono(partes[3]);
                objCliente.setComprasTotales(Integer.parseInt(partes[4]));
                
                // arreglando al arreglo
                agregarCliente(objCliente);
            }
            lector.close();
            fr.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        
    }
    
    public void agregarCliente(Cliente objcliente)
    {
        clienteVectores.add(objcliente);
    }
    
    public String correlativo()
    {
        if(clienteVectores.size() == 0)
        {
            return "CLI-1";
        }
        else
        {
            // obetniendo codigo anterior
            String   codigoAnterior = clienteVectores.get(clienteVectores.size()-1).getCodigoCliente();
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
            File myObj = new File("listaClientes.csv");
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
    
    public void grabarEnArchivo(Cliente clienteobj)
    {
        crearArchivoSEGUNDAFORMA();
        try
        {           
            FileWriter f                = new FileWriter("ListaClientes.csv",true);
            BufferedWriter b            = new BufferedWriter(f);
            PrintWriter pw              = new PrintWriter(b);

            pw.println(clienteobj.getCodigoCliente()+ "," + clienteobj.getDNI()+ ","
                        + clienteobj.getNombre()+ "," + clienteobj.getTelefono() + ","
                        + clienteobj.getComprasTotales() );
            
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
      return clienteVectores.size();
    }
    
    public Cliente get(int pos)
    {
      return clienteVectores.get(pos);
    }
  
    public Cliente buscarcodigo(String cod)
    {
        
        Cliente objCLiente = new Cliente();
        objCLiente.setCodigoCliente("Error");
        for(Cliente x:clienteVectores)
        {
            if( cod.equals( x.getCodigoCliente()) )
            {
                return x;
            }
        }
        return objCLiente;
    }
    
    public String buscarcodigoGetTelefono(String cod)
    {
        
        Cliente objCLiente = new Cliente();
        objCLiente.setCodigoCliente("Error");
        for(Cliente x:clienteVectores)
        {
            if( cod.equals( x.getCodigoCliente()) )
            {
                return x.getTelefono();
            }
        }
        return null;
    }
    
    public String buscarcodigoGetNombre(String cod)
    {
        
        Cliente objCLiente = new Cliente();
        objCLiente.setCodigoCliente("Error");
        for(Cliente x:clienteVectores)
        {
            if( cod.equals( x.getCodigoCliente()) )
            {
                return x.getNombre();
            }
        }
        return null;
    }
    
    public boolean modificarNombreCliente(Cliente clienteOBJ, String nomrbeModificado)
    {
        boolean estado= false;
        for(int i=0; i < rows(); i++)
        {
            if( clienteOBJ.getCodigoCliente().equals( get(i).getCodigoCliente()) )
            {
                clienteVectores.get(i).setNombre(nomrbeModificado);
                estado = true;
                return estado;
            }
        }
        return estado;
    }
    
    public boolean modificarCantidadCOmpraCliente(Cliente clienteOBJ, int nuevaCantidad)
    {
        boolean estado= false;
        for(int i=0; i < rows(); i++)
        {
            if( clienteOBJ.getCodigoCliente().equals( get(i).getCodigoCliente()) )
            {
                clienteVectores.get(i).setComprasTotales(nuevaCantidad);
                estado = true;
                return estado;
            }
        }
        return estado;
    }
    
    public boolean modificarTELEFONO(Cliente clienteOBJ, String teleModificado)
    {
        for(int i=0; i < rows(); i++)
        {
            if( clienteOBJ.getCodigoCliente().equals( get(i).getCodigoCliente()) )
            {
                clienteVectores.get(i).setTelefono(teleModificado);
                return true;
            }
        }
        return false;
    }
    
    boolean modificarDNI(Cliente clienteOBJ, String dniModificado)
    {
        for(int i=0; i < rows(); i++)
        {
            if( clienteOBJ.getCodigoCliente().equals( get(i).getCodigoCliente()) )
            {
                clienteVectores.get(i).setDNI(dniModificado);
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
            FileWriter f = new FileWriter("ListaClientes.csv",false);
            BufferedWriter b = new BufferedWriter(f);
            PrintWriter pw = new PrintWriter(b);
            
            for(Cliente x:clienteVectores)
            {
               pw.println(x.getCodigoCliente()+ "," + x.getDNI()+ ","+ x.getNombre() +
                            "," + x.getTelefono() + "," + x.getComprasTotales() ); 
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
    
    public void eliminar(Cliente clienteOBJ)
    {
        clienteVectores.remove(getposarray(clienteOBJ));
    }
    
    public int getposarray(Cliente clienteOBJ)
    {
        for(int i=0; i<rows(); i++)
        {
            if(clienteOBJ.getCodigoCliente().equals(clienteVectores.get(i).getCodigoCliente()))
            {
                return i;
            }
        }

        return -1;
    }
    
}
