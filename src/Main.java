import models.Batalla;
import models.GuerreroZ;
import models.Transformacion;
import java.util.UUID;

public class Main {

    
    public static void main(String[] args) {
        
        GuerreroZ guerreroUno = new GuerreroZ();
        Batalla batalla = new Batalla();
        Transformacion transfor =new Transformacion();


        guerreroUno.setId(UUID.randomUUID());
        guerreroUno.setNombre("Goku");
        guerreroUno.setColorCabello("Negro");
        guerreroUno.setRaza("Sayayin");
        guerreroUno.setAtaque(1500);
        guerreroUno.setDefensa(2500);
        guerreroUno.setKiActual(1000);
        guerreroUno.setKiMaximo(2000);
        guerreroUno.setNivelPelea(5);

        batalla.setId(UUID.randomUUID());
        batalla.setGuerreroUno("Goku");
        batalla.setGuerreroDos("Vegeta");
        batalla.setEnCurso(true);
        batalla.setEscenario("Arena torneo de fuerza");
        batalla.setGanador("Goku");
        
        transfor.setId(UUID.randomUUID());
        transfor.setNombre("Super Sayayin");
        transfor.setSeTransforma (true);


        GuerreroZ guerreroDos = new GuerreroZ (UUID.randomUUID(), "Vegueta", "Sayayin", 1500, 2500, "Negro", 1000, 2000, 5);
        Batalla batallaDos = new Batalla (UUID.randomUUID(), "Pikoro", "Goten","Arena Cel", true, "Pikoro");
        Transformacion transformacion = new Transformacion(UUID.randomUUID(),true,"Goten");

        System.out.println("Informacion del Guerrero 1");
        System.out.println("ID: " + guerreroUno.getId());
        System.out.println("Nombre: " + guerreroUno.getNombre());
        System.out.println("Raza: " + guerreroUno.getRaza());
        System.out.println("Ataque: " + guerreroUno.getAtaque());
        System.out.println("Defensa: " + guerreroUno.getDefensa());
        System.out.println("Ki Actual: " + guerreroUno.getKiActual());
        System.out.println("Ki Máximo: " + guerreroUno.getKiMaximo());
        System.out.println("Nivel de Pelea: " + guerreroUno.getNivelPelea());

        System.out.println("Informacion del Guerrero 2");
        System.out.println("ID: " + guerreroDos.getId());
        System.out.println("Nombre: " + guerreroDos.getNombre());
        System.out.println("Raza: " + guerreroDos.getRaza());
        System.out.println("Ataque: " + guerreroDos.getAtaque());
        System.out.println("Defensa: " + guerreroDos.getDefensa());
        System.out.println("Ki Actual: " + guerreroDos.getKiActual());
        System.out.println("Ki Máximo: " + guerreroDos.getKiMaximo());
        System.out.println("Nivel de Pelea: " + guerreroDos.getNivelPelea());

        System.out.println("Informacion de la Batalla 1");
        System.out.println("ID: " + batalla.getId());
        System.out.println("Guerrero 1: " + batalla.getGuerreroUno());
        System.out.println("Guerrero 2: " + batalla.getGuerreroDos());
        System.out.println("Escenario: " + batalla.getEscenario());
        System.out.println("En Curso: " + batalla.getEnCurso());
        System.out.println("Ganador: " + batalla.getGanador());

        System.out.println("Informacion de la Batalla 2");
        System.out.println("ID: " + batallaDos.getId());
        System.out.println("Guerrero 1: " + batallaDos.getGuerreroUno());
        System.out.println("Guerrero 2: " + batallaDos.getGuerreroDos());
        System.out.println("Escenario: " + batallaDos.getEscenario());
        System.out.println("En Curso: " + batallaDos.getEnCurso());
        System.out.println("Ganador: " + batallaDos.getGanador());



    }

}
