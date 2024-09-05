package Pb5.softVechi;

import Pb5.softNou.MedicamentDepozit;

public class AdapterMedicament extends MedicamentVanzare{
    MedicamentDepozit medicamentDepozit;
    public AdapterMedicament(MedicamentDepozit medicamentDepozit) {
        super(medicamentDepozit.getId(),medicamentDepozit.getStoc());
        this.medicamentDepozit=medicamentDepozit;
    }
}
