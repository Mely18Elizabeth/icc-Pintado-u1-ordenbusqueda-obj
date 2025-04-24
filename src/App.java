import Models.Direccion;
import Models.Persona;
import Views.ShowConsole;
import Controllers.PersonaControllers;

public class App {
    public static void main(String[] args) {
        Persona[] personas = new Persona[5];

        personas[0] = new Persona("Maria", 30, new Direccion("Calle 2", 23, 56));
        personas[1] = new Persona("Pedro", 35, new Direccion("Calle 3", 34, 67));
        personas[2] = new Persona("Ana", 28, new Direccion("Calle 4", 45, 78));
        personas[3] = new Persona("Juan", 25, new Direccion("Calle 1", 12, 45));
        personas[4] = new Persona("Luis", 40, new Direccion("Calle 5", 56, 89));

        
        ShowConsole cv = new ShowConsole();
        PersonaControllers pc= new PersonaControllers();
        PersonaControllers.sortByDireccionCodigo(personas);
        cv.printPersonas(personas);
        pc.sortByDireccionCodigo(personas);
        cv.printPersonas(personas);
        Persona personaB=pc.findByCodigo(personas, 0);
        if(personaB==null){
            System.out.println("No encontrada");
        }else{
            System.out.println("Encontrada");
            System.out.println(personaB);
        }
        
    }
}
