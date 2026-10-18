package biblioteca.app;

import biblioteca.modelo.libro;
import biblioteca.personas.socio;

public class biblioteca {

    public static void main(String[] args) {

        libro libro = new libro("Ficciones", "Borges");
        socio socio = new socio("Martin");

        socio.prestarLibro(libro);

        System.out.println("Disponibilidad: " + libro.estaDisponible());
        System.out.println("Préstamos: " + socio.getLibrosPrestados());

        socio.devolverLibro(libro);

        System.out.println("Disponibilidad: " + libro.estaDisponible());
        System.out.println("Préstamos: " + socio.getLibrosPrestados());
    }
}