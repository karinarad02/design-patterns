package Pb7.clase.decorator;

import Pb7.clase.casaDeBilete.Bilet;
import Pb7.clase.casaDeBilete.BiletAbstract;

public abstract class DecoratorBilet extends BiletAbstract {
    BiletAbstract biletAbstract;

    public DecoratorBilet(String numeCalator, String data) {
        super(numeCalator, data);
        this.biletAbstract=new Bilet(numeCalator,data);
    }

    public DecoratorBilet(BiletAbstract biletAbstract) {
        super(biletAbstract.getNumeCalator(), biletAbstract.getData());
        this.biletAbstract = biletAbstract;
    }

    public BiletAbstract getBiletAbstract() {
        return biletAbstract;
    }

}
