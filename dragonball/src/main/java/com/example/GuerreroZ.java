package com.example;

public class GuerreroZ {
    private String nombre;
    private String raza;
    private Integer vida;
    private Integer ki;
    public GuerreroZ() {
    }
    public GuerreroZ(String nombre, String raza, Integer vida, Integer ki) {
        this.nombre = nombre;
        this.raza = raza;
        this.vida = vida;
        this.ki = ki;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public Integer getVida() {
        return vida;
    }
    public void setVida(Integer vida) {
        this.vida = vida;
    }
    public Integer getKi() {
        return ki;
    }
    public void setKi(Integer ki) {
        this.ki = ki;
    }
    

    
}
