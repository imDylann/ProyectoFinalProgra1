/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clientes;

import Personas.Persona;
import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author PC
 */
public class Cliente extends Persona{
    
    public Cliente(String cedula, String nombre, LocalDate fechaNacimiento, String telefono, String correo) {
        super(cedula, nombre, fechaNacimiento, telefono, correo);
        
    }

    public Cliente() {
    }

        public int calcularEdad() {
        return Period.between(this.getFechaNacimiento(), LocalDate.now()).getYears();
    }

 
    
    
}
