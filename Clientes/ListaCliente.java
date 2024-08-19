/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clientes;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class ListaCliente {
    
private ArrayList<Cliente> clientes;
private PropertyChangeSupport support;
private ListaCliente() {
        this.clientes = new ArrayList<>() ;
              support = new PropertyChangeSupport(this);
    }
    private static ListaCliente listC;
    public static ListaCliente getInstance(){
        if(listC==null){
            listC = new ListaCliente();
        }
        return listC;
    }
    public void AddCliente(Cliente c){
        clientes.add(c);
           support.firePropertyChange("clientes", null, clientes);
    }

    public boolean DeleteCliente(String id){
            for(Cliente c:clientes){
                if(c.getCedula().equals(id)){
                    if(!c.getPaquetes().hayPaqueteEnTransito()){
                        clientes.remove(c);
                           support.firePropertyChange("clientes", null, clientes);
                        return true;
                    }
                }
            }
            return false;
    }
    
    public Cliente SearchCliente(String id){
         for(Cliente c:clientes){
                if(c.getCedula().equals(id)){
                    return c;
                 }}
         return null;
    }
      public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        support.removePropertyChangeListener(listener);
    }
        public int getCantidadClientesNoNulos() {
        int count = 0;
        for (Cliente c : clientes) {
            if (c != null) {
                count++;
            }
        }
        return count;
    }
        
}
