package negocio_2;

public class Cachorro extends Mamifero{
	private double mordida;

	public Cachorro() {
		super();
	}

	public Cachorro(double peso, double altura, String nome, double litrosLeite, double mordida) {
		super(peso, altura, nome, litrosLeite);
		this.mordida = mordida;
	}

	public double getMordida() {
		return mordida;
	}

	public void setMordida(double mordida) {
		this.mordida = mordida;
	}
	
	public void morder() {
		System.out.println("O cachorro mordeu");
	}
}
