package main;

import clase.Cash;
import clase.Client;
import clase.ModPlata;

public class Main {
    public static void main(String[] args) {
        Client client=new Client("Ion");
        ModPlata modPlata=new Cash();
        client.realizeazaPlata(20);
        client.setModPlata(modPlata);
        client.realizeazaPlata(30);
        client.realizeazaPlata(40);

    }
}