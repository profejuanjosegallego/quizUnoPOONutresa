package com.example;

public class Main {
    public static void main(String[] args) {
        Transformacion transformacion = new Transformacion();
        Batalla batalla = new Batalla();
        GuerreroZ guerreroZ = new GuerreroZ();

        transformacion.setNombreTransformacion("Super Sayan");
        transformacion.setMultiplicadorPoder(50);
        transformacion.setMultiplicadorkI(50);
        transformacion.setMultiplicadorFuerza(50);

        batalla.setLugar("Planeta Tierra");
        batalla.setGanador("Vegeta");
        batalla.setLuchador1("Goku");
        batalla.setLuchador2("Vegeta");

        guerreroZ.setNombre("Gohan");
        guerreroZ.setRaza("Sayan");
        guerreroZ.setVida(80);
        guerreroZ.setKi(70);

        Transformacion transformacionLleno = new Transformacion("Sayan", 100, 100, 100);
        Batalla batallaLleno = new Batalla("Namek", "Goku", "Goku", "Vegeta");
        GuerreroZ guerrerozLleno = new GuerreroZ("Goku", "Sayan", 100, 100);

        System.out.println("----- GuerreroZ (constructor vacio) -----");
        System.out.println("Nombre: " + guerreroZ.getNombre());
        System.out.println("Raza: " + guerreroZ.getRaza());
        System.out.println("Vida: " + guerreroZ.getVida());
        System.out.println("Ki: " + guerreroZ.getKi());

        System.out.println("----- Transformacion (constructor vacio) -----");
        System.out.println("Nombre Transformacion: " + transformacion.getNombreTransformacion());
        System.out.println("Multiplicador Poder: " + transformacion.getMultiplicadorPoder());
        System.out.println("Multiplicador Ki: " + transformacion.getMultiplicadorkI());
        System.out.println("Multiplicador Fuerza: " + transformacion.getMultiplicadorFuerza());

        System.out.println("----- Batalla (constructor vacio) -----");
        System.out.println("Lugar: " + batalla.getLugar());
        System.out.println("Ganador: " + batalla.getGanador());
        System.out.println("Luchador 1: " + batalla.getLuchador1());
        System.out.println("Luchador 2: " + batalla.getLuchador2());

        System.out.println("----- GuerreroZ (constructor lleno) -----");
        System.out.println("Nombre: " + guerrerozLleno.getNombre());
        System.out.println("Raza: " + guerrerozLleno.getRaza());
        System.out.println("Vida: " + guerrerozLleno.getVida());
        System.out.println("Ki: " + guerrerozLleno.getKi());

        System.out.println("----- Transformacion (constructor lleno) -----");
        System.out.println("Nombre Transformacion: " + transformacionLleno.getNombreTransformacion());
        System.out.println("Multiplicador Poder: " + transformacionLleno.getMultiplicadorPoder());
        System.out.println("Multiplicador Ki: " + transformacionLleno.getMultiplicadorkI());
        System.out.println("Multiplicador Fuerza: " + transformacionLleno.getMultiplicadorFuerza());

        System.out.println("----- Batalla (constructor lleno) -----");
        System.out.println("Lugar: " + batallaLleno.getLugar());
        System.out.println("Ganador: " + batallaLleno.getGanador());
        System.out.println("Luchador 1: " + batallaLleno.getLuchador1());
        System.out.println("Luchador 2: " + batallaLleno.getLuchador2());
    }
}
