/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pgy2121._1_4_actividad_formativa_colecciones;

/**
 *
 * @author Cetecom
 */
public class Tipo_evento {

    String nombre_evento;

    public Tipo_evento(){}
    
    public Tipo_evento(String nombre_evento) {
        this.nombre_evento = nombre_evento;
    }

    public String getNombre_evento() {
        return nombre_evento;
    }

    public void setNombre_evento(String nombre_evento) {
        this.nombre_evento = nombre_evento;
    }

    @Override
    public String toString() {
        return "{nombre_evento="+nombre_evento+"}";
    }

}
