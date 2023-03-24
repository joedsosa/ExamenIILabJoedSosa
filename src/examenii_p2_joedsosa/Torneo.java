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
public class Torneo implements Serializable{
    private  String nombre;
    private ArrayList<Equipo> equipos;
    private ArrayList<Partido> partidos;

    public Torneo(String nombre, ArrayList<Equipo> equipos, ArrayList<Partido> partidos) {
        this.nombre = nombre;
        this.equipos = equipos;
        this.partidos = partidos;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }

    @Override
    public String toString() {
        return nombre;
    }

    
    
}
