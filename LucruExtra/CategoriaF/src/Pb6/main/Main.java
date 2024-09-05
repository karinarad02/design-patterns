package Pb6.main;

import Pb6.clase.Autobuz;
import Pb6.clase.Flota;
import Pb6.clase.StructuraAbstracta;

public class Main {
    public static void main(String[] args) {
        StructuraAbstracta companie=new Flota("General Motors");
        StructuraAbstracta grupMic=new Flota("Grupuri Mici");
        StructuraAbstracta grupMediu=new Flota("Grupuri Mediu");
        StructuraAbstracta grupMare=new Flota("Grupuri Mare");

        StructuraAbstracta autobuz1 = new Autobuz("Mercedes-Benz", "Mercedes-Benz Citaro", 30);
        StructuraAbstracta autobuz2 = new Autobuz("Volvo", "Volvo 9700", 10);
        StructuraAbstracta autobuz3 = new Autobuz("MAN", "MAN Lion's City", 10);
        StructuraAbstracta autobuz4 = new Autobuz("Scania", "Scania Interlink", 30);
        StructuraAbstracta autobuz5 = new Autobuz("Van Hool", "Van Hool Exqui.City", 50);

        companie.adaugareFlota(grupMic);
        companie.adaugareFlota(grupMediu);
        companie.adaugareFlota(grupMare);

        grupMic.adaugareFlota(autobuz2);
        grupMic.adaugareFlota(autobuz3);
        grupMediu.adaugareFlota(autobuz1);
        grupMediu.adaugareFlota(autobuz4);
        grupMare.adaugareFlota(autobuz5);

        companie.afiseazaIerarhie("   ");

    }
}
