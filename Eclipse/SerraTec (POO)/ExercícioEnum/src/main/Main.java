package main;

import java.time.LocalDate;

import ExercícioSlide.Carro;
import classes.Proprietario;

public class Main {

	public static void main(String[] args) {
		LocalDate data = LocalDate.of(2024, 8, 23);
		Proprietario Jose = new Proprietario("José");
		Carro c1 = new Carro("Opala", data ,Jose,"Velho");
		
		System.out.println(c1.trocarOleo());
		System.out.println(c1.revisao());
		
		System.out.println("nome" + Jose.getNome() + c1.toString());
		
	}

}
