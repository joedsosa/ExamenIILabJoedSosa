/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenii_p2_joedsosa;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author joeds
 */
class Equipo implements Serializable{
    private String nombre;
    private int puntos;
    private ArrayList<Partido>partido = new ArrayList();
    
   public void addPartido(Partido p ){
        this.partido.add(p);
    }

    public ArrayList<Partido> getPartido() {
        return partido;
    }

    public void setPartido(ArrayList<Partido> partido) {
        this.partido = partido;
    }
    
    public Equipo(String nombre) {
        this.nombre = nombre;
       
    }
     public void contpunt(int puntos){
        this.puntos+=puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return  nombre;
    }
    
}
