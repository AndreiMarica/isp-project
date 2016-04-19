package factory;

import domain.Vitamina;

import java.math.BigDecimal;

//todo Irina adauga Vitaminele corecte
public class VitamineFactory {
    public static Vitamina vitaminaC = new Vitamina("C","SimptomC","ExcesC",new BigDecimal("50"));
    public static Vitamina vitaminaA = new Vitamina("A","SimptomA","ExcesA",new BigDecimal("150"));
    public static Vitamina vitaminaD3 = new Vitamina("D3","SimptomD3","ExcesD3",new BigDecimal("30"));
    public static Vitamina vitaminaD2 = new Vitamina("D2","SimptomD2","ExcesD2",new BigDecimal("20"));
    public static Vitamina vitaminaB14 = new Vitamina("B14","SimptomB14","ExcesB14",new BigDecimal("35"));
}
