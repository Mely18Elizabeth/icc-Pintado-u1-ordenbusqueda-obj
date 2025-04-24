package Controllers;

import Models.Persona;

public class PersonaControllers {

public static void sortByDireccionCodigo(Persona[] personas) {
    for (int i = 0; i < personas.length; i++) {
        int index = i;
        for (int j = i + 1; j < personas.length; j++) {
            if (personas[j].equalsByCodigoDireccion(personas[index])) 
                index = j; 
        }
        if (index != i) {
            Persona temp = personas[index];
            personas[index] = personas[i];
            personas[i] = temp;
        }
    }
}


public static Persona findByCodigo(Persona[] personas, int codigo) {
    int bajo = 0;
    int alto = personas.length - 1;

    while (bajo <= alto) {
        int centro = (bajo + alto) / 2;
        int valorCentro = personas[centro].getCodigoDireccion();

        if (valorCentro == codigo) {
            return personas[centro];
        } 
        if (valorCentro > codigo) {
            bajo = centro + 1;
        } else {
            alto = centro - 1;
        }
    }
    return null;
}


    
}
