import java.util.Scanner;

public class potenciacao {
	public static void main (String args[]) {
		//var e scanner
		Scanner leitor = new Scanner (System.in);
		
		int base;
		int expoente;
		double resultado;
		
		//Entrada
		
		System.out.print("Digite o valor do número: ");
		base = leitor.nextInt();
		
		System.out.print("Digite o valor do expoente: ");
		expoente = leitor.nextInt();
		
		leitor.close();
		
		//Processamento
		
		resultado = Math.pow(base, expoente);
		
		//Saida
		
		System.out.println("O resultado de " + base + " elevado à " + expoente + " é " + resultado );
	}
}
