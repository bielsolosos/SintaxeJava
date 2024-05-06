package classes;

import java.time.LocalDate;

import ExercícioSlide.Oficina;
import ExercícioSlide.TipoServico;

public class Veiculo implements Oficina{
	
	private String modelo;
	private double valorCobrado;
	protected LocalDate dataConserto;
	private Proprietario proprietario;
	private TipoServico tipoServico;
	
	public Veiculo(String modelo,LocalDate dataConserto, Proprietario proprietario) {
		super();
		this.modelo = modelo;
		this.dataConserto = dataConserto;
		this.proprietario = proprietario;
	}
	
	
	
	public double getValorCobrado() {
		return valorCobrado;
	}

	@Override
	public String toString() {
		return "Veiculo [modelo=" + modelo + ", valorCobrado=" + valorCobrado + ", dataConserto=" + dataConserto
				+ ", proprietario=" + proprietario + "]";
	}



	@Override
	public double lavarVeiculo() {
		return TipoServico.LAVAGEM.getValorPorServico(); 
	}
	



	@Override
	public double trocarOleo() {
		
		/*if(TipoServico.OLEO.getTipoServico().equalsIgnoreCase(servico)){
			return TipoServico.OLEO.getValorPorServico();
		}
		else {
			return 0;
		}*/
		return TipoServico.OLEO.getValorPorServico();

	}



	@Override
	public double revisao() {
		return TipoServico.REVISAO.getValorPorServico();
	}
	
	
}
