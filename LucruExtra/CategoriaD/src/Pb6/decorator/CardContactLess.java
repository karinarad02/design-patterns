package Pb6.decorator;

import Pb6.clase.CardAbstract;

public class CardContactLess extends DecoratorCard{
    public CardContactLess(String numar, String detinator, double suma) {
        super(numar, detinator, suma);
    }

    public CardContactLess(CardAbstract cardAbstract) {
        super(cardAbstract);
    }

    @Override
    public void plata() {
        this.getCardAbstract().plata();
        System.out.println("Plata a fost efectuata CONTACTLESS");
    }
}
