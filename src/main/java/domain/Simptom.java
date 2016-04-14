package domain;

import domain.util.IntensitateSimptom;

public class Simptom {
    private String descriere;
    private IntensitateSimptom intensitate;

    public Simptom(String descriere, IntensitateSimptom intensitate) {
        this.descriere = descriere;
        this.intensitate = intensitate;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public IntensitateSimptom getIntensitate() {
        return intensitate;
    }

    public void setIntensitate(IntensitateSimptom intensitate) {
        this.intensitate = intensitate;
    }

    public void afisare(){
        System.out.println("Se afiseaza informatii despre simptom:");
        System.out.println("Descriere:" + getDescriere());
        System.out.println("Intensitatea simptomulu: "+ getIntensitate().toString());
    }
}
