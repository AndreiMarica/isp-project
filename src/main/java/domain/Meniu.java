package domain;

import domain.util.GrupDeVarsta;

import java.math.BigDecimal;
import java.util.ArrayList;


public class Meniu {

    private ArrayList<Masa> mese;
    private ArrayList<Supliment> suplimente;
    private GrupDeVarsta grupDeVarsta;

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
        System.out.println("Se afiseaza informatiile despre meniu:");
        afisareMese();
        afisareSuplimente();
        System.out.println("Grupa de varsta:");
        getGrupDeVarsta().afisare();
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
        System.out.println("Se afiseaza mesele:");
        for (Masa masa : getMese()) {
            masa.afisare();
        }
    }

    public void afisareSuplimente() {
        System.out.println("Se afiseaza suplimentele:");
        for (Supliment supliment : suplimente) {
            supliment.afisare();
        }
    }

    public void afisareMasaDupaTip(String tipMasa) {
        for (Masa masa : getMese()) {
            if (masa.getTipMasa().toString().equals(tipMasa)) {
                System.out.println("S-a gasit masa cu tipul:" + tipMasa);
                System.out.println("Se afiseaza informatii despre masa gasita:");
                masa.afisare();
                return;
            }
        }
        System.out.println("Nu s-a gasit masa in meniu cu tipul: " + tipMasa);
    }

    public void afisareInformatii(String informatii) {
        //todo logica complexa
    }

    public void afisareInformatiiPeMasa(String tipMasa, String informatii) {
        //todo logica complexa
    }

    public void cautaAliment(String aliment) {
        //todo logica complexa
    }

    public void cautaSuplimentDupaPret(BigDecimal minim, BigDecimal maxim) {
        if (minim == null || maxim == null) {
            System.out.println("Nu s-au introdus corect datele de cautare! pret minim sau maxim null");
            return;
        } else if (minim.compareTo(maxim) == 1) {
            System.out.println("S-au introdus date incorecte! minimul este > decat maximul");
            return;
        } else if (minim.compareTo(maxim) == 0) {
            System.out.println("S-au introdus date incorecte! minimul = maximul");
            return;
        }

        System.out.println("Se cauta suplimente dupa pretul minim: " + minim + " si pretul maxim:" + maxim);

        Boolean isFoundFlag = false;

        for (Supliment supliment : suplimente) {
            if ((supliment.getPret().compareTo(maxim) <= 0) && (supliment.getPret().compareTo(minim) >= 0)) {
                supliment.afisare();
                isFoundFlag = true;
            }
        }

        if (!isFoundFlag) {
            System.out.println("Nu s-a gasit supliment in intervalul dorit.");
        }
    }

    public void cautaSuplimentDupaVitamina(String vitamina) {
        //todo
    }

    public void cautaSuplimentDupaMineral(String mineral) {
        //todo
    }
}

