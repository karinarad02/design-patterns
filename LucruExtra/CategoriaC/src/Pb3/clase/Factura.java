package Pb3.clase;

public class Factura {
    private int numarPungi;
    private boolean plataCuCard;
    private boolean areCardFidelitate;
    private int cotaTVA;

    protected Factura() {
        this.numarPungi = 0;
        this.plataCuCard = false;
        this.areCardFidelitate = false;
        this.cotaTVA = 0;
    }

    protected Factura(int numarPungi, boolean plataCuCard, boolean areCardFidelitate, int cotaTVA) {
        this.numarPungi = numarPungi;
        this.plataCuCard = plataCuCard;
        this.areCardFidelitate = areCardFidelitate;
        this.cotaTVA = cotaTVA;
    }

    protected void setNumarPungi(int numarPungi) {
        this.numarPungi = numarPungi;
    }

    protected void setPlataCuCard(boolean plataCuCard) {
        this.plataCuCard = plataCuCard;
    }

    protected void setAreCardFidelitate(boolean areCardFidelitate) {
        this.areCardFidelitate = areCardFidelitate;
    }

    protected void setCotaTVA(int cotaTVA) {
        this.cotaTVA = cotaTVA;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Factura{");
        sb.append("numarPungi=").append(numarPungi);
        sb.append(", plataCuCard=").append(plataCuCard);
        sb.append(", areCardFidelitate=").append(areCardFidelitate);
        sb.append(", cotaTVA=").append(cotaTVA);
        sb.append('}');
        return sb.toString();
    }
}
