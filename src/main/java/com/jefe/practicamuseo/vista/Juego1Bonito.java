/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.jefe.practicamuseo.vista;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author picperru
 */
public final class Juego1Bonito extends javax.swing.JDialog {

    Map<String, String>obras=new HashMap<>();
    ArrayList<String> autores=new ArrayList<>();
    private String imagenActual;
    private String AutorActual;

    public Juego1Bonito pepe;
    int totnum=0;
    int[] numeros; 
    Random random=new Random();
    int cont=0;//esto tiene que ser 0 creo
    
    /**
     * Creates new form Juego1Bonito
     */
    public Juego1Bonito(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        meterAutores();
        Botones();
        fotos();
        array();
        llamadaFoto();
        Autor1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Autor1.getText().equals(AutorActual)){
                    JOptionPane.showMessageDialog(pepe, "Has acertado");
                    Autor1.setBackground(Color.green);
                }else{
                    JOptionPane.showMessageDialog(pepe, "Has fallado");
                    Autor1.setBackground(Color.red);
                }
                llamadaFoto();
            }
        });
        Autor2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Autor2.getText().equals(AutorActual)){
                    JOptionPane.showMessageDialog(pepe, "Has acertado");
                    Autor2.setBackground(Color.green);
                }else{
                    JOptionPane.showMessageDialog(pepe, "Has fallado");
                    Autor2.setBackground(Color.red);
                }
                llamadaFoto();
            }
        });
        Autor3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Autor3.getText().equals(AutorActual)){
                    JOptionPane.showMessageDialog(pepe, "Has acertado");
                    Autor3.setBackground(Color.green);
                }else{
                    JOptionPane.showMessageDialog(pepe, "Has fallado");
                    Autor3.setBackground(Color.red);
                }
                llamadaFoto();
            }
        });
        Autor4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Autor4.getText().equals(AutorActual)){
                    JOptionPane.showMessageDialog(pepe, "Has acertado");
                    Autor4.setBackground(Color.green);
                }else{
                    JOptionPane.showMessageDialog(pepe, "Has fallado");
                    Autor4.setBackground(Color.red);
                }
                llamadaFoto();
            }
        });
    }
    
    //esto seria una llamada a la base de datos desde su apartado para rellenar el array
    private void Botones(){
        this.Autor1.setText(autores.get(0));//los botones tienen el exacto nombre por lo que se pueden comparar
        this.Autor2.setText(autores.get(1));
        this.Autor3.setText(autores.get(2));
        this.Autor4.setText(autores.get(3));
    }
    
    private void meterAutores(){//aqui meteriamos todos los autores con una llamada a BD
        autores.add("Van Gogh");
        autores.add("Schile");
        autores.add("Renoir");
        autores.add("Bernini");
    }
    
    private void fotos(){//los autores se meterian al azar
        obras.put(autores.get(0),"C:\\Users\\picperru\\Documents\\NetBeansProjects\\Tema9\\src\\main\\java\\Recursos\\Imagen1.jpg");
        obras.put(autores.get(1),"C:\\Users\\picperru\\Documents\\NetBeansProjects\\Tema9\\src\\main\\java\\Recursos\\Imagen2.jpeg");
        obras.put(autores.get(2),"C:\\Users\\picperru\\Documents\\NetBeansProjects\\Tema9\\src\\main\\java\\Recursos\\imagen3.jpg");
        obras.put(autores.get(3),"C:\\Users\\picperru\\Documents\\NetBeansProjects\\Tema9\\src\\main\\java\\Recursos\\Imagen4.jpg");
        totnum=obras.size();
    }
    
    private void array(){//se generan los mismo numero que fotos haya, luego se desordenan y cogen un par
        numeros= new int[totnum];
        for (int i = 0; i < totnum; i++) {
            numeros[i]=i;   
        }
    }
    
    private void colorNormal(){
        Autor1.setBackground(Color.white);
        Autor2.setBackground(Color.white);
        Autor3.setBackground(Color.white);
        Autor4.setBackground(Color.white);        
    }
    
//    public void desordenarArray(){//de momento no usado
//        for (int i = numeros.length - 1; i > 0; i--) {
//            int j = random.nextInt(i + 1);
//            int temp = numeros[i];
//            numeros[i] = numeros[j];
//            numeros[j] = temp;
//        }
//    }

    
    
    public void llamadaFoto(){
        if(cont<4){
        String auutor=autores.get(numeros[cont]);
        AutorActual=auutor;
        System.out.println(auutor);
        String pipi=obras.get(auutor);
        imagenActual=pipi;
        cont++;
        ImageIcon ima1 = new ImageIcon(pipi);
        Image bien1 = ima1.getImage().getScaledInstance(this.jLabel1.getWidth(), this.jLabel1.getHeight(), Image.SCALE_SMOOTH);
        this.jLabel1.setIcon(new ImageIcon(bien1));
        colorNormal();
        }else{
            
        }
        
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
        Autor1 = new javax.swing.JButton();
        Autor2 = new javax.swing.JButton();
        Autor3 = new javax.swing.JButton();
        Autor4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(Autor1)
                        .addGap(18, 18, 18)
                        .addComponent(Autor2)
                        .addGap(18, 18, 18)
                        .addComponent(Autor3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Autor4)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Autor1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Autor2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Autor3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Autor4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Autor1;
    private javax.swing.JButton Autor2;
    private javax.swing.JButton Autor3;
    private javax.swing.JButton Autor4;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
