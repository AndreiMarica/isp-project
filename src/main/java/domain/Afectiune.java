package domain;

import java.util.ArrayList;

public class Afectiune {
    private String nume;
    private String descriere;
    private ArrayList<Simptom> simptome;
    private ArrayList<Meniu> meniu;

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

    public ArrayList<Meniu> getMeniu() {
        return meniu;
    }

    public void setMeniu(ArrayList<Meniu> meniu) {
        this.meniu = meniu;
    }

    public Afectiune(String nume, String descriere, ArrayList<Simptom> simptome, ArrayList<Meniu> meniu) {
        this.nume = nume;
        this.descriere = descriere;
        this.simptome = simptome;
        this.meniu = meniu;
    }

    public void afisare(){
//todo
    }

    public void adauaSimptom(Simptom simptom){
//todo
    }

    public void adaugaMeniu(Meniu meniu){
//todo
    }

}
