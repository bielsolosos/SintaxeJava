package Banco;
import java.util.Scanner;

public class Main {
	//Exercício ainda não concluído!
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		
		Dados_Banco Banco;
		int Numero;
		String Nome , Verifica;
		Double Deposito;
		
		System.out.println("Entre o Número da Conta: ");
		Numero = Scan.nextInt();
		
		System.out.println("Entre o Titular da Conta: ");
		Nome = Scan.next();
	
		

		System.out.println("Haverá depósito inicial? (s/n)");
		Verifica = Scan.next();
		
		
		
		if(Verifica == "s") {
			System.out.println("Insira seu Depósito incial");
			Deposito = Scan.nextDouble();
			Banco = new Dados_Banco(Numero, Nome, Deposito );
			
		}
		else {
			Banco = new Dados_Banco(Numero, Nome);
		}
		//Utilizar o Modo Debug do Java no Eclipse e descobrir como fazer essa verificação
		Banco.MostrarSaldo();
	}

}
