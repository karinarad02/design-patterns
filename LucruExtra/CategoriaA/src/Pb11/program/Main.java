package Pb11.program;

import Pb11.clase.Card;
import Pb11.clase.Cash;
import Pb11.clase.Client;
import Pb11.clase.ModPlata;

public class Main {
    public static void main(String[] args) {
        Client client=new Client("Popescu");
        client.realizeazaPlata(25.0);
        ModPlata card=new Card();
        client.setModPlata(card);
        client.realizeazaPlata(35.0);
    }
}
