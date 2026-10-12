package com.example.models;

import java.util.UUID;

public class Batalla {

    private UUID id;
    private String ubicacion;
    private String nombreBatalla;
    private String nombreDesafiante;
    private String nombreOponente;
    private Double duracionBatalla;

    public Batalla() {
    }

    public Batalla(UUID id, String ubicacion, String nombreBatalla, String nombreDesafiante, String nombreOponente,
            Double duracionBatalla) {
        this.id = id;
        this.ubicacion = ubicacion;
        this.nombreBatalla = nombreBatalla;
        this.nombreDesafiante = nombreDesafiante;
        this.nombreOponente = nombreOponente;
        this.duracionBatalla = duracionBatalla;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getNombreBatalla() {
        return nombreBatalla;
    }

    public void setNombreBatalla(String nombreBatalla) {
        this.nombreBatalla = nombreBatalla;
    }

    public String getNombreDesafiante() {
        return nombreDesafiante;
    }

    public void setNombreDesafiante(String nombreDesafiante) {
        this.nombreDesafiante = nombreDesafiante;
    }

    public String getNombreOponente() {
        return nombreOponente;
    }

    public void setNombreOponente(String nombreOponente) {
        this.nombreOponente = nombreOponente;
    }

    public Double getDuracionBatalla() {
        return duracionBatalla;
    }

    public void setDuracionBatalla(Double duracionBatalla) {
        this.duracionBatalla = duracionBatalla;
    }
}
