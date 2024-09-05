package Pb1.clase;

public class FactorySupaCiuperci implements FactorySupa{
    @Override
    public ISupa creareSupa() {
        return new SupaCiuperci();
    }
}
