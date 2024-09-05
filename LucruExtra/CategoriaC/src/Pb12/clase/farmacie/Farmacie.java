package Pb12.clase.farmacie;

public class Farmacie extends Subiect{
    private String denumire;

    public Farmacie(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void notificareReducerePreturi() {
        super.notificareClienti("Farmacia "+this.denumire+" are reduceri la medicamente!");
    }
}
