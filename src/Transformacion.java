public class Transformacion {

    private String nombre;
    private String colorAura;
    private double multiplicadorPoder;
    private boolean permanente;

    
    public Transformacion() {
    }

   
    public Transformacion(String nombre, String colorAura, double multiplicadorPoder, boolean permanente) {
        this.nombre = nombre;
        this.colorAura = colorAura;
        this.multiplicadorPoder = multiplicadorPoder;
        this.permanente = permanente;
    }

  
    public String getNombre() { return nombre; }
    public String getColorAura() { return colorAura; }
    public double getMultiplicadorPoder() { return multiplicadorPoder; }
    public boolean isPermanente() { return permanente; }

  
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setColorAura(String colorAura) { this.colorAura = colorAura; }
    public void setMultiplicadorPoder(double multiplicadorPoder) { this.multiplicadorPoder = multiplicadorPoder; }
    public void setPermanente(boolean permanente) { this.permanente = permanente; }
}