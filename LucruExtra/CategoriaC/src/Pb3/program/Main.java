package Pb3.program;

import Pb3.clase.Factura;
import Pb3.clase.FacturaBuilder;

public class Main {
    public static void main(String[] args) {
        FacturaBuilder builder=new FacturaBuilder();
        Factura factura=builder.adaugaNumarPungi(4)
                .adaugaCardFidelitate(true)
                .build();
        System.out.println(factura);
    }
}