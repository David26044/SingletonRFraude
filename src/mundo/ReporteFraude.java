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
public class ReporteFraude {
    
    private int idReporte;
    private Transaccion transaccion;
    private Date fechaReporte;
    private Persona cliente;
    private Asesor asesor;
    private String estado;

    public ReporteFraude(Date fecha, Persona cliente, Transaccion transaccion) {
        this.fechaReporte = fecha;
        this.cliente = cliente;
        estado = "En espera";
        asesor = GestorAsesores.getInstance().getAsesorAleatorio();
        this.transaccion = transaccion;
    }
    
    public boolean generarReporte(){
        System.out.println("Se genera el reporte de la transaccion " + transaccion.getId());
        estado = "en espera";
        System.out.println("    El estado del reporte paso a: " + estado);
        int temp = asesor.manejarReporte(transaccion.getId(), cliente.getCedula());
        if (temp == -1) {
            estado = "rechazado, no se encontro la transaccion";
            System.out.println("                El estado del reporte paso a: " + estado);
            return false;
        }
        estado = "aprobado, el banco se cominunicara en 5 dias laborales habiles a partir de: " + fechaReporte;
        System.out.println("                El estado del reporte paso a: " + estado + " id: " + temp);
        idReporte = temp;
        return true;
    }
    
    /**
     * @return the idReporte
     */
    public int getIdReporte() {
        return idReporte;
    }
    
    @Override
    public String toString(){
        return "El reporte se encuentra: " + estado;
    }
    
}
