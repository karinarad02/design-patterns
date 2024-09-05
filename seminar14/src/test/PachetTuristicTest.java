package test;

import dubluri.FakePersoana;
import model.IPersoana;
import model.PachetTuristic;
import model.Persoana;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import test.suite.categorii.TestErrorConditions;
import test.suite.categorii.TestRange;

import static org.junit.Assert.*;

public class PachetTuristicTest {
    @Test
    @Category(TestRange.class)
    public void rightAplicaDiscountVarstnici() {
        IPersoana persoana=new Persoana("Florin","1240101123456");
        PachetTuristic pachetTuristic=new PachetTuristic(persoana,"Bahamas",20.00);
        pachetTuristic.aplicaDiscountVarstnici(50);
        assertEquals(10.00,pachetTuristic.getPret(),0.001);
    }

    @Test
    @Category(TestRange.class)
    public void boundaryAplicaDiscountVarstnici(){
        IPersoana persoana=new Persoana("Florin","1590101123456");
        PachetTuristic pachetTuristic=new PachetTuristic(persoana,"Bahamas",20.00);
        pachetTuristic.aplicaDiscountVarstnici(50);
        assertEquals(10.00,pachetTuristic.getPret(),0.001);
    }

    @Test
    @Category(TestRange.class)
    public void boundaryAplicaDiscountVarstniciUnder65(){
        IPersoana persoana=new Persoana("Florin","1600101123456");
        PachetTuristic pachetTuristic=new PachetTuristic(persoana,"Bahamas",20.00);
        pachetTuristic.aplicaDiscountVarstnici(50);
        assertEquals(20.00,pachetTuristic.getPret(),0.001);
    }

    @Test
    @Category(TestRange.class)
    public void rightFakeAplicaDiscountVarstnici(){
        FakePersoana persoana=new FakePersoana();
        persoana.setGetVarsta(72);
        PachetTuristic pachet=new PachetTuristic(persoana,"Chile",2000.00);
        pachet.aplicaDiscountVarstnici(50);
        assertEquals(1000.00,pachet.getPret(),0.001);
    }

    @Test
    @Category(TestRange.class)
    public void rightAplicaDiscountVarstniciTineri(){
        FakePersoana persoana=new FakePersoana();
        persoana.setGetVarsta(18);
        PachetTuristic pachet=new PachetTuristic(persoana,"Chile",2000.00);
        pachet.aplicaDiscountVarstnici(50);
        assertEquals(2000.00,pachet.getPret(),0.001);
    }

    @Test
    @Category(TestRange.class)
    public void boundaryAplicaDiscountVarstniciNoDiscount(){
        FakePersoana persoana=new FakePersoana();
        persoana.setGetVarsta(65);
        PachetTuristic pachet=new PachetTuristic(persoana,"Chile",2000.00);
        pachet.aplicaDiscountVarstnici(0);
        assertEquals(2000.00,pachet.getPret(),0.001);
    }

    @Test
    @Category(TestRange.class)
    public void boundaryAplicaDiscountVarstniciFullDiscount(){
        FakePersoana persoana=new FakePersoana();
        persoana.setGetVarsta(65);
        PachetTuristic pachet=new PachetTuristic(persoana,"Chile",2000.00);
        pachet.aplicaDiscountVarstnici(100);
        assertEquals(0.00,pachet.getPret(),0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    @Category({TestErrorConditions.class, TestRange.class})
    public void errorConditionsAplicaDiscountVarstnici(){
        FakePersoana persoana=new FakePersoana();
        persoana.setGetVarsta(65);
        PachetTuristic pachet=new PachetTuristic(persoana,"Chile",2000.00);
        pachet.aplicaDiscountVarstnici(-3);
    }

    @Test(timeout = 10)
    public void performanceAplicaDiscountVarstnici(){
        IPersoana persoana=new FakePersoana();
        ((FakePersoana)persoana).setGetVarsta(65);
        PachetTuristic pachet=new PachetTuristic(persoana,"Chile",2000.00);
        pachet.aplicaDiscountVarstnici(3);
    }
}
