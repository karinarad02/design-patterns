package Pb2.clase;

public class FactoryAtacant implements IFactoryJucator{
    @Override
    public IJucator creareJucator() {
        return new Atacant();
    }
}
