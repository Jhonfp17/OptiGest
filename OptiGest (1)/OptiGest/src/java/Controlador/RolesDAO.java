/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Controlador;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Modelo.Roles;
import java.sql.ResultSet;

public class RolesDAO {

    public boolean insertarRol(Roles rol) {
        boolean insertado = false;
        Conexion conexion = new Conexion();
        Connection con = conexion.getConexion();

        String sql = "INSERT INTO Roles (idroles, descripcion_roles) VALUES (?, ?)";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, rol.getIdroles());
            ps.setString(2, rol.getDescripcion_roles());
            ps.executeUpdate();
            insertado = true;
            System.out.println("✅ Rol insertado correctamente en la base de datos.");
        } catch (SQLException e) {
            System.out.println("❌ Error al insertar rol: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                System.out.println("❌ Error al cerrar conexión: " + e.getMessage());
            }
        }

        return insertado;
    }

    public Roles consultaRoles(int idroles) {
        Roles rolEncontrado = null;
        Conexion conexion = new Conexion();

        Connection con = conexion.getConexion();
        if (con == null) {
            System.out.println("No se pudo obtener conexión. Abortando consulta.");
            return null;
        }

        String sql = "SELECT idroles, descripcion_roles FROM roles WHERE idroles = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, idroles);

            ResultSet rs = ps.executeQuery(); // ✅ Aquí usamos java.sql.ResultSet

            if (rs.next()) {
                rolEncontrado = new Roles();
                rolEncontrado.setIdroles(rs.getInt("idroles"));
                rolEncontrado.setDescripcion_roles(rs.getString("descripcion_roles"));
            }

        } catch (SQLException e) {
            System.out.println("❌ Error al consultar el rol: " + e.getMessage());
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("❌ Error al cerrar conexión: " + e.getMessage());
            }
        }

        return rolEncontrado;
    }
}
