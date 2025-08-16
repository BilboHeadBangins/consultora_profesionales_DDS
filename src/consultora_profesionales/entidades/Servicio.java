package consultora_profesionales.entidades;
import consultora_profesionales.actores.Consultor;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 **/
public class Servicio {
    //atributos
    private String nro_servicio;
    private String descripcionServicio;
    private int cant_horas_estimadas;
    private int cant_horas_reales;
    private Date fechaInicioServicioEstimada;
    private Date fechaFinServicioEstimada;    
    private Date fechaInicioServicioReal;
    private Date fechaFinServicioReal;
    
    //Navegabilidades
    private TipoServicio TipoServ;
    private Servicio_Estado ServEstActual;
    private ArrayList<Servicio_Estado> ServEstHistorico;
    private ArrayList<Servicio_Tarea> sertar = new ArrayList<>();
    private Acuerdo_Comercial acuerdo;
    private Consultor consultor;
    
    public Servicio() {
    }   
    public Servicio(String id_servicio) {
        this.nro_servicio=id_servicio;
    }
    public Servicio(String id_servicio,int cant_horas_estimadas, int cant_horas_reales, String descripcion) {
        this.cant_horas_estimadas = cant_horas_estimadas;
        this.cant_horas_reales = cant_horas_reales;
        this.descripcionServicio = descripcion;
    }
    public String getID(){
        return nro_servicio;
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
