package factory;

import domain.Mineral;

import java.math.BigDecimal;

//todo Irina adauga mineralele corecte
public class MineraleFactory {
    public static Mineral mineral1 = new Mineral("Mineral 1","energizant1",new BigDecimal("200"));
    public static Mineral mineral2 = new Mineral("Mineral 2","energizant2",new BigDecimal("300"));
    public static Mineral mineral3 = new Mineral("Mineral 3","energizant3",new BigDecimal("250"));
    public static Mineral mineral4 = new Mineral("Mineral 4","energizant4",new BigDecimal("50"));
    public static Mineral mineral5 = new Mineral("Mineral 5","energizant5",new BigDecimal("120"));
}
