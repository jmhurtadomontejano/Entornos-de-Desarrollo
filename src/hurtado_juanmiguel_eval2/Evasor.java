/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hurtado_juanmiguel_eval2;

/**
 *
 * @author jmhur
 */
    //DECLARACION DE VARIABLES CLASE EVASOR
public class Evasor {
    private String nombre;
    private long cantidad_evadida;

    //CONSTRUCTORES CLASE EVASOR
    public Evasor(String nombre, long cantidad_evadida) {
        this.nombre = nombre;
        this.cantidad_evadida = cantidad_evadida;
    }

    public Evasor() {
    }
    
    //GETTER Y SETTER CLASE EVASOR
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getCantidad_evadida() {
        return cantidad_evadida;
    }

    public void setCantidad_evadida(long cantidad_evadida) {
        this.cantidad_evadida = cantidad_evadida;
    }
    
    
}
