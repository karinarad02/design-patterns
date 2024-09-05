package Pb1.program;


import Pb1.clase.FactorySupa;
import Pb1.clase.FactorySupaCiuperci;
import Pb1.clase.ISupa;

public class Main {
    public static void main(String[] args) {
        FactorySupa factorySupa=new FactorySupaCiuperci();
        ISupa supaCiuperci=factorySupa.creareSupa();
        supaCiuperci.afisare();
    }
}