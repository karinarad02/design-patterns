package Pb5.main;

import Pb5.softwareNou.MedicamentFarmacie;
import Pb5.softwareVechi.AdapterMedicament;
import Pb5.softwareVechi.MedicamentMagazin;

public class Main {
    public static void main(String[] args) {
        System.out.println("Spital:");
        MedicamentMagazin medicamentMagazin=new MedicamentMagazin("Paracetamol");
        medicamentMagazin.achizitioneazaMedicament();
        System.out.println("Farmacie:");
        MedicamentFarmacie medicamentFarmacie=new MedicamentFarmacie("Nurofen");
        medicamentFarmacie.cumparaMedicament();
        System.out.println("Adapter:");
        AdapterMedicament adapterMedicament=new AdapterMedicament(medicamentFarmacie);
        adapterMedicament.achizitioneazaMedicament();

    }
}
