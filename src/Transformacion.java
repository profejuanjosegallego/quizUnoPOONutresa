public class Transformacion {

    private String nombre;
    private Boolean esPermanente;
    private Integer duracion;
    private String colorAura;

    public Transformacion() {
    }

    public Transformacion(String nombre, Boolean esPermanente, Integer duracion, String colorAura) {
        this.nombre = nombre;
        this.esPermanente = esPermanente;
        this.duracion = duracion;
        this.colorAura = colorAura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getEsPermanente() {
        return esPermanente;
    }

    public void setEsPermanente(Boolean esPermanente) {
        this.esPermanente = esPermanente;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public String getColorAura() {
        return colorAura;
    }

    public void setColorAura(String colorAura) {
        this.colorAura = colorAura;
    }

}
