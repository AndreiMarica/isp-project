package domain.util;

import domain.Mineral;
import domain.Vitamina;

import java.math.BigDecimal;
import java.util.ArrayList;

public enum GrupDeVarsta {
    A(null,null,null,null,null,null,null,null,null,null),
    B(null,null,null,null,null,null,null,null,null,null),
    C(null,null,null,null,null,null,null,null,null,null),
    D(null,null,null,null,null,null,null,null,null,null),
    E(null,null,null,null,null,null,null,null,null,null),
    F(null,null,null,null,null,null,null,null,null,null)
    ;

    private final String sex;
    private final Integer varstaMinima;
    private final Integer varstaMaxima;
    private final Integer necesarGrasimi;
    private final Integer necesarCarbohidrati;
    private final Integer necesarProteine;
    private final Integer necesarFibre;
    private final ArrayList<Vitamina> necesarVitamine;
    private final ArrayList<Mineral> necesarMinerale;
    private final BigDecimal kcal;

    public ArrayList<Vitamina> getNecesarVitamine() {
        return necesarVitamine;
    }

    public ArrayList<Mineral> getNecesarMinerale() {
        return necesarMinerale;
    }

    public Integer getNecesarFibre(){
        return necesarFibre;
    }

    public Integer getncesarProteine(){
        return necesarProteine;
    }

    public Integer getNecesarCarbohidrati(){
        return necesarCarbohidrati;
    }

    public Integer getNecesarGrasimi(){
        return necesarGrasimi;
    }

    public Integer getVarstaMaxima(){
        return varstaMaxima;
    }

    public Integer getVarstaMinima(){
        return varstaMinima;

    }

    public String getSex(){
        return sex;

    }

    public BigDecimal getKcal() {
        return kcal;
    }



    /**
     *
     * @param kcal
     * @param necesarMinerale
     * @param necesarVitamine
     * @param necesarFibre
     * @param necesarProteine
     * @param necesarCarbohidrati
     * @param necesarGrasimi
     * @param varstaMaxima
     * @param varstaMinima
     * @param sex
     */
    GrupDeVarsta(BigDecimal kcal,
                 ArrayList<Mineral> necesarMinerale,
                 ArrayList<Vitamina> necesarVitamine,
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
}
