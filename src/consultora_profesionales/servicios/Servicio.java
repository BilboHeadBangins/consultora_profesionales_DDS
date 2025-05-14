/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consultora_profesionales.servicios;

import java.util.ArrayList;

/**
 *
 **/
public class Servicio {
    
    private String id_servicio;
    private int cant_horas_estimadas;
    private int cant_horas_reales;
    private String descripcion;
    
    private Servicio_Estado ServEst;
    
    private ArrayList<Servicio_Tarea> sertar = new ArrayList<>();
    private Acuerdo_Comercial acuerdo;
    
    
    public Servicio() {
    }
    
    public Servicio(String id_servicio) {
        this.id_servicio=id_servicio;
    }

    public Servicio(String id_servicio,int cant_horas_estimadas, int cant_horas_reales, String descripcion) {
        this.cant_horas_estimadas = cant_horas_estimadas;
        this.cant_horas_reales = cant_horas_reales;
        this.descripcion = descripcion;
    }
    
    public String getID(){
        return id_servicio;
    }
    
    public ArrayList<Servicio_Tarea> getSertar() {
        return sertar;
    }

    public void setSertar(ArrayList<Servicio_Tarea> sertar) {
        this.sertar = sertar;
    } 

    public Acuerdo_Comercial getAcuerdo() {
        return acuerdo;
    }

    public void setAcuerdo(Acuerdo_Comercial acuerdo) {
        this.acuerdo = acuerdo;
    }
    
    public void listarTareasAsociadas(){
        if(sertar.isEmpty()){
            System.out.println("No hay tareas para este servicio.");
        }
        else{
           System.out.println("\n*Listando tareas:");
           for (int i = 0; i < sertar.size(); i++) {
           System.out.println("\n*Tarea "+(i+1));
           System.out.println("*Fecha de inicio: "+sertar.get(i).getFechaHora_desde());
           System.out.println("*Fecha de finalización: "+sertar.get(i).getFechaHora_hasta());
           System.out.println(sertar.get(i).getDescripcion_avance());
       }
        }
       
   }
   
}
