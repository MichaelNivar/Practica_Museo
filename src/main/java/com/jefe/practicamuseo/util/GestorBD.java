/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jefe.practicamuseo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author serbusmi
 */
public class GestorBD {

    public static String url = "jdbc:mysql://localhost:3306/dim_gf";
    private static String user = "root";
    private static String password = "";
    public static Connection con;

    public static Connection conectarBD() {
        try {
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Conexion realizada");

        } catch (SQLException ex) {
            System.err.print("Error de conexion");
            ex.printStackTrace();
        }
        return con;
    }

    public static Connection desconectarDB() {
        try {
            if (con != null) {
                con.close();
            }
            System.out.println("Conexion realizada");
        } catch (SQLException ex) {
            System.out.println("Error al desconectar");
            ex.printStackTrace();
        }
        return con;
    }
}
