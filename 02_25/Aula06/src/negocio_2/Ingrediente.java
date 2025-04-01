package negocio_2;

public class Ingrediente {
	//propriedades
	private String nome;
	private int qtd;
	private String unidade;
	
	//construtores
	public Ingrediente() {
		super();
	}


	public Ingrediente(String nome, int qtd, String unidade) {
		super();
		this.nome = nome;
		this.qtd = qtd;
		this.unidade = unidade;
	}

	//metodos de classe
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getQtd() {
		return qtd;
	}


	public void setQtd(int qtd) {
		this.qtd = qtd;
	}


	public String getUnidade() {
		return unidade;
	}


	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	
	
}
