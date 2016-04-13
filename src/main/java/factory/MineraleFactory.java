package factory;

import domain.Mineral;

import java.math.BigDecimal;

//todo Irina adauga mineralele corecte
public class MineraleFactory {
    public static Mineral mineral1 = new Mineral("1","energizant",new BigDecimal("200"));
    public static Mineral mineral2 = new Mineral("2","energizant",new BigDecimal("300"));
    public static Mineral mineral3 = new Mineral("3","energizant",new BigDecimal("250"));
    public static Mineral mineral4 = new Mineral("4","energizant",new BigDecimal("50"));
    public static Mineral mineral5 = new Mineral("5","energizant",new BigDecimal("120"));
}
