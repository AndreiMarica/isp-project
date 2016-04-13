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
//todo
    }

    public void adaugaAliment(Aliment aliment){
//todo
    }
}
