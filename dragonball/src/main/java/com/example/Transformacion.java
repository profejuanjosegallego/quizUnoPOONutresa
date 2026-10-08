package com.example;

public class Transformacion {
    private String nombreTransformacion;
    private Integer multiplicadorPoder;
    private Integer multiplicadorkI;
    private Integer multiplicadorFuerza;
    public Transformacion() {
    }
    public Transformacion(String nombreTransformacion, Integer multiplicadorPoder, Integer multiplicadorkI,
            Integer multiplicadorFuerza) {
        this.nombreTransformacion = nombreTransformacion;
        this.multiplicadorPoder = multiplicadorPoder;
        this.multiplicadorkI = multiplicadorkI;
        this.multiplicadorFuerza = multiplicadorFuerza;
    }
    public String getNombreTransformacion() {
        return nombreTransformacion;
    }
    public void setNombreTransformacion(String nombreTransformacion) {
        this.nombreTransformacion = nombreTransformacion;
    }
    public Integer getMultiplicadorPoder() {
        return multiplicadorPoder;
    }
    public void setMultiplicadorPoder(Integer multiplicadorPoder) {
        this.multiplicadorPoder = multiplicadorPoder;
    }
    public Integer getMultiplicadorkI() {
        return multiplicadorkI;
    }
    public void setMultiplicadorkI(Integer multiplicadorkI) {
        this.multiplicadorkI = multiplicadorkI;
    }
    public Integer getMultiplicadorFuerza() {
        return multiplicadorFuerza;
    }
    public void setMultiplicadorFuerza(Integer multiplicadorFuerza) {
        this.multiplicadorFuerza = multiplicadorFuerza;
    }
    

    
}
