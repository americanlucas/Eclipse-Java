//CTRL+SHIFT+O
import java.util.Scanner;

public class QuantidadeSalarioMinimo {
	public static void main (String args[]) {
		//Scanner e Variáveis
		Scanner leitor = new Scanner(System.in);
		
			//double para numeros fracionarios
		double salarioMinimo = 1412;
		double salario = 0;
		double quantidadeSalariosMinimos = 0;
		
		
		
		//Entrada de Dados
		System.out.print("Digite o valor do seu salário: " );
		salario = leitor.nextDouble();
		leitor.close();
		
		//Processamento
		quantidadeSalariosMinimos = (salario / salarioMinimo);
		
		//Saida de Dados
		System.out.println("A quantidade de salários mínimos é: " + quantidadeSalariosMinimos);
		
	}
}
