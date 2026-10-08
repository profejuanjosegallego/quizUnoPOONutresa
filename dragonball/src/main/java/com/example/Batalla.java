package com.example;

public class Batalla {
    private String Lugar;
    private String luchador1;
    private String luchador2;
    private String gravedad;
    
    public Batalla() {
    }

    public Batalla(String lugar, String luchador1, String luchador2, String gravedad) {
        Lugar = lugar;
        this.luchador1 = luchador1;
        this.luchador2 = luchador2;
        this.gravedad = gravedad;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String lugar) {
        Lugar = lugar;
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

    public String getGravedad() {
        return gravedad;
    }

    public void setGravedad(String gravedad) {
        this.gravedad = gravedad;
    }
    
}
