package factory;

import domain.Vitamina;

import java.math.BigDecimal;

//todo Irina adauga Vitaminele corecte
public class VitamineFactory {
    public static Vitamina vitaminaC = new Vitamina("C","","",new BigDecimal("50"));
    public static Vitamina vitaminaA = new Vitamina("A","","",new BigDecimal("50"));
    public static Vitamina vitaminaD3 = new Vitamina("D3","","",new BigDecimal("50"));
    public static Vitamina vitaminaD2 = new Vitamina("D2","","",new BigDecimal("50"));
    public static Vitamina vitaminaB14 = new Vitamina("B14","","",new BigDecimal("50"));
}
