package main;

import Exemplo1.Livro;
import Exemplo1.Operacao;

public class Principal {
	public static void main(String args[]) {
		Livro l1 = new Livro("Marco Antônio", "Cisco CCNA", 85.00);
		Livro l2 = new Livro("Kathy Sierra", "Use a Cabeça Java", 98.00);
		
		Operacao op1 = new Operacao("teste", "teste", 85.00, "venda" , 85.00, l1);
		Operacao op2 = new Operacao("teste", "teste", 98.00, "empréstimo", 98.00, l2);
		
		op1.reajusteLivro(0.06);
		op1.venderLivro();
		op2.emprestarLivro();
		
		System.out.println(op1.getValor());
		System.out.println(op2.getValor());

		System.out.println(op1.toString());
		System.out.println(op2.toString());
	}
}
