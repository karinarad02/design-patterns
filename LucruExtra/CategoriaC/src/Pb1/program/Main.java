package Pb1.program;

import Pb1.clase.FactoryMedicament;
import Pb1.clase.IMedicament;
import Pb1.clase.TipAfectiune;

public class Main {
    public static void main(String[] args) {
        FactoryMedicament factoryMedicament=new FactoryMedicament();
        try {
            IMedicament medicament= factoryMedicament.creareMedicament(TipAfectiune.RACEALA);
            medicament.afisare();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}