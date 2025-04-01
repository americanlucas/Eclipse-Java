package negocio;

public class Cubo implements Solido{
	//propriedade
	private double aresta;

	//construtor
	public Cubo() {
		super();
	}

	public Cubo(double aresta) {
		super();
		this.aresta = aresta;
	}

	//metodos de acesso
	public double getAresta() {
		return aresta;
	}

	public void setAresta(double aresta) {
		this.aresta = aresta;
	}
	
	//metodos de interface
	public double calcularArea() {
		return (6 * Math.pow(getAresta(), 2));
	}
	
	public double calcularVolume() {
		return (Math.pow(getAresta(), 3));
	}
}
