package Pb6.decorator;

import Pb6.clase.CardAbstract;

public class CardNormal extends DecoratorCard{
    public CardNormal(String numar, String detinator, double suma) {
        super(numar, detinator, suma);
    }

    public CardNormal(CardAbstract cardAbstract) {
        super(cardAbstract);
    }

    @Override
    public void plata() {
        this.getCardAbstract().plata();
        System.out.println("Plata a fost efectuata NORMAL");
    }
}
