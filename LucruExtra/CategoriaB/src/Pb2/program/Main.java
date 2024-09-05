package Pb2.program;


import Pb2.clase.Rezervare;
import Pb2.clase.RezervareBuilder;

public class Main {
    public static void main(String[] args) {
        RezervareBuilder rezervareBuilder=new RezervareBuilder("Marcel");
        Rezervare rezervare=rezervareBuilder
                .adaugaAsezareGeam(true)
                .adaugaMuzicaAmbientalaPersonalizata(true)
                .build();
        System.out.println(rezervare);
    }
}