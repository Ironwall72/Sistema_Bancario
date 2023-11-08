
package com.mycompany.sistema_bancario.Clases;

public class Cuenta {
    private int numeroCuenta;
    private int idCliente;
    private TipoCuenta tiposCuentas;
    private Long dni;
    private String alias;
    private Movimientos movimientos;
    private boolean estado;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, int idCliente, TipoCuenta tiposCuentas, Long dni, String alias, Movimientos movimientos, boolean estado) {
        this.numeroCuenta = numeroCuenta;
        this.idCliente = idCliente;
        this.tiposCuentas = tiposCuentas;
        this.dni = dni;
        this.alias = alias;
        this.movimientos = movimientos;
        this.estado = estado;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public TipoCuenta getTiposCuentas() {
        return tiposCuentas;
    }

    public void setTiposCuentas(TipoCuenta tiposCuentas) {
        this.tiposCuentas = tiposCuentas;
    }

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Movimientos getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(Movimientos movimientos) {
        this.movimientos = movimientos;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    
}
