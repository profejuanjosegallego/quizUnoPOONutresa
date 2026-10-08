public class Main {

    public static void main(String[] args) {

        GuerreroZ guerrero1 = new GuerreroZ();
        guerrero1.setNombre("Goku");
        guerrero1.setPlanetaOrigen("Vegeta");
        guerrero1.setEdad(35);
        guerrero1.setNivel(9000);

        Transformacion transformacion1 = new Transformacion();
        transformacion1.setNombre("Super Saiyajin");
        transformacion1.setEsPermanente(false);
        transformacion1.setDuracion(30);
        transformacion1.setColorAura("dorado");

        Batalla batalla1 = new Batalla();
        batalla1.setUsoEsferasDragon(true);
        batalla1.setLugar("Namek");
        batalla1.setGanador("Goku");
        batalla1.setDuracion(120);

        GuerreroZ guerrero2 = new GuerreroZ("Piccolo", "Namek", 40, 3500);
        Transformacion transformacion2 = new Transformacion("Kaioken", false, 10, "rojo");
        Batalla batalla2 = new Batalla("Torneo de Artes Marciales", "Goku", 45, false);

        System.out.println("***🔥GUERRERO 1🔥 ***");
        System.out.println("Nombre: " + guerrero1.getNombre());
        System.out.println("Planeta de origen: " + guerrero1.getPlanetaOrigen());
        System.out.println("Edad: " + guerrero1.getEdad());
        System.out.println("Nivel: " + guerrero1.getNivel());
        System.out.println();

        System.out.println("*** 🔥GUERRERO 2🔥***");
        System.out.println("Nombre: " + guerrero2.getNombre());
        System.out.println("Planeta de origen: " + guerrero2.getPlanetaOrigen());
        System.out.println("Edad: " + guerrero2.getEdad());
        System.out.println("Nivel: " + guerrero2.getNivel());
        System.out.println();

        System.out.println("*** 👊BATALLA 1👊 ***");
        System.out.println("Lugar: " + batalla1.getLugar());
        System.out.println("Ganador: " + batalla1.getGanador());
        System.out.println("Duracion: " + batalla1.getDuracion());
        System.out.println("Uso esferas del dragon: " + batalla1.getUsoEsferasDragon());
        System.out.println();

        System.out.println("*** 👊BATALLA2 👊 ***");
        System.out.println("Lugar: " + batalla2.getLugar());
        System.out.println("Ganador: " + batalla2.getGanador());
        System.out.println("Duracion: " + batalla2.getDuracion());
        System.out.println("Uso esferas del dragon: " + batalla2.getUsoEsferasDragon());
        System.out.println();

        System.out.println("*** 🌀TRANSFORMACION 1🌀  ***");
        System.out.println("Nombre: " + transformacion1.getNombre());
        System.out.println("Es permanente: " + transformacion1.getEsPermanente());
        System.out.println("Duracion: " + transformacion1.getDuracion());
        System.out.println("Color del aura: " + transformacion1.getColorAura());
        System.out.println();

        System.out.println("*** 🌀TRANSFORMACION 2🌀 ***");
        System.out.println("Nombre: " + transformacion2.getNombre());
        System.out.println("Es permanente: " + transformacion2.getEsPermanente());
        System.out.println("Duracion: " + transformacion2.getDuracion());
        System.out.println("Color del aura: " + transformacion2.getColorAura());
        System.out.println();

    }

}
