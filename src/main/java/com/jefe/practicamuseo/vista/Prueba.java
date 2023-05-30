/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jefe.practicamuseo.vista;

import java.net.URL;

/**
 *
 * @author serbusmi
 */
public class Prueba {
    public static void main(String[] args) {
        String nombre="LaNocheEstrellada";
        URL ruta=Prueba.class.getResource(nombre);
        
        System.out.println(ruta.getPath());
    }
}
