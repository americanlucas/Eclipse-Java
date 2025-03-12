package Negocio;

public class Gerente extends Colaborador{
	//propriedades
	private double bonus;

	//Construtores
	public Gerente() {
		super();
	}

	public Gerente(int matricula, String nome, double salario, double bonus) {
		super(matricula, nome, salario);
		this.bonus = bonus;
	}


	//Get e Set
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	
	//metodos sobrescritos
	public double getSalario() {
		return (super.getSalario() + this.getBonus());
	}
}
