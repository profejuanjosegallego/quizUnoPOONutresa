public class Main {
    public static void main(String[] args) {

        System.out.println("=================================================");
        System.out.println("  SISTEMA DE CONTROL DE LA CORPORACIÓN CÁPSULA   ");
        System.out.println("=================================================\n");

        // PARTE A: Constructor Vacío + Setters
        GuerreroZ g1 = new GuerreroZ();
        g1.setNombre("Goku");
        g1.setKiBase(9000.0);
        g1.setTransformacion("Super Saiyajin 1");
        g1.setRaza("Saiyajin");

        Transformacion t1 = new Transformacion();
        t1.setNombreFase("Super Saiyajin 1");
        t1.setMultiplicadorKi(50.0);
        t1.setColorCabello("Dorado");
        t1.setColorAura("Amarillo");

        Batalla b1 = new Batalla();
        b1.setNombreLugar("Planeta Namek");
        b1.setDuracionMinutos(45);
        b1.setGanador("Goku");
        b1.setPerdedor("Freezer");

        // PARTE B: Constructor Lleno
        GuerreroZ g2 = new GuerreroZ("Vegeta", 8500.0, "Super Saiyajin Blue", "Saiyajin");

        Transformacion t2 = new Transformacion("Super Saiyajin Blue", 1500.0, "Azul", "Azul Brillante");

        Batalla b2 = new Batalla("Campos de Hielo", 60, "Goku y Vegeta", "Broly");

        // PARTE C: Getters
        System.out.println("--- OBJETOS CREADOS CON CONSTRUCTOR VACÍO Y SETTERS ---\n");

        System.out.println("[GUERRERO Z #1]");
        System.out.println("Nombre: " + g1.getNombre() + " | Ki Base: " + g1.getKiBase() + 
                           " | Transformación: " + g1.getTransformacion() + " | Raza: " + g1.getRaza() + "\n");

        System.out.println("[TRANSFORMACIÓN #1]");
        System.out.println("Fase: " + t1.getNombreFase() + " | Multiplicador: x" + t1.getMultiplicadorKi() + 
                           " | Color Cabello: " + t1.getColorCabello() + " | Color Aura: " + t1.getColorAura() + "\n");

        System.out.println("[BATALLA #1]");
        System.out.println("Lugar: " + b1.getNombreLugar() + " | Duración: " + b1.getDuracionMinutos() + " mins" +
                           " | Ganador: " + b1.getGanador() + " | Perdedor: " + b1.getPerdedor() + "\n");

        System.out.println("---------------------------------------------------\n");
        System.out.println("--- OBJETOS CREADOS CON CONSTRUCTOR LLENO ---\n");

        System.out.println("[GUERRERO Z #2]");
        System.out.println("Nombre: " + g2.getNombre() + " | Ki Base: " + g2.getKiBase() + 
                           " | Transformación: " + g2.getTransformacion() + " | Raza: " + g2.getRaza() + "\n");

        System.out.println("[TRANSFORMACIÓN #2]");
        System.out.println("Fase: " + t2.getNombreFase() + " | Multiplicador: x" + t2.getMultiplicadorKi() + 
                           " | Color Cabello: " + t2.getColorCabello() + " | Color Aura: " + t2.getColorAura() + "\n");

        System.out.println("[BATALLA #2]");
        System.out.println("Lugar: " + b2.getNombreLugar() + " | Duración: " + b2.getDuracionMinutos() + " mins" +
                           " | Ganador: " + b2.getGanador() + " | Perdedor: " + b2.getPerdedor());
    }
}