package Pb6.decorator;

import Pb6.clase.CardAbstract;

public class CardOnline extends DecoratorCard{
    public CardOnline(String numar, String detinator, double suma) {
        super(numar, detinator, suma);
    }

    public CardOnline(CardAbstract cardAbstract) {
        super(cardAbstract);
    }

    @Override
    public void plata() {
        this.getCardAbstract().plata();
        System.out.println("Plata a fost efectuata ONLINE");
    }
}
