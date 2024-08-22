/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Envios;

import Clientes.Cliente;
import Paquetes.Paquete;
import RutasEntrega.RutaEntrega;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
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
    private PropertyChangeSupport support;

    private GestionEnvios() {
        this.colaEnvios = new LinkedList<>();
        this.listaEnvios = new ArrayList<>();
           support = new PropertyChangeSupport(this);
    }
    private static GestionEnvios gestionenvios;
    
    public static GestionEnvios getInstance(){
        if(gestionenvios==null){
           gestionenvios= new GestionEnvios(); 
        }return gestionenvios;
    }

    public void registrarEnvio(Envio nuevoEnvio) {
        
        colaEnvios.add(nuevoEnvio);
       listaEnvios.add(nuevoEnvio);
        support.firePropertyChange("listaEnvios", null, listaEnvios);
        
   }
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        support.removePropertyChangeListener(listener);
    }
    
    public Envio buscarEnvio(int numeroEnvio) {
        for (Envio envio : listaEnvios) {
            if (envio.getNumeroEnvio() == numeroEnvio) {
                return envio;
            }
        }
        return null; // Envío no encontrado
    }

    public void despacharEnvio() {
        Envio envio = colaEnvios.poll();
            envio.despachar();
           buscarEnvio(envio.getNumeroEnvio()).despachar();
                     support.firePropertyChange("listaEnvios", null, listaEnvios);
        
    }

    public void entregarEnvio(int numeroEnvio) {
         buscarEnvio(numeroEnvio).entregar();
            support.firePropertyChange("listaEnvios", null, listaEnvios);
        
    }

    public void cancelarEnvio(int numeroEnvio) {
      Envio envio = buscarEnvio(numeroEnvio);
              buscarEnvio(numeroEnvio).cancelar();
        colaEnvios.remove(envio);
                     support.firePropertyChange("listaEnvios", null, listaEnvios);
        
    }

    public void procesarColaEnvios() {
        while (!colaEnvios.isEmpty()) {
            Envio envio = colaEnvios.poll();
            System.out.println("Procesando envío: " + envio);
        }
    }

    public List<Envio> getListaEnvios() {
        return listaEnvios;
    }
           public int getCantidadEnviosNoNulos() {
        int count = 0;
        for (Envio c : listaEnvios) {
            if (c != null) {
                count++;
            }
        }
        return count;
    }
}