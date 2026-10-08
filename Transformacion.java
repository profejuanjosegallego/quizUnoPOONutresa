public class Transformacion {

    private String nombre;
    private int nivel;
    private double multiplicadorPoder;
    private String colorAura;
    private String colorCabello;
    private String razaRequerida;
    private double consumoKi;
    private int duracionMaximaMinutos;
    private boolean permanente;
    private String primeraAparicion;

    public Transformacion() {
    }

    public Transformacion(String nombre, int nivel, double multiplicadorPoder, String colorAura,
                          String colorCabello, String razaRequerida, double consumoKi,
                          int duracionMaximaMinutos, boolean permanente, String primeraAparicion) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.multiplicadorPoder = multiplicadorPoder;
        this.colorAura = colorAura;
        this.colorCabello = colorCabello;
        this.razaRequerida = razaRequerida;
        this.consumoKi = consumoKi;
        this.duracionMaximaMinutos = duracionMaximaMinutos;
        this.permanente = permanente;
        this.primeraAparicion = primeraAparicion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public double getMultiplicadorPoder() {
        return multiplicadorPoder;
    }

    public String getColorAura() {
        return colorAura;
    }

    public String getColorCabello() {
        return colorCabello;
    }

    public String getRazaRequerida() {
        return razaRequerida;
    }

    public double getConsumoKi() {
        return consumoKi;
    }

    public int getDuracionMaximaMinutos() {
        return duracionMaximaMinutos;
    }

    public boolean isPermanente() {
        return permanente;
    }

    public String getPrimeraAparicion() {
        return primeraAparicion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setMultiplicadorPoder(double multiplicadorPoder) {
        this.multiplicadorPoder = multiplicadorPoder;
    }

    public void setColorAura(String colorAura) {
        this.colorAura = colorAura;
    }

    public void setColorCabello(String colorCabello) {
        this.colorCabello = colorCabello;
    }

    public void setRazaRequerida(String razaRequerida) {
        this.razaRequerida = razaRequerida;
    }

    public void setConsumoKi(double consumoKi) {
        this.consumoKi = consumoKi;
    }

    public void setDuracionMaximaMinutos(int duracionMaximaMinutos) {
        this.duracionMaximaMinutos = duracionMaximaMinutos;
    }

    public void setPermanente(boolean permanente) {
        this.permanente = permanente;
    }

    public void setPrimeraAparicion(String primeraAparicion) {
        this.primeraAparicion = primeraAparicion;
    }
}
