package atributosEscola;

public class dadosEscola {
	String nome;
	int idade;
	int prova1;
	int prova2;
	
	public dadosEscola(String Nome, int Idade, int Prova1, int Prova2) {
		nome = Nome;
		idade = Idade;
		prova1 = Prova1;
		prova2 = Prova2;
	}
	
	public dadosEscola(String Nome, int Prova1, int Prova2) {
		nome = Nome;
		idade = 0;
		prova1 = Prova1;
		prova2 = Prova2;
	}
	
	
	public int media(int prova1, int prova2) {
		return (prova1 + prova2)/2;
	}
}


