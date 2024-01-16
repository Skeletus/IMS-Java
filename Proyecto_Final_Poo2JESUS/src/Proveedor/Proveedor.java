/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proveedor;

/**
 *
 * @author Jesus
 */
public class Proveedor 
{
    // atributo
    protected String ID;
    protected String nombre;
    protected String RUC;
    protected int    cantidadDeProductos;
    
    // constructor
    public Proveedor()
    {
        
    }

    public Proveedor(String ID, String nombre, String RUC, int cantidadDeProductos) {
        this.ID = ID;
        this.nombre = nombre;
        this.RUC = RUC;
        this.cantidadDeProductos = cantidadDeProductos;
    }
    
    // getter y setter

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRUC() {
        return RUC;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }

    public int getCantidadDeProductos() {
        return cantidadDeProductos;
    }

    public void setCantidadDeProductos(int cantidadDeProductos) {
        this.cantidadDeProductos = cantidadDeProductos;
    }
    
    
    
}
