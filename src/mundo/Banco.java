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
public class Banco {
    public static void main(String[] args) {
        
        // Creación de personas
        Persona persona1 = new Persona("102166", "David", "Carreño");
        Persona persona2 = new Persona("1283918", "Angela", "Parra");
        Persona persona3 = new Persona("8291830", "Camilo", "Vargas");
        
        // Creación de transacciones
        Transaccion transaccion1 = new Transaccion("12345", 1500000, new Date(124, 8, 17), "Transferencia a tienda A", persona1); // Año = 2024 - 1900, Mes = 9 - 1
        Transaccion transaccion2 = new Transaccion("67890", 500000, new Date(124, 8, 18), "Pago de servicios", persona2);
        Transaccion transaccion3 = new Transaccion("11223", 2000000, new Date(124, 8, 19), "Compra en tienda B", persona3);
        Transaccion transaccion4 = new Transaccion("44556", 1000000, new Date(124, 8, 20), "Transferencia a persona C", persona1);
        Transaccion transaccion5 = new Transaccion("77889", 800000, new Date(124, 8, 21), "Depósito de nómina", persona2);
        
        //Creacion de asesores
        Asesor asesor1 = new Asesor("Sofia", 1);
        Asesor asesor2 = new Asesor("Santiago", 2);
        Asesor asesor3 = new Asesor("Felipe", 3);
        
         //Creo el gestor de asesores y agrego asesores para que en el momento que un cliente haga una solicitud se le asifne un asesor
        GestorAsesores gestorAsesores1 = GestorAsesores.getInstance();
        System.out.println("Agrego a: " + asesor1.getNombre() + " desde gestorAsesores1");
        gestorAsesores1.addAsesor(asesor1);
        System.out.println("Agrego a: " + asesor2.getNombre() + " desde gestorAsesores1");
        gestorAsesores1.addAsesor(asesor2);

        //creo otro gestor y agrego un asesor
        GestorAsesores gestorAsesores2 = GestorAsesores.getInstance();
        System.out.println("Agrego a: " + asesor2.getNombre() + " desde gestorAsesores2");
        gestorAsesores2.addAsesor(asesor3);
        
        // Obtener el sistema de banco (Singleton)
        SistemaBanco gestorTransacciones = SistemaBanco.getInstance();
        
        // Agregar transacciones al sistema
        gestorTransacciones.agregarTransaccion(transaccion1);
        gestorTransacciones.agregarTransaccion(transaccion3);
        gestorTransacciones.agregarTransaccion(transaccion4);
        gestorTransacciones.agregarTransaccion(transaccion5);
        System.out.println("");
        persona1.reportarFraude(transaccion1);
        System.out.println("");
        persona2.reportarFraude(transaccion2);
        System.out.println("");
        persona1.reportarFraude(transaccion4);
        System.out.println("");
        persona3.reportarFraude(transaccion3);
    }
}
