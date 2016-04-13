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
     * @param mese
     * @param suplimente
     * @param grupDeVarsta
     */
    public Meniu(ArrayList<Masa> mese, ArrayList<Supliment> suplimente, GrupDeVarsta grupDeVarsta) {
        this.mese = mese;
        this.suplimente = suplimente;
        this.grupDeVarsta = grupDeVarsta;
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

    public void adaugaSupliment(Supliment supliment) {
        //todo
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

