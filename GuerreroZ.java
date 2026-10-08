public class GuerreroZ {
    private String nombre;
    private int poder;
    private int defensa;
    private double ki;
    private boolean activo;

    public GuerreroZ() {

    }

    public GuerreroZ(String nombre, int poder, int defensa, double ki, boolean activo) {
        this.nombre = nombre;
        this.poder = poder;
        this.defensa = defensa;
        this.ki = ki;
        this.activo = activo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public double getKi() {
        return ki;
    }

    public void setKi(double ki) {
        this.ki = ki;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public void mostrarInfo() {
        System.err.println("==========================");
        System.out.println("Nombre: " + nombre);
        System.out.println("Poder: " + poder);
        System.out.println("Defensa: " + defensa);
        System.out.println("Ki: " + ki);
        System.out.println("Activo: " + activo);
        System.err.println("==========================\n");
    }
}
