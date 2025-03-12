import java.util.Scanner;

public class tiposDeTriangulo {
    public static void main(String[] args) {
        //scan
        Scanner sc = new Scanner (System.in);

        //entrada
        System.out.println("Digite os lados A, B e C");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        sc.close();
        //proc
        if (a == b && b == c) {
            System.out.println("Triângulo Isóceles: 2 Lados Iguais");
        } else if (a == b || a == c || b == c) {
            System.out.println("Triângulo Equilátero: 3 Lados Iguais");
        } else {
            System.out.println("Triângulo Escaleno: 0 Lados Iguais");
        }
    }
}
