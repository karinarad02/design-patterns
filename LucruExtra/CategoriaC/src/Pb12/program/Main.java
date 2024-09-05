package Pb12.program;

import Pb12.clase.farmacie.Farmacie;
import Pb12.clase.farmacie.Subiect;
import Pb12.clase.observer.Client;
import Pb12.clase.observer.Observer;

public class Main {
    public static void main(String[] args) {
        Subiect farmacie=new Farmacie("Tei");
        Observer client1=new Client("Adina");
        Observer client2=new Client("Lavinia");
        Observer client3=new Client("Sorana");
        Observer client4=new Client("Luana");

        farmacie.adaugareClient(client1);
        farmacie.adaugareClient(client2);
        farmacie.adaugareClient(client3);
        farmacie.adaugareClient(client4);
        farmacie.notificareReducerePreturi();
    }
}
