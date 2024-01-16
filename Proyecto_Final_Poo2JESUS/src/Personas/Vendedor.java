/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

/**
 *
 * @author Lorelay
 */
public class Vendedor 
{
    //atributos
    protected String codigo;
    protected String nombre;
    protected int    telefono;
    protected int    dni;
    
    //constructor
    public Vendedor() 
    {
        
    }
    
    public Vendedor(String codigo, String nombre, int telefono, int dni) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.telefono = telefono;
        this.dni = dni;
    }
    
    //SET & GET

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    
    //METODOS
    public String[] getDatos()
    {
        String strTelefono = Integer.toString(telefono);
        String strDNI = Integer.toString(dni);
        
        String dato[] = {codigo, nombre , strTelefono, strDNI};
        return dato;
    }
}
