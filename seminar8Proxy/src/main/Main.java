package main;

import clase.*;

public class Main {
    public static void main(String[] args) {
        BiletAbstract bilet1=new Bilet("A","B",10.0);
        Client client1=new Client("Popescu",13);
        bilet1.vanzareBilet(client1);

        BiletAbstract bilet2=new ProxyBilet(bilet1);
        bilet2.vanzareBilet(client1);
        Client client2=new Client("Gigel",18);
        bilet2.vanzareBilet(client2);

        BiletAbstract bilet3=new ProxySector(bilet1);
        ProxySector.adaugaLitere('p');
        bilet3.vanzareBilet(client1);
        bilet3.vanzareBilet(client2);

        BiletAbstract bilet4=new ProxyBilet((bilet3));
        bilet4.vanzareBilet(client1);
        bilet4.vanzareBilet(client2);

    }
}