package main;

import model.AbstractBuilder;
import model.Pacient;
import model.PacientBuilder;

public class Main {
    public static void main(String[] args) {
        AbstractBuilder builder=new PacientBuilder("Andrei");
        Pacient pacient=builder.adaugaHalatInterior().adaugaPapuciCamera().build();
        System.out.println(pacient);
    }
}