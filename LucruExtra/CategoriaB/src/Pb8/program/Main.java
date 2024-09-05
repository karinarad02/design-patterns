package Pb8.program;

import Pb8.clase.Produs;
import Pb8.clase.Sectiune;
import Pb8.clase.StructuraAbstracta;

public class Main {
    public static void main(String[] args) {
        StructuraAbstracta meniu=new Sectiune("Meniu");

        StructuraAbstracta startere=new Sectiune("Startere");
        StructuraAbstracta bauturi=new Sectiune("Bauturi");
        StructuraAbstracta desert=new Sectiune("Desert");

        StructuraAbstracta sucuri=new Sectiune("Sucuri");
        StructuraAbstracta cafea=new Sectiune("Cafea");

        StructuraAbstracta portocale=new Produs("Suc de Portocale", 8.0);
        StructuraAbstracta mere=new Produs("Suc de Mere", 10.0);
        StructuraAbstracta latte=new Produs("Cafe Latte",22.0);
        StructuraAbstracta espresso=new Produs("Espresso",15.0);
        StructuraAbstracta tiramisu=new Produs("Tiramisu",18.0);
        StructuraAbstracta lava=new Produs("Lava Cake",20.0);

        meniu.adaugareSectiune(startere);
        meniu.adaugareSectiune(bauturi);
        meniu.adaugareSectiune(desert);

        bauturi.adaugareSectiune(sucuri);
        bauturi.adaugareSectiune(cafea);
        desert.adaugareSectiune(tiramisu);
        desert.adaugareSectiune(lava);

        sucuri.adaugareSectiune(portocale);
        sucuri.adaugareSectiune(mere);
        cafea.adaugareSectiune(latte);
        cafea.adaugareSectiune(espresso);

        meniu.afisareMeniu("   ");

    }
}