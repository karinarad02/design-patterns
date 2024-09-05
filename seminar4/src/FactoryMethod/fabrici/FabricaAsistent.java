package FactoryMethod.fabrici;

import SimpleFactory.clase.Asistent;
import SimpleFactory.clase.PersonalSpital;

public class FabricaAsistent implements FactoryAngajati{
    @Override
    public PersonalSpital creareAngajat(String nume, int salariu) {
        return new Asistent(nume,salariu);
    }
}
