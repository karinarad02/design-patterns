package Pb6.decorator;

import Pb6.clase.Card;
import Pb6.clase.CardAbstract;

public abstract class DecoratorCard extends CardAbstract{
    CardAbstract cardAbstract;

    public DecoratorCard(String numar, String detinator, double suma) {
        super(numar, detinator, suma);
        this.cardAbstract=new Card(numar,detinator,suma);
    }

    public DecoratorCard(CardAbstract cardAbstract) {
        super(cardAbstract.getNumar(), cardAbstract.getDetinator(), cardAbstract.getSuma());
        this.cardAbstract=cardAbstract;
    }

    public CardAbstract getCardAbstract() {
        return cardAbstract;
    }

}
