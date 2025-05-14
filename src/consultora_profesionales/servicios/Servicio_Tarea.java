/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consultora_profesionales.servicios;
import java.time.LocalDate;


/**
 *
 * @author italo
 */
public class Servicio_Tarea {
    private String descripcion_avance;
    private LocalDate fechaHora_desde;
    private LocalDate fechaHora_hasta;

    public Servicio_Tarea(String descripcion_avance){
        this.descripcion_avance = descripcion_avance;
    }
    
    public Servicio_Tarea(String descripcion_avance, LocalDate fechaHora_desde, LocalDate fechaHora_hasta) {
        this.descripcion_avance = descripcion_avance;
        this.fechaHora_desde = fechaHora_desde;
        this.fechaHora_hasta = fechaHora_hasta;
    }

    public String getDescripcion_avance() {
        return descripcion_avance;
    }

    public void setDescripcion_avance(String descripcion_avance) {
        this.descripcion_avance = descripcion_avance;
    }

    public LocalDate getFechaHora_desde() {
        return fechaHora_desde;
    }

    public void setFechaHora_desde(LocalDate fechaHora_desde) {
        this.fechaHora_desde = fechaHora_desde;
    }

    public LocalDate getFechaHora_hasta() {

        return fechaHora_hasta;
    }

    public void setFechaHora_hasta(LocalDate fechaHora_hasta) {
        this.fechaHora_hasta = fechaHora_hasta;
    }
    
    
    
    
}
