package Pb6.clase;

public class FacadeFarmacist {
    private Farmacist farmacist;

    public FacadeFarmacist(Farmacist farmacist) {
        this.farmacist = farmacist;
    }

    public void verificariAchizitieMedicament(){
        this.farmacist.verificaReteta();
        this.farmacist.verificaDisponibilitateMedicament();
        this.farmacist.verificaCardSanatate();
    }
}
