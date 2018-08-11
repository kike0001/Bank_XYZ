/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author AG
 */
public class CuentaLogica {
    private int IdCuenta;
    private int IdCliente;
    private int IdTipoCuenta;
    private double saldo;
    private String Fecha_de_Creacion;
   
    public int getIdCuenta() {
        return IdCuenta;
    }

    public void setIdCuenta(int IdCuenta) {
        this.IdCuenta = IdCuenta;
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    public int getIdTipoCuenta() {
        return IdTipoCuenta;
    }

    public void setIdTipoCuenta(int IdTipoCuenta) {
        this.IdTipoCuenta = IdTipoCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getFecha_de_Creacion() {
        return Fecha_de_Creacion;
    }

    public void setFecha_de_Creacion(String Fecha_de_Creacion) {
        this.Fecha_de_Creacion = Fecha_de_Creacion;
    } 
}
