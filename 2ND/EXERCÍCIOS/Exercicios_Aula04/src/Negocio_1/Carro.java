package Negocio_1;

public class Carro extends Veiculo{
	//propriedades
	private String quantidadePortas;

	//construtores
	public Carro() {
		super();
	}

	public Carro(String marca, String modelo, int ano, String quantidadePortas) {
		super(marca, modelo, ano);
		this.quantidadePortas = quantidadePortas;
	}

	//get e set
	public String getQuantidadePortas() {
		return quantidadePortas;
	}

	public void setQuantidadePortas(String quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}
	
	//sobrescrição
	public String getPortas() {
		return (this.getQuantidadePortas());
	}
}
