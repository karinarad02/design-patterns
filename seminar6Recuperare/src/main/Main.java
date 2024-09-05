package main;

import adapter.softNou.Bar;
import adapter.softNou.Bautura;
import adapter.softVechi.*;

public class Main {
    public static void platesteConsumatia(SoftBucatarie bucatarie){
        bucatarie.printareBon();
    }
    public static void main(String[] args) {
        SoftBucatarie bucatarie=new Bucatarie();
        bucatarie.adaugareProdus(new Produs("Pizza",52));
        bucatarie.adaugareProdus(new Produs("Paste",45));
        platesteConsumatia(bucatarie);

        Bar bar=new Bar();
        bar.adaugaBautura(new Bautura(12,"Cola",0));
        bar.adaugaBautura(new Bautura(25,"Mojito",25.5F));

        AdapterComandaBarBucatarie adapter=new AdapterComandaBarBucatarie();
        adapter.adaugaBautura(new Bautura(20,"Cola",0));
        adapter.adaugaBautura(new Bautura(15,"Pepsi",0));
        adapter.adaugaBautura(new Bautura(18,"Sprite",0));

        Bautura bautura=new Bautura(5,"Apa",0);
        AdapterBauturaProdus adapterBauturaProdus=new AdapterBauturaProdus(bautura);
        adapter.adaugareProdus(adapterBauturaProdus);

        platesteConsumatia(adapter);

    }
}