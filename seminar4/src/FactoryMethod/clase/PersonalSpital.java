package FactoryMethod.clase;

public abstract class PersonalSpital {
    private String nume;
    private int salariu;
    public abstract void afisare();

    public PersonalSpital(String nume, int salariu) {
        this.nume = nume;
        this.salariu = salariu;
    }

    public String getNume() {
        return nume;
    }

    public int getSalariu() {
        return salariu;
    }
}
