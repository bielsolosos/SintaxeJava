package Escola;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Escola escola = new Escola("Julia" , 21 , 2, 1);
		
		System.out.println("Escola Paroquial nossa senhora de gertrudes");
		
		System.out.println("Nome : " + escola.getnome());
		System.out.println("idade : " + escola.getIdade());
		System.out.println("nota1 : " + escola.getProva1());
		System.out.println("nota2 : " + escola.getProva2());
		System.out.println("Média final : " + escola.media(escola.getProva1(), escola.getProva2()));
		
		int mediaFinal = escola.media(escola.getProva1(), escola.getProva2());
		
		if(escola.media(escola.getProva1(), escola.getProva2()) <= 6) {
			System.out.println("Você ficou de recuperação, Por favor Insira a Nota da Prova de recuperação ");
			int NotaFinal = scan.nextInt();
			System.out.println("Recuperação: " + escola.media(mediaFinal, NotaFinal) );
			
		}
	}

}
