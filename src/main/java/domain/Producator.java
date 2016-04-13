package domain;

public class Producator {
    private String nume;
    private String adresa;
    private String detalii;

    public Producator(String nume, String adresa, String detalii) {
        this.nume = nume;
        this.adresa = adresa;
        this.detalii = detalii;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getDetalii() {
        return detalii;
    }

    public void setDetalii(String detalii) {
        this.detalii = detalii;
    }

    public void afisare() {
        System.out.println("Producatorul cu numele: " + this.nume
                + " are adresa: " + this.adresa
                + " ,INFO: " + this.detalii);
    }
}
