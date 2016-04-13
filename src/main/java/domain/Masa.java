package domain;

import domain.util.TipMasa;

import java.util.ArrayList;

public class Masa {
    private ArrayList<Aliment> alimente;
    private TipMasa tipMasa;

    public Masa(ArrayList<Aliment> alimente, TipMasa tipMasa) {
        this.alimente = alimente;
        this.tipMasa = tipMasa;
    }

    public ArrayList<Aliment> getAlimente() {
        return alimente;
    }

    public void setAlimente(ArrayList<Aliment> alimente) {
        this.alimente = alimente;
    }

    public TipMasa getTipMasa() {
        return tipMasa;
    }

    public void setTipMasa(TipMasa tipMasa) {
        this.tipMasa = tipMasa;
    }

    public void afisare(){
        System.out.println("Afisare informatii despre Masa:");
        System.out.println("Alimente:");
        for(Aliment aliment : alimente){
            aliment.afisare();
        }
        System.out.println("Tip masa:"+ getTipMasa().toString());
    }

    public void adaugaAliment(Aliment aliment){
        if (alimente != null && !alimente.contains(aliment)) {
            this.alimente.add(aliment);
            System.out.println("S-a adaugat cu succes alimentul:" + aliment.getNume());
        }
    }
}
