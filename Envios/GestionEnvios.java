/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Envios;

import Clientes.Cliente;
import Paquetes.Paquete;
import RutasEntrega.RutaEntrega;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author ASUS
 */
public class GestionEnvios {
    private Queue<Envio> colaEnvios;
    private List<Envio> listaEnvios;

    public GestionEnvios() {
        this.colaEnvios = new LinkedList<>();
        this.listaEnvios = new ArrayList<>();
    }

    public void registrarEnvio(Cliente cliente, Paquete paquete, RutaEntrega ruta, LocalDate fechaEnvio, LocalDate fechaEntrega) {
        Envio nuevoEnvio = new Envio(cliente, paquete, ruta, fechaEnvio, fechaEntrega);
        colaEnvios.add(nuevoEnvio);
        listaEnvios.add(nuevoEnvio);
    }

    public Envio buscarEnvio(int numeroEnvio) {
        for (Envio envio : listaEnvios) {
            if (envio.getNumeroEnvio() == numeroEnvio) {
                return envio;
            }
        }
        return null; // Envío no encontrado
    }

    public void despacharEnvio(int numeroEnvio) {
        Envio envio = buscarEnvio(numeroEnvio);
        if (envio != null) {
            envio.despachar();
        }
    }

    public void entregarEnvio(int numeroEnvio) {
        Envio envio = buscarEnvio(numeroEnvio);
        if (envio != null) {
            envio.entregar();
        }
    }

    public void cancelarEnvio(int numeroEnvio) {
        Envio envio = buscarEnvio(numeroEnvio);
        if (envio != null) {
            envio.cancelar();
        }
    }

    public void procesarColaEnvios() {
        while (!colaEnvios.isEmpty()) {
            Envio envio = colaEnvios.poll();
            System.out.println("Procesando envío: " + envio);
        }
    }
}