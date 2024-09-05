package FactoryMethod.fabrici;

import SimpleFactory.clase.Medic;
import SimpleFactory.clase.PersonalSpital;

public class FabricaMedic implements FactoryAngajati{
    @Override
    public PersonalSpital creareAngajat(String nume, int salariu) {
        return new Medic(nume,salariu);
    }
}
