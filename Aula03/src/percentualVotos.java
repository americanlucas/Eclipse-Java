import java.util.Scanner;

public class percentualVotos {
	public static void main (String args[]) {
		//var 
		Scanner leitor = new Scanner (System.in);
		
		double candA = 0;
		double candB = 0;
		double candC = 0;
		double branco = 0;
		double nulo = 0;
		
		double totalVotosValidos = 0;
		double totalVotosInvalidos = 0;
		
		
		double percentualCandA = 0;
		double percentualCandB = 0;
		double percentualCandC = 0;
		double percentualVotoInvalido = 0;
		
		
		
		//entrada 
		System.out.print("Digite o número de votos do candidato A: ");
		candA = leitor.nextDouble();
		
		System.out.print("Digite o número de votos do candidato B: ");
		candB = leitor.nextDouble();
		
		System.out.print("Digite o número de votos do candidato C: ");
		candC = leitor.nextDouble();
		
		System.out.print("Digite o número de votos em branco: ");
		branco = leitor.nextDouble();
		
		System.out.print("Digite o número de votos nulos: ");
		nulo = leitor.nextDouble();
		
		leitor.close();
		
		//processamento 
		totalVotosValidos = (candA + candB + candC);
		
		totalVotosInvalidos = (branco + nulo);
		
		percentualCandA = ((100 * candA) / totalVotosValidos);
		percentualCandB = ((100 * candB) / totalVotosValidos);
		percentualCandC = ((100 * candC) / totalVotosValidos);
		
		percentualVotoInvalido = ((100 * totalVotosInvalidos) / (totalVotosInvalidos + totalVotosValidos));
		
		
		//saida
		System.out.println("Candidato A: " + percentualCandA + "%");
		System.out.println("Candidato B: " + percentualCandB + "%");
		System.out.println("Candidato C: " + percentualCandC + "%");
		System.out.println("Votos Inválidos: " + percentualVotoInvalido + "%");
	}
}
