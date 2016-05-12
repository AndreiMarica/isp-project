package domain;

import domain.util.GrupaDeVarsta;
import domain.util.TipInformatii;
import domain.util.TipMasa;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Meniu {

    private List<Masa> mese;
    private List<Supliment> suplimente;
    private GrupaDeVarsta grupaDeVarsta;

    public Meniu(List<Masa> mese, List<Supliment> suplimente, GrupaDeVarsta grupaDeVarsta) {
        this.suplimente = suplimente;
        this.grupaDeVarsta = grupaDeVarsta;
        this.mese = mese;
    }

    public Meniu(GrupaDeVarsta grupaDeVarsta) {
        this.grupaDeVarsta = grupaDeVarsta;
        this.mese = new ArrayList<Masa>();
        this.suplimente = new ArrayList<Supliment>();
    }


    public List<Masa> getMese() {
        return mese;
    }

    public void setMese(ArrayList<Masa> mese) {
        this.mese = mese;
    }

    public List<Supliment> getSuplimente() {
        return suplimente;
    }

    public void setSuplimente(ArrayList<Supliment> suplimente) {
        this.suplimente = suplimente;
    }

    public GrupaDeVarsta getGrupaDeVarsta() {
        return grupaDeVarsta;
    }

    public void setGrupaDeVarsta(GrupaDeVarsta grupaDeVarsta) {
        this.grupaDeVarsta = grupaDeVarsta;
    }

    public void afisare() {
        System.out.println("Se afiseaza informatiile despre meniu:");
        afisareMese();
        afisareSuplimente();
        System.out.println("Grupa de varsta:");
        getGrupaDeVarsta().afisare();
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

    public boolean afisareMasaDupaTip(String tipMasa) {
        for (Masa masa : getMese()) {
            if (masa.getTipMasa().toString().equals(tipMasa)) {
                System.out.println("S-a gasit masa cu tipul:" + tipMasa);
                System.out.println("Se afiseaza informatii despre masa gasita:");
                masa.afisare();
                return true;
            }
        }
        System.out.println("Nu s-a gasit masa in meniu cu tipul: " + tipMasa);
        return false;
    }

    public void afisareInformatii(String informatii) {
        BigDecimal info = new BigDecimal("0");
        if (informatii.equals(TipInformatii.carbohidrati.toString())) {
            for (Masa masa : getMese()) {
                for (Aliment aliment : masa.getAlimente()) {
                    info = info.add(aliment.getInformatiiNutritionale().getCarbohidrati());
                }
            }
        } else if (informatii.equals(TipInformatii.fibre.toString())) {
            for (Masa masa : getMese()) {
                for (Aliment aliment : masa.getAlimente()) {
                    info = info.add(aliment.getInformatiiNutritionale().getFibre());
                }
            }
        } else if (informatii.equals(TipInformatii.grasimi.toString())) {
            for (Masa masa : getMese()) {
                for (Aliment aliment : masa.getAlimente()) {
                    info = info.add(aliment.getInformatiiNutritionale().getGrasimi());
                }
            }
        } else if (informatii.equals(TipInformatii.kcal.toString())) {
            for (Masa masa : getMese()) {
                for (Aliment aliment : masa.getAlimente()) {
                    info = info.add(aliment.getKcal());
                }
            }
        } else if (informatii.equals(TipInformatii.proteine.toString())) {
            for (Masa masa : getMese()) {
                for (Aliment aliment : masa.getAlimente()) {
                    info = info.add(aliment.getInformatiiNutritionale().getProteine());
                }
            }
        } else {
            System.out.println("Nu exista acest tip de informatii");
            return;
        }

        System.out.println("Totalul de informatii despre: " + informatii + " este:" + info);
    }

    public boolean afisareInformatiiPeMasa(String tipMasa, String informatii) {
        BigDecimal info = new BigDecimal("0");
        if (Arrays.asList(TipMasa.mic_dejun.toString(), TipMasa.cina.toString(), TipMasa.pranz.toString()).contains(tipMasa)) {
            if (informatii.equals(TipInformatii.carbohidrati.toString())) {
                for (Masa masa : getMese()) {
                    if (masa.getTipMasa().toString().equals(tipMasa)) {
                        for (Aliment aliment : masa.getAlimente()) {
                            info = info.add(aliment.getInformatiiNutritionale().getCarbohidrati());
                        }
                    }
                }
            } else if (informatii.equals(TipInformatii.fibre.toString())) {
                for (Masa masa : getMese()) {
                    if (masa.getTipMasa().toString().equals(tipMasa)) {
                        for (Aliment aliment : masa.getAlimente()) {
                            info = info.add(aliment.getInformatiiNutritionale().getFibre());
                        }
                    }
                }
            } else if (informatii.equals(TipInformatii.grasimi.toString())) {
                for (Masa masa : getMese()) {
                    if (masa.getTipMasa().toString().equals(tipMasa)) {
                        for (Aliment aliment : masa.getAlimente()) {
                            info = info.add(aliment.getInformatiiNutritionale().getGrasimi());
                        }
                    }
                }
            } else if (informatii.equals(TipInformatii.kcal.toString())) {
                for (Masa masa : getMese()) {
                    if (masa.getTipMasa().toString().equals(tipMasa)) {
                        for (Aliment aliment : masa.getAlimente()) {
                            info = info.add(aliment.getKcal());
                        }
                    }
                }
            } else if (informatii.equals(TipInformatii.proteine.toString())) {
                for (Masa masa : getMese()) {
                    if (masa.getTipMasa().toString().equals(tipMasa)) {
                        for (Aliment aliment : masa.getAlimente()) {
                            info = info.add(aliment.getInformatiiNutritionale().getProteine());
                        }
                    }
                }
            } else {
                System.out.println("Nu exista acest tip de informatii");
                return false;
            }
        } else {
            System.out.println("Nu exista acest tip de masa");
            return false;
        }
        System.out.println("Totalul de informatii de tip: " + informatii + " pentru masa de tip: " + tipMasa + " este urmatorul: " + info);
        return true;
    }

    public boolean cautaAliment(String aliment) {
        if (aliment != null && aliment.matches("^[a-zA-Z]*$")) {
            for (Masa masa : getMese()) {
                for (Aliment alimentDinMeniu : masa.getAlimente()) {
                    if (alimentDinMeniu.getNume().equals(aliment)) {
                        System.out.println("S-a gasit alimentul cautat in masa de tip:" + masa.getTipMasa().toString());
                        alimentDinMeniu.afisare();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean cautaSuplimentDupaPret(BigDecimal minim, BigDecimal maxim) {
        if (minim == null || maxim == null) {
            System.out.println("Nu s-au introdus corect datele de cautare! pret minim sau maxim null");
            return false;
        } else if (minim.compareTo(maxim) == 1) {
            System.out.println("S-au introdus date incorecte! minimul este > decat maximul");
            return false;
        } else if (minim.compareTo(maxim) == 0) {
            System.out.println("S-au introdus date incorecte! minimul = maximul");
            return false;
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
            return false;
        }else{
            return true;
        }
    }

    public boolean cautaSuplimentDupaVitamina(String vitamina) {
        if (vitamina != null) {
            for (Supliment supliment : getSuplimente()) {
                for (Vitamina vitmn : supliment.getVitamine()) {
                    if (vitmn.getNume().equals(vitamina)) {
                        System.out.println("Supliment care contine vitamina:" + vitamina);
                        supliment.afisare();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean cautaSuplimentDupaMineral(String mineral) {
        if (mineral != null) {
            for (Supliment supliment : getSuplimente()) {
                for (Mineral minrl : supliment.getMinerale()) {
                    if (minrl.getNume().equals(mineral)) {
                        System.out.println("Supliment care contine mineralul:" + mineral);
                        supliment.afisare();
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

