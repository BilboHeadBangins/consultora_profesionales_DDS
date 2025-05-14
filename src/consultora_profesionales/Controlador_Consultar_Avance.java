/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consultora_profesionales;

import java.util.Scanner;
import consultora_profesionales.servicios.Servicio;
import java.util.ArrayList;

/**
 *
 * @author italo
 */
public class Controlador_Consultar_Avance {
    static Scanner sc=new Scanner(System.in);
    String rtaServ;
    Servicio servAconsultar=null;
    
    public void consultarAvance(ArrayList<Servicio> lista_servicios){
        try{
        System.out.println("*ACTOR: Interesado en Servicio");
        System.out.println("-------------------------------");
        System.out.println("*Por favor, seleccione el servicio en el que este interesado.");
        System.out.println("*Para ello, ingrese el número de ID del servicio:");
        rtaServ=sc.nextLine();
        System.out.println("*Respuesta registrada.");
        
        servAconsultar=buscarServicio(rtaServ, lista_servicios);
        if(servAconsultar==null){
            System.out.println("*Fin caso de uso.");
        }
        else{
         servAconsultar.listarTareasAsociadas();
        }
        }
        catch(Exception e){
            System.out.println("No se cumplieron algunas condiciones.");
        }     
    }
    
    public Servicio buscarServicio(String id, ArrayList<Servicio> servicios){
        Servicio serv=new Servicio();
        
        for (int i = 0; i < servicios.size(); i++) {
            if (id.equals(servicios.get(i).getID())) {
                serv=servicios.get(i);
                System.out.println("*Servicio encontrado, ID: "+serv.getID());
                return serv;
            }      
        }
        System.out.println("*No se encontró tal servicio. Pruebe otra id.");
        return null;
    }
      
}
