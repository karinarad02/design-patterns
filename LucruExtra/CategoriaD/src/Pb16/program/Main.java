package Pb16.program;


import Pb16.clase.Client;

public class Main {
    public static void main(String[] args) {
        Client client=new Client("George");
        client.realizeazaPlata(30);
        client.realizeazaPlata(40);
        client.realizeazaPlata(80);

    }
}
