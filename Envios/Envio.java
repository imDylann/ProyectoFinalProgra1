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
       private String estado;

    public Envio(Cliente cliente, Paquete paquete, RutaEntrega ruta, LocalDate fechaEnvio, LocalDate fechaEntrega) {
        this.numeroEnvio = ++contadorEnvios;
        this.cliente = cliente;
        this.paquete = paquete;
        this.ruta = ruta;
        this.fechaEnvio = fechaEnvio;
        this.fechaEntrega = fechaEntrega;
      this.precio = calcularPrecio(paquete.getPeso());
         this.estado = "En almacén";
    }

  private double calcularPrecio(double peso) {
        return 2100 + (peso > 1 ? (peso - 1) * 1200 : 0);
    }

    public static int getContadorEnvios() {
        return contadorEnvios;
    }

    public int getNumeroEnvio() {
        return numeroEnvio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Paquete getPaquete() {
        return paquete;
    }

    public RutaEntrega getRuta() {
        return ruta;
    }

    public LocalDate getFechaEnvio() {
        return fechaEnvio;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public double getPrecio() {
        return precio;
    }

    // Getters y Setters
    public String getEstado() {
        return estado;
    }

    public void despachar() {
        if (this.estado.equals("En almacén")) {
            this.estado = "Despachado";
        }
    }

    public void entregar() {
        if (this.estado.equals("Despachado")) {
            this.estado = "Entregado";
        }
    }

    public void cancelar() {
        if (this.estado.equals("En almacén")) {
            this.estado = "Cancelado";
        }
    }

    @Override
    public String toString() {
        return "Envio{" +
                "numeroEnvio=" + numeroEnvio +
                ", cliente=" + cliente.getNombre() +
                ", paquete=" + paquete.getDescripcion() +
                ", ruta=" + ruta.getDescripcion() +
                ", fechaEnvio=" + fechaEnvio +
                ", fechaEntrega=" + fechaEntrega +
                ", precioEnvio=" + precio +
                ", estado='" + estado + '\'' +
                '}';
    }
}