package toUpperCase;

import java.util.Scanner;

public class toUpperCaseMain {
	public static void main(String[] Args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Me diga qual seu nome");
		String nome = sc.nextLine();
		
		//nome = null;
		try {
			nome = nome.toUpperCase();
			System.out.println("Agora Bonito: " + nome );
		}catch(Exception Vadia){
			System.out.println("Você digitou merda tá? " + Vadia.getMessage());
		}finally {
			System.out.println("\nFim do Programa");
		}
	}
}
