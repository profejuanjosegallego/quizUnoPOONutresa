public class Transformacion {

    private String nombre;
    private double multiplicadorPoder;
    private int duracionMinutos;
    private boolean esPermanente;

    // Constructor vacío
    public Transformacion() {
    }

    // Constructor lleno
    public Transformacion(String nombre, double multiplicadorPoder, int duracionMinutos, boolean esPermanente) {
        this.nombre = nombre;
        this.multiplicadorPoder = multiplicadorPoder;
        this.duracionMinutos = duracionMinutos;
        this.esPermanente = esPermanente;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getMultiplicadorPoder() {
        return multiplicadorPoder;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public boolean isEsPermanente() {
        return esPermanente;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMultiplicadorPoder(double multiplicadorPoder) {
        this.multiplicadorPoder = multiplicadorPoder;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public void setEsPermanente(boolean esPermanente) {
        this.esPermanente = esPermanente;
    }
}
