import java.util.Scanner;

public class numerosDiferCrescentes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c;

        do {
            System.out.println("Insira três números distintos abaixo.");
            System.out.println("Escreva o primeiro valor: ");
            a = scan.nextInt();
            System.out.println("Escreva o segundo valor: ");
            b = scan.nextInt();
            System.out.println("Escreva o terceiro valor: ");
            c = scan.nextInt();
        } while (a == b || b == c || a == c);

        if (a > b) {
            if (b > c) {
                System.out.println(a + "; " + b + "; " + c);
            } else if (a > c) {
                System.out.println();
            }

//            if (a > c && c > b) {
//                System.out.println(a + "; " + c + "; " + b);
//            }
//        }
//
//        else if (b > c) {
//            if (c > a) {
//                System.out.println(b + "; " + c + "; " + a);
//            } if (a > c && b > a) {
//                System.out.println(b + "; " + c + "; " + a);
//            }
//        }
//        else if (c > b) {
//            if (a > b) {
//                System.out.println(c + "; " + a + "; " + b);
//            } else if (b > a && c > b) {
//                System.out.println(c + "; " + b + "; " + a);
//            }
//        }
//
//        else{
//            System.out.println("Dados inválidos.");
//        }

    }
}
