package negocio_2;

public class Aguia extends Ave{
	private double autonomia;

	public Aguia() {
		super();
	}

	public Aguia(double peso, double altura, String nome, int qtdOvos, double autonomia) {
		super(peso, altura, nome, qtdOvos);
		this.autonomia = autonomia;
	}

	public double getAutonomia() {
		return autonomia;
	}

	public void setAutonomia(double autonomia) {
		this.autonomia = autonomia;
	}

	public void voar() {
		System.out.println("A ave está voando");
	}
}
