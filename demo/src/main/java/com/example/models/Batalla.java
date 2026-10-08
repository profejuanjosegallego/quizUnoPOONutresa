
package com.example.models;

public class Batalla {

    private String lugar;
    private String ganador;
    private int duracionSegundos;
    private String nivelDestruccion;
    private boolean tieneEspectadores;
    private String fechaBatalla;
    private String tipoBatalla;
    private int recompensaZeni;
    private boolean fueTransmitida;
    private double poderMaximoRegistrado;

    
    public Batalla() {
    }

    
    public Batalla(String lugar, String ganador, int duracionSegundos, String nivelDestruccion, boolean tieneEspectadores, String fechaBatalla, String tipoBatalla, int recompensaZeni, boolean fueTransmitida, double poderMaximoRegistrado) {
        this.lugar = lugar;
        this.ganador = ganador;
        this.duracionSegundos = duracionSegundos;
        this.nivelDestruccion = nivelDestruccion;
        this.tieneEspectadores = tieneEspectadores;
        this.fechaBatalla = fechaBatalla;
        this.tipoBatalla = tipoBatalla;
        this.recompensaZeni = recompensaZeni;
        this.fueTransmitida = fueTransmitida;
        this.poderMaximoRegistrado = poderMaximoRegistrado;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getGanador() {
        return ganador;
    }

    public void setGanador(String ganador) {
        this.ganador = ganador;
    }

    public int getDuracionSegundos() {
        return duracionSegundos;
    }

    public void setDuracionSegundos(int duracionSegundos) {
        this.duracionSegundos = duracionSegundos;
    }

    public String getNivelDestruccion() {
        return nivelDestruccion;
    }

    public void setNivelDestruccion(String nivelDestruccion) {
        this.nivelDestruccion = nivelDestruccion;
    }

    public boolean isTieneEspectadores() {
        return tieneEspectadores;
    }

    public void setTieneEspectadores(boolean tieneEspectadores) {
        this.tieneEspectadores = tieneEspectadores;
    }

    public String getFechaBatalla() {
        return fechaBatalla;
    }

    public void setFechaBatalla(String fechaBatalla) {
        this.fechaBatalla = fechaBatalla;
    }

    public String getTipoBatalla() {
        return tipoBatalla;
    }

    public void setTipoBatalla(String tipoBatalla) {
        this.tipoBatalla = tipoBatalla;
    }

    public int getRecompensaZeni() {
        return recompensaZeni;
    }

    public void setRecompensaZeni(int recompensaZeni) {
        this.recompensaZeni = recompensaZeni;
    }

    public boolean isFueTransmitida() {
        return fueTransmitida;
    }

    public void setFueTransmitida(boolean fueTransmitida) {
        this.fueTransmitida = fueTransmitida;
    }

    public double getPoderMaximoRegistrado() {
        return poderMaximoRegistrado;
    }

    public void setPoderMaximoRegistrado(double poderMaximoRegistrado) {
        this.poderMaximoRegistrado = poderMaximoRegistrado;
    }
}