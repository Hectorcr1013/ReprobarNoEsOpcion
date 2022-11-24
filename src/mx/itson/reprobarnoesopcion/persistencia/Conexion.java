/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.reprobarnoesopcion.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Hector
 */
public class Conexion {
    
    /**
     * Obtiene una conexión hacia la base de datos utilizando los parámetros proporcionados.
     * @return La conexión inicializada hacia la base de datos.
     */
    public static Connection obtener(){
        
        Connection conexion = null;
        
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/almacen", "root", "1323");
            System.out.println("Conexion exitosa");
        } catch (Exception e) {
            System.out.println("Ocurrio un error al conectar a la base de datos: "+e);
        }
        
        return conexion;
        
    }
    
}
