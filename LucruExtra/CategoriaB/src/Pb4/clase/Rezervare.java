package Pb4.clase;

public class Rezervare implements IRezervare{
    private String nume;
    private int nrPersoane;
    private String numarTelefon;

    public Rezervare() {
    }

    public Rezervare(String nume, int nrPersoane, String numarTelefon) {
        this.nume = nume;
        if(nrPersoane<1) {
            throw new IllegalArgumentException();
        }
        this.nrPersoane = nrPersoane;
        if(numarTelefon.length()<13) {
            throw new IllegalArgumentException();
        }
        if(!numarTelefon.startsWith("0040")) {
            throw new IllegalArgumentException();
        }
        this.numarTelefon = numarTelefon;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append(", numarTelefon='").append(numarTelefon).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public IRezervare cloneaza() {
        Rezervare rezervare=new Rezervare();
        rezervare.nume=this.nume;
        rezervare.nrPersoane=this.nrPersoane;
        rezervare.numarTelefon=this.numarTelefon;
        return rezervare;
    }
}
