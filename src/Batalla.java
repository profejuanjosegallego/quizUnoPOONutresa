public class Batalla {

    private String lugar;
    private String ganador;
    private Integer duracion;
    private Boolean usoEsferasDragon;

    public Batalla() {
    }

    public Batalla(String lugar, String ganador, Integer duracion, Boolean usoEsferasDragon) {
        this.lugar = lugar;
        this.ganador = ganador;
        this.duracion = duracion;
        this.usoEsferasDragon = usoEsferasDragon;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getGanador() {
        return ganador;
    }

    public void setGanador(String ganador) {
        this.ganador = ganador;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public Boolean getUsoEsferasDragon() {
        return usoEsferasDragon;
    }

    public void setUsoEsferasDragon(Boolean usoEsferasDragon) {
        this.usoEsferasDragon = usoEsferasDragon;
    }

}
