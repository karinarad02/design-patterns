package Pb10.main;

import Pb10.clase.Banca;
import Pb10.clase.FlyweightFactory;
import Pb8.clase.Client;

public class Main {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory=new FlyweightFactory();
        Banca banca=new Banca("BNR","Credite",4000);
        flyweightFactory.getClient("1234","Cosmin","str. Ciresilor","0987654321","cosmir@gmail.com",210.0)
                .creareCont(banca);

    }
}
