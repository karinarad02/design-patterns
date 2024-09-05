package Pb2.clase;

public class FactoryMedicamentBody implements IFactoryMedicament{
    @Override
    public Medicament creareMedicament(float pret,String denumire) {
        return new MedicamentBody(pret,denumire);
    }
}
