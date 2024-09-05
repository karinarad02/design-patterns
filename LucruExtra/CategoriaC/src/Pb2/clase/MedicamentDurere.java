package Pb2.clase;

public class MedicamentDurere extends Medicament {

    public MedicamentDurere(float pret, String denumire) {
        super(pret, denumire);
    }

    @Override
    public void afisare() {
        System.out.println("Medicamentul de Durere "+getDenumire()+" costa "+getPret());

    }
}
