package negocio_2;

public class Leopardo extends Mamifero{
	private double velocidade;

	public Leopardo() {
		super();
	}

	public Leopardo(double peso, double altura, String nome, double litrosLeite, double velocidade) {
		super(peso, altura, nome, litrosLeite);
		this.velocidade = velocidade;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	public void correr() {
		System.out.println("O leopardo correu");
	}
}
