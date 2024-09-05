package Pb2.clase;

public abstract class Medicament {
    private float pret;
    private String denumire;
    public abstract void afisare();

    public Medicament(float pret, String denumire) {
        this.pret = pret;
        this.denumire = denumire;
    }

    public float getPret() {
        return pret;
    }

    public String getDenumire() {
        return denumire;
    }
}
