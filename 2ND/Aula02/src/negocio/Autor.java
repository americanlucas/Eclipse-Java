package negocio;

public class Autor {
	//PROPRIEDADES
	
	private String nome = "";
	
	//CONSTRUTORAS
	public Autor() {
		
	}
	
	public Autor(String nome) {
		this.nome = nome;
	}
	
	//ACESSO
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
