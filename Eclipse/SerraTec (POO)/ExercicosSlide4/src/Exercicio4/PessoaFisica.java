package Exercicio4;

public class PessoaFisica extends ImpostoDeRenda {
	private	String cpf;
	private String rg;
	


	public PessoaFisica(String nome, double rendimentos, String cpf, String rg) {
		super(nome,rendimentos);
		this.cpf = cpf;
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	@Override
	public double calculoIR() {
		// TODO Auto-generated method stub
		return super.calculoIR() * 0.12;
	}
	
	
}
