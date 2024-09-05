package FactoryMethod.fabrici;

import SimpleFactory.clase.Infirmier;
import SimpleFactory.clase.PersonalSpital;

public class FabricaInfirmier implements FactoryAngajati{
    @Override
    public PersonalSpital creareAngajat(String nume, int salariu) {
        return new Infirmier(nume,salariu);
    }
}
