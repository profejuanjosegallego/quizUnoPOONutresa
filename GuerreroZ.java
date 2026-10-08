public class GuerreroZ {

    private String nombre;
    private String raza;
    private String planetaOrigen;
    private int edad;
    private long nivelDePoder;
    private double ki;
    private double estatura;
    private boolean vivo;
    private String tecnicaEspecial;
    private String afiliacion;

    public GuerreroZ() {
    }

    public GuerreroZ(String nombre, String raza, String planetaOrigen, int edad, long nivelDePoder,
                     double ki, double estatura, boolean vivo, String tecnicaEspecial, String afiliacion) {
        this.nombre = nombre;
        this.raza = raza;
        this.planetaOrigen = planetaOrigen;
        this.edad = edad;
        this.nivelDePoder = nivelDePoder;
        this.ki = ki;
        this.estatura = estatura;
        this.vivo = vivo;
        this.tecnicaEspecial = tecnicaEspecial;
        this.afiliacion = afiliacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public String getPlanetaOrigen() {
        return planetaOrigen;
    }

    public int getEdad() {
        return edad;
    }

    public long getNivelDePoder() {
        return nivelDePoder;
    }

    public double getKi() {
        return ki;
    }

    public double getEstatura() {
        return estatura;
    }

    public boolean isVivo() {
        return vivo;
    }

    public String getTecnicaEspecial() {
        return tecnicaEspecial;
    }

    public String getAfiliacion() {
        return afiliacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setPlanetaOrigen(String planetaOrigen) {
        this.planetaOrigen = planetaOrigen;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNivelDePoder(long nivelDePoder) {
        this.nivelDePoder = nivelDePoder;
    }

    public void setKi(double ki) {
        this.ki = ki;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public void setTecnicaEspecial(String tecnicaEspecial) {
        this.tecnicaEspecial = tecnicaEspecial;
    }

    public void setAfiliacion(String afiliacion) {
        this.afiliacion = afiliacion;
    }
}
