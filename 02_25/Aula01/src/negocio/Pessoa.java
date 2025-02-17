package negocio;

public class Pessoa {
	// PROPRIEDADES DA CLASSE
	
	private String nome = "";
	private String endereco = ""; //PRIVATE APENAS DENTRO DA CLASSE PESSOA
	private String telefone = "";
	
	// METODOS CONSTRUTORES (Completamente vazio - public pessoa(), Completamente cheio - public pessoa(args)
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, String endereco, String telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	//METODOS DE ACESSO 
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}