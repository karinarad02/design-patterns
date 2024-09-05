package Pb14.clase;

public class IntrarePeStadion extends Intrare{
    Bilet bilet;

    public IntrarePeStadion(Bilet bilet) {
        this.bilet = bilet;
    }

    @Override
    public void asezareCoada() {
        System.out.println(bilet.getNume()+" s-a asezat la coada");
    }

    @Override
    public void prezintaBilet() {
        System.out.println("Biletul este "+bilet.toString());
    }

    @Override
    public void controlCorporal() {
        System.out.println(bilet.getNume()+" a fost controlat");
    }

    @Override
    public void intrareStadion() {
        System.out.println(bilet.getNume()+" a intrat pe stadion");
    }

    @Override
    public void ocupareLoc() {
        System.out.println(bilet.getNume()+" s-a asezat pe locul cu numarul "+bilet.getLoc());
    }
}
