package Exercicio4;

public class Main {
	public static void main(String[] args) {
		ImpostoDeRenda José = new PessoaFisica("josé" , 2000.00, "123", "32");
		ImpostoDeRenda Rodrigo = new PessoaJuridica("Rodrigro", 4000.00, "123" , "321");
		
		System.out.println(" Pagar " + José.calculoIR());
		System.out.println(" Pagar " + Rodrigo.calculoIR());
	}
	
}
