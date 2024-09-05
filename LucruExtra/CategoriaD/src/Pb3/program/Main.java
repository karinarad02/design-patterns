package Pb3.program;

import Pb3.clase.Builder;
import Pb3.clase.Cont;
import Pb3.clase.IBuilder;

public class Main {
    public static void main(String[] args) {
        IBuilder builder=new Builder();
        Cont cont=builder.adaugaSalariu(true)
                .adaugaCardAtasat(true)
                .build();
        System.out.println(cont);
    }
}