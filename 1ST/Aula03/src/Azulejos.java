import java.util.Scanner;

public class Azulejos {
	public static void main (String args[]) {
		//var
		Scanner leitor = new Scanner (System.in);
		
		double comp = 0;
		double larg = 0;
		double prof = 0;
		double azulejos = 0;
		
		double areaDaParedeLonga = 0;
		double areaDaParedeCurta = 0;
		double areaDoPiso = 0;
		
		double areaAzulejo = 0.01;
		
		//entrada 
		System.out.print("Digite o valor do comprimento: ");
		comp = leitor.nextDouble();
		
		System.out.print("Digite o valor da largura: ");
		larg = leitor.nextDouble();
		
		System.out.print("Digite o valor da profundidade: ");
		prof = leitor.nextDouble();
		
		leitor.close();
		
		//processamento
		areaDaParedeLonga = (prof * comp);
		
		areaDaParedeCurta = (larg * prof);
		
		areaDoPiso = (larg * comp);
		
		
		azulejos = (((2 * areaDaParedeLonga) + (2 * areaDaParedeCurta) + (areaDoPiso)) / areaAzulejo);
		
		
		
		
		//saida
		System.out.println("O numero de azulejos é: " + azulejos);
		
		//em 1 M cabe 10 azulejos 
	}
}
