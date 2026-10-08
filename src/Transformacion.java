public class Transformacion {

    private String nombreFase;
    private double multiplicadorKi;
    private String colorCabello;
    private String colorAura;

    public Transformacion() {
    }

    public Transformacion(String nombreFase, double multiplicadorKi, String colorCabello, String colorAura) {
        this.nombreFase = nombreFase;
        this.multiplicadorKi = multiplicadorKi;
        this.colorCabello = colorCabello;
        this.colorAura = colorAura;
    }

    public String getNombreFase() { return nombreFase; }
    public void setNombreFase(String nombreFase) { this.nombreFase = nombreFase; }

    public double getMultiplicadorKi() { return multiplicadorKi; }
    public void setMultiplicadorKi(double multiplicadorKi) { this.multiplicadorKi = multiplicadorKi; }

    public String getColorCabello() { return colorCabello; }
    public void setColorCabello(String colorCabello) { this.colorCabello = colorCabello; }

    public String getColorAura() { return colorAura; }
    public void setColorAura(String colorAura) { this.colorAura = colorAura; }
}