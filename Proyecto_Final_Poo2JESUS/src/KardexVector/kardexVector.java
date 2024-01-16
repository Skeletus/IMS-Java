/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KardexVector;
import Kardex.*;
import Producto.Producto;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Jesus
 */
public class kardexVector 
{
    // atributos
    private ArrayList<kardex> kardexProductos = new ArrayList<>();
    
    // constructor
    public kardexVector() 
    {
        // cargardatos_archivo_vector(); al momento de crear la istancia debe ser usada el metodo cargar manualmente
    }
    
    //metodos
    public void  cargardatos_archivo_vector(String nombreProducto, String nombreProveedor)
    {
        System.out.println("cargando datos " + nombreProducto + "-" + nombreProveedor + "kardex al vector...");
        
        BufferedReader  lector;
        FileReader      fr;
        String          linea;
        String          partes[] = null;
        String          nombreCSV = "Kardex.csv";
        String          nombreArchivoKardex = nombreProducto + "-" + nombreProveedor + nombreCSV;
        
        crearArchivoSEGUNDAFORMA(nombreProducto, nombreProveedor);
        try
        {
            fr = new FileReader(nombreArchivoKardex);
            lector = new BufferedReader(fr);
            while((linea=lector.readLine())!=null)
            {              
                partes=linea.split(",");
                // crear objeto
                kardex objKardex = new kardex();
                
                // seteeando datos
                // === datos previos
                objKardex.setCodigo(partes[0]);
                objKardex.setTipoOperacion(partes[1]);
                objKardex.setTipoDocumento(partes[2]);
                objKardex.setFecha(partes[3]);
                objKardex.setTipocompra(partes[4]);
                // === valor unitario
                objKardex.setValorUnitario(Double.parseDouble(partes[5]));
                // === entradas
                objKardex.setEntradaCant(Integer.parseInt(partes[6]));
                objKardex.setEntradaValor(Double.parseDouble(partes[7]));
                // === salidas
                objKardex.setSalidaCant(Integer.parseInt(partes[8]));
                objKardex.setSalidaValor(Double.parseDouble(partes[9]));
                // === saldos
                objKardex.setSaldoCant(Integer.parseInt(partes[10]));
                objKardex.setSaldoValor(Double.parseDouble(partes[11]));
                // === precio
                objKardex.setPrecioProducto(Double.parseDouble(partes[12]));
                
                // arreglando al arreglo
                agregarRegistroAlKardex(objKardex);
                
            }
            lector.close();
            fr.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        
    }
    
    public ArrayList<kardex> getVectorDeArchivoTemporal(String nombreProducto, String nombreProveedor)
    {
        System.out.println("copiando datos " + nombreProducto + "-" + nombreProveedor + "Temporalkardex al vector...");
        ArrayList<kardex> arrayRetorno = new ArrayList<>();
        BufferedReader  lector;
        FileReader      fr;
        String          linea;
        String          partes[] = null;
        String nombreCSV            = "TempKardex.csv";
        String nombreArchivoKardex  = nombreProducto + "-" + nombreProveedor + nombreCSV;
        try
        {
            fr = new FileReader(nombreArchivoKardex);
            lector = new BufferedReader(fr);
            while((linea=lector.readLine())!=null)
            {              
                partes=linea.split(",");
                // crear objeto
                kardex objKardex = new kardex();
                
                // seteeando datos
                // === datos previos
                objKardex.setCodigo(partes[0]);
                objKardex.setTipoOperacion(partes[1]);
                objKardex.setTipoDocumento(partes[2]);
                objKardex.setFecha(partes[3]);
                objKardex.setTipocompra(partes[4]);
                // === valor unitario
                objKardex.setValorUnitario(Double.parseDouble(partes[5]));
                // === entradas
                objKardex.setEntradaCant(Integer.parseInt(partes[6]));
                objKardex.setEntradaValor(Double.parseDouble(partes[7]));
                // === salidas
                objKardex.setSalidaCant(Integer.parseInt(partes[8]));
                objKardex.setSalidaValor(Double.parseDouble(partes[9]));
                // === saldos
                objKardex.setSaldoCant(Integer.parseInt(partes[10]));
                objKardex.setSaldoValor(Double.parseDouble(partes[11]));
                // === precio
                objKardex.setPrecioProducto(Double.parseDouble(partes[12]));
                
                // arreglando al arreglo
                arrayRetorno.add(objKardex);
                
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
    
    public void agregarRegistroAlKardex(kardex objkardex)
    {
        kardexProductos.add(objkardex);
    }

    public void vaciarVector( )
    {
        kardexProductos.clear();
    }    
    public String correlativo()
    {
        if(kardexProductos.size() == 0)
        {
            return "KAR-1";
        }
        else
        {
            // obetniendo codigo anterior
            String   codigoAnterior = kardexProductos.get(kardexProductos.size()-1).getCodigo();
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
    
    public String correlativoParaTemporal(ArrayList<kardex> kardexMemoria)
    {
        // obetniendo codigo anterior
        String   codigoAnterior = kardexMemoria.get(kardexMemoria.size()-1).getCodigo();
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
    
    public void crearArchivoSEGUNDAFORMA(String nombreArchivo, String nombreProveedor)
    {
        String nombreCSV            = "Kardex.csv";
        String nombreArchivoKardex  = nombreArchivo + "-" + nombreProveedor + nombreCSV;
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
    
    public void crearArchivoTemporal(String nombreProducto, String nombreProveedor)
    {
        String nombreCSV            = "TempKardex.csv";
        String nombreArchivoKardex  = nombreProducto + "-" + nombreProveedor + nombreCSV;
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
    
    public void grabarEnArchivo(kardex kardexobj, String nombreProducto, String nombreProveedor)
    {
        crearArchivoSEGUNDAFORMA(nombreProducto, nombreProveedor);
        try
        {
            String nombreCSV            = "Kardex.csv";
            String nombreArchivoKardex  = nombreProducto + "-" + nombreProveedor + nombreCSV;
            
            FileWriter f                = new FileWriter(nombreArchivoKardex,true);
            BufferedWriter b            = new BufferedWriter(f);
            PrintWriter pw              = new PrintWriter(b);

            pw.println(kardexobj.getCodigo()+ "," + kardexobj.getTipoOperacion()+ "," + kardexobj.getTipoDocumento()
                       + "," + kardexobj.getFecha() + "," + kardexobj.getTipocompra()+ "," 
                       + kardexobj.getValorUnitario() + "," + kardexobj.getEntradaCant() + "," + kardexobj.getEntradaValor()
                       + "," + kardexobj.getSalidaCant() + "," + kardexobj.getSalidaValor()
                       + "," + kardexobj.getSaldoCant()+ "," + kardexobj.getSaldoValor() + "," + kardexobj.getPrecioProducto());
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
    
    public void grabarEnArchivoTemporal(kardex kardexobj, String producto, String proveedor)
    {
        crearArchivoTemporal(producto, proveedor);
        try
        {
            String nombreCSV            = "TempKardex.csv";
            String nombreArchivoKardex  = producto + "-" + proveedor + nombreCSV;
            
            FileWriter f                = new FileWriter(nombreArchivoKardex,true);
            BufferedWriter b            = new BufferedWriter(f);
            PrintWriter pw              = new PrintWriter(b);

            pw.println(kardexobj.getCodigo()+ "," + kardexobj.getTipoOperacion()+ "," + kardexobj.getTipoDocumento()
                       + "," + kardexobj.getFecha() + "," + kardexobj.getTipocompra()+ "," 
                       + kardexobj.getValorUnitario() + "," + kardexobj.getEntradaCant() + "," + kardexobj.getEntradaValor()
                       + "," + kardexobj.getSalidaCant() + "," + kardexobj.getSalidaValor()
                       + "," + kardexobj.getSaldoCant()+ "," + kardexobj.getSaldoValor() + "," + kardexobj.getPrecioProducto());
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
    
    public void copiarDtosTemporalesAPrincipal(String producto, String proveedor)
    {
        ArrayList<kardex> kardexMemoria = getVectorDeArchivoTemporal(producto, proveedor);
        for(kardex x: kardexMemoria)
        {
            grabarEnArchivo(x, producto, proveedor);
        }
    }
    
    public void vaciarDatos(String producto, String proveedor)
    {
        String nombreCSV            = "Kardex.csv";
        String nombreArchivoKardex  = producto + "-" + proveedor + nombreCSV;
        kardexProductos .clear(); // vaciando todo el arreglo princpal
        try
        {
            FileWriter f = new FileWriter(nombreArchivoKardex,false); 
            BufferedWriter b = new BufferedWriter(f);
            PrintWriter pw = new PrintWriter(b);

            for(kardex x: kardexProductos ) // aca como ya el arreglo principal se vacio entonces estaria vaciando tmb el archivo
            {
               pw.println(x.getCodigo()+ "," + x.getTipoOperacion()+ "," + x.getTipoDocumento()
                     + "," + x.getFecha() + "," + x.getTipocompra()+ "," 
                     + x.getValorUnitario() + "," + x.getEntradaCant() + "," + x.getEntradaValor()
                     + "," + x.getSalidaCant() + "," + x.getSalidaValor()
                     + "," + x.getSaldoCant()+ "," + x.getSaldoValor()+ "," + x.getPrecioProducto() ); 
            }

            pw.flush();
            pw.close();
            System.out.println("se han eliminado todos los datos exitosamente");
        } 
        catch ( Exception e )
        {
             System.out.println(e);
        }
    }
    
    public int rows()
    {
      return kardexProductos.size();
    }
    
    public kardex get(int pos)
    {
      return kardexProductos.get(pos);
    }
    
    public ArrayList<kardex> getKardexEnMemoria(String producto, String provedor)
    {
        crearArchivoTemporal(producto, provedor);
        ArrayList<kardex> kardexEnMemoria = new ArrayList<>();
        for(kardex x:kardexProductos)
        {
            kardexEnMemoria.add(x);
        }
        return kardexEnMemoria;
    }
    
    public void guardarKardexSalidaEnMemoria(
            ArrayList<kardex> copiaVectorKardex,String producto, String provedor, kardex kardexSalida)
    {
        // aca ya estaria cargada la copia del kardex k-01 , k-02, k-03....
        String correlativoMemoria = correlativoParaTemporal(copiaVectorKardex);
        kardexSalida.setCodigo(correlativoMemoria);
        copiaVectorKardex.add(kardexSalida);
        grabarEnArchivoTemporal(kardexSalida, producto, provedor);
    }
    
    public void pasarMemoriaVectorPrincipal(ArrayList<kardex> kardexMemoria)
    {
        for(kardex x:kardexMemoria)
        {
            kardexProductos.add(x); // agrega los kardex de venta al vector principal
        } 
    }
    
    public String getBoletaAnterior(ArrayList<kardex> kardexMemoria)
    {
        String boleta = kardexMemoria.get(kardexMemoria.size() - 1).getTipoDocumento();
        return boleta;
    }
  
    public kardex buscarcodigo(String cod)
    {
        
        kardex kardexobj = new kardex();
        kardexobj.setCodigo("Error");
        for(kardex x:kardexProductos)
        {
            if( cod.equals( x.getCodigo()) )
            {
                return x;
            }
        }
        return kardexobj;
    }
    
    public String getCodPorNombre(String nombreProducto)
    {
        String codError = "Error";
        for(kardex x:kardexProductos)
        {
            if( x.getNombre().equals( nombreProducto) )
            {
                return x.getCodigo();
            }
        }
        return codError;
    }
    
    public kardex obtenerUltimoKardex()
    {
        
        return kardexProductos.get(kardexProductos.size() - 1);
    }
    
    public boolean modificarNombreProveedor(kardex kardexobj, String newProveedor)
    {
        for(int i=0; i < rows(); i++)
        {
            if( kardexobj.getCodigo().equals( get(i).getCodigo()) )
            {
                kardexProductos.get(i).setTipocompra(newProveedor);
                return true;
            }
        }
        return false;
    }
    public boolean modificarPrecio(kardex kardexobj, double nuevoPrecio)
    {
        for(int i=0; i < rows(); i++)
        {
            if( kardexobj.getCodigo().equals( get(i).getCodigo()) )
            {
                kardexProductos.get(i).setPrecioProducto(nuevoPrecio);
                return true;
            }
        }
        return false;
    }
   
    public void grabarModificareliminar(String nombreArchivo, String proveedor)
    {
        crearArchivoSEGUNDAFORMA(nombreArchivo, proveedor);
        try
        {
            String nombreCSV            = "Kardex.csv";
            String nombreArchivoKardex  = nombreArchivo + "-" + proveedor + nombreCSV;
            
            FileWriter f = new FileWriter(nombreArchivoKardex,false);
            BufferedWriter b = new BufferedWriter(f);
            PrintWriter pw = new PrintWriter(b);
            
            for(kardex x:kardexProductos)
            {
               pw.println( x.getCodigo()+ "," + x.getTipoOperacion()+ "," + x.getTipoDocumento()
                     + "," + x.getFecha() + "," + x.getTipocompra()+ "," 
                     + x.getValorUnitario() + "," + x.getEntradaCant() + "," + x.getEntradaValor()
                     + "," + x.getSalidaCant() + "," + x.getSalidaValor()
                     + "," + x.getSaldoCant()+ "," + x.getSaldoValor()+ "," + x.getPrecioProducto() ); 
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
    
    public void eliminar(kardex kardexobj)
    {
        kardexProductos.remove(getposarray(kardexobj));
    }
    
    public void eliminarArchivoKardex(String nombreArchivo, String proveedor)
    {
        
        try
        {
            String nombreCSV            = "Kardex.csv";
            String nombreArchivoKardex  = nombreArchivo + "-" + proveedor + nombreCSV;
            File myObj = new File(nombreArchivoKardex); 
            
            RandomAccessFile raf=new RandomAccessFile(myObj,"rw");
            raf.close();
            boolean estadoDelete = Files.deleteIfExists(myObj.toPath());
            if (estadoDelete == true) 
            { 
                String msg = "Se elimino el archivo: " + myObj.getName();
                JOptionPane.showMessageDialog(null, msg);
                System.out.println("Archivo eliminado: " + myObj.getName());
            }
            else
            {
                String msg = "Ocurrio algo inesperado al eliminar el archivo: ";
                JOptionPane.showMessageDialog(null, msg);
            }
        }
        catch(HeadlessException | IOException e)
        {
            System.out.println("Ocurrio una excpecion al eliminar el archivoKardex: " + e);
        }
    }
    
    public void eliminarArchivoTemporal(String producto, String proveedor)
    {
        
        try
        {
            String nombreCSV            = "TempKardex.csv";
            String nombreArchivoKardex  = producto + "-" + proveedor + nombreCSV;
            File myObj = new File(nombreArchivoKardex); 
            
            RandomAccessFile raf=new RandomAccessFile(myObj,"rw");
            raf.close();
            boolean estadoDelete = Files.deleteIfExists(myObj.toPath());
            if (estadoDelete == true) 
            { 
                String msg = "Se elimino el archivo: " + myObj.getName();
                JOptionPane.showMessageDialog(null, msg);
                System.out.println("Archivo eliminado: " + myObj.getName());
            }
            else
            {
                String msg = "Ocurrio algo inesperado al eliminar el archivo: ";
                JOptionPane.showMessageDialog(null, msg);
            }
        }
        catch(HeadlessException | IOException e)
        {
            System.out.println("Ocurrio una excpecion al eliminar el archivoKardex: " + e);
        }
    }
    
    public void renombrarArchivoKardex(String nombreProductoAntiguo, String proveedor,
                                        String nombreProductoActual)
    {
        String nombreCSV            = "Kardex.csv";
        String nombreArchivoKardexOld  = nombreProductoAntiguo + "-" + proveedor + nombreCSV;
        String nombreArchivoKardexNew  = nombreProductoActual + "-" + proveedor + nombreCSV;
        // Create an object of the File class
        // Replace the file path with path of the directory
        File oldFile = new File("C:/Users/Jesus/Desktop/Avance2POO/avance mio/Proyecto_Final_Poo2JESUS/"
                                + nombreArchivoKardexOld);
  
        // Create an object of the File class
        // Replace the file path with path of the directory
        File newFile = new File("C:/Users/Jesus/Desktop/Avance2POO/avance mio/Proyecto_Final_Poo2JESUS/"
                                + nombreArchivoKardexNew);
  
        // store the return value of renameTo() method in
        // flag
        boolean flag = oldFile.renameTo(newFile);
  
        // if renameTo() return true then if block is
        // executed
        if (flag == true) 
        {
            String msg = "Archivo renombrado satisfactoriamente!!!";
            System.out.println(msg);
            JOptionPane.showMessageDialog(null, msg);
        }
        // if renameTo() return false then else block is
        // executed
        else 
        {
            System.out.println("Hubo un error al renombrar");
        }
    }
    
    public int getposarray(kardex kardexobj)
    {
        for(int i=0; i<rows(); i++)
        {
            if(kardexobj.getCodigo().equals(kardexProductos.get(i).getCodigo()))
            {
                return i;
            }
        }

        return -1;
    }
    
    public ArrayList<kardex> getKardexReembolso (String boletaBuscada)
    {
        ArrayList<kardex> arrayRetorno = new ArrayList<>();
        for(kardex x: kardexProductos)
        {
            if(x.getTipoDocumento().equals(boletaBuscada) && x.getTipocompra().equals("VENTA"))
            {
                arrayRetorno.add(x);
                
            }
        }

        return arrayRetorno;
    }
}
