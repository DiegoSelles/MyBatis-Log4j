/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mappers;

import java.util.List;
import Model.Actividad;
import org.apache.ibatis.annotations.Select;
/**
 *
 * @author Diego
 */
public interface ActividadMapper {
    
    @Select("SELECT * FROM actividad")
    public List<Actividad> getAllActivities() throws Exception;
}
