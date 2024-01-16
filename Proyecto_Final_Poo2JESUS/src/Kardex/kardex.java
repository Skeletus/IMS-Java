/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kardex;
import Producto.*;

/**
 *
 * @author Jesus
 */
public class kardex extends Producto
{
    // atributos
    // === datos previos
    protected String    codigo;
    protected String	tipoOperacion; // op-01 = factura || op-02 = boleta
    protected String	tipoDocumento; // F01-3525 || B06-2135 la boleta generada
    protected String	fecha;         // dd/mm//YYYY
    protected String	tipocompra;    // entrada (COMPRA) o salida (VENTA), no se muestra en tabla
    // === entradas
    protected int 	entradaCant;
    protected double 	entradaValor;
    // === valor unitario
    protected double	valorUnitario; // viene a ser precio que debe venderse x 1unidad (no ganancia)
    // === salidas
    protected int	salidaCant;
    protected double	salidaValor;
    // === saldos
    protected int	saldoCant;
    protected double	saldoValor;
    // === precioproducto
    protected double	precioProducto; // precio con ganancia
    
    
    // constuctor
    public kardex() 
    {
        
    }

    // constructor para ventas o salidas
    public kardex(String codigo, String tipoDocumento, String fecha,
                  double valorUnitario, int salidaCant, double salidaValor,
                  int saldoCant, double saldoValor,  double precioProducto) 
    {
        this.codigo = codigo;
        this.tipoOperacion = "01";
        this.tipoDocumento = tipoDocumento;
        this.fecha = fecha;
        this.tipocompra = "VENTA";
        this.entradaCant = 0;
        this.entradaValor = 0;
        this.valorUnitario = valorUnitario;
        this.salidaCant = salidaCant;
        this.salidaValor = salidaValor;
        this.saldoCant = saldoCant;
        this.saldoValor = saldoValor;
        this.precioProducto = precioProducto;
    }

    // constructor para cuando se aumenta  el stock 
    public kardex(String codigo, String tipoDocumento, String fecha,
                  int entradaCant, double entradaValor, double valorUnitario,
                  int saldoCant, double saldoValor,
                  double precioProducto) 
    {
        this.codigo = codigo;
        this.tipoOperacion = "02";
        this.tipoDocumento = tipoDocumento;
        this.fecha = fecha;
        this.tipocompra = "COMPRA";
        this.entradaCant = entradaCant;
        this.entradaValor = entradaValor;
        this.valorUnitario = valorUnitario;
        this.salidaCant = 0;
        this.salidaValor = 0;
        this.saldoCant = saldoCant;
        this.saldoValor = saldoValor;
        this.precioProducto = precioProducto;
    }
    
    // constructor para cuando hay reembolso
    public kardex(String codigo, String tipoDocumento, String fecha,
                  int entradaCant, double entradaValor, double valorUnitario,
                  int saldoCant, double saldoValor) 
    {
        this.codigo = codigo;
        this.tipoOperacion = "03";
        this.tipoDocumento = tipoDocumento;
        this.fecha = fecha;
        this.tipocompra = "REEMBOLSO";
        this.entradaCant = entradaCant;
        this.entradaValor = entradaValor;
        this.valorUnitario = valorUnitario;
        this.salidaCant = 0;
        this.salidaValor = 0;
        this.saldoCant = saldoCant;
        this.saldoValor = saldoValor;
        this.precioProducto = 0;
    }
    
    // constructor para cuando se agrega un nuevo producto
    public kardex(String codigo, String tipoDocumento, String fecha,
                    int entradaCant, double entradaValor,
                     double valorUnitario, double precioProducto) 
    {
        this.codigo = codigo;
        this.tipoOperacion = "02";
        this.tipoDocumento = tipoDocumento;
        this.fecha = fecha;
        this.tipocompra = "COMPRA";
        this.entradaCant = entradaCant;
        this.entradaValor = entradaValor;
        this.valorUnitario = valorUnitario;
        this.salidaCant = 0;
        this.salidaValor = 0;
        this.saldoCant = entradaCant;
        this.saldoValor = entradaValor;
        this.precioProducto = precioProducto;
    }
    
    
    
    // SET Y GET

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipoOperacion() {
        return tipoOperacion;
    }

    public void setTipoOperacion(String tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipocompra() {
        return tipocompra;
    }

    public void setTipocompra(String tipocompra) {
        this.tipocompra = tipocompra;
    }

    public int getEntradaCant() {
        return entradaCant;
    }

    public void setEntradaCant(int entradaCant) {
        this.entradaCant = entradaCant;
    }

    public double getEntradaValor() {
        return entradaValor;
    }

    public void setEntradaValor(double entradaValor) {
        this.entradaValor = entradaValor;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public int getSalidaCant() {
        return salidaCant;
    }

    public void setSalidaCant(int salidaCant) {
        this.salidaCant = salidaCant;
    }

    public double getSalidaValor() {
        return salidaValor;
    }

    public void setSalidaValor(double salidaValor) {
        this.salidaValor = salidaValor;
    }

    public int getSaldoCant() {
        return saldoCant;
    }

    public void setSaldoCant(int saldoCant) {
        this.saldoCant = saldoCant;
    }

    public double getSaldoValor() {
        return saldoValor;
    }

    public void setSaldoValor(double saldoValor) {
        this.saldoValor = saldoValor;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }
    
    // metodo to string

    @Override
    public String toString() {
        return "kardex:" + "\nCodigo=" + codigo + "\ntipoOperacion=" + 
                tipoOperacion + "\ntipoDocumento=" + tipoDocumento + "\nfecha=" 
                + fecha + "\ntipocompra=" + tipocompra + "\nentradaCant=" + entradaCant
                + "\nentradaValor=" + entradaValor + "\nvalorUnitario=" + valorUnitario
                + "\nsalidaCant=" + salidaCant + "\nsalidaValor=" + salidaValor + "\nsaldoCant="
                + saldoCant + "\nsaldoValor=" + saldoValor + "\nprecioProducto=" + precioProducto;
    }
    
}
