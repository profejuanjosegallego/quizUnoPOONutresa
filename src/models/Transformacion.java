package models;

import java.util.UUID;

public class Transformacion {

    private UUID id;
    private Boolean seTransforma;
    private String nombre;

    
    public Transformacion() {
    }


    public Transformacion(UUID id, Boolean seTransforma, String nombre) {
        this.id = id;
        this.seTransforma = seTransforma;
        this.nombre = nombre;
    }


    public UUID getId() {
        return id;
    }


    public void setId(UUID id) {
        this.id = id;
    }


    public Boolean getSeTransforma() {
        return seTransforma;
    }


    public void setSeTransforma(Boolean seTransforma) {
        this.seTransforma = seTransforma;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    


}
