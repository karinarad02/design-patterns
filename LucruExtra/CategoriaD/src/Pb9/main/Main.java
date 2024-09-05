package Pb9.main;

import Pb9.clase.Agentie;
import Pb9.clase.StructuraAbstracta;
import Pb9.clase.Sucursala;

public class Main {
    public static void main(String[] args) {
        StructuraAbstracta banca=new Sucursala("BNR");
        StructuraAbstracta sucursala1=new Sucursala("Sucursala 1");
        StructuraAbstracta sucursala2=new Sucursala("Sucursala 2");
        StructuraAbstracta sucursala3=new Sucursala("Sucursala 3");
        StructuraAbstracta sucursala4=new Sucursala("Sucursala 4");

        StructuraAbstracta agentie1=new Agentie("Agentie 1");
        StructuraAbstracta agentie2=new Agentie("Agentie 2");
        StructuraAbstracta agentie3=new Agentie("Agentie 3");
        StructuraAbstracta agentie4=new Agentie("Agentie 4");

        banca.adaugaSucursala(sucursala1);
        banca.adaugaSucursala(sucursala2);
        banca.adaugaSucursala(sucursala3);
        banca.adaugaSucursala(sucursala4);

        sucursala1.adaugaSucursala(agentie1);
        sucursala2.adaugaSucursala(agentie2);
        sucursala2.adaugaSucursala(agentie3);
        sucursala4.adaugaSucursala(agentie4);

        banca.afisareIerarhie("    ");
    }
}
