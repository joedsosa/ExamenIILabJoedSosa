
package examenii_p2_joedsosa;

import java.io.Serializable;
import java.util.ArrayList;


public class Deporte implements Serializable {
   private ArrayList <Torneo> torneos = new ArrayList();
   private String nombre;

    public Deporte() {
        
    }

    public Deporte(String nombre) {
        this.torneos = torneos;
        this.nombre = nombre;
    }
    public void addTorneo(Torneo torneo){
        this.torneos.add(torneo);
    }

    public ArrayList<Torneo> getTorneos() {
        return torneos;
    }

    public void setTorneos(ArrayList<Torneo> torneos) {
        this.torneos = torneos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
   
   

   

    
   
}
