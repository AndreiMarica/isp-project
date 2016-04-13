package domain;

import java.math.BigDecimal;

public class Mineral {
    private String nume;
    private String rol;
    private BigDecimal gramaj;

    public Mineral(String nume, String rol, BigDecimal gramaj) {
        this.nume = nume;
        this.rol = rol;
        this.gramaj = gramaj;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public BigDecimal getGramaj() {
        return gramaj;
    }

    public void setGramaj(BigDecimal gramaj) {
        this.gramaj = gramaj;
    }

    private void afisare() {
        System.out.println("Mineralul cu numele: " + this.nume
                + " are rolul: " + this.rol
                + " si un gramaj de: " + this.gramaj.toString());
    }
}
