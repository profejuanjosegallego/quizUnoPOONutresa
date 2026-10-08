public class Main {

    public static void main(String[] args) {
        
        GuerreroZ goku = new GuerreroZ("Goku", 9000, 8000, 7500.5, true);
        GuerreroZ vegeta = new GuerreroZ("Vegeta", 8500, 7800, 7000.0, true);
        GuerreroZ gohan = new GuerreroZ();
        GuerreroZ piccolo = new GuerreroZ();
        
        Transformacion ssj1 = new Transformacion(1, 50, "Amarillo", 1000.0);
        Transformacion ssj2 = new Transformacion(2, 100, "Amarillo", 2500.0);
        Transformacion ssj3 = new Transformacion();
        Transformacion ultraInstinto = new Transformacion();


        Batalla batalla1 = new Batalla("Goku", "Freezer", "Namek", "Derrotar a Freezer");
        Batalla batalla2 = new Batalla("Gohan", "Cell", "Tierra", "Salvar a la Tierra");
        Batalla batalla3 = new Batalla();
        Batalla batalla4 = new Batalla();

        goku.mostrarInfo();
        vegeta.mostrarInfo();
        gohan.mostrarInfo();
        piccolo.mostrarInfo();

        ssj1.mostrarInfo();
        ssj2.mostrarInfo();
        ssj3.mostrarInfo();
        ultraInstinto.mostrarInfo();

        batalla1.mostrarInfo();
        batalla2.mostrarInfo();
        batalla3.mostrarInfo();
        batalla4.mostrarInfo();
    }
}

