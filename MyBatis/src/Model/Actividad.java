/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author Diego
 */
public class Actividad {
    private int idActividad;
    private String usuarioDni;
    private String nombre;
    private int numPlazas;
    private Date horario;
    private String lugar;
    private String tipoAct;
    
    public int getIdActividad(){
        return idActividad;
    }
    
    public String getUsuarioDni(){
        return usuarioDni;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getNumPlazas(){
        return numPlazas;
    }
    
    public Date getHorario(){
        return horario;
    }
    
    public String getLugar(){
        return lugar;
    }
    
    public String getTipoAct(){
        return tipoAct;
    }
    
    public void setIdActividad(int idActividad){
        this.idActividad = idActividad;
    }
    
    public void setUsuarioDni(String usuarioDni){
        this.usuarioDni = usuarioDni;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setNumPlazas(int numPlazas){
        this.numPlazas = numPlazas;
    }
    
    public void setHorario(Date horario){
        this.horario = horario;
    }    
    
    public void setLugar(String lugar){
        this.lugar = lugar;
    }    
    
    public void setTipoAct(String tipoAct){
        this.tipoAct = tipoAct;
    }    
}
