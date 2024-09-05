package main;


import model.animal.Leu;
import model.animal.Maimuta;
import model.animal.Zebra;
import model.animal.ZooKeeper;
import model.zoo.Zoo;

public class Main {
    public static void main(String[] args) {

        Zoo zoo=new Zoo("Zoo Bucuresti",new ZooKeeper("Dorel"),null);
        Leu leu=new Leu("Alex",4,4);
        zoo.adaugaAnimal(leu,"carne de vita");
        zoo.adaugaAnimal(new Zebra("Marty",5,4),"iarba verde");
        zoo.adaugaAnimal(new Maimuta("Julien",6,4),"banane");
        zoo.hranesteToateAnimalele();
        tipuriAnimale tip=tipuriAnimale.LEU;

    }

    public enum tipuriAnimale{
        LEU,
        MAIMUTA,
        ZEBRA

    }
}