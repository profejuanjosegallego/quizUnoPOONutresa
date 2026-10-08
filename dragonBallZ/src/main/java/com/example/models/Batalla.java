import java.util.UUID;

public class Batalla {

    UUID id;
    private String ubicacion;
    private String duracionTiempo;
    private String danoAmbiental;
    private String estadoGanador;

    public Batalla() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDuracionTiempo() {
        return duracionTiempo;
    }

    public void setDuracionTiempo(String duracionTiempo) {
        this.duracionTiempo = duracionTiempo;
    }

    public String getDanoAmbiental() {
        return danoAmbiental;
    }

    public void setDanoAmbiental(String danoAmbiental) {
        this.danoAmbiental = danoAmbiental;
    }

    public String getEstadoGanador() {
        return estadoGanador;
    }

    public void setEstadoGanador(String estadoGanador) {
        this.estadoGanador = estadoGanador;
    }

    
}
