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
    private double peso;
    private Cliente remitente;
    private Cliente destinatario;
    private String estado;

    public Paquete(String codigo, String descripcion, double peso, Cliente remitente, Cliente destinatario) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.peso = peso;
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.estado = "En almacén";
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPeso() {
        return peso;
    }

    public Cliente getRemitente() {
        return remitente;
    }

    public Cliente getDestinatario() {
        return destinatario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Paquete{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", peso=" + peso + ", remitente=" + remitente + ", destinatario=" + destinatario + ", estado=" + estado + '}';
    }


}