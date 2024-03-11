package Banco;
import java.util.Scanner;

public class Main {
	//Exercício ainda não concluído!
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		
		Dados_Banco Banco;
		int Numero, Verifica;
		String Nome;
		Double Deposito;
		
		System.out.println("Entre o Número da Conta: ");
		Numero = Scan.nextInt();
		
		System.out.println("Entre o Titular da Conta: ");
		Nome = Scan.next();
	
		
		do {
		System.out.println("Haverá depósito inicial? (Digite 1 para sim e 2 para Não)");
		Verifica = Scan.nextInt();
		}while(Verifica != 1 && Verifica != 2);
		
		
		if(Verifica == 1) {
			System.out.println("Insira seu Depósito incial");
			Deposito = Scan.nextDouble();
			Banco = new Dados_Banco(Numero, Nome, Deposito );
			
		}
		else {
			Banco = new Dados_Banco(Numero, Nome);
		}
		Banco.MostrarSaldo(1);
		
		
		System.out.println("Entre um valor para depósito:");
		Deposito = Scan.nextDouble();
		Banco.Deposito(Deposito);
		Banco.MostrarSaldo(0);
		
		
		System.out.println("Entre um valor para Saque:");
		Deposito = Scan.nextDouble();
		Banco.Saque(Deposito);
		Banco.MostrarSaldo(0);
	}

}
