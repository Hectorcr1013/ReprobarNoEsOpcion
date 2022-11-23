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
import mx.itson.reprobarnoesopcion.persistencia.Conexion;

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
    
    /**
     * 
     * @return 
     */
    public List<Busqueda> obtenerTodos(){
        List<Busqueda> busquedas = new ArrayList<>();
        try {
            
            Connection conexion = Conexion.obtener();
            Statement statement = conexion.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT modelo, color, numero, tipo, sexo, precio FROM buscar");
            
            while(resultSet.next()){
                Busqueda busqueda = new Busqueda();
                busqueda.setModelo(resultSet.getString(1));
                busqueda.setColor(resultSet.getString(2));
                busqueda.setNumero(resultSet.getInt(3));
                busqueda.setTipo(resultSet.getString(4));
                busqueda.setSexo(resultSet.getString(5));
                busqueda.setPrecio(resultSet.getInt(6));
                
                busquedas.add(busqueda);
                
                conexion.close();
            }
            
        } catch (Exception e) {
            System.out.println("Ocurrio un error: " + e.getMessage());
        }
        return busquedas;
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
    public boolean guardar(String modelo, String color, int numero, String tipo, String sexo, int precio){
        boolean resultado = false;
        try {
           Connection conexion = Conexion.obtener();
           String consulta = "INSERT INTO buscar (modelo, color, numero, tipo, sexo, precio) VALUES(?, ?, ?, ?, ?, ?)";
           PreparedStatement statement = conexion.prepareStatement(consulta);
           statement.setString(1, modelo);
           statement.setString(2, color);
           statement.setInt(3, numero);
           statement.setString(4, tipo);
           statement.setString(5, sexo);
           statement.setInt(6, precio);
           
           resultado = statement.getUpdateCount() == 1;
           conexion.close();
           
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
