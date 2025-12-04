/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pruebas;

import java.util.Scanner;
import Modelo.Roles;
import Controlador.RolesDAO;

public class PruebaInsertarRoles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Roles rol = new Roles();
        RolesDAO dao = new RolesDAO();
        
        System.out.println("=== INSERTAR NUEVO ROL ===");
        
       
        System.out.print("Ingrese el ID del rol: ");
        rol.setIdroles(sc.nextInt());
        sc.nextLine();
        
       
        System.out.print("Ingrese la descripción del rol: ");
        rol.setDescripcion_roles(sc.nextLine());
        
        boolean resultado = dao.insertarRol(rol);
        
        if (resultado) {
            System.out.println("✅ El rol se guardó correctamente en la base de datos.");
        } else {
            System.out.println("❌ No se pudo guardar el rol.");
        }
        
        sc.close();
    }
}