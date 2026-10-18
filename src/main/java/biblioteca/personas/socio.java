package biblioteca.personas;

import biblioteca.modelo.libro;

public class socio {

    private String nombre;
    private int librosPrestados;

    public socio(String nombre) {
        this.nombre = nombre;
        this.librosPrestados = 0;
    }

    public int getLibrosPrestados() {
        return librosPrestados;
    }

    public void prestarLibro(libro libro) {

        if (libro == null) {
            System.out.println("No hay libro para prestar");

        } else if (!libro.estaDisponible()) {
            System.out.println(libro.getTitulo()
                    + " no está disponible");

        } else {
            libro.prestar();
            librosPrestados++;

            System.out.println(nombre + " recibió "
                    + libro.getTitulo());
        }
    }

    public void devolverLibro(libro libro) {

        if (libro == null) {
            System.out.println("No hay libro para devolver");

        } else if (librosPrestados <= 0) {
            System.out.println("No hay préstamos registrados");

        } else if (libro.estaDisponible()) {
            System.out.println("El libro ya está disponible");

        } else {
            libro.devolver();
            librosPrestados--;

            System.out.println(nombre + " devolvió "
                    + libro.getTitulo());
        }
    }
}