package Pb4.program;

import Pb4.clase.Client;

public class Main {
    public static void main(String[] args) {
        Client client1=new Client("Popescu",50);
        Client client2=client1.clone();
        System.out.println(client2);
    }
}