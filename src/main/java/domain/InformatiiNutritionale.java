package domain;

import java.math.BigDecimal;

public class InformatiiNutritionale {
    private BigDecimal grasimi;
    private BigDecimal proteine;
    private BigDecimal carbohidrati;
    private BigDecimal fibre;

    public InformatiiNutritionale(BigDecimal grasimi, BigDecimal proteine, BigDecimal carbohidrati, BigDecimal fibre) {
        this.grasimi = grasimi;
        this.proteine = proteine;
        this.carbohidrati = carbohidrati;
        this.fibre = fibre;
    }

    public BigDecimal getGrasimi() {
        return grasimi;
    }

    public void setGrasimi(BigDecimal grasimi) {
        this.grasimi = grasimi;
    }

    public BigDecimal getProteine() {
        return proteine;
    }

    public void setProteine(BigDecimal proteine) {
        this.proteine = proteine;
    }

    public BigDecimal getCarbohidrati() {
        return carbohidrati;
    }

    public void setCarbohidrati(BigDecimal carbohidrati) {
        this.carbohidrati = carbohidrati;
    }

    public BigDecimal getFibre() {
        return fibre;
    }

    public void setFibre(BigDecimal fibre) {
        this.fibre = fibre;
    }

    public void afisare(){
//todo
    }
}
