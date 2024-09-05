package Pb10.clase;

public class Detinator implements Flyweight{
    private String nume;
    private String adresa;
    private String telefon;
    private String email;
    private String numarCont;
    private double suma;

    public Detinator(String nume, String adresa, String telefon, String email, String numarCont, double suma) {
        this.nume = nume;
        this.adresa = adresa;
        this.telefon = telefon;
        this.email = email;
        this.numarCont = numarCont;
        this.suma = suma;
    }

    public String getNume() {
        return nume;
    }

    public String getAdresa() {
        return adresa;
    }

    public String getTelefon() {
        return telefon;
    }

    public String getEmail() {
        return email;
    }

    public String getNumarCont() {
        return numarCont;
    }

    public double getSuma() {
        return suma;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Detinator{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", adresa='").append(adresa).append('\'');
        sb.append(", telefon='").append(telefon).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", numarCont='").append(numarCont).append('\'');
        sb.append(", suma=").append(suma);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void creareCont(Banca banca) {
        System.out.println(this.nume+" are un cont la banca "+banca.toString()+" cu numarul "+this.numarCont);
    }
}
