package Negocio_2;

public class Admin extends Funcionario {
	//propriedades
	private String setor;

	//construtores
	public Admin() {
		super();
	}

	public Admin(String nome, int cpf, double salario, String setor) {
		super(nome, cpf, salario);
		this.setor = setor;
	}

	//get e set
	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	
}
