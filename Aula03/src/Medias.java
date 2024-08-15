import java.util.Scanner;

public class Medias {
	public static void main (String args[]) {
		//var
		Scanner leitor = new Scanner (System.in);
		
		double v1 = 0;
		double v2 = 0;
		double v3 = 0;
		
		double media = 0;
		
		//entrada
		System.out.print("Digite a primeira nota: ");
		v1 = leitor.nextDouble();
	
		System.out.print("Digite a segunda nota: ");
		v2 = leitor.nextDouble();
		
		System.out.print("Digite a terceira nota: ");
		v3 = leitor.nextDouble();
		
		leitor.close();
		
		//processamento
		media = (v1 + v2 + v3) / 3 ;
		
		//saida 
		System.out.println("Sua média é: " + media);
	}
}
