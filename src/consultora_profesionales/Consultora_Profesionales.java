/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package consultora_profesionales;

import consultora_profesionales.entidades.Servicio;
import consultora_profesionales.entidades.Servicio_Tarea;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author italo
 */
public class Consultora_Profesionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        ArrayList<Servicio> lista_servicios=new ArrayList<>();
        
        
        
        Controlador_GestionarServicios llamadaGestionar=new Controlador_GestionarServicios();
        
        
        
        llamadaGestionar.consultarAvance(lista_servicios);
        
        
    }

}
