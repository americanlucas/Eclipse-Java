package Negocio_2;

public class Professor extends Funcionario{
	//propriedades
	private String disciplina;

	//construtores
	public Professor() {
		super();
	}

	public Professor(String nome, int cpf, double salario, String disciplina) {
		super(nome, cpf, salario);
		this.disciplina = disciplina;
	}

	//get e set
	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	
}
