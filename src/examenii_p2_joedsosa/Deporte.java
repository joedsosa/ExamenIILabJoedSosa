
package examenii_p2_joedsosa;

import java.io.Serializable;
import java.util.ArrayList;


public class Deporte implements Serializable {
   private ArrayList <Deporte> deporte;
   private String nombre;
   private String periodo;
   
   public Deporte(ArrayList<Deporte> deporte, String nombre, String periodo) {
        this.deporte = deporte;
        this.nombre = nombre;
        this.periodo = periodo;
    }

    public ArrayList<Deporte> getDeporte() {
        return deporte;
    }

    public void setDeporte(ArrayList<Deporte> deporte) {
        this.deporte = deporte;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    @Override
    public String toString() {
        return nombre;
    }

    
   
}
