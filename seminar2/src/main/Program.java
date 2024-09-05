package main;

import java.io.FileNotFoundException;
import java.util.List;

import model.clase.Aplicant;
import model.readere.AngajatReader;
import model.readere.AplicantReader;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		AplicantReader angajatReader=new AngajatReader();
		try {
			listaAngajati = angajatReader.readAplicanti("angajati.txt");
			for(Aplicant aplicant:listaAngajati)
				System.out.println(aplicant.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
