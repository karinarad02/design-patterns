package Pb8.main;

import Pb8.clase.Autobuz;
import Pb8.clase.Client;
import Pb8.clase.InterfataAutobuz;
import Pb8.clase.ProxyAutobuz;

public class Main {
    public static void main(String[] args) {
        Client client=new Client("Marta",40);
        System.out.println("Fara Proxy: ");
        Autobuz autobuz1=new Autobuz("Nicu",3,10);
        Autobuz autobuz2=new Autobuz("Marcel",3,0);
        autobuz1.oprireInStatie(client);
        autobuz2.oprireInStatie(client);
        System.out.println("Cu Proxy: ");
        ProxyAutobuz proxy1=new ProxyAutobuz(autobuz1);
        ProxyAutobuz proxy2=new ProxyAutobuz(autobuz2);
        proxy1.oprireInStatie(client);
        proxy2.oprireInStatie(client);
    }
}
