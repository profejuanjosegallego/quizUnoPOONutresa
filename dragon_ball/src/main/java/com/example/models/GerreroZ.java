package com.example.models;

import java.util.UUID;

public class GerreroZ {
    private UUID id;
    private String nombre;
    private String raza;
    private Integer edad;
    private Double kiBase;
    private Boolean estaVivo;

    public GerreroZ() {
    }

    public GerreroZ(UUID id, String nombre, String raza, Integer edad, Double kiBase, Boolean estaVivo) {
        this.id = id;
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.kiBase = kiBase;
        this.estaVivo = estaVivo;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Double getKiBase() {
        return kiBase;
    }

    public void setKiBase(Double kiBase) {
        this.kiBase = kiBase;
    }

    public Boolean getEstaVivo() {
        return estaVivo;
    }

    public void setEstaVivo(Boolean estaVivo) {
        this.estaVivo = estaVivo;
    }

    
    

}
