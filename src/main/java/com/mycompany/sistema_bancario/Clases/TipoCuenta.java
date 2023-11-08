
package com.mycompany.sistema_bancario.Clases;

public class TipoCuenta {
    private int id;
    private String nombre;
    private double tasaDebitoAnual;
    private double tasaCreditoAnual;

    public TipoCuenta() {
    }

    public TipoCuenta(int id, String nombre, double tasaDebitoAnual, double tasaCreditoAnual) {
        this.id = id;
        this.nombre = nombre;
        this.tasaDebitoAnual = tasaDebitoAnual;
        this.tasaCreditoAnual = tasaCreditoAnual;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTasaDebitoAnual() {
        return tasaDebitoAnual;
    }

    public void setTasaDebitoAnual(double tasaDebitoAnual) {
        this.tasaDebitoAnual = tasaDebitoAnual;
    }

    public double getTasaCreditoAnual() {
        return tasaCreditoAnual;
    }

    public void setTasaCreditoAnual(double tasaCreditoAnual) {
        this.tasaCreditoAnual = tasaCreditoAnual;
    }
    
    
    
}
