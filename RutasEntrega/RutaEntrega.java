/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RutasEntrega;


import java.util.HashSet;
import java.util.Set;

public class RutaEntrega {
    private String codigo;
    private String nombre;
    private String descripcion;
    private Set<String> destinos;

    public RutaEntrega(String codigo, String nombre, String descripcion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.destinos = new HashSet<>();
    }

    public void agregarDestino(String destino) {
        destinos.add(destino);
    }

    public void BorrarDestinoString(String destino) {
        destinos.remove(destino);
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Set<String> getDestinos() {
        return destinos;
    }
    
}