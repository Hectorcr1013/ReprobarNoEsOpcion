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
    
    public static Connection obtener(){
        
        Connection conexion = null;
        
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/ReprobarNoEsOpcion?user=root&password=1323");
        } catch (Exception e) {
            System.out.println("Ocurrio un error"+e);
        }
        
        return conexion;
        
    }
    
}
