import java.util.Scanner;

public class poligonos {

	public static void main(String[] args) {
		// var e scan
		Scanner sc = new Scanner (System.in);
		double tamLado, area = 0;
		int qtdLado ;
		//entrada
		System.out.println("Qual a quantidade de lados? ");
		qtdLado = sc.nextInt();
		
		System.out.println("Digite o tamanho do lado: ");
		tamLado = sc.nextInt();

		sc.close();
		
		//proc
		double perimetro = qtdLado * tamLado;
		
		switch (qtdLado) {
		
		case 3: 
			area = ((Math.pow(tamLado, 2) * Math.sqrt(3)) / 4);
			break;
			
		case 4:
			area = tamLado * 4;
			break;
			
		case 5:
			area = ((5 * Math.pow(tamLado, 2) / (4 * Math.tan(36))));
			break;
			
		case 6: 
			area = ((3 * Math.pow(tamLado, 2) * Math.sqrt(3)) / 2);
			break;
			
		case 7:
			area = ((7/4) * Math.pow(tamLado, 2) * (1/Math.tan(514285714)));
			break;
			
		default:
			System.out.println("Valor Inválido para AREA!");
			break;
		}
		
		//saida
		System.out.println("Perímetro: " + perimetro);
		System.out.println("Area: " + area);
	}

}
