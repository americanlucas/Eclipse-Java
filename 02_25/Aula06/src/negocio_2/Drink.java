package negocio_2;

public abstract class Drink {
	//propriedades
	private Ingrediente[] colecao = new Ingrediente[10];
	private int qtd;
	
	//metodos da classe
	public void adicionar(Ingrediente objIngrediente) {
		colecao[qtd] = objIngrediente;
		qtd++;
	}
	
	public void beber() {
		for (int i = 0; i < qtd; i++) {
			System.out.println(colecao[i].getQtd() + "" + colecao[i].getUnidade() + "de " + colecao[i].getNome());
		}
	}
}
