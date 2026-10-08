package com.example;

public class Batalla {
    private String lugar;
    private String ganador;
    private String luchador1;
    private String luchador2;
    public Batalla() {
    }
    public Batalla(String lugar, String ganador, String luchador1, String luchador2) {
        this.lugar = lugar;
        this.ganador = ganador;
        this.luchador1 = luchador1;
        this.luchador2 = luchador2;
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
    public String getLuchador1() {
        return luchador1;
    }
    public void setLuchador1(String luchador1) {
        this.luchador1 = luchador1;
    }
    public String getLuchador2() {
        return luchador2;
    }
    public void setLuchador2(String luchador2) {
        this.luchador2 = luchador2;
    }
    
}
