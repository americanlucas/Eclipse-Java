package Negocio_3;

public class ContaInvestimento extends ContaBancaria {
	//propriedades
	private double Tesouro;

	public ContaInvestimento() {
		super();
	}

	public ContaInvestimento(String titular, int numeroConta, double saldo, double tesouro) {
		super(titular, numeroConta, saldo);
		Tesouro = tesouro;
	}

	public double getTesouro() {
		return Tesouro;
	}

	public void setTesouro(double tesouro) {
		Tesouro = tesouro;
	}
	
	//sobrescrita
	public double getSaldo() {
		return (super.getSaldo() + ((this.getTesouro() * 13) / 100));
	}
}
