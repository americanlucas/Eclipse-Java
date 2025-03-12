import java.util.Scanner;

public class VolumeEsfera {
	public static void main (String args[]) {
		//Scanner e var
		Scanner leitor = new Scanner(System.in);
		
		double raio = 0;
		double volume = 0;
		
		
		
		//Entrada de Dados
		System.out.print("digite o valor raio: ");
		raio = leitor.nextDouble();
		leitor.close();
		
		//Processamento
		volume = (((Math.PI * 4) * Math.pow(raio, 3) / 3));
		
		//Saida de Dados
		System.out.println("O valor do Volume é " + volume);
		
	}
}
