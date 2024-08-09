/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleados;

import Personas.Persona;
import java.time.LocalDate;

/**
 *
 * @author PC
 */
public class Empelado extends Persona {

     private String puesto;
    private double salario;

    public Empelado(String puesto, double salario, String cedula, String nombre, LocalDate fechaNacimiento, String telefono, String correo) {
        super(cedula, nombre, fechaNacimiento, telefono, correo);
        this.puesto = puesto;
        this.salario = salario;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
   
}
