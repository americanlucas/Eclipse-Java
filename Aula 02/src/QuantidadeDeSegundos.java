import java.util.Scanner;

public class QuantidadeDeSegundos {
	public static void main (String args[]) {
		//Scanner e var
		Scanner leitor = new Scanner(System.in);
		
		int horas = 0;
		int minutos = 0;
		int segundos = 0;
		
		int totalSegundos = 0;
		
		//Entrada de Dados
		System.out.print("Digite o total de horas: "); 
		horas = leitor.nextInt();
		
		System.out.print("Digite o total de minutos: ");
		minutos = leitor.nextInt();
		
		System.out.print("Digite o total de segundos: ");
		segundos = leitor.nextInt();
		
		leitor.close();
		
		//Processamento
		totalSegundos = (((horas * 3600) +  minutos * 60) + segundos * 1);
		
		//Saida de Dados
		System.out.println("O total de segundos é " + totalSegundos);
	}
}
