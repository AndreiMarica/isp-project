package domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Aliment {
    private String nume;
    private InformatiiNutritionale informatiiNutritionale;
    private String detalii;
    private List<Vitamina> vitamine;
    private List<Mineral> minerale;
    private String tipGatire;
    private BigDecimal cantitate;
    private BigDecimal kcal;

    public Aliment(String nume, InformatiiNutritionale informatiiNutritionale, String detalii, List<Vitamina> vitamine, List<Mineral> minerale, String tipGatire, BigDecimal cantitate, BigDecimal kcal) {
        this.nume = nume;
        this.informatiiNutritionale = informatiiNutritionale;
        this.detalii = detalii;
        this.vitamine = vitamine;
        this.minerale = minerale;
        this.tipGatire = tipGatire;
        this.cantitate = cantitate;
        this.kcal = kcal;
    }

    public Aliment() {
        this.vitamine = new ArrayList<Vitamina>();
        this.minerale = new ArrayList<Mineral>();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public InformatiiNutritionale getInformatiiNutritionale() {
        return informatiiNutritionale;
    }

    public void setInformatiiNutritionale(InformatiiNutritionale informatiiNutritionale) {
        this.informatiiNutritionale = informatiiNutritionale;
    }

    public String getDetalii() {
        return detalii;
    }

    public void setDetalii(String detalii) {
        this.detalii = detalii;
    }

    public List<Vitamina> getVitamine() {
        return vitamine;
    }

    public void setVitamine(ArrayList<Vitamina> vitamine) {
        this.vitamine = vitamine;
    }

    public List<Mineral> getMinerale() {
        return minerale;
    }

    public void setMinerale(ArrayList<Mineral> minerale) {
        this.minerale = minerale;
    }

    public String getTipGatire() {
        return tipGatire;
    }

    public void setTipGatire(String tipGatire) {
        this.tipGatire = tipGatire;
    }

    public BigDecimal getCantitate() {
        return cantitate;
    }

    public void setCantitate(BigDecimal cantitate) {
        this.cantitate = cantitate;
    }

    public BigDecimal getKcal() {
        return kcal;
    }

    public void setKcal(BigDecimal kcal) {
        this.kcal = kcal;
    }

    public void afisare() {
        System.out.println("Informatii despre Aliment:");
        System.out.println("Nume:" + getNume());
        getInformatiiNutritionale().afisare();
        System.out.println("Detalii:" + getDetalii());
        System.out.println("Vitamine:");
        for (Vitamina vitamina : getVitamine()) {
            vitamina.afisare();
        }
        System.out.println("Minerale:");
        for (Mineral mineral : getMinerale()) {
            mineral.afisare();
        }
        System.out.println("Tip de Gatire:" + getTipGatire());
        System.out.println("Cantintate:" + getCantitate());
        System.out.println("KCAL:" + getKcal());
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
