/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pgy2121._1_4_actividad_formativa_colecciones;
import java.util.Date;
import java.time.LocalTime;

/**
 *
 * @author Cetecom
 */
public class Evento {
    private int codigo, precio, cantidad_asistentes;
    private Date fecha_evento;
    private String hora_inicio_evento,hora_fin_evento, ubicacion_evento;
    private Tipo_evento tipo_evento;
    
    public Evento(){
        tipo_evento = new Tipo_evento();
    }
    
}
