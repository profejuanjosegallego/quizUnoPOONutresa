import java.util.UUID;

public class Transformacion {

    UUID id;
    private String nombreFase;
    private Integer multiplicadorPoder;
    private Integer costoKiPorSegundo;
    private Integer requisitoIra;
    
    public Transformacion() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNombreFase() {
        return nombreFase;
    }

    public void setNombreFase(String nombreFase) {
        this.nombreFase = nombreFase;
    }

    public Integer getMultiplicadorPoder() {
        return multiplicadorPoder;
    }

    public void setMultiplicadorPoder(Integer multiplicadorPoder) {
        this.multiplicadorPoder = multiplicadorPoder;
    }

    public Integer getCostoKiPorSegundo() {
        return costoKiPorSegundo;
    }

    public void setCostoKiPorSegundo(Integer costoKiPorSegundo) {
        this.costoKiPorSegundo = costoKiPorSegundo;
    }

    public Integer getRequisitoIra() {
        return requisitoIra;
    }

    public void setRequisitoIra(Integer requisitoIra) {
        this.requisitoIra = requisitoIra;
    }

    

}
