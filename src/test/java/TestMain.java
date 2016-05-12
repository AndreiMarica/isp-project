import domain.*;
import domain.inregistrari.InregistrariAfectiuni;
import domain.util.GrupaDeVarsta;
import domain.util.IntensitateSimptom;
import domain.util.SexPersoana;
import domain.util.TipMasa;
import factory.MineraleFactory;
import factory.VitamineFactory;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


/**
 * Created by Marga on 5/12/2016.
 */
public class TestMain {

    @Test
    public void testAfectiuneAdaugaSimtpom() {
        String descriereSimptomTest = "descriere";

        Afectiune afectiune = new Afectiune();
        Simptom simptom = new Simptom(descriereSimptomTest, IntensitateSimptom.mediu);

        assertTrue(afectiune.getSimptome().isEmpty());

        afectiune.adauaSimptom(simptom);

        assertTrue(!afectiune.getSimptome().isEmpty());
        assertEquals(simptom, afectiune.getSimptome().get(0));
    }

    @Test
    public void testAfectiuneAdaugaMeniu() {
        Afectiune afectiune = new Afectiune();
        Meniu meniu = new Meniu(null, null, GrupaDeVarsta.A);

        assertTrue(afectiune.getMeniuri().isEmpty());

        afectiune.adaugaMeniu(meniu);

        assertTrue(!afectiune.getMeniuri().isEmpty());
        assertEquals(meniu, afectiune.getMeniuri().get(0));
    }

    @Test
    public void testAlimentAdaugaVitamina() {
        Aliment aliment = new Aliment();

        assertTrue(aliment.getVitamine().isEmpty());

        aliment.adaugaVitamina(VitamineFactory.vitaminaA);

        assertTrue(!aliment.getVitamine().isEmpty());
        assertEquals(VitamineFactory.vitaminaA, aliment.getVitamine().get(0));
    }

    @Test
    public void testAlimentAdaugaMineral() {
        Aliment aliment = new Aliment();

        assertTrue(aliment.getMinerale().isEmpty());

        aliment.adaugaMineral(MineraleFactory.mineral1);

        assertTrue(!aliment.getMinerale().isEmpty());
        assertEquals(MineraleFactory.mineral1, aliment.getMinerale().get(0));
    }

    @Test
    public void testMasaAdaugaAliment() {
        Masa masa = new Masa();
        Aliment aliment = new Aliment("nume", null, null, null, null, null, null, null);
        assertTrue(masa.getAlimente().isEmpty());

        masa.adaugaAliment(aliment);

        assertTrue(!masa.getAlimente().isEmpty());
        assertEquals(aliment, masa.getAlimente().get(0));
    }


    //complexa
    @Test
    public void testPersoanaCautaAfectiune() {
        new InregistrariAfectiuni();
        Persoana persoana = new Persoana(18, SexPersoana.F);
        Afectiune afectiune = persoana.cautaAfectiune("Nume Afectiune 1");
        assertTrue(afectiune != null);
    }

    //complexa
    @Test
    public void afiseazaDupaTipMasa() {
        new InregistrariAfectiuni();
        Persoana persoana = new Persoana(18, SexPersoana.F);
        Afectiune afectiune = persoana.cautaAfectiune("Nume Afectiune 1");
        assertTrue(afectiune != null);
        assertTrue(afectiune.getMeniuri().get(0).afisareMasaDupaTip(TipMasa.cina.toString()));
    }

    //complexa
    @Test
    public void cautaSuplimentDupaPretMinimMaxim() {
        new InregistrariAfectiuni();
        Persoana persoana = new Persoana(18, SexPersoana.F);
        Afectiune afectiune = persoana.cautaAfectiune("Nume Afectiune 1");
        assertTrue(afectiune != null);
        assertTrue(afectiune.getMeniuri().get(0).cautaSuplimentDupaPret(new BigDecimal("10"), new BigDecimal("50")));

    }

    //complexa
    @Test
    public void cautaSuplimentDupaVitamina() {
        new InregistrariAfectiuni();
        Persoana persoana = new Persoana(18, SexPersoana.F);
        Afectiune afectiune = persoana.cautaAfectiune("Nume Afectiune 1");
        assertTrue(afectiune != null);
        assertTrue(afectiune.getMeniuri().get(0).cautaSuplimentDupaVitamina("VitaminaA"));
    }

}
