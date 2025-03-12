package negocio;

public class Produto {
	//propriedades
	private String nome = "";
	private double preco;
	private Tipo objTipo = null;
	
	//construtores
	
	public Produto() {
		super();
	}


	public Produto(String nome, double preco, Tipo objTipo) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.objTipo = objTipo;
	}

	//metodos

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public Tipo getObjTipo() {
		return objTipo;
	}


	public void setObjTipo(Tipo objTipo) {
		this.objTipo = objTipo;
	}
	
	
	
}
