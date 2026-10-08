public class GuerreroZ {

    private String nombre;
    private String raza;
    private long nivelDePoder;
    private boolean vivo;

    
    public GuerreroZ() {
    }

   
    public GuerreroZ(String nombre, String raza, long nivelDePoder, boolean vivo) {
        this.nombre = nombre;
        this.raza = raza;
        this.nivelDePoder = nivelDePoder;
        this.vivo = vivo;
    }

   
    public String getNombre() { return nombre; }
    public String getRaza() { return raza; }
    public long getNivelDePoder() { return nivelDePoder; }
    public boolean isVivo() { return vivo; }

   
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setRaza(String raza) { this.raza = raza; }
    public void setNivelDePoder(long nivelDePoder) { this.nivelDePoder = nivelDePoder; }
    public void setVivo(boolean vivo) { this.vivo = vivo; }
}