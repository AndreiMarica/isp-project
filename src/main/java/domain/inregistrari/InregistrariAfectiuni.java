package domain.inregistrari;

import domain.*;
import domain.util.GrupaDeVarsta;
import domain.util.IntensitateSimptom;
import domain.util.TipMasa;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class InregistrariAfectiuni {
    public static HashMap<String, Afectiune> inregistrariAfectiuni;

    public InregistrariAfectiuni() {
        inregistrariAfectiuni = new HashMap<String, Afectiune>();
        //todo adaugat inregistari
        InformatiiNutritionale informatiiNutritionale = new InformatiiNutritionale(new BigDecimal("150"), new BigDecimal("150"),
                new BigDecimal("150"), new BigDecimal("150"));

        Vitamina vitaminaB = new Vitamina("VitaminaB", "DeficitVitamina2", "ExcesVitamina2", new BigDecimal("15"));
        Vitamina vitaminaA = new Vitamina("VitaminaA", "DeficitVitamina1", "ExcesVitamina1", new BigDecimal("15"));

        Mineral mineralA = new Mineral("mineral1", "energizant", new BigDecimal("15"));
        Mineral mineralB = new Mineral("mineral2", "energizant", new BigDecimal("15"));

        Producator producator1 = new Producator("Nume producator1", "Adresa Producator1", "Detalii producator 1");

        Aliment aliment1 = new Aliment("morcov",
                informatiiNutritionale,
                "e portocaliu",
                (ArrayList<Vitamina>) Arrays.asList(vitaminaA, vitaminaB),
                (ArrayList<Mineral>) Arrays.asList(mineralA, mineralB),
                "prajeala",
                new BigDecimal("150"),
                new BigDecimal("150"));

        Aliment aliment3 = new Aliment("gutuie",
                informatiiNutritionale,
                "e gutuie",
                (ArrayList<Vitamina>) Arrays.asList(vitaminaA, vitaminaB),
                (ArrayList<Mineral>) Arrays.asList(mineralA, mineralB),
                "cruda",
                new BigDecimal("150"),
                new BigDecimal("150"));

        Aliment aliment2 = new Aliment("rosie",
                informatiiNutritionale,
                "e rosie",
                (ArrayList<Vitamina>) Arrays.asList(vitaminaA, vitaminaB),
                (ArrayList<Mineral>) Arrays.asList(mineralA, mineralB),
                "salata",
                new BigDecimal("150"),
                new BigDecimal("150"));
        Masa masa1 = new Masa((ArrayList<Aliment>) Arrays.asList(aliment1, aliment2, aliment3), TipMasa.cina);


        Mineral mineral1 = new Mineral("mineral1", "energizant", new BigDecimal("15"));
        Mineral mineral2 = new Mineral("mineral2", "energizant", new BigDecimal("15"));
        Mineral mineral3 = new Mineral("mineral3", "energizant", new BigDecimal("15"));
        Mineral mineral4 = new Mineral("mineral4", "energizant", new BigDecimal("15"));

        Vitamina vitamina1 = new Vitamina("Vitamina1", "DeficitVitamina1", "ExcesVitamina1", new BigDecimal("15"));
        Vitamina vitamina2 = new Vitamina("Vitamina2", "DeficitVitamina2", "ExcesVitamina2", new BigDecimal("15"));
        Vitamina vitamina3 = new Vitamina("Vitamina3", "DeficitVitamina3", "ExcesVitamina3", new BigDecimal("15"));
        Vitamina vitamina4 = new Vitamina("Vitamina4", "DeficitVitamina4", "ExcesVitamina4", new BigDecimal("15"));

        ArrayList<Vitamina> vitaminaList = (ArrayList<Vitamina>) Arrays.asList(vitamina1, vitamina2, vitamina3, vitamina4);
        ArrayList<Mineral> mineralList = (ArrayList<Mineral>) Arrays.asList(mineral1, mineral2, mineral3, mineral4);

        Supliment supliment1 = new Supliment(vitaminaList, mineralList, new Integer("250"), "Supliment1", producator1, new BigDecimal("25"));

        Meniu meniu = new Meniu((ArrayList<Masa>) Arrays.asList(masa1), (ArrayList<Supliment>) Arrays.asList(supliment1), GrupaDeVarsta.A);

        Simptom simptom1 = new Simptom("Doare", IntensitateSimptom.mediu);
        Simptom simptom2 = new Simptom("Febra", IntensitateSimptom.slab);
        Afectiune afectiune1 = new Afectiune("Nume Afectiune 1", "Descriere Afectiune 1", (ArrayList<Simptom>) Arrays.asList(simptom1, simptom2), (ArrayList<Meniu>) Arrays.asList(meniu));

        adaugaAfectiuneLaInregistrari(afectiune1);
    }

    public void adaugaAfectiuneLaInregistrari(Afectiune afectiune) {
        inregistrariAfectiuni.put(afectiune.getNume(), afectiune);
    }


}
