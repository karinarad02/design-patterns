package Pb3.clase;

public interface IBuilder {
    IBuilder adaugaMancareInclusa(boolean areMancareInclusa);
    IBuilder adaugaScaunErgonomic(boolean areScaunErgonomic);
    IBuilder adaugaBauturaInclusa(boolean areBauturaInclusa);
    IBuilder adaugaMuzicaAmbientala(boolean areMuzicaAmbientala);
    IBuilder adaugaGenMuzica(boolean areGenMuzica);
    Rezervare build();

}
