package Negocio_2;

public class Novo extends Imovel{
	//propriedades
	private double adicional;

	//construtores
	public Novo() {
		super();
	}

	public Novo(String endereco, double metragem, double valor, double adicional) {
		super(endereco, metragem, valor);
		this.adicional = adicional;
	}

	//get e set
	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	//sobrescrita
	public double getValor() {
		return (super.getValor() + this.getAdicional());
	}
}
