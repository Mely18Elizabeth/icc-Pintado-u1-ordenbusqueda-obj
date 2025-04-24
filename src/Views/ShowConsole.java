package Views;

import Models.Persona;

public class ShowConsole {
    public void printPersonas(Persona[] personas) {
        for (Persona p : personas) {
            System.out.println(p);
        }
    }
}
