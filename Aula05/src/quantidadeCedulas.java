import java.util.Scanner;

public class quantidadeCedulas {
    public static void main(String[] args) {
        //scan
        Scanner sc = new Scanner (System.in);

        int valor, n200, n100, n50, n20, n10, n5, n2, n1;
        
        //entrada
        System.out.println("Digite o valor: ");
        valor = sc.nextInt();

        sc.close();

        //proc
        n200 = valor / 200;
        valor = valor % 200;

        n100 = valor / 100;
        valor = valor % 100;

        n50 = valor / 50;
        valor = valor % 50;

        n20 = valor / 20;
        valor = valor % 20;

        n10 = valor / 10;
        valor = valor % 10;

        n5 = valor / 5;
        valor = valor % 5;

        n2 = valor / 2;
        valor = valor % 2;

        n1 = valor;

        //saida
        if (n200 > 0) {
            System.out.println(n200 + "notas(s) de 200");
        }
        if (n100 > 0) {
            System.out.println(n100 + "notas(s) de 100");
        }
        if (n50 > 0) {
            System.out.println(n50 + "notas(s) de 50");
        }
        if (n20 > 0) {
            System.out.println(n20 + "notas(s) de 20");
        }
        if (n10 > 0) {
            System.out.println(n10 + "notas(s) de 10");
        }
        if (n5 > 0) {
            System.out.println(n5 + "notas(s) de 5");
        }
        if (n2 > 0) {
            System.out.println(n2 + "notas(s) de 2");
        }
        if (n1 > 0) {
            System.out.println(n1 + "moeda(s) de 1");
        }
    }
}