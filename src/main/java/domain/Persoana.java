package domain;

import domain.inregistrari.InregistrariAfectiuni;
import domain.util.GrupaDeVarsta;
import domain.util.SexPersoana;

public class Persoana {
    private Integer varsta;
    private SexPersoana sex;

    public Persoana(Integer varsta, SexPersoana sex) {
        this.varsta = varsta;
        this.sex = sex;
    }

    public Persoana(SexPersoana sex) {
        this.sex = sex;
        this.varsta = 0;
    }

    public Persoana(Integer varsta) {
        this.varsta = varsta;
        this.sex = SexPersoana.NESELECTAT;
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
        System.out.println("Se afiseaza informatii despre persoana:");
        System.out.println("Varsta: " + (getVarsta() == 0 ? "Neprecizat" : getVarsta()));
        System.out.println("Sex:" + getSex().toString());
    }

    public Afectiune cautaAfectiune(String numeAfectiune) {
        if (InregistrariAfectiuni.inregistrariAfectiuni.isEmpty()) {
            System.out.println("Nu s-au inserat inregistrari!");
            return null;
        }

        if (numeAfectiune != null && InregistrariAfectiuni.inregistrariAfectiuni.containsKey(numeAfectiune)) {
            Afectiune afectiune = InregistrariAfectiuni.inregistrariAfectiuni.get(numeAfectiune);
            if (!sex.toString().equals(SexPersoana.NESELECTAT.toString()) && varsta > 0) {
                afectiune.afisare(sex, varsta);
            } else if (sex.toString().equals(SexPersoana.NESELECTAT.toString())) {
                afectiune.afisare(sex);
            } else if (varsta == 0) {
                afectiune.afisare(varsta);
            } else {
                afectiune.afisare();
            }
            return afectiune;

        } else {
            System.out.println("Nu s-a gasit afectiunea precizata, va rugam selectati una din urmatoarele afectiuni");
        }
        return null;
    }

    public void afisareNecesar() {
        if (!sex.toString().equals(SexPersoana.NESELECTAT.toString()) && varsta > 0) {
            GrupaDeVarsta.getByGenderAndAge(sex.toString(), varsta);
        }
    }


}
