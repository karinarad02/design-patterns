package Pb3.clase;

public class AutobuzLinie {
    private String model;
    private String sofer;
    private boolean areOpririLaCapat;
    private boolean deschideUsileLaFiecareStatie;
    private String textEcran;

    protected AutobuzLinie() {
    }

    public AutobuzLinie(String model, String sofer, boolean areOpririLaCapat, boolean deschideUsileLaFiecareStatie, String textEcran) {
        this.model = model;
        this.sofer = sofer;
        this.areOpririLaCapat = areOpririLaCapat;
        this.deschideUsileLaFiecareStatie = deschideUsileLaFiecareStatie;
        this.textEcran = textEcran;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSofer(String sofer) {
        this.sofer = sofer;
    }

    public void setAreOpririLaCapat(boolean areOpririLaCapat) {
        this.areOpririLaCapat = areOpririLaCapat;
    }

    public void setDeschideUsileLaFiecareStatie(boolean deschideUsileLaFiecareStatie) {
        this.deschideUsileLaFiecareStatie = deschideUsileLaFiecareStatie;
    }

    public void setTextEcran(String textEcran) {
        this.textEcran = textEcran;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutobuzLinie{");
        sb.append("model='").append(model).append('\'');
        sb.append(", sofer='").append(sofer).append('\'');
        sb.append(", areOpririLaCApat=").append(areOpririLaCapat);
        sb.append(", deschideUsileLaFiecareStatie=").append(deschideUsileLaFiecareStatie);
        sb.append(", textEcran='").append(textEcran).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
