public class Transformacion {
    private String nombre;
    private int nivel;
    private double multiplicadorPoder;
    private String colorCabello;

    public Transformacion() {
    }

    public Transformacion(String nombre, int nivel, double multiplicadorPoder, String colorCabello) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.multiplicadorPoder = multiplicadorPoder;
        this.colorCabello = colorCabello;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public double getMultiplicadorPoder() {
        return multiplicadorPoder;
    }

    public void setMultiplicadorPoder(double multiplicadorPoder) {
        this.multiplicadorPoder = multiplicadorPoder;
    }

    public String getColorCabello() {
        return colorCabello;
    }

    public void setColorCabello(String colorCabello) {
        this.colorCabello = colorCabello;
    }
}
