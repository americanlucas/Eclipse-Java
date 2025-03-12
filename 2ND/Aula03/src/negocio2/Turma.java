package negocio2;

public class Turma {
	//prorpiedades
	private Cadeira objCadeira = null;
	private Professor objProfessor = null;
	private String letra = "";
	private Aluno[] colecao = new Aluno[50];
	
	//construtores
	public Turma() {
		super();
	}


	public Turma(Cadeira objCadeira, Professor objProfessor, String letra, Aluno[] colecao) {
		super();
		this.objCadeira = objCadeira;
		this.objProfessor = objProfessor;
		this.letra = letra;
		this.colecao = colecao;
	}

	//metodos
	public Cadeira getObjCadeira() {
		return objCadeira;
	}


	public void setObjCadeira(Cadeira objCadeira) {
		this.objCadeira = objCadeira;
	}


	public Professor getObjProfessor() {
		return objProfessor;
	}


	public void setObjProfessor(Professor objProfessor) {
		this.objProfessor = objProfessor;
	}


	public String getLetra() {
		return letra;
	}


	public void setLetra(String letra) {
		this.letra = letra;
	}


	public Aluno[] getColecao() {
		return colecao;
	}


	public void setColecao(Aluno[] colecao) {
		this.colecao = colecao;
	}
	
	//metodos da classe
	//analisar métodos de classe e como construir
	private int qtdAluno = 0;
	
	public void adicionarAluno (Aluno objAluno) {
		colecao[qtdAluno] = objAluno;
		qtdAluno++;
	}
	
	public void listarAluno () {
		System.out.println("+==================+");
		System.out.println("| Lista de Alunos |");
		System.out.println("+==================+");
		System.out.println("| Mat | Nome |");
		System.out.println("+==================+");
		for(int i = 0; i < qtdAluno; i++) {
			System.out.println("| " + colecao[i].getMatricula() + " | " + colecao[i].getNome() + " |");
		}
	}
}
