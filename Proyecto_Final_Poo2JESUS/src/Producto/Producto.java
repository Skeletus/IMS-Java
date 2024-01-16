/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Producto;

/**
 *
 * @author Lorelay
 */
public class Producto 
{
    //atributos
    protected String codigoProducto; // PRO-1
    protected String nombre;         // nombre
    protected String proveedor;      // PROVEEDOR
    protected String descripcion;   // txtxt
    protected int    cantidad;       // 50
    protected double precio;         // 48.67
    
    //constructor
    
    public Producto() 
    {
        
    }
    
    public Producto(String nombre,String proveedor, String descripcion,
                    int cantidad, double precio) {
        this.nombre = nombre;
        this.proveedor = proveedor;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public Producto(String codigoProducto, String nombre,
                    String proveedor, String descripcion,
                    int cantidad, double precio) {
        this.codigoProducto = codigoProducto;
        this.nombre = nombre;
        this.proveedor = proveedor;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    
    //GET & SET
    public String getCodigoProducto()
    {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // metodos
    public String[] getDatos() {
        String strPrecio    = Double.toString(precio);
        String strCantidad  = Integer.toString(cantidad);
        String dato[]       = {codigoProducto, nombre ,
            proveedor, descripcion ,
            strCantidad, strPrecio};
        
        return dato;
    }
}
