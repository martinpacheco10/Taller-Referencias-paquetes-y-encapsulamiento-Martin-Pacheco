/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aerolinea.app;
import aerolinea.modelo.vuelo;
import aerolinea.modelo.pasajero;

/**
 *
 * @author LENOVO
 */
public class aerolinea {
    public static void main(String[] args) {

        // Creamos el vuelo
        vuelo vuelo = new vuelo("AV-204", "Cartagena", 2);

        // Creamos los pasajeros
        pasajero p1 = new pasajero("Sara");
        pasajero p2 = new pasajero("Tomás");
        pasajero p3 = new pasajero("Lina");

        // Mostramos la reserva inicial de Lina
        p3.mostrarReserva();

        // Los pasajeros intentan reservar en este orden
        p1.reservar(vuelo);
        p2.reservar(vuelo);
        p3.reservar(vuelo);

        // Mostramos las sillas restantes
        System.out.println(vuelo.getSillasDisponibles());

        // Cambiamos el destino
        vuelo.setDestino("Santa Marta");

        // Mostramos las reservas actualizadas
        p1.mostrarReserva();
        p2.mostrarReserva();
        p3.mostrarReserva();

        // Comprobamos si Sara y Tomás tienen el mismo objeto Vuelo
        System.out.println(p1.getVuelo() == p2.getVuelo());
    }
}
