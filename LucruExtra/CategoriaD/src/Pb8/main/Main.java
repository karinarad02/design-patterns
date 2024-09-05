package Pb8.main;

import Pb8.clase.Client;
import Pb8.clase.Credit;
import Pb8.clase.ProxyCredit;

public class Main {
    public static void main(String[] args) {
        Client client=new Client("Mircea");
        System.out.println("Fara Proxy:");
        Credit credit=new Credit(200.0,3.0,"EURO");
        credit.creareCont(client);
        System.out.println("Cu Proxy:");
        ProxyCredit proxyCredit=new ProxyCredit(credit);
        proxyCredit.creareCont(client);
    }
}
