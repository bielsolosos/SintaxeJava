
public class Escola {
	private String nome;
	private int idade;
	private int prova1;
	private int prova2;
	
	public Escola(String Nome, int Idade, int Prova1, int Prova2) {
		this.nome = Nome;
		this.idade = Idade;
		this.prova1 = Prova1;
		this.prova2 = Prova2;
	}
	
	//Setando os Gets:
	public String getnome() {
		return this.nome;
	}
	public int getIdade() {
		return idade;
	}
	public int getProva1() {
		return prova1;
	}
	public int getProva2() {
		return prova2;
	}
	
	//setando os sets
	public int setProva1(int Prova1) {
		this.prova1 = Prova1;
	}
	public int setProva2(int Prova2) {
		this.prova2 = Prova2;
		
	
	}
}
