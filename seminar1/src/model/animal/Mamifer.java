package model.animal;

public abstract class Mamifer implements Vietate {
    private String nume;
    private int varsta;
    private int nrPicioare;

    public Mamifer(String nume, int varsta, int nrPicioare) {
        this.nume = nume;
        this.varsta = varsta;
        this.nrPicioare = nrPicioare;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public int getNrPicioare() {
        return nrPicioare;
    }

    public void setNrPicioare(int nrPicioare) {
        this.nrPicioare = nrPicioare;
    }


}
