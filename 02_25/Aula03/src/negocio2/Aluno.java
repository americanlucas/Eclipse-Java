package negocio2;

public class Aluno {
	//propriedades
	private String nome = "";
	private int matricula;
	
	//construtores
	public Aluno() {
		super();
	}
	
	public Aluno(String nome, int matricula) {
		super();
		this.nome = nome;
		this.matricula = matricula;
	}

	
	//metodos
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	
}
