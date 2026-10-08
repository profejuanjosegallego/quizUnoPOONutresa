package com.example.models;

import java.util.UUID;

public class GuerreroZ {
 
    UUID id;
    private String raza;
    private Double kiBase;
    private String nivelResistencia;
    private String listaTecnicas;

    
    public GuerreroZ() {
    }


    public UUID getId() {
        return id;
    }


    public String getRaza() {
        return raza;
    }


    public Double getKiBase() {
        return kiBase;
    }


    public String getNivelResistencia() {
        return nivelResistencia;
    }


    public String getListaTecnicas() {
        return listaTecnicas;
    }


    public void setId(UUID id) {
        this.id = id;
    }


    public void setRaza(String raza) {
        this.raza = raza;
    }


    public void setKiBase(Double kiBase) {
        this.kiBase = kiBase;
    }


    public void setNivelResistencia(String nivelResistencia) {
        this.nivelResistencia = nivelResistencia;
    }


    public void setListaTecnicas(String listaTecnicas) {
        this.listaTecnicas = listaTecnicas;
    }


    
}
