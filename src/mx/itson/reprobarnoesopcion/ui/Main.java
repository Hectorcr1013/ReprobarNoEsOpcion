/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mx.itson.reprobarnoesopcion.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.time.LocalDate;
import javax.swing.JPanel;
import mx.itson.reprobarnoesopcion.entidades.Busqueda;
import mx.itson.reprobarnoesopcion.persistencia.Conexion;

/**
 * Ui principal donde en la que contendrá todo el contenido del proyecto y creará una ventana donde veremos el proyecto 
 * El contenido del proyectó será sobre un almacen de zapatos para una zapateria
 * @author Hector Cardenas
 */
public class Main extends javax.swing.JFrame {

    int xMouse, yMouse;
    
    /**
     * En este metodo iniciamos el ui e inicializamos al arrancar el proyecto algunas variables 
     * para obtener la fecha actual y mostrarla en el proyecto en el ui principal.
     * Tambien empezará con el panel de inicio al arrancar el programa.
     */
    public Main() {
        initComponents();
        setLocationRelativeTo(null);
        
        LocalDate hoy = LocalDate.now();
        int anio = hoy.getYear();
        int dia = hoy.getDayOfMonth();
        int mes = hoy.getMonthValue();
        String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto"," ;Septiembre"
            ,"Octubre","Noviembre","Diciemrbre"};
        lblFecha.setText("Hoy es "+dia+" de "+meses[mes - 1]+" de "+anio);
        
        Inicio p1 = new Inicio();
        p1.setSize(730, 420);
        p1.setLocation(0,0);
        
