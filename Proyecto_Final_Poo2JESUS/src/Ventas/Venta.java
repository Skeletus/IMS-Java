/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ventas;

/**
 *
 * @author Jesus
 */
public class Venta 
{
    // atributos
    protected String ID_Venta;
    protected String ID_Cliente;
    protected String ID_Vendedor;
    protected String fecha;
    protected int    montoTotal;
    protected double totalPagar;

    public Venta() 
    {
        
    }
    
    public Venta(String ID_Venta, String ID_Cliente, String ID_Vendedor, String fecha) 
    {
        this.ID_Venta = ID_Venta;
        this.ID_Cliente = ID_Cliente;
        this.ID_Vendedor = ID_Vendedor;
        this.fecha = fecha;
        this.montoTotal = 0;
        this.totalPagar = 0;
    }
    
    public Venta(String ID_Venta, String ID_Cliente, String ID_Vendedor, String fecha, int montoTotal, double totalPagar) 
    {
        this.ID_Venta = ID_Venta;
        this.ID_Cliente = ID_Cliente;
        this.ID_Vendedor = ID_Vendedor;
        this.fecha = fecha;
        this.montoTotal = montoTotal;
        this.totalPagar = totalPagar;
    }
    
    
    
    // get y set
    public String getID_Vendedor() {
        return ID_Vendedor;
    }
    public void setID_Vendedor(String ID_Vendedor) {    
        this.ID_Vendedor = ID_Vendedor;
    }

    public int getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(int montoTotal) {
        this.montoTotal = montoTotal;
    }

    public double getTotalPagar() {
        return totalPagar;
    }
    
    public void setTotalPagar(double totalPagar) {    
        this.totalPagar = totalPagar;
    }

    public String getID_Venta() {
        return ID_Venta;
    }

    public void setID_Venta(String ID_Venta) {
        this.ID_Venta = ID_Venta;
    }

    public String getID_Cliente() {
        return ID_Cliente;
    }

    public void setID_Cliente(String ID_Cliente) {
        this.ID_Cliente = ID_Cliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
}
