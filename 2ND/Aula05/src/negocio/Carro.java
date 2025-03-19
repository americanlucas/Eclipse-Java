package negocio;

public class Carro extends Veiculo{
	//propriedades
	private boolean tetoSolar = false; //boolean sempre inicializado com FALSE

	//construtores
	public Carro() {
		super();
	}

	public Carro(String modelo, Fabricante objFabricante, String cor, boolean tetoSolar) {
		super(modelo, objFabricante, cor);
		this.tetoSolar = tetoSolar;
	}

	//get e set
	public boolean isTetoSolar() {
		return tetoSolar;
	}

	public void setTetoSolar(boolean tetoSolar) {
		this.tetoSolar = tetoSolar;
	}
	
	
}
