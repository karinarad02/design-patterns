package clase;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;

public class Reteta {
    private int nrReteta;
    private List<String>medicamente;

    public Reteta(int nrReteta) {
        this.nrReteta = nrReteta;
        this.medicamente=new ArrayList<>();
    }
    public void adaugareMedicamente(String medicament){
        this.medicamente.add(medicament);
    }

    public int getNrReteta() {
        return nrReteta;
    }

    public List<String> getMedicamente() {
        return medicamente;
    }
}
