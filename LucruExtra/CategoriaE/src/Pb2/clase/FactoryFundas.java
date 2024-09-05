package Pb2.clase;

public class FactoryFundas implements IFactoryJucator{
    @Override
    public IJucator creareJucator( ) {
        return new Fundas();
    }
}
