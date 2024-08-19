/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquetes;

import Clientes.Cliente;
import java.util.HashMap;

/**
 *
 * @author PC
 */
public class ListaPaquete {
        private HashMap<String, Paquete> paquetes;

    public ListaPaquete() {
        this.paquetes = new HashMap<>();
    }

    private static ListaPaquete listP;
    
    public static ListaPaquete getInstance(){
        if(listP ==null){
            listP = new ListaPaquete();
        }
        return listP;
    }
    public void agregarPaquete(Paquete paquete) {
        paquetes.put(paquete.getCodigo(), paquete);
        System.out.println("Paquete agregado: " + paquete);
    }

    public boolean actualizarPaquete(String codigo, String descripcion, Cliente destinatario) {
       
        if (paquetes.get(codigo)!= null) {
            paquetes.get(codigo).setDescripcion(descripcion);
            paquetes.get(codigo).setDestinatario(destinatario);
            System.out.println("Paquete actualizado: " + paquetes.get(codigo));
            return true;
        } else {
            System.out.println("Paquete no encontrado.");
            return false;
        }
    }

    public boolean eliminarPaquete(String codigo) throws Exception {
      
        if (paquetes.get(codigo) != null) {
            if (paquetes.get(codigo).getTransito().equals(paquetes.get(codigo).getEstado())) {
                throw new Exception("No se puede eliminar el paquete porque está en tránsito.");
                
            }
            paquetes.remove(codigo);
            System.out.println("Paquete eliminado: " + codigo);
            return true;
        } else {
            System.out.println("Paquete no encontrado.");
            
        }
        return false;
    }

    public Paquete buscarPaquete(String codigo) {
        return paquetes.get(codigo);
    }

   
        public boolean hayPaqueteEnTransito() {
        for (Paquete paquete : paquetes.values()) {
            if (paquete.getTransito().equals(paquete.getEstado())) {
                return true;
            }
        }
        return false;
    }
}
