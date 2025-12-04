/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pruebas;

import Controlador.AsignacionesDAO;
import Modelo.Asignaciones;

public class PruebaAsignaciones {

    public static void main(String[] args) {

        // 1️⃣ Crear un objeto de tipo Asignaciones
        Asignaciones asignacion = new Asignaciones();

        // IMPORTANTE: si tu campo id_asignaciones es AUTO_INCREMENT
        // déjalo en 0 o no lo uses, dependiendo de tu tabla
        asignacion.setId_asignaciones(1);
        asignacion.setFecha_asignaciones("2025-02-01");
        asignacion.setFecha_devolucion("2025-02-10");
        asignacion.setObservaciones("Prueba de inserción desde PruebaAsignaciones.java");
        asignacion.setPersonal_id_personal("1");   // ID real de tabla Personal
        asignacion.setActivos_id_activos("1");     // ID real de tabla Activos

        // 2️⃣ Crear el DAO
        AsignacionesDAO dao = new AsignacionesDAO();

        // 3️⃣ Insertar
        boolean resultado = dao.insertarAsignacion(asignacion);

        // 4️⃣ Ver resultado
        if (resultado) {
            System.out.println("✔️ La asignación fue insertada correctamente.");
        } else {
            System.out.println("❌ No se pudo insertar la asignación.");
        }
    }
}
