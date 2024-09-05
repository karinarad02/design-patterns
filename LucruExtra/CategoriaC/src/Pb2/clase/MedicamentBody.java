package Pb2.clase;

public class MedicamentBody extends Medicament {

    public MedicamentBody(float pret, String denumire) {
        super(pret, denumire);
    }

    @Override
    public void afisare() {
        System.out.println("Medicamentul de Body "+getDenumire()+" costa "+getPret());
    }
}
