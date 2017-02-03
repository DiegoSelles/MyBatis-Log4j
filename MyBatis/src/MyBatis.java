
import DAO.ActividadDAO;
import Model.Actividad;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diego
 */
public class MyBatis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        Actividad activity = new Actividad();
        ActividadDAO activityDAO = new ActividadDAO();
        
        List<Actividad> activitiesList = new ArrayList<Actividad>();
        activitiesList = activityDAO.getAllActivities();
        Iterator<Actividad> it = activitiesList.iterator();
        
        while(it.hasNext()){
            activity = it.next();
            System.out.println("#####################################################");
            System.out.println("idActividad:"+ activity.getIdActividad());
            System.out.println("Nombre:" + activity.getNombre() );
        }
    }
    
}
