import java.util.Scanner;

public class identificandoTriangulos {

    public static void main(String[] args) {

        double A, B,C, AB, BC, CA, AB1, BC2, CA3;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do lado A: ");
        A = scan.nextDouble();
        while (A<=0) {
            System.out.println("O valor de A precisa ser maior que 0, por favor digite outro valor para A:");
            A = scan.nextDouble();
        }

        System.out.println("Digite o valor do lado B: ");
        B = scan.nextDouble();
        while (B<=0) {
            System.out.println("O valor de B precisa ser maior que 0, por favor digite outro valor para B:");
            B = scan.nextDouble();
        }

        System.out.println("Digite o valor do lado C: ");
        C = scan.nextDouble();
        while (C<=0) {
            System.out.println("O valor de C precisa ser maior que 0, por favor digite outro valor para C: ");
            C = scan.nextDouble();
        }

        AB =  A+B;
        BC = B+C;
        CA = C+A;

        AB1 = (A-B);
            if (AB1<0){
                AB1 = AB1 * (-1);
            }
        BC2 = (B-C);
            if (AB1<0){
                BC2 = BC2 * (-1);
            }
        CA3 = (C-A);
            if (CA3<0){
                CA3 = CA3 * (-1);
            }

        if ((A<BC && A>BC2) && (B<CA && B>CA3) && (C<AB && C>AB1)){
            if (A != B && A != C && B != C){
                System.out.println("Os valores formam um triângulo escaleno.");
            }
            else if (A == B && A == C){
                System.out.println("Os valores formam um triângulo equilátero.");
            }
            else {
                System.out.println("Os valores formam um triângulo isósceles.");
            }
        }
        else {
            System.out.println("Os valores NÃO formam um triângulo.");
            }
        }
    }

