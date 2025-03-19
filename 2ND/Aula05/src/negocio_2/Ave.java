package negocio_2;

public abstract class Ave extends Animal{
	private int qtdOvos;

	public Ave() {
		super();
	}

	public Ave(double peso, double altura, String nome, int qtdOvos) {
		super(peso, altura, nome);
		this.qtdOvos = qtdOvos;
	}

	public int getQtdOvos() {
		return qtdOvos;
	}

	public void setQtdOvos(int qtdOvos) {
		this.qtdOvos = qtdOvos;
	}
	
	
}
