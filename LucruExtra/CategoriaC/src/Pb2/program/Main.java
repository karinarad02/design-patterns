package Pb2.program;

import Pb2.clase.FactoryMedicamentDurere;
import Pb2.clase.IFactoryMedicament;
import Pb2.clase.Medicament;

public class Main {
    public static void main(String[] args) {
        IFactoryMedicament factoryMedicament=new FactoryMedicamentDurere();
        Medicament medicament= factoryMedicament.creareMedicament(15.5F,"Paracetamol");
        medicament.afisare();
    }
}