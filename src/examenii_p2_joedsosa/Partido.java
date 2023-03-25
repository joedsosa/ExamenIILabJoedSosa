
package examenii_p2_joedsosa;

import java.io.Serializable;


class Partido implements Serializable {
    private Equipo[] equipos = new Equipo[2];
    private Integer[] resultados = new Integer[2];

    public Partido() {
    }

    public Equipo[] getEquipos() {
        return equipos;
    }

    public void setEquipos(Equipo[] equipos) {
        this.equipos = equipos;
    }

    public Integer[] getResultados() {
        return resultados;
    }

    public void setResultados(Integer[] resultados) {
        this.resultados = resultados;
    }

   
    
}
