package Pb10.program;

import Pb10.clase.FlyweightFactory;
import Pb10.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare1=new Rezervare(10,3,18);
        Rezervare rezervare2=new Rezervare(12,4,17);
        Rezervare rezervare3=new Rezervare(14,2,18);
        Rezervare rezervare4=new Rezervare(15,2,19);

        FlyweightFactory flyweightFactory=new FlyweightFactory();
        flyweightFactory.getClient("gigel@yahoo.com","Gigel","0713569287").realizeazaRezervare(rezervare1);
        flyweightFactory.getClient("dorel@gmail.com","Dorel","0787623489").realizeazaRezervare(rezervare2);
        flyweightFactory.getClient("dorel@gmail.com","Dorel","0787623489").realizeazaRezervare(rezervare3);
        flyweightFactory.getClient("dorel@gmail.com","Dorel","0787623489").realizeazaRezervare(rezervare4);

    }
}