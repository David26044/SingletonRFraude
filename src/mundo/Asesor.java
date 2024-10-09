/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mundo;

/**
 *
 * @author ACER
 */
public class Asesor {

    private String nombre;
    private int codEmpleado;

    public Asesor(String nombre, int codEmpleado) {
        this.nombre = nombre;
        this.codEmpleado = codEmpleado;
    }

    //El asesor pide al sistema que procese la solicitud, retornara null si el sistema no la aprobo o != null si la aprobo
    public int manejarReporte(String idTransaccion, String cedulaCliente) {
        System.out.println("            Asesor " + nombre + " le pide al sistema que busque y cambie el estado de la transaccion");
        return SistemaBanco.getInstance().reportarTransaccion(idTransaccion, cedulaCliente);

    }

    public String getNombre() {
        return nombre;
    }

    public int getCodEmpleado() {
        return codEmpleado;
    }

}
