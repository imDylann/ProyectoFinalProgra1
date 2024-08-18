
package RutasEntrega;

import java.util.HashSet;


public class ListaRutasEntrega {
    private HashSet<RutaEntrega> rutas;

   
private ListaRutasEntrega() {
        rutas = new HashSet<>();
    }
private static ListaRutasEntrega listR;

public static ListaRutasEntrega getInstance(){
    if(listR==null){
        listR = new  ListaRutasEntrega();
    }
    return listR;
}


  
    public boolean actualizarRuta(String codigoRuta, String nuevaDescripcion, String nuevosDestinos) {
        for (RutaEntrega ruta : rutas) {
            if (ruta.getCodigo().equals(codigoRuta)) {
                ruta.setDescripcion(nuevaDescripcion);
                ruta.agregarDestino(nuevosDestinos);
                return true; 
            }
        }
        return false; 
    }
    
public void agregarRuta(RutaEntrega ruta) {
        rutas.add(ruta);
    }

    public void eliminarRuta(String codigoRuta) {
         rutas.removeIf(ruta -> ruta.getCodigo().equals(codigoRuta));
    }

    public RutaEntrega buscarRuta(String codigoRuta) {
        for (RutaEntrega ruta : rutas) {
            if (ruta.getCodigo().equals(codigoRuta)) {
                return ruta;
            }
        }
        return null;
    }

   
}