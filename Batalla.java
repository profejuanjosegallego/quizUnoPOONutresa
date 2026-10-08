public class Batalla {

    private String nombre;
    private String saga;
    private String ubicacion;
    private String guerrero1;
    private String guerrero2;
    private String ganador;
    private int duracionMinutos;
    private double danoTotal;
    private boolean terminoEnEmpate;
    private int espectadores;

    public Batalla() {
    }

    public Batalla(String nombre, String saga, String ubicacion, String guerrero1, String guerrero2,
                   String ganador, int duracionMinutos, double danoTotal, boolean terminoEnEmpate,
                   int espectadores) {
        this.nombre = nombre;
        this.saga = saga;
        this.ubicacion = ubicacion;
        this.guerrero1 = guerrero1;
        this.guerrero2 = guerrero2;
        this.ganador = ganador;
        this.duracionMinutos = duracionMinutos;
        this.danoTotal = danoTotal;
        this.terminoEnEmpate = terminoEnEmpate;
        this.espectadores = espectadores;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSaga() {
        return saga;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getGuerrero1() {
        return guerrero1;
    }

    public String getGuerrero2() {
        return guerrero2;
    }

    public String getGanador() {
        return ganador;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public double getDanoTotal() {
        return danoTotal;
    }

    public boolean isTerminoEnEmpate() {
        return terminoEnEmpate;
    }

    public int getEspectadores() {
        return espectadores;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSaga(String saga) {
        this.saga = saga;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setGuerrero1(String guerrero1) {
        this.guerrero1 = guerrero1;
    }

    public void setGuerrero2(String guerrero2) {
        this.guerrero2 = guerrero2;
    }

    public void setGanador(String ganador) {
        this.ganador = ganador;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public void setDanoTotal(double danoTotal) {
        this.danoTotal = danoTotal;
    }

    public void setTerminoEnEmpate(boolean terminoEnEmpate) {
        this.terminoEnEmpate = terminoEnEmpate;
    }

    public void setEspectadores(int espectadores) {
        this.espectadores = espectadores;
    }
}
