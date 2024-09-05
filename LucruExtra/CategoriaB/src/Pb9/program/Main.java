package Pb9.program;

import Pb9.clase.Client;
import Pb9.clase.ProxyRezervare;
import Pb9.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        Client client=new Client("Maria",20);
        Rezervare rezervare1=new Rezervare("Exclusive",5,19);
        Rezervare rezervare2=new Rezervare("Exclusive",2,18);

        System.out.println("Fara proxy");
        rezervare1.realizeazaRezervare(client);
        rezervare2.realizeazaRezervare(client);

        System.out.println("\nCu proxy");
        ProxyRezervare rezervare3=new ProxyRezervare(rezervare1);
        ProxyRezervare rezervare4=new ProxyRezervare(rezervare2);
        rezervare3.realizeazaRezervare(client);
        rezervare4.realizeazaRezervare(client);

    }
}
