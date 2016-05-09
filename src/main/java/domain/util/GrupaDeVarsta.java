package domain.util;

import domain.Mineral;
import domain.Vitamina;
import factory.MineraleFactory;
import factory.VitamineFactory;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public enum GrupaDeVarsta {
    A(new BigDecimal("100"),
            Arrays.asList(MineraleFactory.mineral1, MineraleFactory.mineral2),
            Arrays.asList(VitamineFactory.vitaminaA, VitamineFactory.vitaminaB14),
            100,
            150,
            250,
            350,
            30,
            2,
            SexPersoana.F.toString()
    ),
    B(null, null, null, null, null, null, null, null, null, null),
    C(null, null, null, null, null, null, null, null, null, null),
    D(null, null, null, null, null, null, null, null, null, null),
    E(null, null, null, null, null, null, null, null, null, null),
    F(null, null, null, null, null, null, null, null, null, null);

    private final String sex;
    private final Integer varstaMinima;
    private final Integer varstaMaxima;
    private final Integer necesarGrasimi;
    private final Integer necesarCarbohidrati;
    private final Integer necesarProteine;
    private final Integer necesarFibre;
    private final List<Vitamina> necesarVitamine;
    private final List<Mineral> necesarMinerale;
    private final BigDecimal kcal;

    public List<Vitamina> getNecesarVitamine() {
        return necesarVitamine;
    }

    public List<Mineral> getNecesarMinerale() {
        return necesarMinerale;
    }

    public Integer getNecesarFibre() {
        return necesarFibre;
    }

    public Integer getncesarProteine() {
        return necesarProteine;
    }

    public Integer getNecesarCarbohidrati() {
        return necesarCarbohidrati;
    }

    public Integer getNecesarGrasimi() {
        return necesarGrasimi;
    }

    public Integer getVarstaMaxima() {
        return varstaMaxima;
    }

    public Integer getVarstaMinima() {
        return varstaMinima;

    }

    public String getSex() {
        return sex;

    }

    public BigDecimal getKcal() {
        return kcal;
    }

    public static void getByGenderAndAge(String gender, Integer age) {
        for (GrupaDeVarsta grupaDeVarsta : GrupaDeVarsta.values()) {
            if (grupaDeVarsta.getVarstaMaxima() != null &&
                    grupaDeVarsta.getVarstaMinima() != null &&
                    grupaDeVarsta.getSex().equals(gender) &&
                    age <= grupaDeVarsta.getVarstaMaxima() &&
                    age >= grupaDeVarsta.getVarstaMinima()) {
                System.out.println("Se afiseaza informatiile despre necesar conform sexulu: " + gender + " si varstei de:" + age);
                System.out.println("Informatiile se regasesc in grupa de varsta din:" + grupaDeVarsta.getSex() + " varsta minima:" + grupaDeVarsta.getVarstaMinima() + " varsta maxima:" + grupaDeVarsta.getVarstaMaxima());
                grupaDeVarsta.afisare();
                break;
            }
        }
    }


    GrupaDeVarsta(BigDecimal kcal,
                  List<Mineral> necesarMinerale,
                  List<Vitamina> necesarVitamine,
                  Integer necesarFibre,
                  Integer necesarProteine,
                  Integer necesarCarbohidrati,
                  Integer necesarGrasimi,
                  Integer varstaMaxima,
                  Integer varstaMinima,
                  String sex) {
        this.kcal = kcal;
        this.necesarMinerale = necesarMinerale;
        this.necesarVitamine = necesarVitamine;
        this.necesarFibre = necesarFibre;
        this.necesarProteine = necesarProteine;
        this.necesarCarbohidrati = necesarCarbohidrati;
        this.necesarGrasimi = necesarGrasimi;
        this.varstaMaxima = varstaMaxima;
        this.varstaMinima = varstaMinima;
        this.sex = sex;
    }

    public void afisare() {
        System.out.println("---Informatii Grupa de Varsta:");
        System.out.println("Sex: " + getSex());
        System.out.println("Varsta Minima: " + getVarstaMinima());
        System.out.println("Varsta Maxima: " + getVarstaMaxima());
        System.out.println("Necesar Grasimi: " + getNecesarGrasimi());
        System.out.println("Necesar Carbohidrati: " + getNecesarCarbohidrati());
        System.out.println("Necesar Proteine: " + getncesarProteine());
        System.out.println("Necesar Fibre: " + getNecesarFibre());
        System.out.println("Necesar Vitamine: ");
        for (Vitamina vitamina : getNecesarVitamine()) {
            vitamina.afisare();
        }
        System.out.println("Necesar Minerale: ");
        for (Mineral mineral : getNecesarMinerale()) {
            mineral.afisare();
        }
        System.out.println("KCAL: " + getKcal());
        System.out.println("------------------------");
    }
}
