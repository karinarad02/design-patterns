package Pb3.program;

import Pb3.clase.Builder;
import Pb3.clase.IBuilder;
import Pb3.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        IBuilder builder=new Builder("Bill");
        Rezervare rezervare=builder.adaugaMancareInclusa(true)
                .adaugaBauturaInclusa(true)
                .build();
        System.out.println(rezervare);
    }
}