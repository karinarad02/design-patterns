package Pb6.main;

import Pb6.clase.Card;
import Pb6.clase.CardAbstract;
import Pb6.decorator.CardContactLess;
import Pb6.decorator.CardNormal;
import Pb6.decorator.CardOnline;
import Pb6.decorator.DecoratorCard;

public class Main {
    public static void main(String[] args) {
        CardAbstract cardAbstract=new Card("123456789","Gigel",120.96);
        cardAbstract.plata();
        DecoratorCard online=new CardOnline(cardAbstract);
        online.plata();
        DecoratorCard normal=new CardNormal(cardAbstract);
        normal.plata();
        DecoratorCard contactless=new CardContactLess(cardAbstract);
        contactless.plata();


    }
}
