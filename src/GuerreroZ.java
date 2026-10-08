public class GuerreroZ {

    private String nombre;
    private String raza;
    private String planeta;
    private int edad;
    private int poder;
    private double ki;
    private double estatura;
    private boolean vivo;
    private String tecnica;
    private String grupo;

    public GuerreroZ() {
    }

    public GuerreroZ(String nombre, String raza, String planeta, int edad, int poder, double ki,
                     double estatura, boolean vivo, String tecnica, String grupo) {
        this.nombre = nombre;
        this.raza = raza;
        this.planeta = planeta;
        this.edad = edad;
        this.poder = poder;
        this.ki = ki;
        this.estatura = estatura;
        this.vivo = vivo;
        this.tecnica = tecnica;
        this.grupo = grupo;
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

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public double getKi() {
        return ki;
    }

    public void setKi(double ki) {
        this.ki = ki;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public String getTecnica() {
        return tecnica;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
}
