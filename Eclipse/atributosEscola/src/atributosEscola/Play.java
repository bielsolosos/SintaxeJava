package atributosEscola;

public class Play {

	public static void main(String[] args) {
		dadosEscola escola = new dadosEscola("Enzo", 12, 7, 8);
		System.out.println("Escola Paroquial nossa senhora de gertrudes");
		
		System.out.println("Nome : " + escola.nome);
		System.out.println("idade : " + escola.idade);
		System.out.println("nota1 : " + escola.prova1);
		System.out.println("nota2 : " + escola.prova2);
		System.out.println("Média final : " + escola.media(escola.prova1, escola.prova2));
	}

}
