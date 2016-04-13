package domain;

import domain.util.SexPersoana;

public class Persoana {
    private Integer varsta;
    private SexPersoana sex;

    public Persoana(Integer varsta, SexPersoana sex) {
        this.varsta = varsta;
        this.sex = sex;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }

    public SexPersoana getSex() {
        return sex;
    }

    public void setSex(SexPersoana sex) {
        this.sex = sex;
    }

    public void afisare() {
//todo
    }

    public void cautaAfectiune(String numeAfectiune) {
//todo
    }

    public void afisareNecesar() {
//todo
    }


}
