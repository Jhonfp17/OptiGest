/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Modelo.Asignaciones;

public class AsignacionesDAO {
    
    public boolean insertarAsignacion(Asignaciones asignacion) {
        boolean insertado = false;
        Conexion conexion = new Conexion();
        Connection con = conexion.getConexion();
       
        String sql = "INSERT INTO Asignaciones (id_asignaciones, fecha_asignaciones, fecha_devolucion, observaciones, Personal_id_personal, Activos_id_activos) VALUES (?, ?, ?, ?, ?, ?)";
        
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setInt(1, asignacion.getId_asignaciones());
            ps.setString(2, asignacion.getFecha_asignaciones());
            ps.setString(3, asignacion.getFecha_devolucion());
            ps.setString(4, asignacion.getObservaciones());
            ps.setString(5, asignacion.getPersonal_id_personal());
            ps.setString(6, asignacion.getActivos_id_activos());
            
            int filasAfectadas = ps.executeUpdate();
            
            if (filasAfectadas > 0) {
                insertado = true;
                System.out.println("✅ Asignación insertada correctamente en la base de datos.");
            } else {
                System.out.println("⚠️ No se insertó la asignación. Filas afectadas: " + filasAfectadas);
            }
            
        } catch (SQLException e) {
            System.out.println("❌ Error al insertar asignación: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // 3. Cerrar la conexión
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
}