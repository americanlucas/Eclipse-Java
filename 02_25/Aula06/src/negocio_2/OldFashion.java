package negocio_2;

public class OldFashion extends Drink implements Interface{
	public void misturar() {
		super.adicionar(new Ingrediente("Whiskey", 50, "ml"));
		super.adicionar(new Ingrediente("Laranja", 2, "rodela"));
		super.adicionar(new Ingrediente("Bitter", 2, "gotas"));
		super.adicionar(new Ingrediente("Gelo", 1, "bola"));
		super.adicionar(new Ingrediente("Açúcar", 1, "cubo"));
	}
}
