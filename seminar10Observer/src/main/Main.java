package main;

import clase.observer.Client;
import clase.observer.Observer;
import clase.observer.Turist;
import clase.restaurant.Restaurant;
import clase.restaurant.SalaDeSport;
import clase.restaurant.Subiect;

public class Main {
    public static void main(String[] args) {
        Subiect restaurant=new Restaurant("Piata Romana nr. 3");

        Observer client1=new Client("Ana");
        Observer client2=new Client("Mario");
        Observer client3=new Client("Andrei");
        Observer client4=new Client("Ioana");

        restaurant.adaugareClient(client1);
        restaurant.adaugareClient(client2);
        restaurant.notificareEveniment("12 Mai");
        System.out.println("\n");
        restaurant.stergereClient(client1);
        restaurant.adaugareClient(client3);
        restaurant.adaugareClient(client4);
        restaurant.notificareMeniuNou();
        System.out.println("\n");
        restaurant.notificareOfertaPret();
        System.out.println("\n");

        Observer turist=new Turist();
        restaurant.adaugareClient(turist);
        restaurant.notificareEveniment("10 Iulie");
        System.out.println("\n");

        SalaDeSport salaDeSport=new SalaDeSport();
        salaDeSport.adaugareClient(client1);
        salaDeSport.adaugareClient(client3);
        salaDeSport.notificareMeciVolei();

    }
}