package Pb5.main;

import Pb5.softNou.MedicamentDepozit;
import Pb5.softVechi.AdapterMedicament;
import Pb5.softVechi.MedicamentVanzare;

public class Main {
    public static void main(String[] args) {
        System.out.println("Farmacie:");
        MedicamentVanzare medicamentVanzare=new MedicamentVanzare(1,10);
        medicamentVanzare.setareMedicament(2);
        medicamentVanzare.verificareDisponibilitate(3);
        System.out.println("Depozit:");
        MedicamentDepozit medicamentDepozit=new MedicamentDepozit(11,20);
        medicamentDepozit.verificaStocPentruMedicament(11,10);
        medicamentDepozit.verificaStocPentruMedicament(12,3);
        medicamentDepozit.verificaStocPentruMedicament(11,30);
        System.out.println("Adapter:");
        AdapterMedicament adapterMedicament=new AdapterMedicament(medicamentDepozit);
        adapterMedicament.verificareDisponibilitate(25);
    }
}
