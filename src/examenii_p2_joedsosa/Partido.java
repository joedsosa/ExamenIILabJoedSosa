
package examenii_p2_joedsosa;

import java.io.Serializable;


class Partido implements Serializable {
    private String equipo1,equipo2;
    private int resul_equipo1,resul_equipo2;

    public String getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(String equipo1) {
        this.equipo1 = equipo1;
    }

    public String getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(String equipo2) {
        this.equipo2 = equipo2;
    }

    public int getResul_equipo1() {
        return resul_equipo1;
    }

    public void setResul_equipo1(int resul_equipo1) {
        this.resul_equipo1 = resul_equipo1;
    }

    public int getResul_equipo2() {
        return resul_equipo2;
    }

    public void setResul_equipo2(int resul_equipo2) {
        this.resul_equipo2 = resul_equipo2;
    }
    
}
