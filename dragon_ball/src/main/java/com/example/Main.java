package com.example;

import com.example.models.Batalla;
import com.example.models.GerreroZ;
import com.example.models.Transformacion;

public class Main {
    public static void main(String[] args) {

       GerreroZ guerreroUno = new GerreroZ();
       Transformacion transformacionUno = new Transformacion();
       Batalla batallaUno = new Batalla();

       guerreroUno.setNombre("Kakaroto");
       guerreroUno.setRaza("Sayayin");
       guerreroUno.setEdad(35);
       guerreroUno.setKiBase(30000.00);
       guerreroUno.setEstaVivo(true);

       transformacionUno.setNombreTransformacion("Super Sayayin");
       transformacionUno.setMultiplicadorKi(300000.00);
       transformacionUno.setConsumoEnergiaPorMin(600.00);
       transformacionUno.setColorCabello("Amarillo");
       transformacionUno.setColorAura("Dorada");

       batallaUno.setUbicacion("Namekuseijin");
       batallaUno.setNombreBatalla("Pelea contra Vegeta");
       batallaUno.setNombreDesafiante("Kakaroto");
       batallaUno.setNombreOponente("Vegueta");
       batallaUno.setDuracionBatalla(12.00);


       System.out.println("\n________");
       System.out.println("GUERRERO");
       System.out.println(guerreroUno.getNombre());
       System.out.println(guerreroUno.getRaza());
       System.out.println(guerreroUno.getEdad());
       System.out.println(guerreroUno.getKiBase());
       System.out.println(guerreroUno.getEstaVivo());
       System.out.println("\n______________");
       System.out.println("TRANSFORMACIÓN");
       System.out.println(transformacionUno.getNombreTransformacion());
       System.out.println(transformacionUno.getMultiplicadorKi());
       System.out.println(transformacionUno.getConsumoEnergiaPorMin());
       System.out.println(transformacionUno.getColorCabello());
       System.out.println(transformacionUno.getColorAura());
       System.out.println("\n_______"); 
       System.out.println("BATALLA");
       System.out.println(batallaUno.getUbicacion());
       System.out.println(batallaUno.getNombreBatalla());
       System.out.println(batallaUno.getNombreDesafiante());
       System.out.println(batallaUno.getNombreOponente());
       System.out.println(batallaUno.getDuracionBatalla());

       
    }


}