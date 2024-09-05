package Pb7.decoratoare;

import Pb7.clase.AbstractNotaDePlata;

public class DecoratorAnNou extends DecoratorNotaDePlata{
    public DecoratorAnNou(String numeRestaurante) {
        super(numeRestaurante);
    }

    public DecoratorAnNou(AbstractNotaDePlata notaDecorata) {
        super(notaDecorata);
    }

    @Override
    public void printareNota() {
        this.getNota().printareNota();
        System.out.println("La multi ani!");
    }
}
