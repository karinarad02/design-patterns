package main;

import bilete.clase.Bilet;
import bilete.clase.BiletAbstract;
import bilete.decoratoare.BiletLocal;
import bilete.decoratoare.BiletNational;
import bilete.decoratoare.DecoratorBilet;

public class Main {

    public static void imprimantaBilete(BiletAbstract biletAbstract){
        biletAbstract.printareBilet();
    }
    public static void main(String[] args) {
        BiletAbstract bilet1=new Bilet("A","B",10.0);
        imprimantaBilete(bilet1);

        DecoratorBilet bilet2=new BiletLocal(bilet1);
        bilet2.aplicaDiscountBilet();
        imprimantaBilete(bilet2);

        DecoratorBilet bilet3=new BiletNational("Romania","Danemarca",20.0);
        bilet3.aplicaDiscountBilet();
        imprimantaBilete(bilet3);

    }

}