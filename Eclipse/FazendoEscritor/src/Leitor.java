import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

class leitor{
    public static void retornaFuncionarios() throws IOException {
        BufferedReader ler = new BufferedReader(new FileReader("Cadastros.txt"));
        String linha = "";
		int Quantidade_Funcionarios = 0;
		Map<String, Funcionario> mapFuncionarios = new HashMap<>();
		while(true){
			linha = ler.readLine();
			if(linha != null){
				String[] lista = linha.split(";");
				if(lista[2].equalsIgnoreCase("Cliente")){
					Funcionario func = new Funcionario(lista[0], lista[1], lista[2]);
					mapFuncionarios.put(lista[0], func);
					Quantidade_Funcionarios++;
					//O nome dessa variáveis é ridículo aceito sugestões
				}
			}
			else{
				break;
			}

		}
}







    public static void CriarConta() throws IOException {
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter("Cadastros.txt", true));
		Scanner sc = new Scanner(System.in);
		System.out.println("Caso cliente digite 1 caso funcionario digite 0: ");
		String linha1 = sc.nextLine();
		String linha = "";
		System.out.println("Digite sua senha: ");
		linha = sc.nextLine();
		buffWrite.append(linha + ";");
		System.out.println("Digite seu CPF: ");
		linha = sc.nextLine();
		buffWrite.append(linha + ";");
		String cargo="";
			if(linha1.equals("0"))
			{
				System.out.println("Digite seu Cargo: ");
				cargo = sc.nextLine();
				buffWrite.append(cargo + ";");
			}
			else if(linha1.equals("1")){
				buffWrite.append("Cliente" + ";\n");
			}

			if(cargo.equalsIgnoreCase("gerente")) 
			{
					System.out.println("Digite sua agencia: ");
					linha = sc.nextLine();
					buffWrite.append(linha + ";");
			}
		sc.close();
		buffWrite.append("\n");
		System.out.println("Conta criada com sucesso!");
		buffWrite.close();
		}
}