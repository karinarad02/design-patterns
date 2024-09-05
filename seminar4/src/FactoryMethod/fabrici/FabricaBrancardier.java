package FactoryMethod.fabrici;

import SimpleFactory.clase.Brancardier;
import SimpleFactory.clase.PersonalSpital;

public class FabricaBrancardier implements FactoryAngajati{
    @Override
    public PersonalSpital creareAngajat(String nume, int salariu) {
        return new Brancardier(nume,salariu);
    }
}
