package test;

import model.IPersoana;
import model.Persoana;
import org.junit.experimental.categories.Category;
import test.suite.categorii.TestErrorConditions;
import test.suite.categorii.TestRange;

import java.util.Objects;

import static org.junit.Assert.*;
public class PersoanaTest {
    @org.junit.Test
    @Category(TestRange.class)
    public void testGetSexMasculin() {
        IPersoana persoana=new Persoana("Florin","5020202123456");
        assertEquals("M",persoana.getSex());
    }

    @org.junit.Test
    @Category(TestRange.class)
    public void testGetSexFeminin() {
        IPersoana persoana=new Persoana("Flavia","6020202123456");
        assertEquals("F",persoana.getSex());
    }

    @org.junit.Test
    @Category(TestRange.class)
    public void testGetSexBoundaryInferior() {
        IPersoana persoana=new Persoana("Florin","1020202123456");
        assertEquals("M",persoana.getSex());
    }

    @org.junit.Test
    @Category(TestRange.class)
    public void testGetSexBoundarySuperior() {
        IPersoana persoana=new Persoana("Flavia","8020202123456");
        assertEquals("F",persoana.getSex());
    }

    @org.junit.Test
    public void testGetSexCrossCheck() {
        Persoana persoana=new Persoana("Flavia","6020202123456");
        String sex="M";
        if(persoana.CNP.charAt(0)%2==0){
            sex="F";
        }
        assertEquals(sex,persoana.getSex());
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    @Category(TestErrorConditions.class)
    public void testGetSexErrorConditionsBoundary() {
        Persoana persoana=new Persoana("Flavia","-020202123456");
        persoana.getSex();
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    @Category(TestErrorConditions.class)
    public void testGetSexErrorConditions() {
        Persoana persoana=new Persoana("Flavia","ceva");
        persoana.getSex();
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    @Category(TestErrorConditions.class)
    public void testGetSexErrorConditionsNoCNP() {
        Persoana persoana=new Persoana("Flavia","");
        persoana.getSex();
    }

    @org.junit.Test(timeout = 100)
    public void testGetSexPerformance() {
        Persoana persoana=new Persoana("Flavia","6020202123456");
        persoana.getSex();
    }

    @org.junit.Test
    public void testGetSexConformance() {
        Persoana persoana=new Persoana("Flavia","6020202123456");
        String sex= persoana.getSex();
        assertTrue(Objects.equals(sex, "M") || Objects.equals(sex, "F"));
    }

    @org.junit.Test
    public void testGetSexOrder() {
        Persoana persoana1=new Persoana("Flavia","6020202123456");
        Persoana persoana2=new Persoana("Florin","1020202123456");
        assertTrue(persoana1.getSex().compareTo(persoana2.getSex())<0);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    @Category(TestErrorConditions.class)
    public void testGetSexExistence(){
        IPersoana persoana=new Persoana("Flavia",null);
        persoana.getSex();
    }
}
