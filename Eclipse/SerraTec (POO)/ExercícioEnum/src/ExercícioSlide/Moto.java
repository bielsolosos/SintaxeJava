package ExercícioSlide;

import java.time.LocalDate;

import classes.Proprietario;
import classes.Veiculo;

public class Moto extends Veiculo {
	int cilindradas;

	public Moto(String modelo, LocalDate dataConserto, Proprietario proprietario, int cilindradas) {
		super(modelo, dataConserto, proprietario);
		this.cilindradas = cilindradas;
	}

	@Override
	public double getValorCobrado() {
		return super.getValorCobrado();
	}

	@Override
	public double lavarVeiculo() {
		return super.lavarVeiculo();
	}

	@Override
	public double revisao() {
		return super.revisao();
	}


		
}
