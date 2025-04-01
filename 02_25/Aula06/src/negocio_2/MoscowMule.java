package negocio_2;

public class MoscowMule extends Drink implements Interface {
	public void misturar() {
		super.adicionar(new Ingrediente("Cachaça", 50, "ml"));
		super.adicionar(new Ingrediente("Limão", 2, "unidades"));
		super.adicionar(new Ingrediente("Açúcar", 4, "g"));
		super.adicionar(new Ingrediente("Gelo", 3, "pedras"));
		super.adicionar(new Ingrediente("Gengibre", 5, "g"));
		super.adicionar(new Ingrediente("Espuma de Gengibre", 20, "ml"));
	}
}
