package Pb5.softVechi;

import Pb5.softNou.CreditLeasing;

public class AdapterCredit extends Credit{
    CreditLeasing creditLeasing;
    public AdapterCredit(String numeClient, double dobanda) {
        super(numeClient, dobanda);
    }
    public AdapterCredit(CreditLeasing creditLeasing) {
        super(creditLeasing.getNumeClient(),3);
        this.creditLeasing=creditLeasing;
    }
}
