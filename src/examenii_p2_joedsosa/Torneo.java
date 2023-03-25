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
public class Torneo implements Serializable {

    private String nombre;
    private ArrayList<Equipo> equipos=new ArrayList();
    private ArrayList<Partido> partidos=new ArrayList();
    private String periodo;

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getPeriodo() {
        return periodo;
    }

    public Torneo(String nombre, String periodo) {
        this.nombre = nombre;
        this.periodo = periodo;
    }

    public void partidosagg(Partido par) {
        this.partidos.add(par);
        
    } public void equiposagg(Equipo e){
        this.equipos.add(e);
    }

    public String getNombre() {
        return nombre;

    }

    public void agregarTeam(Equipo t) {
        this.equipos.add(t);

    }

    public void agregarMatch(Partido p) {
        this.partidos.add(p);
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
