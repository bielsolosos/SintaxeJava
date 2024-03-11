package Banco;

public class Dados_Banco {
	
	private int Titular;
	private String Nome;
	private double Saldo;
	
	public Dados_Banco(int titular, String nome, double saldo ) {
		this.Titular = titular;
		this.Nome = nome;
		this.Saldo = saldo;
	}
	
	public Dados_Banco(int titular, String nome) {
		this.Titular = titular;
		this.Nome = nome;
		this.Saldo = 0;
	}
	
	public void Deposito(double deposito) {
		this.Saldo = this.Saldo + deposito;
	}
	
	public void Saque(double deposito) {
		this.Saldo = (this.Saldo - deposito) - 5.0;
	}
	
	public int getTitular() {
		return Titular;
	}
	
	public String getNome() {
		return Nome;
	}
	
	public double getSaldo() {
		return Saldo;
	}
	
	public void setNome(String nome) {
		this.Nome = nome;
	}
	
	
	//Esse método afim de facilitar qual tipo de mensagem ele printa eu coloquei esse argumento em que se for 1 printa os dados
	//Qualquer outro método ele aceita dboas
	public void MostrarSaldo(int Verifica) {
		if(Verifica == 1) {
			System.out.println("Dados da Conta:");
		}
		else if (Verifica != 1){
			System.out.println("Dados da Conta atualizados:");
		}
			System.out.println("\nConta: " + getTitular() + ", Titular: " + getNome() + ", Saldo: $" + getSaldo() + "\n\n" );
	}
}
