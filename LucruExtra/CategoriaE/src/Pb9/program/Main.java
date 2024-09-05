package Pb9.program;

import Pb9.clase.Loc;
import Pb9.clase.Sectiune;
import Pb9.clase.SectiuneAbstracta;


public class Main {
    public static void main(String[] args) {
        SectiuneAbstracta stadion=new Sectiune("Stadion");
        SectiuneAbstracta tribuna=new Sectiune("Tribuna");
        SectiuneAbstracta peluza=new Sectiune("Peluza");
        SectiuneAbstracta nord=new Sectiune("Tribuna Nord");
        SectiuneAbstracta copii=new Sectiune("Tribuna Copii");
        SectiuneAbstracta vip=new Sectiune("Tribuna VIP");

        SectiuneAbstracta loc1=new Loc(1,true);
        SectiuneAbstracta loc2=new Loc(2,false);
        SectiuneAbstracta loc3=new Loc(3,true);
        SectiuneAbstracta loc4=new Loc(4,false);

        stadion.adaugareSectiune(tribuna);
        stadion.adaugareSectiune(peluza);
        tribuna.adaugareSectiune(nord);
        tribuna.adaugareSectiune(copii);
        peluza.adaugareSectiune(vip);
        nord.adaugareSectiune(loc1);
        copii.adaugareSectiune(loc2);
        vip.adaugareSectiune(loc3);
        vip.adaugareSectiune(loc4);

        stadion.afisareLocuri("   ");

    }
}
