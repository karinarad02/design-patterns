package Pb2.clase;

public class MedicamentRaceala extends Medicament {

    public MedicamentRaceala(float pret, String denumire) {
        super(pret, denumire);
    }

    @Override
    public void afisare() {
        System.out.println("Medicamentul de Raceala "+getDenumire()+" costa "+getPret());
    }
}
