package Exemplo1;

public class Operacao extends Livro implements Livraria{	
	
	private String tipo;
	private double valorOperacao;
	private Livro livro;
	
	public Operacao(String autor, String titulo, double valor, String tipo, double valorOperacao, Livro livro) {
		super(autor, titulo, valor);
		this.tipo = tipo;
		this.valorOperacao = valorOperacao;
		this.livro = livro;
	}
	
	
	@Override
	public String toString() {
		return "Operacao [tipo=" + tipo + ", valorOperacao=" + valorOperacao + ", livro=" + livro + "]";
	}


	public String getTipo() {
		return tipo;
	}

	public double getValorOperacao() {
		return valorOperacao;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	

	@Override
	public void emprestarLivro() {
		this.valorOperacao =  (this.getValor() * 0.02) + Livraria.taxaEmprestimo; 
	}

	@Override
	public void venderLivro() {
		this.valorOperacao = this.getValor() * 1.09;
	}

	//aqui foi aparentemente 
	//Tem alguém acompanhando a minha tela?
	
	
}
