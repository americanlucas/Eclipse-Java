package negocio_2;

public class DryMartini extends Drink implements Interface{
	public void misturar() {
		super.adicionar(new Ingrediente("Gin", 50, "ml"));
		super.adicionar(new Ingrediente("Vodka", 50, "ml"));
		super.adicionar(new Ingrediente("Vermuth", 10, "ml"));
		super.adicionar(new Ingrediente("Gelo", 4, "pedras"));
		super.adicionar(new Ingrediente("Azeitonas", 3, "unidades"));
	}
}
