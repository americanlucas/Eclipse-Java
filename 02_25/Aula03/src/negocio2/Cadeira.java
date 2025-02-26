package negocio2;

public class Cadeira {
	//propriedades
	private String nome = "";
	
	//construtores
	public Cadeira() {
		super();
	}

	public Cadeira(String nome) {
		super();
		this.nome = nome;
	}
	
	//metodos

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
