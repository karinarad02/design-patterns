package Pb1.program;

import Pb1.clase.CreditFactory;
import Pb1.clase.ICredit;
import Pb1.clase.TipCredit;

public class Main {
    public static void main(String[] args) {
        CreditFactory factory=new CreditFactory();
        try {
            ICredit credit= factory.creareCredit(TipCredit.CREDITIPOTECAR);
            credit.afisare();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}