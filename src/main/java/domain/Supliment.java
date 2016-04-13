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

    public void afisare() {
        System.out.println("Afisare informatii despre Supliment:");
        System.out.println("Nume:" + getNume());
        System.out.println("Producator:");
        getProducator().afisare();
        System.out.println("Pret:" + getPret());
        System.out.println("Gramaj:" + getGramaj());
        System.out.println("Minerale:");
        for (Vitamina vitamina : getVitamine()) {
            vitamina.afisare();
        }
        System.out.println("Vitamine:");
        for (Mineral mineral : getMinerale()) {
            mineral.afisare();
        }

    }

    public void adaugaVitamina(Vitamina vitamina) {
        if (vitamine != null && !vitamine.contains(vitamina)) {
            this.vitamine.add(vitamina);
            System.out.println("S-a adaugat cu succes vitamina:" + vitamina.getNume());
        }
    }

    public void adaugaMineral(Mineral mineral) {
        if (minerale != null && !minerale.contains(mineral)) {
            this.minerale.add(mineral);
            System.out.println("S-a adaugat cu succes mineralul:" + mineral.getNume());
        }
    }


}
