package domain;

import domain.util.SexPersoana;

import java.util.ArrayList;

public class Afectiune {
    private String nume;
    private String descriere;
    private ArrayList<Simptom> simptome;
    private ArrayList<Meniu> meniuri;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public ArrayList<Simptom> getSimptome() {
        return simptome;
    }

    public void setSimptome(ArrayList<Simptom> simptome) {
        this.simptome = simptome;
    }

    public ArrayList<Meniu> getMeniuri() {
        return meniuri;
    }

    public void setMeniuri(ArrayList<Meniu> meniuri) {
        this.meniuri = meniuri;
    }

    public Afectiune(String nume, String descriere, ArrayList<Simptom> simptome, ArrayList<Meniu> meniuri) {
        this.nume = nume;
        this.descriere = descriere;
        this.simptome = simptome;
        this.meniuri = meniuri;
    }

    public Afectiune() {
        this.simptome = new ArrayList<Simptom>();
        this.meniuri = new ArrayList<Meniu>();
    }

    public void afisare() {
        System.out.println("Se afiseaza informatii despre afectiune:");
        System.out.println("Nume:" + getNume());
        System.out.println("Descriere:" + getDescriere());
        System.out.println("Simptome:");
        for (Simptom simptom : simptome) {
            simptom.afisare();
        }
        System.out.println("Meniuri:");
        for (Meniu meniu : meniuri) {
            meniu.afisare();
        }
    }

    public void afisare(SexPersoana sex, Integer varsta) {
        System.out.println("Se afiseaza informatii despre afectiune:");
        System.out.println("Nume:" + getNume());
        System.out.println("Descriere:" + getDescriere());
        System.out.println("Simptome:");
        for (Simptom simptom : simptome) {
            simptom.afisare();
        }
        System.out.println("Meniuri:");
        for (Meniu meniu : meniuri) {
            if (meniu.getGrupDeVarsta().getSex().equals(sex.toString()) &&
                    (meniu.getGrupDeVarsta().getVarstaMinima() <= varsta) &&
                    (meniu.getGrupDeVarsta().getVarstaMaxima() >= varsta))
                meniu.afisare();
        }
    }

    public void afisare(SexPersoana sex) {
        System.out.println("Se afiseaza informatii despre afectiune:");
        System.out.println("Nume:" + getNume());
        System.out.println("Descriere:" + getDescriere());
        System.out.println("Simptome:");
        for (Simptom simptom : simptome) {
            simptom.afisare();
        }
        System.out.println("Meniuri:");
        for (Meniu meniu : meniuri) {
            if (meniu.getGrupDeVarsta().getSex().equals(sex.toString()))
                meniu.afisare();
        }
    }

    public void afisare(Integer varsta) {
        System.out.println("Se afiseaza informatii despre afectiune:");
        System.out.println("Nume:" + getNume());
        System.out.println("Descriere:" + getDescriere());
        System.out.println("Simptome:");
        for (Simptom simptom : simptome) {
            simptom.afisare();
        }
        System.out.println("Meniuri:");
        for (Meniu meniu : meniuri) {
            if ((meniu.getGrupDeVarsta().getVarstaMinima() <= varsta) &&
                    (meniu.getGrupDeVarsta().getVarstaMaxima() >= varsta))
                meniu.afisare();
        }
    }

    public void adauaSimptom(Simptom simptom) {
        if (simptom != null && !simptome.contains(simptom)) {
            this.simptome.add(simptom);
            System.out.println("S-a adaugat cu succes simptomul:" + simptom.getDescriere());
        }
    }

    public void adaugaMeniu(Meniu meniu) {
        if (meniu != null && !meniuri.contains(meniu)) {
            this.meniuri.add(meniu);
            System.out.println("S-a adaugat cu succes meniul");
        }
    }

}
