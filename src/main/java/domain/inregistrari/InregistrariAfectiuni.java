package domain.inregistrari;

import domain.Afectiune;
import domain.Meniu;

import java.util.HashMap;

public class InregistrariAfectiuni {
    public static HashMap<String, Afectiune> inregistrariAfectiuni;

    public InregistrariAfectiuni() {
        inregistrariAfectiuni = new HashMap<String, Afectiune>();
        //todo adaugat inregistari
        Afectiune afectiune1 = new Afectiune();
        afectiune1.adaugaMeniu(new Meniu(null,null,null));
    }

    public void adaugaAfectiuneLaInregistrari(Afectiune afectiune){
        inregistrariAfectiuni.put(afectiune.getNume(),afectiune);
    }



}
