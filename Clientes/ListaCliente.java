/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clientes;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class ListaCliente {
    
private ArrayList<Cliente> clientes;

    public ListaCliente(ArrayList<Cliente> clientes) {
        this.clientes = new ArrayList<>() ;
    }

    public void AddCliente(Cliente c){
        clientes.add(c);
    }

    public boolean DeleteCliente(String id){
            for(Cliente c:clientes){
                if(c.getCedula().equals(id)){
                    if(!c.getPaquetes().hayPaqueteEnTransito()){
                        clientes.remove(c);
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
}
