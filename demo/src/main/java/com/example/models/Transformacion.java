
package com.example.models;

public class Transformacion {
    
    private String nombreTransformacion;
    private double multiplicadorPoder;
    private int nivelRequerido;
    private String colorAura;
    private int duracionMinutos;
    private boolean requiereCola;
    private boolean esLegendaria;
    private double kiNecesario;
    private String descripcion;
    private String guerreroOrigen;

    
    public Transformacion() {
    }


    public Transformacion(String nombreTransformacion, double multiplicadorPoder, int nivelRequerido, String colorAura, int duracionMinutos, boolean requiereCola, boolean esLegendaria, double kiNecesario, String descripcion, String guerreroOrigen) {
        this.nombreTransformacion = nombreTransformacion;
        this.multiplicadorPoder = multiplicadorPoder;
        this.nivelRequerido = nivelRequerido;
        this.colorAura = colorAura;
        this.duracionMinutos = duracionMinutos;
        this.requiereCola = requiereCola;
        this.esLegendaria = esLegendaria;
        this.kiNecesario = kiNecesario;
        this.descripcion = descripcion;
        this.guerreroOrigen = guerreroOrigen;
    }

    public String getNombreTransformacion() {
        return nombreTransformacion;
    }

    public void setNombreTransformacion(String nombreTransformacion) {
        this.nombreTransformacion = nombreTransformacion;
    }

    public double getMultiplicadorPoder() {
        return multiplicadorPoder;
    }

    public void setMultiplicadorPoder(double multiplicadorPoder) {
        this.multiplicadorPoder = multiplicadorPoder;
    }

    public int getNivelRequerido() {
        return nivelRequerido;
    }

    public void setNivelRequerido(int nivelRequerido) {
        this.nivelRequerido = nivelRequerido;
    }

    public String getColorAura() {
        return colorAura;
    }

    public void setColorAura(String colorAura) {
        this.colorAura = colorAura;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public boolean isRequiereCola() {
        return requiereCola;
    }

    public void setRequiereCola(boolean requiereCola) {
        this.requiereCola = requiereCola;
    }

    public boolean isEsLegendaria() {
        return esLegendaria;
    }

    public void setEsLegendaria(boolean esLegendaria) {
        this.esLegendaria = esLegendaria;
    }

    public double getKiNecesario() {
        return kiNecesario;
    }

    public void setKiNecesario(double kiNecesario) {
        this.kiNecesario = kiNecesario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getGuerreroOrigen() {
        return guerreroOrigen;
    }

    public void setGuerreroOrigen(String guerreroOrigen) {
        this.guerreroOrigen = guerreroOrigen;
    }
}