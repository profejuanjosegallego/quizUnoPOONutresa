public class GuerreroZ {

    private String nombre;
    private double kiBase;
    private String transformacion;
    private String raza;

    public GuerreroZ() {
    }

    public GuerreroZ(String nombre, double kiBase, String transformacion, String raza) {
        this.nombre = nombre;
        this.kiBase = kiBase;
        this.transformacion = transformacion;
        this.raza = raza;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public double getKiBase() { return kiBase; }
    public void setKiBase(double kiBase) { this.kiBase = kiBase; }

    public String getTransformacion() { return transformacion; }
    public void setTransformacion(String transformacion) { this.transformacion = transformacion; }

    public String getRaza() { return raza; }
    public void setRaza(String raza) { this.raza = raza; }
}