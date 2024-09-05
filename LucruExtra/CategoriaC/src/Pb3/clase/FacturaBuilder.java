package Pb3.clase;

public class FacturaBuilder implements IBuilder{
    private int numarPungi;
    private boolean plataCuCard;
    private boolean areCardFidelitate;
    private int cotaTVA;

    @Override
    public IBuilder adaugaNumarPungi(int numarPungi) {
        this.numarPungi=numarPungi;
        return this;
    }

    @Override
    public IBuilder adaugaPlataCuCard(boolean plataCuCard) {
        this.plataCuCard=plataCuCard;
        return this;
    }

    @Override
    public IBuilder adaugaCardFidelitate(boolean areCardFidelitate) {
        this.areCardFidelitate=areCardFidelitate;
        return this;
    }

    @Override
    public IBuilder adaugaCotaTVA(int cotaTVA) {
        this.cotaTVA=cotaTVA;
        return this;
    }

    @Override
    public Factura build() {
        return new Factura(numarPungi,plataCuCard,areCardFidelitate,cotaTVA);
    }
}
