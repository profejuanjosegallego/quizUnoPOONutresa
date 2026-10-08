public class Main {

    public static void main(String[] args) {

        GuerreroZ guerrero1 = new GuerreroZ();
        guerrero1.setNombre("Son Goku");
        guerrero1.setRaza("Saiyajin");
        guerrero1.setPlanetaOrigen("Planeta Vegeta");
        guerrero1.setEdad(37);
        guerrero1.setNivelDePoder(150000000L);
        guerrero1.setKi(98.5);
        guerrero1.setEstatura(1.75);
        guerrero1.setVivo(true);
        guerrero1.setTecnicaEspecial("Kamehameha");
        guerrero1.setAfiliacion("Guerreros Z");

        Transformacion transformacion1 = new Transformacion();
        transformacion1.setNombre("Super Saiyajin");
        transformacion1.setNivel(1);
        transformacion1.setMultiplicadorPoder(50.0);
        transformacion1.setColorAura("Dorado");
        transformacion1.setColorCabello("Rubio");
        transformacion1.setRazaRequerida("Saiyajin");
        transformacion1.setConsumoKi(30.0);
        transformacion1.setDuracionMaximaMinutos(60);
        transformacion1.setPermanente(false);
        transformacion1.setPrimeraAparicion("Saga de Freezer");

        Batalla batalla1 = new Batalla();
        batalla1.setNombre("Goku vs Freezer");
        batalla1.setSaga("Saga de Freezer");
        batalla1.setUbicacion("Planeta Namek");
        batalla1.setGuerrero1("Son Goku");
        batalla1.setGuerrero2("Freezer");
        batalla1.setGanador("Son Goku");
        batalla1.setDuracionMinutos(120);
        batalla1.setDanoTotal(9500000.75);
        batalla1.setTerminoEnEmpate(false);
        batalla1.setEspectadores(12);

        GuerreroZ guerrero2 = new GuerreroZ("Vegeta", "Saiyajin", "Planeta Vegeta", 41, 140000000L,
                95.0, 1.64, true, "Final Flash", "Guerreros Z");

        Transformacion transformacion2 = new Transformacion("Super Saiyajin Dios Azul", 4, 50000.0,
                "Azul", "Azul", "Saiyajin", 75.5, 30, false, "Saga de la Resurreccion de F");

        Batalla batalla2 = new Batalla("Goku vs Vegeta", "Saga de los Saiyajin", "Planicies de la Tierra",
                "Son Goku", "Vegeta", "Son Goku", 180, 7800000.5, false, 6);

        System.out.println("===== GUERRERO 1 =====");
        System.out.println("Nombre: " + guerrero1.getNombre());
        System.out.println("Raza: " + guerrero1.getRaza());
        System.out.println("Planeta de origen: " + guerrero1.getPlanetaOrigen());
        System.out.println("Edad: " + guerrero1.getEdad());
        System.out.println("Nivel de poder: " + guerrero1.getNivelDePoder());
        System.out.println("Ki: " + guerrero1.getKi());
        System.out.println("Estatura: " + guerrero1.getEstatura());
        System.out.println("Vivo: " + guerrero1.isVivo());
        System.out.println("Tecnica especial: " + guerrero1.getTecnicaEspecial());
        System.out.println("Afiliacion: " + guerrero1.getAfiliacion());

        System.out.println("\n===== TRANSFORMACION 1 =====");
        System.out.println("Nombre: " + transformacion1.getNombre());
        System.out.println("Nivel: " + transformacion1.getNivel());
        System.out.println("Multiplicador de poder: " + transformacion1.getMultiplicadorPoder());
        System.out.println("Color del aura: " + transformacion1.getColorAura());
        System.out.println("Color del cabello: " + transformacion1.getColorCabello());
        System.out.println("Raza requerida: " + transformacion1.getRazaRequerida());
        System.out.println("Consumo de ki: " + transformacion1.getConsumoKi());
        System.out.println("Duracion maxima (min): " + transformacion1.getDuracionMaximaMinutos());
        System.out.println("Permanente: " + transformacion1.isPermanente());
        System.out.println("Primera aparicion: " + transformacion1.getPrimeraAparicion());

        System.out.println("\n===== BATALLA 1 =====");
        System.out.println("Nombre: " + batalla1.getNombre());
        System.out.println("Saga: " + batalla1.getSaga());
        System.out.println("Ubicacion: " + batalla1.getUbicacion());
        System.out.println("Guerrero 1: " + batalla1.getGuerrero1());
        System.out.println("Guerrero 2: " + batalla1.getGuerrero2());
        System.out.println("Ganador: " + batalla1.getGanador());
        System.out.println("Duracion (min): " + batalla1.getDuracionMinutos());
        System.out.println("Dano total: " + batalla1.getDanoTotal());
        System.out.println("Termino en empate: " + batalla1.isTerminoEnEmpate());
        System.out.println("Espectadores: " + batalla1.getEspectadores());

        System.out.println("\n===== GUERRERO 2 =====");
        System.out.println("Nombre: " + guerrero2.getNombre());
        System.out.println("Raza: " + guerrero2.getRaza());
        System.out.println("Planeta de origen: " + guerrero2.getPlanetaOrigen());
        System.out.println("Edad: " + guerrero2.getEdad());
        System.out.println("Nivel de poder: " + guerrero2.getNivelDePoder());
        System.out.println("Ki: " + guerrero2.getKi());
        System.out.println("Estatura: " + guerrero2.getEstatura());
        System.out.println("Vivo: " + guerrero2.isVivo());
        System.out.println("Tecnica especial: " + guerrero2.getTecnicaEspecial());
        System.out.println("Afiliacion: " + guerrero2.getAfiliacion());

        System.out.println("\n===== TRANSFORMACION 2 =====");
        System.out.println("Nombre: " + transformacion2.getNombre());
        System.out.println("Nivel: " + transformacion2.getNivel());
        System.out.println("Multiplicador de poder: " + transformacion2.getMultiplicadorPoder());
        System.out.println("Color del aura: " + transformacion2.getColorAura());
        System.out.println("Color del cabello: " + transformacion2.getColorCabello());
        System.out.println("Raza requerida: " + transformacion2.getRazaRequerida());
        System.out.println("Consumo de ki: " + transformacion2.getConsumoKi());
        System.out.println("Duracion maxima (min): " + transformacion2.getDuracionMaximaMinutos());
        System.out.println("Permanente: " + transformacion2.isPermanente());
        System.out.println("Primera aparicion: " + transformacion2.getPrimeraAparicion());

        System.out.println("\n===== BATALLA 2 =====");
        System.out.println("Nombre: " + batalla2.getNombre());
        System.out.println("Saga: " + batalla2.getSaga());
        System.out.println("Ubicacion: " + batalla2.getUbicacion());
        System.out.println("Guerrero 1: " + batalla2.getGuerrero1());
        System.out.println("Guerrero 2: " + batalla2.getGuerrero2());
        System.out.println("Ganador: " + batalla2.getGanador());
        System.out.println("Duracion (min): " + batalla2.getDuracionMinutos());
        System.out.println("Dano total: " + batalla2.getDanoTotal());
        System.out.println("Termino en empate: " + batalla2.isTerminoEnEmpate());
        System.out.println("Espectadores: " + batalla2.getEspectadores());
    }
}
