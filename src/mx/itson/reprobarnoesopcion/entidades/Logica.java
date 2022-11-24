/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.reprobarnoesopcion.entidades;


import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.lang.String;
import java.sql.SQLException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mx.itson.reprobarnoesopcion.persistencia.Conexion;
import mx.itson.reprobarnoesopcion.ui.Buscar;
import static mx.itson.reprobarnoesopcion.ui.Main.pnlJFrames;
import mx.itson.reprobarnoesopcion.ui.Vendido;

/**
 *
 * @author Hector
 */
public class Logica {

    private String modelo;
    private String color;
    private int numero;
    private String tipo;
    private String sexo;
    private int precio;
    DefaultTableModel model2;
    
    /**
     * 
     */
    public void mostrarBuscar(){
        
        String consulta = "SELECT * FROM almacen.buscar";
        
        try {
            
            String[] nombreColumnas = {"Modelo", "Color", "Numero", "Tipo", "Sexo", "Precio"};
            String[] registros = new String[6];
            
            DefaultTableModel model1 = new DefaultTableModel(null, nombreColumnas);
            
            Connection conexion = Conexion.obtener();
            Statement statement = conexion.createStatement();
            ResultSet resultSet = statement.executeQuery(consulta);
            
            while(resultSet.next()){
                registros [0] = resultSet.getString("Modelo");
                registros [1] = resultSet.getString("Color");
                registros [2] = resultSet.getString("Numero");
                registros [3] = resultSet.getString("Tipo");
                registros [4] = resultSet.getString("Sexo");
                registros [5] = resultSet.getString("Precio");
                
                model1.addRow(registros);
            }
            Buscar.tblBuscar.setModel(model1);
            
        } catch (Exception e) {
            System.out.println("Ocurrio un error: " + e.getMessage());
        }
    }
    
    /**
     * 
     */
    public void mostrarVendido(){
        
        String consulta = "SELECT * FROM almacen.vendido";
        
        try {
            
            String[] nombreColumnas = {"Modelo", "Color", "Numero", "Tipo", "Sexo", "Precio"};
            String[] registros = new String[6];
            
            DefaultTableModel model2 = new DefaultTableModel(null, nombreColumnas);
            
            Connection conexion = Conexion.obtener();
            Statement statement = conexion.createStatement();
            ResultSet resultSet = statement.executeQuery(consulta);
            
            while(resultSet.next()){
                registros [0] = resultSet.getString("Modelo");
                registros [1] = resultSet.getString("Color");
                registros [2] = resultSet.getString("Numero");
                registros [3] = resultSet.getString("Tipo");
                registros [4] = resultSet.getString("Sexo");
                registros [5] = resultSet.getString("Precio");
                
                model2.addRow(registros);
            }
            Vendido.tblVendido.setModel(model2);
            
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
    
    public static void eliminarModelo(){
        
        try {
            
            int filaSeleccionada = Buscar.tblBuscar.getSelectedRow();
            String consulta = "DELETE FROM almacen.buscar WHERE Modelo=" + Buscar.tblBuscar.getValueAt(filaSeleccionada,0);
            Connection conexion = Conexion.obtener();
            Statement statement = conexion.createStatement();
            
            int n = statement.executeUpdate(consulta);
            
            if (n >= 0) {
                System.out.println("Modelo eliminado de tabla buscar");
            }
            
            Vendido p4 = new Vendido();
            p4.setSize(730, 420);
            p4.setLocation(0,0);
        
            pnlJFrames.removeAll();
            pnlJFrames.add(p4, BorderLayout.CENTER);
            pnlJFrames.revalidate();
            pnlJFrames.repaint();
            
        } catch (Exception e) {
            System.out.println("Ocurrio un error al intentar elminiar el modelo: " + e);
            JOptionPane.showMessageDialog(null, "Selecciona un modelo");
        }
        
    }
    
    /**
     * 
     * @param buscar
     * @return 
     */
    public DefaultTableModel buscar(String buscar){
        
        String [] nombresColumnas = {"Modelo", "Color", "Numero", "Tipo", "Sexo", "Precio"};
        String [] registros = new String[6];
        DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);
        String consulta = "SELECT * FROM almacen.buscar WHERE Modelo LIKE '%"+buscar+"%' OR color LIKE '%"+buscar+"%' OR Numero LIKE '%"+buscar+"%' OR Tipo LIKE '%"+buscar+"%' OR Sexo LIKE '%"+buscar+"%' OR Precio LIKE '%"+buscar+"%'";
        
        Connection cn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;                           

        try
        {
            cn = Conexion.obtener();
            pst = cn.prepareStatement(consulta);
            rs = pst.executeQuery();

            while(rs.next())
            {
                registros[0] = rs.getString("Modelo");
                registros[1] = rs.getString("Color");
                registros[2] = rs.getString("Numero");      
                registros[3] = rs.getString("Tipo");
                registros[4] = rs.getString("Sexo");
                registros[5] = rs.getString("Precio");

                modelo.addRow(registros);

            }                      
        }
        catch(Exception e)
        {
            System.out.println("Ocurrio un error: " + e);
        }
        finally
        {
            try
            {
                if (rs != null) rs.close();

                if (pst != null) pst.close();

                if (cn != null) cn.close();
            }
            catch(Exception e)
            {
                System.out.println("Ocurrio un error: " + e);
            }
        }
         return modelo;
     
    }
    
    //getter and setters de variables
    
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
