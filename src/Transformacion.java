public class Transformacion {

    private String nombre;
    private int nivel;
    private double multiplicador;
    private String aura;
    private String cabello;
    private String raza;
    private double consumoKi;
    private int duracion;
    private boolean permanente;
    private String saga;

    public Transformacion() {
    }

    public Transformacion(String nombre, int nivel, double multiplicador, String aura, String cabello,
                          String raza, double consumoKi, int duracion, boolean permanente, String saga) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.multiplicador = multiplicador;
        this.aura = aura;
        this.cabello = cabello;
        this.raza = raza;
        this.consumoKi = consumoKi;
        this.duracion = duracion;
        this.permanente = permanente;
        this.saga = saga;
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

    public double getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(double multiplicador) {
        this.multiplicador = multiplicador;
    }

    public String getAura() {
        return aura;
    }

    public void setAura(String aura) {
        this.aura = aura;
    }

    public String getCabello() {
        return cabello;
    }

    public void setCabello(String cabello) {
        this.cabello = cabello;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double getConsumoKi() {
        return consumoKi;
    }

    public void setConsumoKi(double consumoKi) {
        this.consumoKi = consumoKi;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public boolean isPermanente() {
        return permanente;
    }

    public void setPermanente(boolean permanente) {
        this.permanente = permanente;
    }

    public String getSaga() {
        return saga;
    }

    public void setSaga(String saga) {
        this.saga = saga;
    }
}
