package Exercicio4;

public class ImpostoDeRenda {
	
	protected String nome;
	protected String tel;
	protected String email;
	protected double rendimentos;
	
	public ImpostoDeRenda(String nome, double rendimentos) {
		super();
		this.nome = nome;
		this.rendimentos = rendimentos;
	}
	 
	public double calculoIR() {	
		return this.rendimentos;
	}
	
}
