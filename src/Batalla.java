public class Batalla {

    private String nombre;
    private String saga;
    private String lugar;
    private String guerrero1;
    private String guerrero2;
    private String ganador;
    private int duracion;
    private double dano;
    private boolean empate;
    private int espectadores;

    public Batalla() {
    }

    public Batalla(String nombre, String saga, String lugar, String guerrero1, String guerrero2,
                   String ganador, int duracion, double dano, boolean empate, int espectadores) {
        this.nombre = nombre;
        this.saga = saga;
        this.lugar = lugar;
        this.guerrero1 = guerrero1;
        this.guerrero2 = guerrero2;
        this.ganador = ganador;
        this.duracion = duracion;
        this.dano = dano;
        this.empate = empate;
        this.espectadores = espectadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSaga() {
        return saga;
    }

    public void setSaga(String saga) {
        this.saga = saga;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getGuerrero1() {
        return guerrero1;
    }

    public void setGuerrero1(String guerrero1) {
        this.guerrero1 = guerrero1;
    }

    public String getGuerrero2() {
        return guerrero2;
    }

    public void setGuerrero2(String guerrero2) {
        this.guerrero2 = guerrero2;
    }

    public String getGanador() {
        return ganador;
    }

    public void setGanador(String ganador) {
        this.ganador = ganador;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public double getDano() {
        return dano;
    }

    public void setDano(double dano) {
        this.dano = dano;
    }

    public boolean isEmpate() {
        return empate;
    }

    public void setEmpate(boolean empate) {
        this.empate = empate;
    }

    public int getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(int espectadores) {
        this.espectadores = espectadores;
    }
}
