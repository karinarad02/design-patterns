package Pb1.clase;

public class FactorySupaVita implements FactorySupa{
    @Override
    public ISupa creareSupa() {
        return new SupaVita();
    }
}
