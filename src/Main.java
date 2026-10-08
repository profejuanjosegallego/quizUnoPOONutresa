public class Main {

    public static void main(String[] args) {

        // ===== PARTE A: Constructor vacío + setters =====
        GuerreroZ guerrero1 = new GuerreroZ();
        guerrero1.setNombre("Goku");
        guerrero1.setEdad(37);
        guerrero1.setNivelDePoder(150000000.0);
        guerrero1.setEstaVivo(true);

        Transformacion transformacion1 = new Transformacion();
        transformacion1.setNombre("Super Saiyajin");
        transformacion1.setMultiplicadorPoder(50.0);
        transformacion1.setDuracionMinutos(30);
        transformacion1.setEsPermanente(false);

        Batalla batalla1 = new Batalla();
        batalla1.setNombre("Goku vs Freezer");
        batalla1.setGanador("Goku");
        batalla1.setDanoTotal(980000.0);
        batalla1.setHuboTransformacion(true);

        // ===== PARTE B: Constructor lleno =====
        GuerreroZ guerrero2 = new GuerreroZ("Vegeta", 40, 140000000.0, true);
        Transformacion transformacion2 = new Transformacion("Super Saiyajin Blue", 1000.0, 15, false);
        Batalla batalla2 = new Batalla("Goku vs Cell", "Gohan", 1500000.0, true);

        // ===== PARTE C: Consulta con getters =====
        System.out.println("========== OBJETOS CREADOS CON CONSTRUCTOR VACÍO ==========");
        mostrarGuerrero("Guerrero 1", guerrero1);
        mostrarTransformacion("Transformación 1", transformacion1);
        mostrarBatalla("Batalla 1", batalla1);

        System.out.println("========== OBJETOS CREADOS CON CONSTRUCTOR LLENO ==========");
        mostrarGuerrero("Guerrero 2", guerrero2);
        mostrarTransformacion("Transformación 2", transformacion2);
        mostrarBatalla("Batalla 2", batalla2);
    }

    public static void mostrarGuerrero(String titulo, GuerreroZ g) {
        System.out.println("--- " + titulo + " (GuerreroZ) ---");
        System.out.println("Nombre: " + g.getNombre());
        System.out.println("Edad: " + g.getEdad());
        System.out.println("Nivel de poder: " + g.getNivelDePoder());
        System.out.println("¿Está vivo?: " + g.isEstaVivo());
        System.out.println();
    }

    public static void mostrarTransformacion(String titulo, Transformacion t) {
        System.out.println("--- " + titulo + " (Transformacion) ---");
        System.out.println("Nombre: " + t.getNombre());
        System.out.println("Multiplicador de poder: x" + t.getMultiplicadorPoder());
        System.out.println("Duración (min): " + t.getDuracionMinutos());
        System.out.println("¿Es permanente?: " + t.isEsPermanente());
        System.out.println();
    }

    public static void mostrarBatalla(String titulo, Batalla b) {
        System.out.println("--- " + titulo + " (Batalla) ---");
        System.out.println("Nombre: " + b.getNombre());
        System.out.println("Ganador: " + b.getGanador());
        System.out.println("Daño total: " + b.getDanoTotal());
        System.out.println("¿Hubo transformación?: " + b.isHuboTransformacion());
        System.out.println();
    }
}
