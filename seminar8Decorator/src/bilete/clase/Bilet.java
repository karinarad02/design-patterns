package bilete.clase;

public class Bilet extends BiletAbstract{
    public Bilet(String echipaGazda, String echipaOaspeti, double pretBilet) {
        super(echipaGazda, echipaOaspeti, pretBilet);
    }

    @Override
    public void printareBilet() {
        System.out.println(this.toString());
    }
}
