/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mundo;

/**
 *
 * @author ACER
 */
import java.util.ArrayList;
import java.util.List;

public class SistemaBanco {
    private static SistemaBanco instancia;
    private List<Transaccion> transacciones;
    private int nGenerarReporte;
    
    private SistemaBanco() {
        transacciones = new ArrayList<>();
        nGenerarReporte = 0;
        //Simula la base de datos del banco, agrego transacciones que se consultaran para generar el reporte
    }

    public static SistemaBanco getInstance() {
        if (instancia == null) {
            instancia = new SistemaBanco();
        }
        return instancia;
    }

    public int reportarTransaccion(String idTransaccion, String idCliente){
        Transaccion temp = buscarTransaccion(idTransaccion, idCliente);
        if (temp == null) {
            return -1; //la transaccion no existe
        }
        nGenerarReporte++; //genera un id de reporte
        temp.setDescripcion("Transaccion reportada de fraude");
        return nGenerarReporte;
    }
    
    public void agregarTransaccion(Transaccion transaccion) {
        transacciones.add(transaccion);
    }

    public Transaccion buscarTransaccion(String id,String idCliente) {
        for (Transaccion transaccion : transacciones) {
            if (transaccion.getId().equals(id) && transaccion.getPersona().getCedula().equals(idCliente)) {
                return transaccion;
            }
        }
        return null; // No se encontró la transacción
    }

    public List<Transaccion> getTransacciones() {
        return new ArrayList<>(transacciones);
    }
}

