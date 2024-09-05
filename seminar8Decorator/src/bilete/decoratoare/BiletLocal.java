package bilete.decoratoare;

import bilete.clase.BiletAbstract;

public class BiletLocal extends DecoratorBilet{
    private static double valoareDiscount=0.9;

    public BiletLocal(String echipaGazda, String echipaOaspeti, double pretBilet) {
        super(echipaGazda, echipaOaspeti, pretBilet);
    }

    public BiletLocal(BiletAbstract biletDecorat) {
        super(biletDecorat);
    }

    @Override
    public void printareBilet() {
        this.getBiletAbstract().printareBilet();
        System.out.println("Hai ca poti "+this.getEchipaGazda());
    }

    @Override
    public void aplicaDiscountBilet() {
        this.getBiletAbstract().setPretBilet(this.getBiletAbstract().getPretBilet()*valoareDiscount);
    }
}
