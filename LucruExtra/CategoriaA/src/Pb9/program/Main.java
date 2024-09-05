package Pb9.program;


import Pb9.clase.Client;
import Pb9.clase.Internare;
import Pb9.clase.InternareAbstracta;
import Pb9.clase.ProxyInternare;

public class Main {
    public static void main(String[] args) {
        Client client1=new Client("Marcel",22,false);
        Client client2=new Client("Mihai",31,true);

        InternareAbstracta internare1=new Internare("Regina Maria",201,"infectie intestinala");
        System.out.println("\nFara proxy:");
        internare1.interneaza(client1);
        internare1.interneaza(client2);

        InternareAbstracta internare2=new ProxyInternare(internare1);
        System.out.println("\nCu proxy:");
        internare2.interneaza(client1);
        internare2.interneaza(client2);
    }

}