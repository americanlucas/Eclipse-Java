import java.util.Scanner;

public class diaDaSemana {
    public static void main(String[] args) {
        //scan
        Scanner sc = new Scanner (System.in);

        //entrada
        System.out.println("Digite o dia, mês e ano: ");
        int dia = sc.nextInt();
        int mes = sc.nextInt();
        int ano = sc.nextInt();

        sc.close();

        //proc
        int diaSemana = (((dia) + (2 * mes) + ((3 * (mes + 1))/5) + ((ano) + (ano / 4)) - (ano / 100) +
        (ano / 400) + 2) % 7);

        switch (diaSemana) {
            case 0:
                System.out.println("Sábado");
                break;

            case 1:
                System.out.println("Domingo");
                break;
            
            case 2:
                System.out.println("Segunda");
                break;

            case 3:
                System.out.println("Terça");
                break;

            case 4:
                System.out.println("Quarta");
                break;

            case 5:
                System.out.println("Quinta");
                break;

            case 6:
                System.out.println("Sexta");
                break;

        }
    }
}
