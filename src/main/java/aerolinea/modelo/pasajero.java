/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aerolinea.modelo;

/**
 *
 * @author LENOVO
 */
public class pasajero {
     private String nombre;
    private vuelo vuelo;

    public pasajero(String nombre) {
        this.nombre = nombre;
        this.vuelo = null;
    }

    public vuelo getVuelo() {
        return vuelo;
    }

    public void reservar(vuelo vuelo) {

        if (vuelo == null) {
            System.out.println(nombre + ": no hay vuelo");

        } else if (vuelo.reservarSilla()) {

            this.vuelo = vuelo;

            System.out.println(nombre + " reservó en "
                    + vuelo.getCodigo());

        } else {
            System.out.println(nombre + ": vuelo "
                    + vuelo.getCodigo() + " lleno");
        }
    }

    public void mostrarReserva() {

        if (vuelo == null) {
            System.out.println(nombre + ": sin reserva");

        } else {
            System.out.println(nombre + " viaja a "
                    + vuelo.getDestino());
        }
    }
}
