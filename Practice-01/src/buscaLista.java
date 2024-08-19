import java.util.Scanner;

public class buscaLista {
	public static void main (String args[]) {
		//var
		Scanner leitor = new Scanner (System.in);
		
		int indice;
		int i;
		
		
		
		
		
		int[] lista =  {10,20,30,40,50,60,70,80,90,100}; // DECLARAÇÃO E INICIALIZAÇÃO DE VALORES PRÉ-DEFINIDOS
		
		//Entrada
		/*for (i = 0; i < lista.length; i++) {
			System.out.println("Elemento na posição " + i + " é " + lista[i] );
		}
		*/
		
		System.out.print("Digite qual índice deseja encontrar: ");
		i = leitor.nextInt();
		
		leitor.close();
		
		//Processamento
		
		indice = lista[i];
		
		
		
		//Saida
		System.out.println("O valor do ÍNDICE " + i + " é " + indice);
		
		
	}
}
