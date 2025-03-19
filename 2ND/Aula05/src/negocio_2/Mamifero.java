package negocio_2;

public abstract class Mamifero extends Animal {
	private double litrosLeite;

	public Mamifero() {
		super();
	}

	public Mamifero(double peso, double altura, String nome, double litrosLeite) {
		super(peso, altura, nome);
		this.litrosLeite = litrosLeite;
	}

	public double getLitrosLeite() {
		return litrosLeite;
	}

	public void setLitrosLeite(double litrosLeite) {
		this.litrosLeite = litrosLeite;
	}
	
	
}
