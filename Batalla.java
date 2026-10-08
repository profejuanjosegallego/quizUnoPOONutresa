public class Batalla {

    private String peleadorUno;
    private String peleadorDos;
    private String lugarBatalla;
    private String razonBatalla;

    public Batalla() {

    }

    public Batalla(String peleadorUno, String peleadorDos, String lugarBatalla, String razonBatalla) {
        this.peleadorUno = peleadorUno;
        this.peleadorDos = peleadorDos;
        this.lugarBatalla = lugarBatalla;
        this.razonBatalla = razonBatalla;
    }

    public String getPeleadorUno() {
        return peleadorUno;
    }

    public void setPeleadorUno(String peleadorUno) {
        this.peleadorUno = peleadorUno;
    }

    public String getPeleadorDos() {
        return peleadorDos;
    }

    public void setPeleadorDos(String peleadorDos) {
        this.peleadorDos = peleadorDos;
    }

    public String getLugarBatalla() {
        return lugarBatalla;
    }

    public void setLugarBatalla(String lugarBatalla) {
        this.lugarBatalla = lugarBatalla;
    }

    public String getRazonBatalla() {
        return razonBatalla;
    }

    public void setRazonBatalla(String razonBatalla) {
        this.razonBatalla = razonBatalla;
    }

    public void mostrarInfo() {
        System.err.println("==========================");
        System.out.println("Peleador uno: " + peleadorUno);
        System.out.println("Peleador dos: " + peleadorDos);
        System.out.println("Lugar de batalla: " + lugarBatalla);
        System.out.println("Razón de batalla: " + razonBatalla);
        System.err.println("==========================\n");
    }
}