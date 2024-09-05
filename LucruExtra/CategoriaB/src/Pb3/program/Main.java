package Pb3.program;

import Pb3.clase.FactorySupa;
import Pb3.clase.ISupa;
import Pb3.clase.TipSupa;

public class Main {
    public static void main(String[] args) {
        FactorySupa factory=new FactorySupa();
        try {
            ISupa supaLegume=factory.creareSupa(TipSupa.LEGUME);
            supaLegume.afisare();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}