package Negocio_2;

public class Funcionario {
	//propriedades
	private String nome;
	private int cpf;
	private double salario;
	
	//construtores
	public Funcionario() {
		super();
	}


	public Funcionario(String nome, int cpf, double salario) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}

	//get e set
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getCpf() {
		return cpf;
	}


	public void setCpf(int cpf) {
		this.cpf = cpf;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
