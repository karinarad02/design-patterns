package Pb3.clase;

public interface IBuilder {
    IBuilder adaugaSalariu(boolean primesteSalariu);
    IBuilder adaugaCardAtasat(boolean areCardAtasat);
    IBuilder adaugaInternetBanking(boolean areInternetBanking);
    Cont build();
}
