/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package mx.itson.reprobarnoesopcion.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
import mx.itson.reprobarnoesopcion.entidades.Logica;
import static mx.itson.reprobarnoesopcion.ui.Main.pnlJFrames;

/**
 *
 * @author Hector
 */
public class AnadirSeleccionado extends javax.swing.JPanel {

    /**
     * Creates new form AnadirSeleccionado
     */
    public AnadirSeleccionado() {
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

        jLabel6 = new javax.swing.JLabel();
        lblAnadir = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txfModelo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        txfNumero = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        txfColor = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        cbxSexo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txfPrecio = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        cbxTipo = new javax.swing.JComboBox<>();
        pnlAnadirSeleccionado = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        pnlAtras = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/reprobarnoesopcion/imagenes/Logo zapateria von azul.png"))); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 155, 36));

        lblAnadir.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lblAnadir.setForeground(new java.awt.Color(0, 0, 0));
        lblAnadir.setText("Añadir");
        add(lblAnadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 400, 70));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Modelo");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 90, 30));

        txfModelo.setForeground(new java.awt.Color(153, 153, 153));
        txfModelo.setText("Ingresa el modelo");
        txfModelo.setBorder(null);
        txfModelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txfModeloMousePressed(evt);
            }
        });
        add(txfModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 160, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 160, 10));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Numero");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 80, 20));

        txfNumero.setForeground(new java.awt.Color(153, 153, 153));
        txfNumero.setText("Ingresa el numero");
        txfNumero.setBorder(null);
        txfNumero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txfNumeroMousePressed(evt);
            }
        });
        add(txfNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 160, 20));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 223, 160, 10));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Color");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 60, 20));

        txfColor.setForeground(new java.awt.Color(153, 153, 153));
        txfColor.setText("Ingresa el color");
        txfColor.setBorder(null);
        txfColor.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txfColor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txfColorMousePressed(evt);
            }
        });
        add(txfColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 160, -1));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 160, -1));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 30, 270));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Sexo");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 60, 20));

        cbxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dama", "Caballero", "Unisex" }));
        cbxSexo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(cbxSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 90, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Precio");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 70, 20));

        txfPrecio.setForeground(new java.awt.Color(153, 153, 153));
        txfPrecio.setText("Ingresa el precio");
        txfPrecio.setBorder(null);
        txfPrecio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txfPrecioMousePressed(evt);
            }
        });
        add(txfPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 170, -1));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 170, 10));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Tipo");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 70, 20));

        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teni", "Zapato", "Zapatilla", "Huarache" }));
        cbxTipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(cbxTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 90, -1));

        pnlAnadirSeleccionado.setBackground(new java.awt.Color(21, 101, 192));
        pnlAnadirSeleccionado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlAnadirSeleccionado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlAnadirSeleccionadoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlAnadirSeleccionadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlAnadirSeleccionadoMouseExited(evt);
            }
        });
        pnlAnadirSeleccionado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Añadir");
        pnlAnadirSeleccionado.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, 30));

        add(pnlAnadirSeleccionado, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, 150, 50));

        pnlAtras.setBackground(new java.awt.Color(255, 255, 255));
        pnlAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlAtrasMouseClicked(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/reprobarnoesopcion/imagenes/atras (1).png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlAtras.add(jLabel9);

        add(pnlAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 40, 40));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 200, 0));
    }// </editor-fold>//GEN-END:initComponents

    private void pnlAnadirSeleccionadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAnadirSeleccionadoMouseEntered
        
        pnlAnadirSeleccionado.setBackground(new Color(21,101,192));
        
    }//GEN-LAST:event_pnlAnadirSeleccionadoMouseEntered

    private void pnlAnadirSeleccionadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAnadirSeleccionadoMouseExited
        
        pnlAnadirSeleccionado.setBackground(new Color(18,90,173));
        
    }//GEN-LAST:event_pnlAnadirSeleccionadoMouseExited

    private void txfModeloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfModeloMousePressed
       
        if(txfModelo.getText().equals("Ingresa el modelo")){
        txfModelo.setText("");
        txfModelo.setForeground(Color.BLACK);
        }
        if(txfNumero.getText().isEmpty()){
        txfNumero.setText("Ingresa el numero");
        txfNumero.setForeground(Color.GRAY);
        }
        if(txfColor.getText().isEmpty()){
        txfColor.setText("Ingresa el color");
        txfColor.setForeground(Color.GRAY);
        }
        if(txfPrecio.getText().isEmpty()){
        txfPrecio.setText("Ingresa el precio");
        txfPrecio.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txfModeloMousePressed

    private void txfNumeroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfNumeroMousePressed
        
        if(txfModelo.getText().isEmpty()){
        txfModelo.setText("Ingresa el modelo");
        txfModelo.setForeground(Color.GRAY);
        }
        if(txfNumero.getText().equals("Ingresa el numero")){
        txfNumero.setText("");
        txfNumero.setForeground(Color.BLACK);
        }
        if(txfColor.getText().isEmpty()){
        txfColor.setText("Ingresa el color");
        txfColor.setForeground(Color.GRAY);
        }
        if(txfPrecio.getText().isEmpty()){
        txfPrecio.setText("Ingresa el precio");
        txfPrecio.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txfNumeroMousePressed

    private void txfColorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfColorMousePressed
        
        if(txfModelo.getText().isEmpty()){
        txfModelo.setText("Ingresa el modelo");
        txfModelo.setForeground(Color.GRAY);
        }
        if(txfNumero.getText().isEmpty()){
        txfNumero.setText("Ingresa el numero");
        txfNumero.setForeground(Color.GRAY);
        }
        if(txfColor.getText().equals("Ingresa el color")){
        txfColor.setText("");
        txfColor.setForeground(Color.BLACK);
        }
        if(txfPrecio.getText().isEmpty())
        txfPrecio.setText("Ingresa el precio");
        txfPrecio.setForeground(Color.GRAY);
    }//GEN-LAST:event_txfColorMousePressed

    private void txfPrecioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfPrecioMousePressed
        
        if(txfModelo.getText().isEmpty()){
        txfModelo.setText("Ingresa el modelo");
        txfModelo.setForeground(Color.GRAY);
        }
        if(txfNumero.getText().isEmpty()){
        txfNumero.setText("Ingresa el numero");
        txfNumero.setForeground(Color.GRAY);
        }
        if(txfColor.getText().isEmpty()){
        txfColor.setText("Ingresa el color");
        txfColor.setForeground(Color.GRAY);
        }
        if(txfPrecio.getText().equals("Ingresa el precio")){
        txfPrecio.setText("");
        txfPrecio.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txfPrecioMousePressed

    private void pnlAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAtrasMouseClicked
        
        Anadir p2 = new Anadir();
        p2.setSize(730, 420);
        p2.setLocation(0,0);
        
        pnlJFrames.removeAll();
        pnlJFrames.add(p2, BorderLayout.CENTER);
        pnlJFrames.revalidate();
        pnlJFrames.repaint();
        
    }//GEN-LAST:event_pnlAtrasMouseClicked

    private void pnlAnadirSeleccionadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAnadirSeleccionadoMouseClicked
     
        String mod = txfModelo.getText().toLowerCase();
        String col = txfColor.getText().toUpperCase();
        String num = txfNumero.getText();
        String sex = cbxSexo.getSelectedItem().toString();
        String pre = txfPrecio.getText();
        String tip = cbxTipo.getSelectedItem().toString();
        
        try {
            if(mod.equals("") || mod.equals("Ingresa el modelo") || 
                    num.equals("") || num.equals("Ingresa el numero") || 
                    col.equals("") || col.equals("Ingresa el color") || 
                    pre.equals("") || pre.equals("Ingresa el precio")){
                JOptionPane.showMessageDialog(null,"Faltan ingresar datos");
            } else {
                
                Logica.guardar(mod, col, Integer.parseInt(num), tip, sex, Integer.parseInt(pre));
                JOptionPane.showMessageDialog(null,"Modelo añadido");
                
                Buscar p3 = new Buscar();
                p3.setSize(730, 420);
                p3.setLocation(0,0);
        
                pnlJFrames.removeAll();
                pnlJFrames.add(p3, BorderLayout.CENTER);
                pnlJFrames.revalidate();
                pnlJFrames.repaint();
                
                
            }
        } catch (Exception e) {
            System.out.println("No se pudo agregar la fila: " + e);
        }
        
    }//GEN-LAST:event_pnlAnadirSeleccionadoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxSexo;
    public static javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    public static javax.swing.JLabel lblAnadir;
    private javax.swing.JPanel pnlAnadirSeleccionado;
    private javax.swing.JPanel pnlAtras;
    private javax.swing.JTextField txfColor;
    private javax.swing.JTextField txfModelo;
    private javax.swing.JTextField txfNumero;
    private javax.swing.JTextField txfPrecio;
    // End of variables declaration//GEN-END:variables
}
