/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Envios;

import Clientes.Cliente;
import Paquetes.Paquete;
import RutasEntrega.RutaEntrega;
import java.time.LocalDate;

/**
 *
 * @author PC
 */

public class Envio {
    private static int contadorEnvios = 0;
    private int numeroEnvio;
    private Cliente cliente;
    private Paquete paquete;
    private RutaEntrega ruta;
    private LocalDate fechaEnvio;
    private LocalDate fechaEntrega;
    private double precio;

    public Envio(Cliente cliente, Paquete paquete, RutaEntrega ruta, LocalDate fechaEnvio, LocalDate fechaEntrega, double precio) {
        this.numeroEnvio = ++contadorEnvios;
        this.cliente = cliente;
        this.paquete = paquete;
        this.ruta = ruta;
        this.fechaEnvio = fechaEnvio;
        this.fechaEntrega = fechaEntrega;
        this.precio = precio;
    }

    // Getters y setters...
}