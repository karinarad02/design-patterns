package Pb7.clase.decorator;

import Pb7.clase.casaDeBilete.BiletAbstract;

public class BiletZiNationala extends DecoratorBilet{
    public BiletZiNationala(BiletAbstract biletAbstract) {
        super(biletAbstract);
    }

    @Override
    public void printareBilet() {
        super.getBiletAbstract().printareBilet();
        System.out.println("La multi ani!");
    }
}
