public class Main {

    public static void main(String[] args) {

        GuerreroZ goku = new GuerreroZ();
        goku.setNombre("Goku");
        goku.setRaza("Saiyajin");
        goku.setPlaneta("Vegeta");
        goku.setEdad(37);
        goku.setPoder(150000000);
        goku.setKi(98.5);
        goku.setEstatura(1.75);
        goku.setVivo(true);
        goku.setTecnica("Kamehameha");
        goku.setGrupo("Guerreros Z");

        Transformacion superSaiyajin = new Transformacion();
        superSaiyajin.setNombre("Super Saiyajin");
        superSaiyajin.setNivel(1);
        superSaiyajin.setMultiplicador(50.0);
        superSaiyajin.setAura("Dorado");
        superSaiyajin.setCabello("Rubio");
        superSaiyajin.setRaza("Saiyajin");
        superSaiyajin.setConsumoKi(30.0);
        superSaiyajin.setDuracion(60);
        superSaiyajin.setPermanente(false);
        superSaiyajin.setSaga("Freezer");

        Batalla gokuVsFreezer = new Batalla();
        gokuVsFreezer.setNombre("Goku vs Freezer");
        gokuVsFreezer.setSaga("Freezer");
        gokuVsFreezer.setLugar("Namek");
        gokuVsFreezer.setGuerrero1("Goku");
        gokuVsFreezer.setGuerrero2("Freezer");
        gokuVsFreezer.setGanador("Goku");
        gokuVsFreezer.setDuracion(120);
        gokuVsFreezer.setDano(9500000.75);
        gokuVsFreezer.setEmpate(false);
        gokuVsFreezer.setEspectadores(12);

        GuerreroZ vegeta = new GuerreroZ("Vegeta", "Saiyajin", "Vegeta", 41, 140000000, 95.0, 1.64, true,
                "Final Flash", "Guerreros Z");

        Transformacion superSaiyajinBlue = new Transformacion("Super Saiyajin Blue", 4, 50000.0, "Azul",
                "Azul", "Saiyajin", 75.5, 30, false, "Resurreccion de F");

        Batalla gokuVsVegeta = new Batalla("Goku vs Vegeta", "Saiyajin", "Tierra", "Goku", "Vegeta", "Goku",
                180, 7800000.5, false, 6);

        System.out.println("===== GUERRERO 1 (constructor vacio) =====");
        System.out.println("Nombre: " + goku.getNombre());
        System.out.println("Raza: " + goku.getRaza());
        System.out.println("Planeta: " + goku.getPlaneta());
        System.out.println("Edad: " + goku.getEdad());
        System.out.println("Poder: " + goku.getPoder());
        System.out.println("Ki: " + goku.getKi());
        System.out.println("Estatura: " + goku.getEstatura());
        System.out.println("Vivo: " + goku.isVivo());
        System.out.println("Tecnica: " + goku.getTecnica());
        System.out.println("Grupo: " + goku.getGrupo());

        System.out.println();
        System.out.println("===== TRANSFORMACION 1 (constructor vacio) =====");
        System.out.println("Nombre: " + superSaiyajin.getNombre());
        System.out.println("Nivel: " + superSaiyajin.getNivel());
        System.out.println("Multiplicador: " + superSaiyajin.getMultiplicador());
        System.out.println("Aura: " + superSaiyajin.getAura());
        System.out.println("Cabello: " + superSaiyajin.getCabello());
        System.out.println("Raza: " + superSaiyajin.getRaza());
        System.out.println("Consumo de ki: " + superSaiyajin.getConsumoKi());
        System.out.println("Duracion: " + superSaiyajin.getDuracion());
        System.out.println("Permanente: " + superSaiyajin.isPermanente());
        System.out.println("Saga: " + superSaiyajin.getSaga());

        System.out.println();
        System.out.println("===== BATALLA 1 (constructor vacio) =====");
        System.out.println("Nombre: " + gokuVsFreezer.getNombre());
        System.out.println("Saga: " + gokuVsFreezer.getSaga());
        System.out.println("Lugar: " + gokuVsFreezer.getLugar());
        System.out.println("Guerrero 1: " + gokuVsFreezer.getGuerrero1());
        System.out.println("Guerrero 2: " + gokuVsFreezer.getGuerrero2());
        System.out.println("Ganador: " + gokuVsFreezer.getGanador());
        System.out.println("Duracion: " + gokuVsFreezer.getDuracion());
        System.out.println("Dano: " + gokuVsFreezer.getDano());
        System.out.println("Empate: " + gokuVsFreezer.isEmpate());
        System.out.println("Espectadores: " + gokuVsFreezer.getEspectadores());

        System.out.println();
        System.out.println("===== GUERRERO 2 (constructor lleno) =====");
        System.out.println("Nombre: " + vegeta.getNombre());
        System.out.println("Raza: " + vegeta.getRaza());
        System.out.println("Planeta: " + vegeta.getPlaneta());
        System.out.println("Edad: " + vegeta.getEdad());
        System.out.println("Poder: " + vegeta.getPoder());
        System.out.println("Ki: " + vegeta.getKi());
        System.out.println("Estatura: " + vegeta.getEstatura());
        System.out.println("Vivo: " + vegeta.isVivo());
        System.out.println("Tecnica: " + vegeta.getTecnica());
        System.out.println("Grupo: " + vegeta.getGrupo());

        System.out.println();
        System.out.println("===== TRANSFORMACION 2 (constructor lleno) =====");
        System.out.println("Nombre: " + superSaiyajinBlue.getNombre());
        System.out.println("Nivel: " + superSaiyajinBlue.getNivel());
        System.out.println("Multiplicador: " + superSaiyajinBlue.getMultiplicador());
        System.out.println("Aura: " + superSaiyajinBlue.getAura());
        System.out.println("Cabello: " + superSaiyajinBlue.getCabello());
        System.out.println("Raza: " + superSaiyajinBlue.getRaza());
        System.out.println("Consumo de ki: " + superSaiyajinBlue.getConsumoKi());
        System.out.println("Duracion: " + superSaiyajinBlue.getDuracion());
        System.out.println("Permanente: " + superSaiyajinBlue.isPermanente());
        System.out.println("Saga: " + superSaiyajinBlue.getSaga());

        System.out.println();
        System.out.println("===== BATALLA 2 (constructor lleno) =====");
        System.out.println("Nombre: " + gokuVsVegeta.getNombre());
        System.out.println("Saga: " + gokuVsVegeta.getSaga());
        System.out.println("Lugar: " + gokuVsVegeta.getLugar());
        System.out.println("Guerrero 1: " + gokuVsVegeta.getGuerrero1());
        System.out.println("Guerrero 2: " + gokuVsVegeta.getGuerrero2());
        System.out.println("Ganador: " + gokuVsVegeta.getGanador());
        System.out.println("Duracion: " + gokuVsVegeta.getDuracion());
        System.out.println("Dano: " + gokuVsVegeta.getDano());
        System.out.println("Empate: " + gokuVsVegeta.isEmpate());
        System.out.println("Espectadores: " + gokuVsVegeta.getEspectadores());
    }
}
