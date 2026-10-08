public class GuerreroZ {

    private String nombre;
    private String planetaOrigen;
    private Integer edad;
    private Integer nivel;

    public GuerreroZ() {
    }

    public GuerreroZ(String nombre, String planetaOrigen, Integer edad, Integer nivel) {
        this.nombre = nombre;
        this.planetaOrigen = planetaOrigen;
        this.edad = edad;
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPlanetaOrigen() {
        return planetaOrigen;
    }

    public void setPlanetaOrigen(String planetaOrigen) {
        this.planetaOrigen = planetaOrigen;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

}
