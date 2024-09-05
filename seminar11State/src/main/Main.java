package main;

import clase.Reteta;

public class Main {
    public static void main(String[] args) {
        Reteta reteta1=new Reteta(3,6);
        reteta1.cumparaMedicamente();
        reteta1.solicitaMedicamente();
        reteta1.respingeAchizitie();
        reteta1.solicitaMedicamente();
        reteta1.solicitaMedicamente();
        reteta1.cumparaMedicamente();
    }
}