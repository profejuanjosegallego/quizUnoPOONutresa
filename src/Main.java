package src;

public class Main {

    public static void main(String[] args) {

        

        GuerreroZ goku = new GuerreroZ();
        goku.setNombre("Son Goku");
        goku.setRaza("Saiyajin");
        goku.setNivelDePoder(9000000L);
        goku.setVivo(true);

        GuerreroZ gohan = new GuerreroZ();
        gohan.setNombre("Son Gohan");
        gohan.setRaza("Saiyajin");
        gohan.setNivelDePoder(7000000L);
        gohan.setVivo(true);

        Transformacion ssj = new Transformacion();
        ssj.setNombre("Super Saiyajin");
        ssj.setColorAura("Dorado");
        ssj.setMultiplicadorPoder(50.0);
        ssj.setPermanente(false);

        Batalla namekusei = new Batalla();
        namekusei.setNombre("Goku vs Freezer");
        namekusei.setGanador("Son Goku");
        namekusei.setDuracionMinutos(120);
        namekusei.setTerminoEnEmpate(false);

        

        GuerreroZ vegeta = new GuerreroZ("Vegeta", "Saiyajin", 8500000L, true);

        Transformacion ssjBlue = new Transformacion("Super Saiyajin Blue", "Azul", 1000.0, false);

        Batalla torneo = new Batalla("Goku vs Vegeta", "Empate", 45, true);

        

        System.out.println("==================== GUERREROS Z ====================");
        mostrarGuerrero("Objeto 1 (constructor vacío)", goku);
        mostrarGuerrero("Objeto 2 (constructor vacío)", gohan);
        mostrarGuerrero("Objeto 3 (constructor lleno)", vegeta);

        System.out.println("==================== TRANSFORMACIONES ====================");
        mostrarTransformacion("Objeto 1 (constructor vacío)", ssj);
        mostrarTransformacion("Objeto 2 (constructor lleno)", ssjBlue);

        System.out.println("==================== BATALLAS ====================");
        mostrarBatalla("Objeto 1 (constructor vacío)", namekusei);
        mostrarBatalla("Objeto 2 (constructor lleno)", torneo);
    }

    private static void mostrarGuerrero(String titulo, GuerreroZ g) {
        System.out.println("--- GuerreroZ: " + titulo + " ---");
        System.out.println("Nombre: " + g.getNombre());
        System.out.println("Raza: " + g.getRaza());
        System.out.println("Nivel de poder: " + g.getNivelDePoder());
        System.out.println("¿Está vivo?: " + (g.isVivo() ? "Sí" : "No"));
        System.out.println();
    }

    private static void mostrarTransformacion(String titulo, Transformacion t) {
        System.out.println("--- Transformacion: " + titulo + " ---");
        System.out.println("Nombre: " + t.getNombre());
        System.out.println("Color del aura: " + t.getColorAura());
        System.out.println("Multiplicador de poder: x" + t.getMultiplicadorPoder());
        System.out.println("¿Es permanente?: " + (t.isPermanente() ? "Sí" : "No"));
        System.out.println();
    }

    private static void mostrarBatalla(String titulo, Batalla b) {
        System.out.println("--- Batalla: " + titulo + " ---");
        System.out.println("Nombre: " + b.getNombre());
        System.out.println("Ganador: " + b.getGanador());
        System.out.println("Duración: " + b.getDuracionMinutos() + " minutos");
        System.out.println("¿Terminó en empate?: " + (b.isTerminoEnEmpate() ? "Sí" : "No"));
        System.out.println();
    }
}