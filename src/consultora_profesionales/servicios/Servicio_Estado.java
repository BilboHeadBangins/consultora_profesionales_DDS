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
public class Servicio_Estado {
    private LocalDate FechaHoraDesde;
    private LocalDate FechaHoraHasta;
    private Estado_Servicio EstadoServicio;

    public Servicio_Estado() {
    }

    public Servicio_Estado(LocalDate FechaHoraDesde, LocalDate FechaHoraHasta, Estado_Servicio EstadoServicio) {
        this.FechaHoraDesde = FechaHoraDesde;
        this.FechaHoraHasta = FechaHoraHasta;
        this.EstadoServicio = EstadoServicio;
    }
    
    
    
}
