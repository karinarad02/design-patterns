package Pb2.clase;

public class FactoryPortar implements IFactoryJucator{
    @Override
    public IJucator creareJucator( ) {
        return new Portar();
    }
}
