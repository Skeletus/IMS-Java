/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Administrador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Jesus
 */
public class LoginClass 
{
    // atributos
    String          linea;
    String          partes[] = null;
    BufferedReader  lector;
    
    // constructor
    public LoginClass() 
    {
        
    }
    
    // metodos
    public void leerArchivoIMPRIMIR(String nombreArchivo)
    {
        try
        {
            lector = new BufferedReader(new FileReader(nombreArchivo)); // el lector ya tiene el archivo
            // imprimiendo el archivo
            while( (linea = lector.readLine()) != null) 
            // obten la primera linea del archivo, y si la linea no hay nada,entonces termina
            {
                partes = linea.split(","); // hasta que encuentra coma cambia de parte
                System.out.println(" cod: " + partes[0] + " nombre: " + partes[1] +
                                    " pass: " + partes[2] + " rol: " + partes[3]);
            }
        }
        catch(Exception e) // lanzar un mensaje en caso de que suceda un error
        {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error de tipo: " + e);
        }
    }
    public void crearArchivoSEGUNDAFORMA()
    {
        try 
        {
            File myObj = new File("listaUusuarios.txt");
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
    public boolean leerArchivoGetUsuario(String nombreArchivo, String nombreComparar)
    {
        boolean valueVerifyed=false;
        try
        {
            lector = new BufferedReader(new FileReader(nombreArchivo)); // el lector ya tiene el archivo
            // imprimiendo el archivo
            while( (linea = lector.readLine()) != null) 
            // obten la primera linea del archivo, y si la linea no hay nada,entonces termina
            {
                partes = linea.split(","); // hasta que encuentra coma cambia de parte
                System.out.println("verifcar: " + partes[1] + " con " + nombreComparar);
                
                if (partes[1].equals(nombreComparar))
                {
                    valueVerifyed = true;
                    break;
                }
                else
                {
                    valueVerifyed = false;
                }
                
            }
            return  valueVerifyed;
            // imprimir();
        }
        catch(Exception e) // lanzar un mensaje en caso de que suceda un error
        {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error de tipo: " + e);
            return false;
        }
    }
    
    public String leerArchivoGetRol(String nombreUsuario)
    {
        String rolRetorno = "";
        try
        {
            lector = new BufferedReader(new FileReader("listaUusuarios.txt")); // el lector ya tiene el archivo
            // imprimiendo el archivo
            while( (linea = lector.readLine()) != null) 
            // obten la primera linea del archivo, y si la linea no hay nada,entonces termina
            {
                partes = linea.split(","); // hasta que encuentra coma cambia de parte
                System.out.println("verifcar: " + partes[1] + " con " + nombreUsuario);
                
                if (partes[1].equals(nombreUsuario))
                {
                    rolRetorno = partes[3];
                    break;
                }
                else
                {
                    rolRetorno = "Error";
                }
                
            }
            return  rolRetorno;
            // imprimir();
        }
        catch(Exception e) // lanzar un mensaje en caso de que suceda un error
        {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error de tipo: " + e);
            return "Error";
        }
    }
    
    public int buscarNombreUsuarioGetPosition(String nombreArchivo, String nombreBuscar)
    {
        int position=0;
        try
        {
            lector = new BufferedReader(new FileReader(nombreArchivo)); // el lector ya tiene el archivo
            // imprimiendo el archivo
            while( (linea = lector.readLine()) != null) 
            // obten la primera linea del archivo, y si la linea no hay nada,entonces termina
            {
                partes = linea.split(","); // hasta que encuentra coma cambia de parte
                if (partes[1].equals(nombreBuscar))
                {
                    break;
                }
                else
                {
                    
                }
                position++;
            }
           return position;
            // imprimir();
        }
        catch(Exception e) // lanzar un mensaje en caso de que suceda un error
        {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error de tipo: " + e);
            return -1;
        }
    }
    
    public boolean leerArchivoPassword(String nombreArchivo, int pos, String passwordComparar)
    {
        int contador = 0; // el contador viene  a ser el numero de liena en el que se encuentra
        boolean passVerify=false;
        try
        {
            
            lector = new BufferedReader(new FileReader(nombreArchivo)); // el lector ya tiene el archivo
            // imprimiendo el archivo
            while( (linea = lector.readLine()) != null) 
            // obten la primera linea del archivo, y si la linea no hay nada,entonces termina
            {
                partes = linea.split(","); // hasta que encuentra coma cambia de parte
                // si el contador esta en el numero de linea que buscamos encontes se verifica la pass
                if ( contador == pos )
                {
                    if( passwordComparar.equals(partes[2]) )
                    {
                        passVerify=true;
                    }
                    else
                    {
                        passVerify=false;
                    }
                }
                contador++; // aumentar el contador para la sgte linea
            }
            return  passVerify;
            // imprimir();
        }
        catch(Exception e) // lanzar un mensaje en caso de que suceda un error
        {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error de tipo: " + e);
            return false;
        }
    }
    
}
