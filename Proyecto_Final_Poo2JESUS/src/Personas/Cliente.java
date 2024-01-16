/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

/**
 *
 * @author Jesus
 */
public class Cliente 
{
    protected String codigoCliente;
    protected String DNI;
    protected String Nombre;
    protected String Telefono;
    protected int    comprasTotales;

    public Cliente() {
    }

    public Cliente(String codigoCliente, String DNI, String Nombre, String Telefono, int comprasTotales) {
        this.codigoCliente = codigoCliente;
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.Telefono = Telefono;
        this.comprasTotales = comprasTotales;
    }
    
    // constructor para agregar cliente por primera vez
    public Cliente(String codigoCliente, String DNI, String Nombre, String Telefono) {
        this.codigoCliente = codigoCliente;
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.Telefono = Telefono;
        this.comprasTotales = 0;
    }

    

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public int getComprasTotales() {
        return comprasTotales;
    }

    public void setComprasTotales(int comprasTotales) {
        this.comprasTotales = comprasTotales;
    }
    
    
    
}
