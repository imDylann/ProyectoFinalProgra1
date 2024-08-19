
package Empleados;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;


public class ListaEmpleados {
     private List<Empleado> empleados;
     private PropertyChangeSupport support;
     private ListaEmpleados() {
        this.empleados = new ArrayList<>() ;
         support = new PropertyChangeSupport(this);
    }
     
     private static ListaEmpleados listP;
     
     public static ListaEmpleados getInstance(){
         if(listP==null){
             listP = new ListaEmpleados();
         }
         return listP;
     }
       public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
           support.firePropertyChange("empleados", null, empleados);
    }
       
      public void  eliminarEmpleado(String id) {
         empleados.removeIf(e -> e.getCedula().equals(id));
              support.firePropertyChange("empleados", null, empleados);
   
      }
  
    public Empleado buscarEmpleado(String id) {
       for(Empleado empleado:empleados){
           if(empleado.getCedula().equals(id)){
               return empleado;
           }
       }
       return null;
    }
        public boolean actualizarEmpleado(String id, String nuevoTelefono, String nuevoCorreo, String nuevoPuesto, Double salario) {
        for (Empleado empleado : empleados) {
            if (empleado.getCedula().equals(id)) {
                empleado.setTelefono(nuevoTelefono);
                empleado.setCorreo(nuevoCorreo);
                empleado.setPuesto(nuevoPuesto);
                empleado.setSalario(salario);
                return true; 
            }
        }
        return false; 
    }
             public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        support.removePropertyChangeListener(listener);
    }
        public int getCantidadEmpleadosNoNulos() {
        int count = 0;
        for (Empleado c : empleados) {
            if (c != null) {
                count++;
            }
        }
        return count;
    }
}

