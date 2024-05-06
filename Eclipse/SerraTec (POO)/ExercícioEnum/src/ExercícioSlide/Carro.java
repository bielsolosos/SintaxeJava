package ExercícioSlide;

import java.time.LocalDate;

import classes.Proprietario;
import classes.Veiculo;

public class Carro extends Veiculo {
	String categoria;

	public Carro(String modelo, LocalDate dataConserto, Proprietario proprietario, String categoria) {
		super(modelo, dataConserto, proprietario);
		this.categoria = categoria;
	}

	public String getCategoria() {
		return categoria;
	}
	
	

	@Override
	public double trocarOleo() {
		if(this.dataConserto.getDayOfWeek().getValue() == 7 ) {
			return super.trocarOleo() - 50.0;
		}
		else {
			return super.trocarOleo();
		}
	}

	@Override
	public double lavarVeiculo() {
		return super.lavarVeiculo();
	}

	@Override
	public double revisao() {
		if(this.dataConserto.getMonthValue() == 8) {
			return (super.revisao() * 0.9);
		}
		else {
			return this.revisao();
		}
	}

	
	
	 
}
