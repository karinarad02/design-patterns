package Pb9.clase;

public class Rezervare implements IRezervare{
    private String numeRestaurant;
    private int nrPersoane;
    private int ora;

    public Rezervare(String numeRestaurant, int nrPersoane, int ora) {
        this.numeRestaurant = numeRestaurant;
        this.nrPersoane = nrPersoane;
        this.ora = ora;
    }

    public String getNumeRestaurant() {
        return numeRestaurant;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }

    public int getOra() {
        return ora;
    }

    public void setNumeRestaurant(String numeRestaurant) {
        this.numeRestaurant = numeRestaurant;
    }

    public void setNrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
    }

    public void setOra(int ora) {
        this.ora = ora;
    }

    @Override
    public void realizeazaRezervare(Client client) {
        System.out.println("Rezervarea a fost facuta de "+client.toString());
    }
}
