/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consultora_profesionales.actores;

import consultora_profesionales.entidades.ConsultorTipoServicio;
import java.util.Date;

/**
 *
 * @author italo
 */
public class Consultor {
    private int dniConsultor;
    private String nombreConsultor;
    private int nroLegajoConsultor;    
    private short horasDisponiblidadMaximaConsultoria;
    private short horasDisponibilidadMinimaConsultoria;
    private Date fechaHoraBajaConsultor;
    
    private boolean esSocio;
    private ConsultorTipoServicio tipoServicioOfrecido;
}
