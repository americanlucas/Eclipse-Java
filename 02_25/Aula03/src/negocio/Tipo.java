package negocio;

public class Tipo {
	//propriedades
	private String descricao = "";

	//construtor
	
	public Tipo(String descricao) {
		this.descricao = descricao;
	}

	public Tipo() {
		super();
	}
	
	//metodos
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
