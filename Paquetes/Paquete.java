/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquetes;

import Clientes.Cliente;

/**
 *
 * @author PC
 */
public class Paquete {
    
    private String codigo;
    private String descripcion;
    private String peso;
    private String Cremitente;
    private String Cdestinatario;
    private String estado;
    private final String Almacen ="Almacen";
    private final String Transito = "Transito";
    private final String Completado = "Completo";
    public Paquete(String codigo, String descripcion, String peso, String remitente, String destinatario) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.peso = peso+"kg";
        this.Cremitente = remitente;
        this.Cdestinatario = destinatario;
        this.estado = Almacen;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getPeso() {
        return peso;
    }

    public String getRemitente() {
        return Cremitente;
    }

    public String getDestinatario() {
        return Cdestinatario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setDestinatario(String destinatario) {
        this.Cdestinatario = destinatario;
    }

    @Override
    public String toString() {
        return "Paquete{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", peso=" + peso + ", remitente=" + Cremitente + ", destinatario=" + Cdestinatario + ", estado=" + estado + '}';
    }

    public String getAlmacen() {
        return Almacen;
    }

    public String getTransito() {
        return Transito;
    }

    public String getCompletado() {
        return Completado;
    }


}