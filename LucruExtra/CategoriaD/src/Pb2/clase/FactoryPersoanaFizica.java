package Pb2.clase;

public class FactoryPersoanaFizica extends IFactoryPersoana{
    @Override
    public IPersoana crearePersoana() {
        return new PersoanaFizica();
    }
}
