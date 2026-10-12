package com.example;

import com.example.models.Batalla;
import com.example.models.GuerreroZ;
import com.example.models.Transformacion;

public class Main {
    public static void main(String[] args) {

        GuerreroZ guerrero1 = new GuerreroZ();
        guerrero1.setNombre("Vegueta");
        guerrero1.setRaza("Sayayin");
        guerrero1.setEdad(34);
        guerrero1.setKiBase(18.000);
        guerrero1.setEstaVivo(true);

        System.out.println("\n----------------------------------------------------------");
        System.out.println(" GUERREROS Z");
        System.out.println("----------------------------------------------------------");
        System.out.println("Nombre guerrero: " + guerrero1.getNombre());
        System.out.println("Raza guerrero: " + guerrero1.getRaza());
        System.out.println("Edad guerrero: " + guerrero1.getEdad());
        System.out.println("Ki base guerrero: " + guerrero1.getKiBase());
        System.out.println("¿El guerrero esta vivo?: " + guerrero1.getEstaVivo());
        System.out.println();

        Transformacion transformacion1 = new Transformacion();
        transformacion1.setNombreTransformacion("Super Sayayin");
        transformacion1.setMultiplicadorKi(2.010000);
        transformacion1.setConsumoEnergiaPorMin(60.000);
        transformacion1.setColorCabello("Dorado");
        transformacion1.setColorAura("Dorado");

        System.out.println("\n----------------------------------------------------------");
        System.out.println(" TRANSFORMACION");
        System.out.println("----------------------------------------------------------");
        System.out.println("Nombre transformacion: " + transformacion1.getNombreTransformacion());
        System.out.println("Multiplicador ki: " + transformacion1.getMultiplicadorKi());
        System.out.println("Consumo energia: " + transformacion1.getConsumoEnergiaPorMin());
        System.out.println("Color cabello: " + transformacion1.getColorCabello());
        System.out.println("Color Aura: " + transformacion1.getColorAura());
        System.out.println();

        Batalla batalla1 = new Batalla();
        batalla1.setUbicacion("Namekuseijin");
        batalla1.setNombreBatalla("Pelea contra Freezer");
        batalla1.setNombreDesafiante("Vegueta");
        batalla1.setNombreOponente("Freezer");
        batalla1.setDuracionBatalla(64.5);

        System.out.println("\n----------------------------------------------------------");
        System.out.println(" BATALLA");
        System.out.println("----------------------------------------------------------");
        System.out.println("Ubicacion: " + batalla1.getUbicacion());
        System.out.println("Nombre batalla: " + batalla1.getNombreBatalla());
        System.out.println("Nombre desafiante: " + batalla1.getNombreDesafiante());
        System.out.println("Nombre oponente: " + batalla1.getNombreOponente());
        System.out.println("Duracion batalla: " + batalla1.getDuracionBatalla());
        System.out.println();
    }
}