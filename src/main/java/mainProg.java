import domain.InformatiiNutritionale;
import domain.Meniu;
import domain.Persoana;
import domain.inregistrari.InregistrariAfectiuni;
import domain.util.SexPersoana;
import domain.util.TipInformatii;
import factory.MineraleFactory;

/**
 * Created by Marga on 4/19/2016.
 *
 */
public class mainProg {
    public static void main(String[] args) {
        InregistrariAfectiuni records = new InregistrariAfectiuni();

        records.getInregistrariAfectiuni();

//        records.getInregistrariAfectiuni().get("Nume Afectiune 1").afisare();

        Persoana persoana = new Persoana(18,SexPersoana.F);

        persoana.afisareNecesar();
        System.out.println("...---...");
//
//        System.out.println("...---...");
//        persoana.afisare();

        for(Meniu meniu: records.getInregistrariAfectiuni().get("Nume Afectiune 1").getMeniuri()){
            meniu.afisareInformatii(TipInformatii.fibre.toString());
            System.out.println("--==--==--==--==--");
            meniu.cautaSuplimentDupaMineral(MineraleFactory.mineral1.getNume());
        }


//        persoana.cautaAfectiune("Nume Afectiune 1".getBytes()).getMeniuri();


    }
}
