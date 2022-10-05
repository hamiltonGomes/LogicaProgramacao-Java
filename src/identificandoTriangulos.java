import java.util.Scanner;

public class identificandoTriangulos {

    public static void main(String[] args) {

        double A, B,C, AB, BC, CA;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do lado A: ");
        A = scan.nextDouble();
        while (A<=0) {
            System.out.println("O valor de A precisa ser maior que 0, por favor digite outro valor.");
            System.out.println("Digite o valor do lado A: ");
            A = scan.nextDouble();
        }

        System.out.println("Digite o valor do lado B: ");
        B = scan.nextDouble();
        while (B<=0) {
            System.out.println("O valor de B precisa ser maior que 0, por favor digite outro valor.");
            System.out.println("Digite o valor do lado B: ");
            B = scan.nextDouble();
        }

        System.out.println("Digite o valor do lado C: ");
        C = scan.nextDouble();
        while (C<=0) {
            System.out.println("O valor de C precisa ser maior que 0, por favor digite outro valor.");
            System.out.println("Digite o valor do lado C: ");
            C = scan.nextDouble();
        }



        AB =  A+B;
        BC = B+C;
        CA = C+A;

        if (A>BC || B> CA || C> AB){
            System.out.println("Os valores NÃO formam um triângulo.");
        }
        else {
            System.out.println("Os valores formam um triângulo.");
        }

    }
}
