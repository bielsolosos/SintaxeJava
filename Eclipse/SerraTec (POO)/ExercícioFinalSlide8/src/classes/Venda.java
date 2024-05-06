package classes;

import java.time.LocalDate;

import enums.FinalizarVenda;

public class Venda implements FinalizarVenda{
	private Produto produto;
	private LocalDate dataCompra;
	private int quantidade;
	private double totalVenda;
	
	public Venda(Produto produto, LocalDate dataCompra, int quantidade, double totalVenda) {
		super();
		this.produto = produto;
		this.dataCompra = dataCompra;
		this.quantidade = quantidade;
		this.totalVenda = totalVenda;
	}

	public Produto getProduto() {
		return produto;
	}

	public LocalDate getDataCompra() {
		return dataCompra;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public double getTotalVenda() {
		return totalVenda;
	}

	@Override
	public void calcularVenda() {
				
	}
	
	
	
}
