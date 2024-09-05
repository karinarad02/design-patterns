package Pb2.clase;

public class FactoryMedicamentRaceala implements IFactoryMedicament{
    @Override
    public Medicament creareMedicament(float pret,String denumire) {
        return new MedicamentRaceala(pret,denumire);
    }
}
