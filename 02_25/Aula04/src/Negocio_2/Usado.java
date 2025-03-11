package Negocio_2;

public class Usado extends Imovel{
	//propriedades	
	private double depreciacao;

	//construtores
	public Usado() {
		super();
	}

	public Usado(String endereco, double metragem, double valor, double depreciacao) {
		super(endereco, metragem, valor);
		this.depreciacao = depreciacao;
	}

	//get e set
	public double getDepreciacao() {
		return depreciacao;
	}

	public void setDepreciacao(double depreciacao) {
		this.depreciacao = depreciacao;
	}
	
	//sobrescrita
	public double getValor() {
		return (super.getValor() - this.getDepreciacao());
	}
}
