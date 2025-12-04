/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Aprendiz
 */
public class Mantenimiento {
    


private int id_mantenimiento;
private String fecha_mante;
private String costo;
private String descripcion;
private String Activos_idActivos;

    public int getId_mantenimiento() {
        return id_mantenimiento;
    }

    public void setId_mantenimiento(int id_mantenimiento) {
        this.id_mantenimiento = id_mantenimiento;
    }

    public String getFecha_mante() {
        return fecha_mante;
    }

    public void setFecha_mante(String fecha_mante) {
        this.fecha_mante = fecha_mante;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getActivos_idActivos() {
        return Activos_idActivos;
    }

    public void setActivos_idActivos(String Activos_idActivos) {
        this.Activos_idActivos = Activos_idActivos;
    }
 
}