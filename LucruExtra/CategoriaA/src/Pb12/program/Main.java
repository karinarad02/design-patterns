package Pb12.program;

import Pb12.clase.observer.Observer;
import Pb12.clase.observer.Pacient;
import Pb12.clase.spital.Spital;
import Pb12.clase.spital.Subiect;

public class Main {
    public static void main(String[] args) {
        Subiect spital=new Spital("Regina Maria");
        Observer pacient1=new Pacient("Ana");
        Observer pacient2=new Pacient("Cristian");
        Observer pacient3=new Pacient("Daniela");
        Observer pacient4=new Pacient("Maria");

        spital.adaugarePacient(pacient1);
        spital.adaugarePacient(pacient2);
        spital.notificareEpidemie();
        spital.adaugarePacient(pacient3);
        spital.adaugarePacient(pacient4);
        spital.stergerePacient(pacient2);
        spital.notificareEpidemie();
    }
}
