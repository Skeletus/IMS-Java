/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ventas;

/**
 *
 * @author Jesus
 */
public class DetalleVenta 
{
    // atirbutos
    String ID_Venta;
    String ID_Producto;
    int    cantidadVendidaProducto;
    String codigoBoleta;
    
    // constructor
    
    public DetalleVenta() 
    {
        
    }

    /*
    public DetalleVenta(String ID_Venta, String ID_Producto, int cantidadVendidaProducto) {
        this.ID_Venta = ID_Venta;
        this.ID_Producto = ID_Producto;
        this.cantidadVendidaProducto = cantidadVendidaProducto;
    }
    */

    public DetalleVenta(String ID_Venta, String ID_Producto, int cantidadVendidaProducto, String codigoBoleta) {
        this.ID_Venta = ID_Venta;
        this.ID_Producto = ID_Producto;
        this.cantidadVendidaProducto = cantidadVendidaProducto;
        this.codigoBoleta = codigoBoleta;
    }
    
    
    /*
    public DetalleVenta(String ID_Venta, String ID_Producto) {
        this.ID_Venta = ID_Venta;
        this.ID_Producto = ID_Producto;
    }
    */

    // setter y getter
    public int getCantidadVendidaProducto() {
        return cantidadVendidaProducto;
    }
    
    public void setCantidadVendidaProducto(int cantidadVendidaProducto) {
        this.cantidadVendidaProducto = cantidadVendidaProducto;
    }

    public String getID_Venta() {
        return ID_Venta;
    }

    public void setID_Venta(String ID_Venta) {
        this.ID_Venta = ID_Venta;
    }

    public String getID_Producto() {
        return ID_Producto;
    }

    public void setID_Producto(String ID_Producto) {
        this.ID_Producto = ID_Producto;
    }

    public String getCodigoBoleta() {
        return codigoBoleta;
    }

    public void setCodigoBoleta(String codigoBoleta) {
        this.codigoBoleta = codigoBoleta;
    }
    
    
    
}
