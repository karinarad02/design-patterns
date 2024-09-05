package Pb3.clase;

public interface IBuilder {
    IBuilder adaugaNumarPungi(int numarPungi);
    IBuilder adaugaPlataCuCard(boolean plataCuCard);
    IBuilder adaugaCardFidelitate(boolean areCardFidelitate);
    IBuilder adaugaCotaTVA(int cotaTVA);
    Factura build();

}
