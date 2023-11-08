
package com.mycompany.sistema_bancario.Clases;

public class Movimientos {
    private int numeroCuenta;
    private String tipoMovimiento;
    private double monto;
    private boolean estado;

    public Movimientos() {
    }

    public Movimientos(int numeroCuenta, String tipoMovimiento, double monto, boolean estado) {
        this.numeroCuenta = numeroCuenta;
        this.tipoMovimiento = tipoMovimiento;
        this.monto = monto;
        this.estado = estado;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(String tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    
}
