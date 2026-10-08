
public class GuerreroZ {

    private String nombre;
    private int edad;
    private double nivelDePoder;
    private boolean estaVivo;

    // Constructor vacío
    public GuerreroZ() {
    }

    // Constructor lleno
    public GuerreroZ(String nombre, int edad, double nivelDePoder, boolean estaVivo) {
        this.nombre = nombre;
        this.edad = edad;
        this.nivelDePoder = nivelDePoder;
        this.estaVivo = estaVivo;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getNivelDePoder() {
        return nivelDePoder;
    }

    public boolean isEstaVivo() {
        return estaVivo;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNivelDePoder(double nivelDePoder) {
        this.nivelDePoder = nivelDePoder;
    }

    public void setEstaVivo(boolean estaVivo) {
        this.estaVivo = estaVivo;
    }
}