        pnlJFrames.removeAll();
        pnlJFrames.add(p1, BorderLayout.CENTER);
        pnlJFrames.revalidate();
        pnlJFrames.repaint();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFondo = new javax.swing.JPanel();
        pnlMenu = new javax.swing.JPanel();
        lblZapateriaVon = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        pnlInicio = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pnlAnadir = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pnlBuscar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pnlVendido = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pnlBarra = new javax.swing.JPanel();
        pnlExit = new javax.swing.JPanel();
        lblExit = new javax.swing.JLabel();
        pnlEncabezado = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        pnlJFrames = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        pnlFondo.setBackground(new java.awt.Color(255, 255, 255));
        pnlFondo.setMinimumSize(new java.awt.Dimension(980, 670));
        pnlFondo.setPreferredSize(new java.awt.Dimension(980, 670));
        pnlFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlMenu.setBackground(new java.awt.Color(13, 71, 161));
        pnlMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblZapateriaVon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/reprobarnoesopcion/imagenes/Logo zapateria von.png"))); // NOI18N
        pnlMenu.add(lblZapateriaVon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 220, 61));
        pnlMenu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 119, 210, 10));

        pnlInicio.setBackground(new java.awt.Color(21, 101, 192));
        pnlInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlInicioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlInicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlInicioMouseExited(evt);
            }
        });
        pnlInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Inicio");
        pnlInicio.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 50, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/reprobarnoesopcion/imagenes/home-outline.png"))); // NOI18N
        pnlInicio.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        pnlMenu.add(pnlInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 250, 50));

        pnlAnadir.setBackground(new java.awt.Color(18, 90, 173));
        pnlAnadir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlAnadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlAnadirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlAnadirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlAnadirMouseExited(evt);
            }
        });
        pnlAnadir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/reprobarnoesopcion/imagenes/anadir.png"))); // NOI18N
        pnlAnadir.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Añadir");
        pnlAnadir.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 60, 30));

        pnlMenu.add(pnlAnadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 250, 50));

        pnlBuscar.setBackground(new java.awt.Color(18, 90, 173));
        pnlBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlBuscarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlBuscarMouseExited(evt);
            }
        });
        pnlBuscar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Buscar");
        pnlBuscar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 60, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/reprobarnoesopcion/imagenes/buscar.png"))); // NOI18N
        pnlBuscar.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        pnlMenu.add(pnlBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 250, 50));

        pnlVendido.setBackground(new java.awt.Color(18, 90, 173));
        pnlVendido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlVendidoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlVendidoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlVendidoMouseExited(evt);
            }
        });
        pnlVendido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Vendido");
        pnlVendido.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 80, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/reprobarnoesopcion/imagenes/dolar.png"))); // NOI18N
        pnlVendido.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        pnlMenu.add(pnlVendido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 250, 50));

        pnlFondo.add(pnlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 670));

        pnlBarra.setBackground(new java.awt.Color(255, 255, 255));
        pnlBarra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlBarraMouseDragged(evt);
            }
        });
        pnlBarra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlBarraMousePressed(evt);
            }
        });

        pnlExit.setBackground(new java.awt.Color(255, 255, 255));

        lblExit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblExit.setForeground(new java.awt.Color(102, 102, 102));
        lblExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExit.setText("X");
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblExitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlExitLayout = new javax.swing.GroupLayout(pnlExit);
        pnlExit.setLayout(pnlExitLayout);
        pnlExitLayout.setHorizontalGroup(
            pnlExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlExitLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlExitLayout.setVerticalGroup(
            pnlExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlExitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnlBarraLayout = new javax.swing.GroupLayout(pnlBarra);
        pnlBarra.setLayout(pnlBarraLayout);
        pnlBarraLayout.setHorizontalGroup(
            pnlBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBarraLayout.createSequentialGroup()
                .addGap(0, 926, Short.MAX_VALUE)
                .addComponent(pnlExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlBarraLayout.setVerticalGroup(
            pnlBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBarraLayout.createSequentialGroup()
                .addComponent(pnlExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlFondo.add(pnlBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 30));

        pnlEncabezado.setBackground(new java.awt.Color(25, 118, 210));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Almacen de zapateria");

        lblFecha.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha.setText("Hoy es 22 de noviembre del 2022");

        javax.swing.GroupLayout pnlEncabezadoLayout = new javax.swing.GroupLayout(pnlEncabezado);
        pnlEncabezado.setLayout(pnlEncabezadoLayout);
        pnlEncabezadoLayout.setHorizontalGroup(
            pnlEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEncabezadoLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(pnlEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(233, Short.MAX_VALUE))
        );
        pnlEncabezadoLayout.setVerticalGroup(
            pnlEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEncabezadoLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(lblFecha)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pnlFondo.add(pnlEncabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 730, 170));

        pnlJFrames.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlJFramesLayout = new javax.swing.GroupLayout(pnlJFrames);
        pnlJFrames.setLayout(pnlJFramesLayout);
        pnlJFramesLayout.setHorizontalGroup(
            pnlJFramesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );
        pnlJFramesLayout.setVerticalGroup(
            pnlJFramesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        pnlFondo.add(pnlJFrames, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 730, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlBarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBarraMousePressed
       
        xMouse = evt.getX();
        yMouse = evt.getY();
        
    }//GEN-LAST:event_pnlBarraMousePressed

    private void pnlBarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBarraMouseDragged
       
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x-xMouse,y-yMouse);
        
    }//GEN-LAST:event_pnlBarraMouseDragged

    private void lblExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseExited
        pnlExit.setBackground(Color.white);
        lblExit.setForeground(Color.black);
    }//GEN-LAST:event_lblExitMouseExited

    private void lblExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseEntered
        pnlExit.setBackground(Color.red);
        lblExit.setForeground(Color.white);
    }//GEN-LAST:event_lblExitMouseEntered

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblExitMouseClicked

    private void pnlInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlInicioMouseEntered
         if(pnlInicio.getBackground().getRGB() == -15574355)
            setColor(pnlInicio);
    }//GEN-LAST:event_pnlInicioMouseEntered

    private void pnlInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlInicioMouseExited
        if(pnlAnadir.getBackground().getRGB() != -15574355 || pnlVendido.getBackground().getRGB() != -15574355
            || pnlBuscar.getBackground().getRGB() != -15574355 )
            resetColor(pnlInicio);
    }//GEN-LAST:event_pnlInicioMouseExited

    private void pnlAnadirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAnadirMouseEntered
        if(pnlAnadir.getBackground().getRGB() == -15574355)
            setColor(pnlAnadir);
    }//GEN-LAST:event_pnlAnadirMouseEntered

    private void pnlAnadirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAnadirMouseClicked
        
        setColor(pnlAnadir);
        resetColor(pnlInicio);
        resetColor(pnlVendido);
        resetColor(pnlBuscar);
        
        Anadir p2 = new Anadir();
        p2.setSize(730, 420);
        p2.setLocation(0,0);
        
        pnlJFrames.removeAll();
        pnlJFrames.add(p2, BorderLayout.CENTER);
        pnlJFrames.revalidate();
        pnlJFrames.repaint();
        
    }//GEN-LAST:event_pnlAnadirMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void pnlInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlInicioMouseClicked
        
        setColor(pnlInicio);
        resetColor(pnlVendido);
        resetColor(pnlAnadir);
        resetColor(pnlBuscar);
        
        Inicio p1 = new Inicio();
        p1.setSize(730, 420);
        p1.setLocation(0,0);
        
        pnlJFrames.removeAll();
        pnlJFrames.add(p1, BorderLayout.CENTER);
        pnlJFrames.revalidate();
        pnlJFrames.repaint();
    }//GEN-LAST:event_pnlInicioMouseClicked

    private void pnlBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBuscarMouseClicked
        
        setColor(pnlBuscar);
        resetColor(pnlInicio);
        resetColor(pnlAnadir);
        resetColor(pnlVendido);
        
        Buscar p3 = new Buscar();
        p3.setSize(730, 420);
        p3.setLocation(0,0);
        
        pnlJFrames.removeAll();
        pnlJFrames.add(p3, BorderLayout.CENTER);
        pnlJFrames.revalidate();
        pnlJFrames.repaint();
    }//GEN-LAST:event_pnlBuscarMouseClicked

    private void pnlAnadirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAnadirMouseExited
       if(pnlInicio.getBackground().getRGB() != -15574355 || pnlVendido.getBackground().getRGB() != -15574355
            || pnlBuscar.getBackground().getRGB() != -15574355 )
            resetColor(pnlAnadir);
    }//GEN-LAST:event_pnlAnadirMouseExited

    private void pnlVendidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlVendidoMouseClicked
        
        setColor(pnlVendido);
        resetColor(pnlInicio);
        resetColor(pnlAnadir);
        resetColor(pnlBuscar);
        
        Vendido p4 = new Vendido();
        p4.setSize(730, 420);
        p4.setLocation(0,0);
        
        pnlJFrames.removeAll();
        pnlJFrames.add(p4, BorderLayout.CENTER);
        pnlJFrames.revalidate();
        pnlJFrames.repaint();
        
    }//GEN-LAST:event_pnlVendidoMouseClicked

    private void pnlBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBuscarMouseEntered
        if(pnlBuscar.getBackground().getRGB() == -15574355)
            setColor(pnlBuscar);
    }//GEN-LAST:event_pnlBuscarMouseEntered

    private void pnlBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBuscarMouseExited
       if(pnlInicio.getBackground().getRGB() != -15574355 || pnlVendido.getBackground().getRGB() != -15574355
            || pnlAnadir.getBackground().getRGB() != -15574355 )
            resetColor(pnlBuscar);
    }//GEN-LAST:event_pnlBuscarMouseExited

    private void pnlVendidoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlVendidoMouseEntered
        if(pnlVendido.getBackground().getRGB() == -15574355)
            setColor(pnlVendido);
    }//GEN-LAST:event_pnlVendidoMouseEntered

    private void pnlVendidoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlVendidoMouseExited
        if(pnlInicio.getBackground().getRGB() != -15574355 || pnlBuscar.getBackground().getRGB() != -15574355
            || pnlAnadir.getBackground().getRGB() != -15574355 )
            resetColor(pnlVendido);
    }//GEN-LAST:event_pnlVendidoMouseExited

    /**
     * Establece un panel del color rgb que pongamos
     * Se utilizará para cuando esté seleccionado un panel del menu en el ui principal
     * @param panel Nombre del panel que queramos establecerle el color
     */
    public void setColor(JPanel panel){
        panel.setBackground(new Color(21,101,192));
    }
    
    /**
     * Establece un panel del color rgb que pongamos
     * Se ultilizará para cuando se deje de seleccionar un panel del menú en el ui principal
     * @param panel Nombre del panel que queramos establecerle el color
     */
    public void resetColor(JPanel panel){
        panel.setBackground(new Color(18,90,173));
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblZapateriaVon;
    public static javax.swing.JPanel pnlAnadir;
    private javax.swing.JPanel pnlBarra;
    public static javax.swing.JPanel pnlBuscar;
    private javax.swing.JPanel pnlEncabezado;
    private javax.swing.JPanel pnlExit;
    private javax.swing.JPanel pnlFondo;
    public static javax.swing.JPanel pnlInicio;
    public static javax.swing.JPanel pnlJFrames;
    private javax.swing.JPanel pnlMenu;
    public static javax.swing.JPanel pnlVendido;
    // End of variables declaration//GEN-END:variables
}
