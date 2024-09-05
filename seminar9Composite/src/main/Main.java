package main;

import clase.Categorie;
import clase.Medicament;
import clase.StructuraAbstracta;

public class Main {
    public static void main(String[] args) {
        StructuraAbstracta medicamente=new Categorie("Medicamente");
        StructuraAbstracta raceala=new Categorie("Raceala");
        StructuraAbstracta durere=new Categorie("Durere");

        StructuraAbstracta copii=new Categorie("Copii");
        StructuraAbstracta adulti=new Categorie("Adulti");

        StructuraAbstracta nurofen=new Medicament("Nurofen",15.0);
        StructuraAbstracta paracetamol=new Medicament("Paracetamol",10.0);
        StructuraAbstracta mig400=new Medicament("Mig400",20.0);
        StructuraAbstracta nurofenJunior=new Medicament("NurofenJunior",15.0);

        medicamente.adaugareCategorie(raceala);
        medicamente.adaugareCategorie(durere);

        raceala.adaugareCategorie(copii);
        raceala.adaugareCategorie(adulti);

        durere.adaugareCategorie(mig400);

        adulti.adaugareCategorie(nurofen);
        copii.adaugareCategorie(nurofenJunior);
        raceala.adaugareCategorie(paracetamol);

        medicamente.afisareProspect(" ");

    }
}