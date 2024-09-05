package Pb7.decoratoare;

import Pb7.clase.AbstractNotaDePlata;
import Pb7.clase.NotaDePlata;

public abstract class DecoratorNotaDePlata extends AbstractNotaDePlata {
    private AbstractNotaDePlata notaDecorata;
    public DecoratorNotaDePlata(String numeRestaurant) {
        super(numeRestaurant);
        this.notaDecorata = new NotaDePlata(numeRestaurant);

    }

    public DecoratorNotaDePlata(AbstractNotaDePlata notaDecorata) {
        super(notaDecorata.getNumeRestaurant());
        this.notaDecorata = notaDecorata;
    }

    public AbstractNotaDePlata getNota(){return notaDecorata;}
}
