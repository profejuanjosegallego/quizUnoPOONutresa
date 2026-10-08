public class GuerreroZ {
    private String nombre;
    private String raza;
    private double nivelPoder;
    private String tecnicaEspecial;

    public GuerreroZ() {
    }

    public GuerreroZ(String nombre, String raza, double nivelPoder, String tecnicaEspecial) {
        this.nombre = nombre;eww
        this.raza = raza;
        this.nivelPoder = nivelPoder;
        this.tecnicaEspecial = tecnicaEspecial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double getNivelPoder() {
        return nivelPoder;
    }

    public void setNivelPoder(double nivelPoder) {
        this.nivelPoder = nivelPoder;
    }

    public String getTecnicaEspecial() {
        return tecnicaEspecial;
    }

    public void setTecnicaEspecial(String tecnicaEspecial) {
        this.tecnicaEspecial = tecnicaEspecial;
    }
}
