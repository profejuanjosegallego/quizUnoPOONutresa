public class Transformacion {

    private int fase;
    private int multiplicadorPoder;
    private String colorCabello;
    private double kiNecesario;

    public Transformacion() {

    }

    public Transformacion(int fase, int multiplicadorPoder, String colorCabello, double kiNecesario) {
        this.fase = fase;
        this.multiplicadorPoder = multiplicadorPoder;
        this.colorCabello = colorCabello;
        this.kiNecesario = kiNecesario;
    }

    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }

    public int getMultiplicadorPoder() {
        return multiplicadorPoder;
    }

    public void setMultiplicadorPoder(int multiplicadorPoder) {
        this.multiplicadorPoder = multiplicadorPoder;
    }

    public String getColorCabello() {
        return colorCabello;
    }

    public void setColorCabello(String colorCabello) {
        this.colorCabello = colorCabello;
    }

    public double getKiNecesario() {
        return kiNecesario;
    }

    public void setKiNecesario(double kiNecesario) {
        this.kiNecesario = kiNecesario;
    }

    public void mostrarInfo() {
        System.err.println("==========================");
        System.out.println("Fase: " + fase);
        System.out.println("Multiplicador de poder: " + multiplicadorPoder);
        System.out.println("Color de cabello: " + colorCabello);
        System.out.println("Ki necesario: " + kiNecesario);
        System.err.println("==========================\n");
    }
}