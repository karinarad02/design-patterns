package Pb1.clase;

public class FactoryMedicament {
    public IMedicament creareMedicament(TipAfectiune tipAfectiune) throws Exception {
        switch (tipAfectiune){
            case RACEALA:return new MedicamentRaceala();
            case DURERE:return new MedicamentDurere();
            case BODY:return new MedicamentBody();
            default:
                throw new Exception("Tip de afectiune neconform");
        }
    }
}
