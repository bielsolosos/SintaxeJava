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
	
	public void RemoverSaldo(double deposito) {
		this.Saldo = this.Saldo - deposito;
	}
	
	public double getTitular() {
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
	
	
	
	public void MostrarSaldo() {
		System.out.println("Conta: " + getTitular() + " Titular: " + getNome() + " Saldo: $" + getSaldo() );
	}
}
