package FactoryMethod.fabrici;

import SimpleFactory.clase.PersonalSpital;

public interface FactoryAngajati {

    public PersonalSpital creareAngajat(String nume, int salariu);
}
