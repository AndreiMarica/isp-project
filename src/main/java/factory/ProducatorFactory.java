package factory;

import domain.Producator;

//todo Irina adauga producatori corecti
public class ProducatorFactory {
    public static Producator producatorRopharma = new Producator("RoPharma","Aleea Virtutii","Companie inceputa in 2012");
    public static Producator producatorVitaplus = new Producator("Vitaplus","Aleea Independentei","Companie inceputa in 2000");
    public static Producator producatorGreenhealth= new Producator("Greenhealth","Splaiul Independentei","Companie cu actionariat strain");
    public static Producator producatorBayer = new Producator("Bayer","Str Rozelor","Companie ce importa medicamentele din Germania");
}
