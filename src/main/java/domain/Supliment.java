package domain;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Supliment {
    private ArrayList<Vitamina> vitamine;
    private ArrayList<Mineral> minerale;
    private Integer gramaj;
    private String nume;
    private Producator producator;
    private BigDecimal pret;

    public Supliment(ArrayList<Vitamina> vitamine, ArrayList<Mineral> minerale, Integer gramaj, String nume, Producator producator, BigDecimal pret) {
        this.vitamine = vitamine;
        this.minerale = minerale;
        this.gramaj = gramaj;
        this.nume = nume;
        this.producator = producator;
        this.pret = pret;
    }

    public ArrayList<Vitamina> getVitamine() {
        return vitamine;
    }

    public void setVitamine(ArrayList<Vitamina> vitamine) {
        this.vitamine = vitamine;
    }

    public ArrayList<Mineral> getMinerale() {
        return minerale;
    }

    public void setMinerale(ArrayList<Mineral> minerale) {
        this.minerale = minerale;
    }

    public Integer getGramaj() {
        return gramaj;
    }

    public void setGramaj(Integer gramaj) {
        this.gramaj = gramaj;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Producator getProducator() {
        return producator;
    }

    public void setProducator(Producator producator) {
        this.producator = producator;
    }

    public BigDecimal getPret() {
        return pret;
    }

    public void setPret(BigDecimal pret) {
        this.pret = pret;
    }

    public void afisare(){
        //todo
    }

    public void adaugaVitamina(Vitamina vitamina){
        //todo
    }

    public void adaugaMineral(Mineral mineral){
        //todo
    }


}
