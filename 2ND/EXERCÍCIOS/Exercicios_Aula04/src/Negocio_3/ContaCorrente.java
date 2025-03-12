package Negocio_3;

public class ContaCorrente extends ContaBancaria {
	//propriedades
	private int chequeEspecial;

	//construtores
	public ContaCorrente() {
		super();
	}

	public ContaCorrente(String titular, int numeroConta, double saldo, int chequeEspecial) {
		super(titular, numeroConta, saldo);
		this.chequeEspecial = chequeEspecial;
	}

	//get e set
	public int getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(int chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
	
	//sobrescrita
	public double getSaldo() {
		return (super.getSaldo() - this.getChequeEspecial());
	}
}
