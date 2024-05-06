package enums;

public enum Categoria {
	ELETRONICO("Tv") ,
	ALIMENTO("Banana"),
	AUTOMOTIVO("Pneu"),
	ROUPAS("Camisa"),
	FARMACEUTICO("Marcelo");
	
	String Cat;

	private Categoria(String cat) {
		Cat = cat;
	}

	public String getCat() {
		return Cat;
	}
	
	//fiquei bugado p/ fazer essa merda ok? maior dificuldade até agora foram as enum
	//pulei as Enuns e comecei a fazer simplismente a porra das Classes!!!
}
