package domain;

import java.math.BigDecimal;

public class Vitamina {
    private String nume;
    private String simptomeDeficit;
    private String simptomeExces;
    private BigDecimal gramaj;

    public Vitamina(String nume, String simptomeDeficit, String simtpomeExces, BigDecimal gramaj) {
        this.nume = nume;
        this.simptomeDeficit = simptomeDeficit;
        this.simptomeExces = simtpomeExces;
        this.gramaj = gramaj;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getSimptomeDeficit() {
        return simptomeDeficit;
    }

    public void setSimptomeDeficit(String simptomeDeficit) {
        this.simptomeDeficit = simptomeDeficit;
    }

    public String getSimptomeExces() {
        return simptomeExces;
    }

    public void setSimptomeExces(String simptomeExces) {
        this.simptomeExces = simptomeExces;
    }

    public BigDecimal getGramaj() {
        return gramaj;
    }

    public void setGramaj(BigDecimal gramaj) {
        this.gramaj = gramaj;
    }

    public void afisare() {
        System.out.println("Vitamina cu numele: " + this.nume
                + " poate avea urmatoarele simptome de deficit: " + this.simptomeDeficit
                + " ,si urmatoarele simptome de exces: " + this.simptomeExces
                + " si un gramaj de: " + this.gramaj.toString());
    }
}
