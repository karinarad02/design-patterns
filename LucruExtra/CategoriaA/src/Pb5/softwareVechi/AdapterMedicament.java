package Pb5.softwareVechi;

import Pb5.softwareNou.MedicamentFarmacie;

public class AdapterMedicament extends MedicamentMagazin {
    private MedicamentFarmacie medicamentFarmacie;
    public AdapterMedicament(MedicamentFarmacie medicamentFarmacie) {
        super(medicamentFarmacie.getDenumire());
        this.medicamentFarmacie=medicamentFarmacie;
    }


}
