/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.jefe.practicamuseo.vista;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 *
 * @author picperru
 */
public class GUIInicio extends javax.swing.JFrame {

    Tiempo tiempo;
    Juego1Bonito juego1;
    
    /**
     * Creates new form GUIInicio
     */
    public GUIInicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        ImageIcon ima1 = new ImageIcon("C:\\Users\\picperru\\Documents\\NetBeansProjects\\Tema9\\src\\main\\java\\Recursos\\Imagen1.jpg");
        Image bien1 = ima1.getImage().getScaledInstance(this.Foto1.getWidth(), this.Foto1.getHeight(), Image.SCALE_SMOOTH);
        this.Foto1.setIcon(new ImageIcon(bien1));
        ImageIcon ima2 = new ImageIcon("C:\\Users\\picperru\\Documents\\NetBeansProjects\\Tema9\\src\\main\\java\\Recursos\\Imagen2.jpeg");
        Image bien2 = ima2.getImage().getScaledInstance(this.Foto2.getWidth(), this.Foto2.getHeight(), Image.SCALE_SMOOTH);
        this.Foto2.setIcon(new ImageIcon(bien2));
        ImageIcon ima3 = new ImageIcon("C:\\Users\\picperru\\Documents\\NetBeansProjects\\Tema9\\src\\main\\java\\Recursos\\imagen3.jpg");
        Image bien3 = ima3.getImage().getScaledInstance(this.Foto3.getWidth(), this.Foto3.getHeight(), Image.SCALE_SMOOTH);
        this.Foto3.setIcon(new ImageIcon(bien3));
        ImageIcon ima4 = new ImageIcon("C:\\Users\\picperru\\Documents\\NetBeansProjects\\Tema9\\src\\main\\java\\Recursos\\Imagen4.jpg");
        Image bien4 = ima4.getImage().getScaledInstance(this.Foto4.getWidth(), this.Foto4.getHeight(), Image.SCALE_SMOOTH);
        this.Foto4.setIcon(new ImageIcon(bien4));
        
        this.Fecha.setVisible(false);
        this.Temporalizacion.setVisible(false);
        
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        IniciarJuego = new javax.swing.JButton();
        Nombre1 = new javax.swing.JLabel();
        Nombre2 = new javax.swing.JLabel();
        Foto4 = new javax.swing.JLabel();
        Foto1 = new javax.swing.JLabel();
        Foto2 = new javax.swing.JLabel();
        Foto3 = new javax.swing.JLabel();
        Nombre3 = new javax.swing.JLabel();
        Nombre4 = new javax.swing.JLabel();
        Temporalizacion = new javax.swing.JLabel();
        Fecha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        IniciarJuego.setText("Iniciar");
        IniciarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarJuegoActionPerformed(evt);
            }
        });

        Nombre1.setText("1: ¿Quién lo hizo?");

        Nombre2.setText("2:  Verdadero/Falso de Museos");

        Nombre3.setText("3: Gregorio Fernández");

        Nombre4.setText("4: Coloca en el mapa");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Foto1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Nombre1)
                            .addComponent(Nombre3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Foto3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Foto4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nombre4)
                            .addComponent(Nombre2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(Foto2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(IniciarJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(Temporalizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre1)
                    .addComponent(Nombre2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Foto1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Foto2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Temporalizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre3)
                    .addComponent(Nombre4))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Foto4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Foto3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Fecha)))
                .addGap(13, 13, 13)
                .addComponent(IniciarJuego)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IniciarJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarJuegoActionPerformed
        this.setVisible(false);
        tiempo = new Tiempo(this, true);
        tiempo.setVisible(true);
        juego1 = new Juego1Bonito(this, true);
        juego1.setVisible(true);
        
    }//GEN-LAST:event_IniciarJuegoActionPerformed

    
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
            java.util.logging.Logger.getLogger(GUIInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fecha;
    private javax.swing.JLabel Foto1;
    private javax.swing.JLabel Foto2;
    private javax.swing.JLabel Foto3;
    private javax.swing.JLabel Foto4;
    private javax.swing.JButton IniciarJuego;
    private javax.swing.JLabel Nombre1;
    private javax.swing.JLabel Nombre2;
    private javax.swing.JLabel Nombre3;
    private javax.swing.JLabel Nombre4;
    private javax.swing.JLabel Temporalizacion;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
