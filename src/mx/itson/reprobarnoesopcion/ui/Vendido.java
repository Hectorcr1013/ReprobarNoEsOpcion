/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package mx.itson.reprobarnoesopcion.ui;

import java.awt.Color;

/**
 *
 * @author Hector
 */
public class Vendido extends javax.swing.JPanel {

    /**
     * Creates new form Vendido
     */
    public Vendido() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVendido = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        lblVentaTotal = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Vendido");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 198, 59));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/reprobarnoesopcion/imagenes/Logo zapateria von azul.png"))); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 155, 36));

        tblVendido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Modelo", "Color", "Numero", "Tipo", "Sexo", "Precio"
            }
        ));
        jScrollPane1.setViewportView(tblVendido);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 670, 190));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ventas  totales:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 140, 20));

        lblVentaTotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblVentaTotal.setForeground(new java.awt.Color(0, 0, 0));
        add(lblVentaTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 100, 20));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblVentaTotal;
    private javax.swing.JTable tblVendido;
    // End of variables declaration//GEN-END:variables
}
