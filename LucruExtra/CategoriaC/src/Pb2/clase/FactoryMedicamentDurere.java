package Pb2.clase;

public class FactoryMedicamentDurere implements IFactoryMedicament{
    @Override
    public Medicament creareMedicament(float pret, String denumire) {
        return new MedicamentDurere(pret,denumire);
    }
}
