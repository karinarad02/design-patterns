package Pb3.clase;

public class BuilderAutobuzLinie implements IBuilder{
    private String model;
    private String sofer;
    private boolean areOpririLaCapat;
    private boolean deschideUsileLaFiecareStatie;
    private String textEcran;

    public BuilderAutobuzLinie(String model, String sofer) {
        this.model = model;
        this.sofer = sofer;
        this.areOpririLaCapat = false;
        this.deschideUsileLaFiecareStatie = false;
        this.textEcran = "";
    }

    public BuilderAutobuzLinie(String model, String sofer, boolean areOpririLaCapat, boolean deschideUsileLaFiecareStatie, String textEcran) {
        this.model = model;
        this.sofer = sofer;
        this.areOpririLaCapat = areOpririLaCapat;
        this.deschideUsileLaFiecareStatie = deschideUsileLaFiecareStatie;
        this.textEcran = textEcran;
    }

    @Override
    public IBuilder adaugaOpriri(boolean areOpririLaCapat) {
        this.areOpririLaCapat=areOpririLaCapat;
        return this;
    }

    @Override
    public IBuilder adaugaDeschidereUsi(boolean deschideUsileLaFiecareStatie) {
        this.deschideUsileLaFiecareStatie=deschideUsileLaFiecareStatie;
        return this;
    }

    @Override
    public IBuilder adaugaTextEcran(String textEcran) {
        this.textEcran=textEcran;
        return this;
    }

    @Override
    public AutobuzLinie build() {
        return new AutobuzLinie(model,sofer,areOpririLaCapat,deschideUsileLaFiecareStatie,textEcran);
    }
}
