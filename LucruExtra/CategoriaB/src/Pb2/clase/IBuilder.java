package Pb2.clase;

public interface IBuilder {

    IBuilder adaugaAsezareGeam(boolean areAsezareGeam);
    IBuilder adaugaScauneErgonomice(boolean areScauneErgonomice);
    IBuilder adaugaDecorareaMesei(boolean areDecorareaMesei);
    IBuilder adaugaMuzicaAmbientalaPersonalizata(boolean areMuzicaAmbientalaPersonalizata);
    IBuilder adaugaGenMuzica(boolean areGenMuzica);
    Rezervare build();
}
