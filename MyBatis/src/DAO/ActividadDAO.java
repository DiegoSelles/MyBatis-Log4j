/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Configuration.ConnectionFactory;
import Mappers.ActividadMapper;
import Model.Actividad;
import java.util.List;
import org.apache.ibatis.session.SqlSession;

/**
 *
 * @author Diego
 */
public class ActividadDAO {
    
        public List<Actividad> getAllActivities() throws Exception {
        SqlSession session = ConnectionFactory.getSession().openSession(); 
        ActividadMapper actividad = session.getMapper(ActividadMapper.class);
        List<Actividad> activitiesList = actividad.getAllActivities();
        session.close();
        return activitiesList;
        
    }
}
