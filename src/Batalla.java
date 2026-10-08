public class Batalla {
    private String nombre;
    private String ubicacion;
    private String guerreroUno;
    private String guerreroDos;

    public Batalla() {
    }

    public Batalla(String nombre, String ubicacion, String guerreroUno, String guerreroDos) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.guerreroUno = guerreroUno;
        this.guerreroDos = guerreroDos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getGuerreroUno() {
        return guerreroUno;
    }

    public void setGuerreroUno(String guerreroUno) {
        this.guerreroUno = guerreroUno;
    }

    public String getGuerreroDos() {
        return guerreroDos;
    }

    public void setGuerreroDos(String guerreroDos) {
        this.guerreroDos = guerreroDos;
    }
}
