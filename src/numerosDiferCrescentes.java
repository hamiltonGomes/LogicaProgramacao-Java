import java.util.Scanner;

public class numerosDiferCrescentes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c;
        System.out.println("Escreva o primeiro valor: ");
        a = scan.nextInt();
        System.out.println("Escreva o primeiro valor: ");
        b = scan.nextInt();
        System.out.println("Escreva o primeiro valor: ");
        c = scan.nextInt();

        if (a > b) {
            if (b > c) {
                System.out.println(a + "; " + b + "; " + c);
            } else if (c > b && a > c) {
                System.out.println(a + "; " + c + "; " + b);
            }
        } else if (b > a) {
            if (a > c) {
                System.out.println(b + "; " + a + "; " + c);
            } else if (c > a && b > c) {
                System.out.println(b + "; " + c + "; " + a);
            }
        } else if (c > a) {
            if (a > b) {
                System.out.println(c + "; " + a + "; " + b);
            } else if (b > a && c > b) {
                System.out.println(c + "; " + b + "; " + a);
            }
        }

    }
}
