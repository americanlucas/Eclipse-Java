package negocio;

public class Cilindro implements Solido{
	//propriedades
	private double raioBase;
	
	private double altura;

	//construtores
	public Cilindro() {
		super();
	}

	public Cilindro(double raioBase, double altura) {
		super();
		this.raioBase = raioBase;
		this.altura = altura;
	}

	//metodos de acesso
	public double getRaioBase() {
		return raioBase;
	}

	public void setRaioBase(double raioBase) {
		this.raioBase = raioBase;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	//metodos de interface
	public double calcularArea() {
		return ((2 * Math.PI * Math.pow(getRaioBase(), 2)) + (2 * Math.PI * getRaioBase() * getAltura()));
	}
	
	public double calcularVolume() {
		return (Math.PI * Math.pow(getRaioBase(), 2) * getAltura());
	}
}
