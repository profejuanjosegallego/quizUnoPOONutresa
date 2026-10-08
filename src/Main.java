public class Main {
    public static void main(String[] args) {
        GuerreroZ goku = new GuerreroZ();
        goku.setNombre("Goku");
        goku.setRaza("Saiyajin");
        goku.setNivelPoder(150000);
        goku.setTecnicaEspecial("Kamehameha");

        Transformacion superSaiyajin = new Transformacion();
        superSaiyajin.setNombre("Super Saiyajin");
        superSaiyajin.setNivel(1);
        superSaiyajin.setMultiplicadorPoder(50);
        superSaiyajin.setColorCabello("Dorado");

        Batalla batalla = new Batalla();
        batalla.setNombre("Batalla contra Freezer");
        batalla.setUbicacion("Namek");
        batalla.setGuerreroUno("Goku");
        batalla.setGuerreroDos("Freezer");

        System.out.println("Guerrero: " + goku.getNombre() + ", " + goku.getRaza()
                + ", poder " + goku.getNivelPoder() + ", tecnica " + goku.getTecnicaEspecial());
        System.out.println("Transformacion: " + superSaiyajin.getNombre() + ", nivel "
                + superSaiyajin.getNivel() + ", multiplicador "
                + superSaiyajin.getMultiplicadorPoder() + ", cabello "
                + superSaiyajin.getColorCabello());
        System.out.println("Batalla: " + batalla.getNombre() + ", lugar "
                + batalla.getUbicacion() + ", " + batalla.getGuerreroUno()
                + " contra " + batalla.getGuerreroDos());
    }
}
