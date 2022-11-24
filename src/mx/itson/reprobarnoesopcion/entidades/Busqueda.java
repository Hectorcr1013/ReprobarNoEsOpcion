/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.reprobarnoesopcion.entidades;

import java.util.ArrayList;
import java.util.List;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import mx.itson.reprobarnoesopcion.persistencia.Conexion;
import mx.itson.reprobarnoesopcion.ui.Buscar;

/**
 *
 * @author Hector
 */
public class Busqueda {

    private String modelo;
    private String color;
    private int numero;
    private String tipo;
    private String sexo;
    private int precio;
    DefaultTableModel model1;
    
    /**
     * 
     */
    public void obtenerTodos(){
        
        String consulta = "SELECT * FROM almacen.buscar";
        
        try {
            
            Connection conexion = Conexion.obtener();
            Statement statement = conexion.createStatement();
            ResultSet resultSet = statement.executeQuery(consulta);
            
            Object[] busqueda = new Object[6];
            model1 = (DefaultTableModel) Buscar.tblBuscar.getModel();
            
            while(resultSet.next()){
                busqueda [0] = resultSet.getString("Modelo");
                busqueda [1] = resultSet.getString("Color");
                busqueda [2] = resultSet.getInt("Numero");
                busqueda [3] = resultSet.getString("Tipo");
                busqueda [4] = resultSet.getString("Sexo");
                busqueda [5] = resultSet.getInt("Precio");
                
                model1.addRow(busqueda);
            }
            Buscar.tblBuscar.setModel(model1);
            
        } catch (Exception e) {
            System.out.println("Ocurrio un error: " + e.getMessage());
        }
    }
    
    /**
     * 
     * @param modelo
     * @param color
     * @param numero
     * @param tipo
     * @param sexo
     * @param precio
     * @return 
     */
    public static boolean guardar(String modelo, String color, int numero, String tipo, String sexo, int precio){
        boolean resultado = false;
        try {
            
           String consulta = "INSERT INTO almacen.buscar (Modelo, Color, Numero, Tipo, Sexo, Precio) VALUES (?, ?, ?, ?, ?, ?)";
           Connection conexion = Conexion.obtener();
           PreparedStatement statement = conexion.prepareStatement(consulta, Statement.RETURN_GENERATED_KEYS);
           statement.setString(1, modelo);
           statement.setString(2, color);
           statement.setInt(3, numero);
           statement.setString(4, tipo);
           statement.setString(5, sexo);
           statement.setInt(6, precio);
           statement.executeUpdate();
           
           resultado = statement.getUpdateCount() == 1;
           
        } catch (Exception e) {
            System.out.println("Ocurrio un error al agregar la fila: " + e);
        }
        return resultado;
    }
    
    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the precio
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
}
