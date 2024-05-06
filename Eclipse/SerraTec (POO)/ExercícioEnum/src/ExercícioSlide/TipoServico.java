package ExercícioSlide;

public enum TipoServico {
	OLEO(100,"Trocar Oleo") , 
	LAVAGEM(50, "Lavar"),
	REVISAO(200, "Revisar carro");
	private String tipoServico;
	
	private double valorPorServico;

	private TipoServico(double valorPorServico, String tipoServico) {
		this.valorPorServico = valorPorServico;
		this.tipoServico = tipoServico;
	}

	public double getValorPorServico() {
		return valorPorServico;
	}

	public String getTipoServico() {
		return tipoServico;
	}
	
}
