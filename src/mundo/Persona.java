/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mundo;

import java.util.Date;

/**
 *
 * @author ACER
 */
public class Persona {

    private String cedula;
    private String nombre;
    private String apellido;

    public Persona(String cedula, String nombre, String apellido) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    /*
    El cliente comienza solicitando la tarjeta, un cliente puede hacer muchas solicitudes
    solo si son negadas, luego de que sea aprovada ya no podrá hacer mas solicitudes.
    */
    public boolean reportarFraude(Transaccion transaccion){
        System.out.println("Cliente "+ nombre +" quiere reportar transaccion con id: " + transaccion.getId());
        ReporteFraude reporteFraude = new ReporteFraude(transaccion.getFecha(), this, transaccion);
        return reporteFraude.generarReporte();
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
    
}
