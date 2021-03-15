/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hurtado_juanmiguel_eval2;

/**
 *
 * @author usutarde
 */
public class Ciudadano {
    //DECLARACION DE VARIABLES CLASE CIUDADANO
    private String nombre;
    private double sueldo;
    private int nhijos;

    //CONSTRUCTORES CLASE CIUDADANO
    public Ciudadano(String nombre, double sueldo, int nhijos) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.nhijos = nhijos;
    }

    //CONSTRUCTOR VACIO CLASE CIUDADANO
    Ciudadano() {
    }

    //GETTER Y SETTER CLASE CIUDADANO
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getNhijos() {
        return nhijos;
    }

    public void setNhijos(int nhijos) {
        this.nhijos = nhijos;
    }

    //STRINGS DE SALIDA
    @Override
    public String toString() {
        return "Ciudadano{" + "nombre=" + nombre + ", sueldo=" + sueldo + ", nhijos=" + nhijos + '}';
    }
    
    
    
    
}
