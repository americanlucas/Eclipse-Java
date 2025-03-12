//CTRL+SHIFT+O

import java.util.Scanner;

public class TemperaturaFahrenheit {
	public static void main (String args[]) {
		//Scanner e Variáveis
		Scanner leitor = new Scanner(System.in);
		
		double celsius = 0;
		double fahrenheit = 0;
		
		
		
		//Entrada de Dados
		System.out.print("Digite a temperatura em ºC: ");
		celsius = leitor.nextDouble();
		leitor.close();
		
		//Processamento
		fahrenheit = (((celsius * 9) / 5) + 32);
		
		//Saida de Dados
		System.out.println("A temperatura em FAHRENHEIT é: " + fahrenheit);
	}
}
