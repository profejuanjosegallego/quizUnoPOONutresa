package com.example.models;

import java.util.UUID;

public class Transformacion {

    private UUID id;
    private String nombreTransformacion;
    private Double multiplicadorKi;
    private Double consumoEnergiaPorMin;
    private String colorCabello;
    private String colorAura;
    
    public Transformacion() {
    }

    public Transformacion(UUID id, String nombreTransformacion, Double multiplicadorKi, Double consumoEnergiaPorMin,
            String colorCabello, String colorAura) {
        this.id = id;
        this.nombreTransformacion = nombreTransformacion;
        this.multiplicadorKi = multiplicadorKi;
        this.consumoEnergiaPorMin = consumoEnergiaPorMin;
        this.colorCabello = colorCabello;
        this.colorAura = colorAura;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNombreTransformacion() {
        return nombreTransformacion;
    }

    public void setNombreTransformacion(String nombreTransformacion) {
        this.nombreTransformacion = nombreTransformacion;
    }

    public Double getMultiplicadorKi() {
        return multiplicadorKi;
    }

    public void setMultiplicadorKi(Double multiplicadorKi) {
        this.multiplicadorKi = multiplicadorKi;
    }

    public Double getConsumoEnergiaPorMin() {
        return consumoEnergiaPorMin;
    }

    public void setConsumoEnergiaPorMin(Double consumoEnergiaPorMin) {
        this.consumoEnergiaPorMin = consumoEnergiaPorMin;
    }

    public String getColorCabello() {
        return colorCabello;
    }

    public void setColorCabello(String colorCabello) {
        this.colorCabello = colorCabello;
    }

    public String getColorAura() {
        return colorAura;
    }

    public void setColorAura(String colorAura) {
        this.colorAura = colorAura;
    }

    
}
