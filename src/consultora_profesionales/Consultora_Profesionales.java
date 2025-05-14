/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package consultora_profesionales;

import consultora_profesionales.servicios.Servicio;
import consultora_profesionales.servicios.Servicio_Tarea;
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
        Servicio s1=new Servicio("12345");
        Servicio s2=new Servicio("12346");
        Servicio s3=new Servicio("12347");
        
        ArrayList<Servicio_Tarea> st2=new ArrayList<>();
        st2.add(new Servicio_Tarea("*Análisis Exploratorio de Datos (EDA)" +
        "\nEl consultor realizó un análisis exploratorio de datos para identificar patrones,"
        + "\ntendencias y anomalías en los conjuntos de datos proporcionados por el cliente."
        + "\nUtilizando herramientas como Python (Pandas, Matplotlib) o R (ggplot2, dplyr), se"
        + "\ngeneraron visualizaciones y estadísticas descriptivas que permitieron entender la"
        + "\ndistribución de los datos, detectar valores atípicos y validar la calidad de la "
        + "\ninformación. Este proceso fue fundamental para garantizar que los datos estuvieran"
        + "\nlistos para etapas posteriores, como modelado predictivo o generación de informes"
        + "\nestratégicos."));
        
        st2.get(0).setFechaHora_desde(LocalDate.of(2025, 5, 10));
        st2.get(0).setFechaHora_hasta(LocalDate.of(2025, 5, 16));

        
        st2.add(new Servicio_Tarea("*Limpieza y Transformación de Datos" +
        "\nEl profesional llevó a cabo la limpieza y transformación de los datos crudos, abordando"
        + "\nproblemas como valores faltantes, duplicados o formatos inconsistentes. Mediante técnicas"
        + "\nde imputación, normalización y estandarización, se aseguró la coherencia del dataset. "
        + "\nAdemás, se aplicaron transformaciones específicas (como one-hot encoding para variables "
        + "\ncategóricas o escalado de features) para adaptar los datos a los requisitos de los "
        + "\nalgoritmos de machine learning o análisis estadístico definidos en el proyecto."));
        
        st2.get(1).setFechaHora_desde(LocalDate.of(2025, 5, 17));
        st2.get(1).setFechaHora_hasta(LocalDate.of(2025, 5, 26));
        
        st2.add(new Servicio_Tarea("*Generación de Informes y Dashboards Interactivos" +
        "\nPara facilitar la toma de decisiones del cliente, el consultor desarrolló informes"
        + "\npersonalizados y dashboards interactivos utilizando herramientas como Power BI, "
        + "\nTableau o librerías de Python (Plotly, Dash). Estos recursos consolidaron métricas"
        + "\nclave, visualizaciones dinámicas y filtros configurables, permitiendo al equipo "
        + "\ndel cliente explorar los resultados de manera autónoma y extraer insights relevantes"
        + "\n para su estrategia de negocio."));
        
        st2.get(2).setFechaHora_desde(LocalDate.of(2025, 5, 26));
        //st2.get(2).setFechaHora_hasta(LocalDate.of(2025, 6, 10));
        
        ArrayList<Servicio> lista_servicios=new ArrayList<>();
        lista_servicios.add(s1);
        lista_servicios.add(s2);
        lista_servicios.add(s3);
        
        lista_servicios.get(0).setSertar(st2);
               
        Controlador_Consultar_Avance conavan=new Controlador_Consultar_Avance();
        
        conavan.consultarAvance(lista_servicios);
        
        
    }

}
