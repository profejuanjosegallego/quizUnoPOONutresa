package com.example;

public class Main {
    public static void main(String[] args) {
        GuerreroZ goku = new GuerreroZ();
        goku.setNombre("Goku");
        goku.setRaza("Saiyan");
        goku.setVida(9000);
        goku.setKi(8000);

        Transformacion ssj = new Transformacion();
        ssj.setSaiyan("Saiyan");
        ssj.setSuperSaiyan("Super Saiyan");
        ssj.setSuperSaiyan2("Super Saiyan 2");
        ssj.setRegeneracion("No");

        Batalla namek = new Batalla();
        namek.setLugar("Namek");
        namek.setLuchador1("Goku");
        namek.setLuchador2("Freezer");
        namek.setGravedad("Normal");

        GuerreroZ vegeta = new GuerreroZ("Vegeta", "Saiyan", 8500, 7800);
        Transformacion ultraInstinto = new Transformacion("Saiyan", "Ultra Instinto", "No aplica", "No");
        Batalla torneo = new Batalla("Tierra", "Gohan", "Cell", "Normal");

        System.out.println("Goku: " + goku.getNombre() + ", " + goku.getRaza() + ", vida " + goku.getVida() + ", ki " + goku.getKi());
        System.out.println("Vegeta: " + vegeta.getNombre() + ", " + vegeta.getRaza() + ", vida " + vegeta.getVida() + ", ki " + vegeta.getKi());
        System.out.println("SSJ: " + ssj.getSaiyan() + ", " + ssj.getSuperSaiyan() + ", " + ssj.getSuperSaiyan2() + ", " + ssj.getRegeneracion());
        System.out.println("Ultra Instinto: " + ultraInstinto.getSaiyan() + ", " + ultraInstinto.getSuperSaiyan() + ", " + ultraInstinto.getSuperSaiyan2() + ", " + ultraInstinto.getRegeneracion());
        System.out.println("Namek: " + namek.getLugar() + ", " + namek.getLuchador1() + " vs " + namek.getLuchador2() + ", gravedad " + namek.getGravedad());
        System.out.println("Torneo: " + torneo.getLugar() + ", " + torneo.getLuchador1() + " vs " + torneo.getLuchador2() + ", gravedad " + torneo.getGravedad());
    }
}
