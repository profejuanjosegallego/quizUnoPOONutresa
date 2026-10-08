public class Batalla {

    private String nombre;
    private String ganador;
    private double danoTotal;
    private boolean huboTransformacion;

    // Constructor vacío
    public Batalla() {
    }

    // Constructor lleno
    public Batalla(String nombre, String ganador, double danoTotal, boolean huboTransformacion) {
        this.nombre = nombre;
        this.ganador = ganador;
        this.danoTotal = danoTotal;
        this.huboTransformacion = huboTransformacion;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getGanador() {
        return ganador;
    }

    public double getDanoTotal() {
        return danoTotal;
    }

    public boolean isHuboTransformacion() {
        return huboTransformacion;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGanador(String ganador) {
        this.ganador = ganador;
    }

    public void setDanoTotal(double danoTotal) {
        this.danoTotal = danoTotal;
    }

    public void setHuboTransformacion(boolean huboTransformacion) {
        this.huboTransformacion = huboTransformacion;
    }
}