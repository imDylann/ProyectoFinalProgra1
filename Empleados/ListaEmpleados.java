
package Empleados;

import java.util.List;


public class ListaEmpleados {
     private List<Empleado> empleados;
     
       public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }
       
      public void  eliminarEmpleado(String id) {
         empleados.removeIf(e -> e.getCedula().equals(id));
   
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
}
