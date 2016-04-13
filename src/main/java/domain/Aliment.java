package domain;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Aliment {
    private String nume;
    private InformatiiNutritionale informatiiNutritionale;
    private String detalii;
    private ArrayList<Vitamina> vitamine;
    private ArrayList<Mineral> minerale;
    private String tipGatire;
    private BigDecimal cantitate;
    private BigDecimal kcal;

    public Aliment(String nume, InformatiiNutritionale informatiiNutritionale, String detalii, ArrayList<Vitamina> vitamine, ArrayList<Mineral> minerale, String tipGatire, BigDecimal cantitate, BigDecimal kcal) {
        this.nume = nume;
        this.informatiiNutritionale = informatiiNutritionale;
        this.detalii = detalii;
        this.vitamine = vitamine;
        this.minerale = minerale;
        this.tipGatire = tipGatire;
        this.cantitate = cantitate;
        this.kcal = kcal;
    }

    public Aliment(){
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
//todo
    }

    public void adaugaVitamina(Vitamina vitamina) {
//todo
    }

    public void adaugaMineral(Mineral mineral) {
//todo
    }

}
