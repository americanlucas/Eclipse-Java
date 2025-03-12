import java.util.Scanner;

public class custoCompra {
    public static void main(String[] args) {
        //scan
        Scanner sc = new Scanner (System.in);

        //entrada
        System.out.println("Digite o valor do produto e a quantidade de produtos");
        int valor = sc.nextInt();
        int qtd = sc.nextInt();

        sc.close();

        double desconto = valor;

        //proc
        if (qtd >= 10) {
            desconto *= 0.1;
            System.out.println("Valor final com 10% de desconto: " + desconto);
        } else if (qtd >= 20) {
            desconto *= 0.3;
            System.out.println("Valor final com 30% de desconto: " + desconto);
        } else if (qtd >= 50) {
            desconto *= 0.4;
            System.out.println("Valor final com 50% de desconto: " + desconto);
        } else if (qtd >= 100) {
            desconto *= 0.5;
            System.out.println("Valor final com 50% de desconto: " + desconto);
        }
        System.out.println("O valor total é :" + (valor - desconto));
    }
}
