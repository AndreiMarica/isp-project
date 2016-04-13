package domain;

import java.math.BigDecimal;

public class Vitamina {
    private String nume;
    private String simptomeDeficit;
    private String simtpomeExces;
    private BigDecimal gramaj;

    public Vitamina(String nume, String simptomeDeficit, String simtpomeExces, BigDecimal gramaj) {
        this.nume = nume;
        this.simptomeDeficit = simptomeDeficit;
        this.simtpomeExces = simtpomeExces;
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

    public String getSimtpomeExces() {
        return simtpomeExces;
    }

    public void setSimtpomeExces(String simtpomeExces) {
        this.simtpomeExces = simtpomeExces;
    }

    public BigDecimal getGramaj() {
        return gramaj;
    }

    public void setGramaj(BigDecimal gramaj) {
        this.gramaj = gramaj;
    }

    public void afisare(){
//todo
    }
}
