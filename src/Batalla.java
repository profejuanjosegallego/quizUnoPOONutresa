public class Batalla {

    private String nombre;
    private String ganador;
    private int duracionMinutos;
    private boolean terminoEnEmpate;


    public Batalla() {
    }

   
    public Batalla(String nombre, String ganador, int duracionMinutos, boolean terminoEnEmpate) {
        this.nombre = nombre;
        this.ganador = ganador;
        this.duracionMinutos = duracionMinutos;
        this.terminoEnEmpate = terminoEnEmpate;
    }

   
    public String getNombre() { return nombre; }
    public String getGanador() { return ganador; }
    public int getDuracionMinutos() { return duracionMinutos; }
    public boolean isTerminoEnEmpate() { return terminoEnEmpate; }

   
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setGanador(String ganador) { this.ganador = ganador; }
    public void setDuracionMinutos(int duracionMinutos) { this.duracionMinutos = duracionMinutos; }
    public void setTerminoEnEmpate(boolean terminoEnEmpate) { this.terminoEnEmpate = terminoEnEmpate; }
}