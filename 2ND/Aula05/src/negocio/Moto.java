package negocio;

public class Moto extends Veiculo {
	private int cilindrada;

	public Moto() {
		super();
	}

	public Moto(String modelo, Fabricante objFabricante, String cor, int cilindrada) {
		super(modelo, objFabricante, cor);
		this.cilindrada = cilindrada;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
}
