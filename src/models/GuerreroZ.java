package models;

import java.util.UUID;

public class GuerreroZ {
   private UUID id;
   private String nombre;
   private String raza;
   private Integer ataque;
   private Integer defensa;
   private String colorCabello;
   private Integer kiActual;
   private Integer kiMaximo;
   private Integer nivelPelea;

   
   public GuerreroZ() {
   }


   public GuerreroZ(UUID id, String nombre, String raza, Integer ataque, Integer defensa, String colorCabello,
        Integer kiActual, Integer kiMaximo, Integer nivelPelea) {
    this.id = id;
    this.nombre = nombre;
    this.raza = raza;
    this.ataque = ataque;
    this.defensa = defensa;
    this.colorCabello = colorCabello;
    this.kiActual = kiActual;
    this.kiMaximo = kiMaximo;
    this.nivelPelea = nivelPelea;
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


   public Integer getAtaque() {
    return ataque;
   }


   public void setAtaque(Integer ataque) {
    this.ataque = ataque;
   }


   public Integer getDefensa() {
    return defensa;
   }


   public void setDefensa(Integer defensa) {
    this.defensa = defensa;
   }


   public String getColorCabello() {
    return colorCabello;
   }


   public void setColorCabello(String colorCabello) {
    this.colorCabello = colorCabello;
   }


   public Integer getKiActual() {
    return kiActual;
   }


   public void setKiActual(Integer kiActual) {
    this.kiActual = kiActual;
   }


   public Integer getKiMaximo() {
    return kiMaximo;
   }


   public void setKiMaximo(Integer kiMaximo) {
    this.kiMaximo = kiMaximo;
   }


   public Integer getNivelPelea() {
    return nivelPelea;
   }


   public void setNivelPelea(Integer nivelPelea) {
    this.nivelPelea = nivelPelea;
   }

}
