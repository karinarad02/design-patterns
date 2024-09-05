package Pb6.program;

import Pb6.clase.FacadePersonal;
import Pb6.clase.Medic;
import Pb6.clase.Pacient;
import Pb6.clase.Salon;

public class Main {
    public static void main(String[] args) {
        Pacient pacient=new Pacient("Mirela",45,"grava");
        Medic medic=new Medic("Ionescu");
        Salon salon=new Salon(3,true);

        System.out.println("\nFara facade:");
        pacient.verificaGravitateStare();
        medic.confirmareInternare();
        salon.disponibilitatePat();

        System.out.println("\nCu facade:");
        FacadePersonal personal=new FacadePersonal(pacient,medic,salon);
        personal.internarePacient();
    }
}
