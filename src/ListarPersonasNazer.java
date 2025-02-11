import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListarPersonasNazer {
    public static void main(String[] args) {
        
        // creo instancias de personas
        Persona persona1 = new Persona("Juan", "Perez");
        Persona persona2 = new Persona("Pablo", "Ramirez");
        Persona persona3 = new Persona("Lucia", "Gonzalez");
        Persona persona4 = new Persona("Agus", "Lopes");
        Persona persona5 = new Persona("Maria", "Fernandez");
        
    
        // Creo la lista, y agrego las personas a ella
        List<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(persona1);
        listaPersonas.add(persona2);
        listaPersonas.add(persona3);
        listaPersonas.add(persona4);
        listaPersonas.add(persona5);

        //mosrtar con un for in la lista para ver si funciona.
        // for(Persona individuo : listaPersonas){
        // System.out.println(individuo.getNombre());
        // }
        
        // ordenado por nombre(A-Z)-
        listaPersonas.sort(Comparator.comparing(Persona::getNombre));

        System.out.println("\nOrdenado por Nombre (A-Z):");
        for (Persona individuo : listaPersonas) {
        System.out.println(individuo.getNombre());
        }

        // ordenado por apellido(A-Z)
        listaPersonas.sort(Comparator.comparing(Persona::getApellido));

        System.out.println("\nOrdenado por Apellido (A-Z):");
        for (Persona individuo : listaPersonas) {
        System.out.println(individuo.getApellido());
        }

        // ordenado por apellido inverso(Z-A)
        listaPersonas.sort(Comparator.comparing(Persona::getApellido).reversed());

        System.out.println("\nOrdenado por Apellido inverso (Z-A):");
        for (Persona individuo : listaPersonas) {
        System.out.println(individuo.getApellido());
        }
//entregado el 11 feb 25

    }

    
}
