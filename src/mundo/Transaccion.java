/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mundo;

/**
 *
 * @author ACER
 */
import java.util.Date;

public class Transaccion {
    
    private String id;
    private Persona persona;
    private double monto;
    private Date fecha;
    private String descripcion;

    public Transaccion(String id, double monto, Date fecha, String descripcion, Persona persona) {
        this.id = id;
        this.monto = monto;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.persona = persona;
    }

    // Getters
    public String getId() {
        return id;
    }

    public Persona getPersona() {
        return persona;
    }

    public double getMonto() {
        return monto;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    public void setDescripcion (String descripcion){
        this.descripcion += " " + descripcion;
        System.out.println("              transaccion con id " + id + " cambio descripcion a: " + this.descripcion);
    }
}

