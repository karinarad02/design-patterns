package Pb12.main;


import Pb12.clase.banca.Banca;
import Pb12.clase.banca.Subiect;
import Pb12.clase.observer.Client;
import Pb12.clase.observer.Observer;

public class Main {
    public static void main(String[] args) {
        Subiect banca=new Banca("BNR");
        Observer client1=new Client("Antonia");
        Observer client2=new Client("Stefan");
        Observer client3=new Client("Vlad");
        banca.adaugaObservator(client1);
        banca.adaugaObservator(client2);
        banca.notificareDobandaMica();
        banca.stergeObservator(client2);
        banca.adaugaObservator(client3);
        banca.notificareDobandaMica();
        
    }
}
