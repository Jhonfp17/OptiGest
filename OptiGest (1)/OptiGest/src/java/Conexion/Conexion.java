/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Conexion;

/**
 *
 * @author Aprendiz
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private Connection conn;
    private String driver = "com.mysql.cj.jdbc.Driver";
    private String user = "root";
    private String password = "";
    private String baseDatos = "OptiGest";
    private String url = "jdbc:mysql://localhost:3307/" + baseDatos + "?useTimezone=true&serverTimezone=UTC";

    public Connection getConexion() {
        Connection con = null;

        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3307/" + baseDatos + "? useSSL=false&serverTimezone=UTC";
        String user = "root";
        String password = "";

        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
            System.out.println(" Conexión establecida correctamente.");
        } catch (ClassNotFoundException e) {
            System.out.println("Error: No se encontró el driver: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error SQL: " + e.getMessage());
        }

        return con;
    }

    public Connection getConn() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}