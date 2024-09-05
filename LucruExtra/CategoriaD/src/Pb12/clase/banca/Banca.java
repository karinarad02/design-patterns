package Pb12.clase.banca;

public class Banca extends Subiect{
    private String denumire;

    public Banca(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void notificareDobandaMica() {
        super.notificaObservatori("Banca "+this.denumire+" are dobanda de doar 1% luna asta!");
    }
}
