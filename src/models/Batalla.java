package models;

import java.util.UUID;

public class Batalla {

    private UUID id;
    private String guerreroUno;
    private String guerreroDos;
    private String escenario;
    private  Boolean enCurso;
    private String ganador;

    public Batalla() {
    }

    public Batalla(UUID id, String guerreroUno, String guerreroDos, String escenario, Boolean enCurso, String ganador) {
        this.id = id;
        this.guerreroUno = guerreroUno;
        this.guerreroDos = guerreroDos;
        this.escenario = escenario;
        this.enCurso = enCurso;
        this.ganador = ganador;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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

    public String getEscenario() {
        return escenario;
    }

    public void setEscenario(String escenario) {
        this.escenario = escenario;
    }

    public Boolean getEnCurso() {
        return enCurso;
    }

    public void setEnCurso(Boolean enCurso) {
        this.enCurso = enCurso;
    }

    public String getGanador() {
        return ganador;
    }

    public void setGanador(String ganador) {
        this.ganador = ganador;
    }

    
    


}
