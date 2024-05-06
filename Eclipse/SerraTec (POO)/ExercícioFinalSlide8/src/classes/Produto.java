package classes;

import enums.Categoria;

public class Produto{
	private int codigo;
	private String descricao;
	private double valor;
	private Categoria categoria;
	
	public Produto(int codigo, String descricao, double valor, Categoria categoria) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.valor = valor;
		this.categoria = categoria;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getValor() {
		return valor;
	}

	public Categoria getCategoria(int i) {
		switch(i) {
		case 1:
			return Categoria.ALIMENTO;
			
		case 2:
			return Categoria.AUTOMOTIVO;
			
		case 3:
			return Categoria.ELETRONICO;
			
		default:
			return Categoria.FARMACEUTICO;
		}
		
	}
	
	
}
