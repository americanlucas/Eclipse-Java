import java.util.Scanner;

public class CalculoIMC {
	public static void main (String args[]) {
		//variaveis 
		Scanner leitor = new Scanner(System.in);
		
		double peso = 0;
		double altura = 0;
		double imc = 0;
		
		//entrada de dados
		System.out.print("Digite o peso: ");
		peso = leitor.nextDouble();
		
		System.out.print("Digite a altura: ");
		altura = leitor.nextDouble();
		
		leitor.close();
		
		//Processamento
		imc = (peso / Math.pow(altura, 2));
		
		//saida de dados 
		System.out.println("Seu IMC é: " + imc);
	}
}
