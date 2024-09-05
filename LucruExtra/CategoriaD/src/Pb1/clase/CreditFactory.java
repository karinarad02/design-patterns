package Pb1.clase;

public class CreditFactory {
    public ICredit creareCredit(TipCredit tipCredit) throws Exception {
        switch (tipCredit){
            case CREDITNEVOIPERSONALE:return new CreditNevoiPersonale();
            case CREDITIPOTECAR:return new CreditIpotecar();
            default:
                throw new Exception("Tipul dat este invalid");
        }
    }
}
