package Pb1.clase;

public class FactorySupaLegume implements FactorySupa{
    @Override
    public ISupa creareSupa() {
        return new SupaLegume();
    }
}
