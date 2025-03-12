package Negocio_3;

public class ContaBancaria {
	//propriedades
	private String titular;
	private int numeroConta;
	private double saldo;
	
	//construtores
	public ContaBancaria() {
		super();
	}
	
	public ContaBancaria(String titular, int numeroConta, double saldo) {
		super();
		this.titular = titular;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}
	
	//get e set
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
