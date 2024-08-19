import java.util.Scanner;

public class fatorial {
	public static void main (String args[]) {
		//var e scanner
		Scanner leitor = new Scanner (System.in);
		
		int numero;
		int fatorial = 1;
		int i;
		
		//Entrada
		
		System.out.print("Digite o número para saber o seu fatorial: ");
		numero = leitor.nextInt();
		
		leitor.close();
		
		//Processamento
		
		for (i = numero; i > 0; i--) {
			fatorial = i * fatorial;
		}
		
		//Saida 
		System.out.println("O valor do Fatorial de " + numero + " é " + fatorial);
	}
}
