 package com.example.models;

public class GuerreroZ {
   
    private String nombre;
    private String raza;
    private int edad;
    private double nivelPoder;
    private double altura;
    private double peso;
    private String planetaOrigen;
    private boolean esSaiyajin;
    private String afiliacion;
    private String tecnicaEspecial;

    public GuerreroZ() {
    }


    public GuerreroZ(String nombre, String raza, int edad, double nivelPoder, double altura, double peso, String planetaOrigen, boolean esSaiyajin, String afiliacion, String tecnicaEspecial) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.nivelPoder = nivelPoder;
        this.altura = altura;
        this.peso = peso;
        this.planetaOrigen = planetaOrigen;
        this.esSaiyajin = esSaiyajin;
        this.afiliacion = afiliacion;
        this.tecnicaEspecial = tecnicaEspecial;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNivelPoder() {
        return nivelPoder;
    }

    public void setNivelPoder(double nivelPoder) {
        this.nivelPoder = nivelPoder;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getPlanetaOrigen() {
        return planetaOrigen;
    }

    public void setPlanetaOrigen(String