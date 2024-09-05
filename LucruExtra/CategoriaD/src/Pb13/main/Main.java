package Pb13.main;

import Pb13.clase.Bancomat;

public class Main {
    public static void main(String[] args) {
        Bancomat bancomat=new Bancomat(20.0);
        bancomat.intorduCard();
        bancomat.introduPin();
        bancomat.retrageBani(10);
        bancomat.retrageBani(30);
    }
}
