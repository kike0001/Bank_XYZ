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
public class MovimientoLogica {
    private int IdMovimiento;
    private int IdTipoMovimiento;
    private String Fecha_Movimiento;
    private int IdCuentaT;
    private int IdCuentaR;
    private double Monto;
    private String tipomovimiento;

    public String getTipomovimiento() {
        return tipomovimiento;
    }

    public void setTipomovimiento(String tipomovimiento) {
        this.tipomovimiento = tipomovimiento;
    }

    public double getMonto() {
        return Monto;
    }

    public void setMonto(double Monto) {
        this.Monto = Monto;
    }

    public int getIdMovimiento() {
        return IdMovimiento;
    }

    public void setIdMovimiento(int IdMovimiento) {
        this.IdMovimiento = IdMovimiento;
    }

    public int getIdTipoMovimiento() {
        return IdTipoMovimiento;
    }

    public void setIdTipoMovimiento(int IdTipoMovimiento) {
        this.IdTipoMovimiento = IdTipoMovimiento;
    }

    public String getFecha_Movimiento() {
        return Fecha_Movimiento;
    }

    public void setFecha_Movimiento(String Fecha_Movimiento) {
        this.Fecha_Movimiento = Fecha_Movimiento;
    }

    public int getIdCuentaT() {
        return IdCuentaT;
    }

    public void setIdCuentaT(int IdCuentaT) {
        this.IdCuentaT = IdCuentaT;
    }

    public int getIdCuentaR() {
        return IdCuentaR;
    }

    public void setIdCuentaR(int IdCuentaR) {
        this.IdCuentaR = IdCuentaR;
    }
}
