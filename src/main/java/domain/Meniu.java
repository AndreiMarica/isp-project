package domain;

import domain.util.GrupDeVarsta;

import java.util.ArrayList;

/**
 * todo doc
 */
public class Meniu {

    private ArrayList<Masa> mese;
    private ArrayList<Supliment> suplimente;
    private GrupDeVarsta grupDeVarsta;

    /**
     * todo doc
     *
     * @param suplimente
     * @param grupDeVarsta
     */
    public Meniu(ArrayList<Masa> mese, ArrayList<Supliment> suplimente, GrupDeVarsta grupDeVarsta) {
        this.suplimente = suplimente;
        this.grupDeVarsta = grupDeVarsta;
        this.mese = mese;
    }

    public Meniu(GrupDeVarsta grupDeVarsta) {
        this.grupDeVarsta = grupDeVarsta;
        this.mese = new ArrayList<Masa>();
        this.suplimente = new ArrayList<Supliment>();
    }


    public ArrayList<Masa> getMese() {
        return mese;
    }

    public void setMese(ArrayList<Masa> mese) {
        this.mese = mese;
    }

    public ArrayList<Supliment> getSuplimente() {
        return suplimente;
    }

    public void setSuplimente(ArrayList<Supliment> suplimente) {
        this.suplimente = suplimente;
    }

    public GrupDeVarsta getGrupDeVarsta() {
        return grupDeVarsta;
    }

    public void setGrupDeVarsta(GrupDeVarsta grupDeVarsta) {
        this.grupDeVarsta = grupDeVarsta;
    }

    public void afisare() {
        //todo
    }

    public void adaugaMasa(Masa masa) {
        if (masa != null && !mese.contains(masa)) {
            this.mese.add(masa);
            System.out.println("S-a adaugat cu succes masa:" + masa.getTipMasa().toString());
        }
    }

    public void adaugaSupliment(Supliment supliment) {
        if (supliment != null && !suplimente.contains(supliment)) {
            this.suplimente.add(supliment);
            System.out.println("S-a adaugat cu succes suplimentul:" + supliment.getNume());
        }

    }

    public void afisareMese() {
        //todo
    }

    public void afisareSuplimente() {
        //todo
    }

    public void afisareMasaDupaTip(String tipMasa) {
        //todo
    }

    public void afisareInformatii(String informatii) {
        //todo
    }

    public void afisareInformatiiPeMasa(String tipMasa, String informatii) {
        //todo
    }

    public void cautaAliment(String aliment) {
        //todo
    }

    public void cautaSupliemntDupaPret(Integer minim, Integer maxim) {
        //todo
    }

    public void cautaSupliemntDupaVitamina(String vitamina) {
        //todo
    }

    public void cautaSuplimentDupaMineral(String mineral) {
        //todo
    }
}

