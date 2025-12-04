/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pruebas;

import Modelo.Roles;
import Controlador.RolesDAO;
import java.sql.SQLException;


/**
 *
 * @author Aprendiz
 */
public class PruebaConsultarRoles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

            RolesDAO rolesDAO = new RolesDAO();

            // ID del rol que quieres consultar
            int idRol = 1;

            Roles rol = rolesDAO.consultaRoles(idRol);

            if (rol != null) {
                System.out.println("=== Rol encontrado ===");
                System.out.println("ID: " + rol.getIdroles());
                System.out.println("Descripción: " + rol.getDescripcion_roles());
            } else {
                System.out.println("No se encontró el rol con ID: " + idRol);
            }
        }
    
}
