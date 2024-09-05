package SimpleFactory.program;

import SimpleFactory.clase.FactoryPersonal;
import SimpleFactory.clase.PersonalSpital;
import SimpleFactory.clase.TipAngajat;

public class Main {

    public static void main(String[] args) {
        FactoryPersonal factoryPersonal=new FactoryPersonal();
        PersonalSpital medic=factoryPersonal.creareAngajat(TipAngajat.MEDIC,"Gigel",12,3);
        medic.afisare();
        PersonalSpital asistent=factoryPersonal.creareAngajat(TipAngajat.ASISTENT,"Ionel",22,0);
        asistent.afisare();
    }

}