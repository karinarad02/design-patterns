package Pb12.clase.spital;

public class Spital extends Subiect{
    private String denumire;

    public Spital(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void notificareEpidemie() {
        super.notificaObservatori("de la spitalul "+this.denumire+": are loc o epidemie!");
    }
}
