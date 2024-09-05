package Pb10.program;

import Pb10.clase.Calator;
import Pb10.clase.CardBancar;
import Pb10.clase.ModPlata;
import Pb10.clase.SMS;

public class Main {
    public static void main(String[] args) {
        Calator calator=new Calator("Marcel");
        calator.platesteCalatore(3);
        ModPlata cardBancar=new CardBancar();
        calator.setModPlata(cardBancar);
        calator.platesteCalatore(4);
        ModPlata sms=new SMS();
        calator.setModPlata(sms);
        calator.platesteCalatore(5);
    }
}