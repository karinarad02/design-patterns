package Pb2.clase;

public class FactoryPersoanaJuridica extends IFactoryPersoana{
    @Override
    public IPersoana crearePersoana() {
        return new PersoanaJuridica();
    }
}
