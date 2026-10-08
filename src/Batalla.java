public class Batalla {

    private String nombreLugar;
    private int duracionMinutos;
    private String ganador;
    private String perdedor;

    public Batalla() {
    }

    public Batalla(String nombreLugar, int duracionMinutos, String ganador, String perdedor) {
        this.nombreLugar = nombreLugar;
        this.duracionMinutos = duracionMinutos;
        this.ganador = ganador;
        this.perdedor = perdedor;
    }

    public String getNombreLugar() { return nombreLugar; }
    public void setNombreLugar(String nombreLugar) { this.nombreLugar = nombreLugar; }

    public int getDuracionMinutos() { return duracionMinutos; }
    public void setDuracionMinutos(int duracionMinutos) { this.duracionMinutos = duracionMinutos; }

    public String getGanador() { return ganador; }
    public void setGanador(String ganador) { this.ganador = ganador; }

    public String getPerdedor() { return perdedor; }
    public void setPerdedor(String perdedor) { this.perdedor = perdedor; }
}