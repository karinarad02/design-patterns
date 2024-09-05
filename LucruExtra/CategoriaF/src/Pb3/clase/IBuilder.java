package Pb3.clase;

public interface IBuilder {
     IBuilder adaugaOpriri(boolean areOpririLaCapat);
    IBuilder adaugaDeschidereUsi(boolean deschideUsileLaFiecareStatie);
    IBuilder adaugaTextEcran(String textEcran);
    AutobuzLinie build();
}
