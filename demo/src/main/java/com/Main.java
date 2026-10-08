package com;



import com.example.models.Batalla;
import com.example.models.GuerreroZ;
import com.example.models.Transformacion;

public class Main {
    public static void main(String[] args) {
        
        
        GuerreroZ goku = new GuerreroZ();
        goku.setNombre("Goku");
        goku.setRaza("Saiyajin");
        goku.setEdad(35);
        goku.setNivelPoder(9000);
        goku.setAltura(1.75);
        goku.setPeso(80);
        goku.setPlanetaOrigen("Vegita");
        goku.setEsSaiyajin(true);
        goku.setAfiliacion("Guerreros Z");
        goku.setTecnicaEspecial("Kamehameha");

        
        GuerreroZ vegeta = new GuerreroZ("Vegeta", "Saiyajin", 38, 8500, 1.64, 75, "Vegita", true, "Guerreros Z", "Final Flash");

        Transformacion ssj = new Transformacion();
        ssj.setNombreTransformacion("Super Saiyajin");
        ssj.setMultiplicadorPoder(50);
        ssj.setNivelRequerido(90);
        ssj.setColorAura("Dorado");
        ssj.setDuracionMinutos(30);
        ssj.setRequiereCola(false);
        ssj.setEsLegendaria(true);
        ssj.setKiNecesario(100000);
        ssj.setDescripcion("Transformacion legendaria");
        ssj.setGuerreroOrigen("Goku");
 
        Transformacion blue = new Transformacion("SSJ Blue", 100, 100, "Azul", 20, false, true, 500000, "Ki divino", "Vegeta");

        
        Batalla batalla1 = new Batalla();
        batalla1.setLugar("Namek");
        batalla1.setGanador("Goku");
        batalla1.setDuracionSegundos(3600);
        batalla1.setNivelDestruccion("Planetario");
        batalla1.setTieneEspectadores(false);
        batalla1.setFechaBatalla("1991");
        batalla1.setTipoBatalla("Muerte");
        batalla1.setRecompensaZeni(0);
        batalla1.setFueTransmitida(false);
        batalla1.setPoderMaximoRegistrado(150000);

        
        Batalla torneo = new Batalla("Tierra", "Gohan", 1800, "Ciudad", true, "2026", "Tor