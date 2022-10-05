import java.util.Scanner;

public class identificandoTriangulos {

    public static void main(String[] args) {

        double A, B,C, X, Y, Z;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do primeiro lado: ");
        A = scan.nextDouble();
        System.out.println("Digite o valor do segundo lado: ");
        B = scan.nextDouble();
        System.out.println("Digite o valor do terceiro lado: ");
        C = scan.nextDouble();

        X =  A+B;
        Y = B+C;
        Z = C+A;

        if (A<Y || B<Z || C<X){
            System.out.println("Os valores formam um triângulo.");
        }
        if (C<X){
            System.out.println("Os valores formam um triângulo.");
        }
        if (B<Z){
            System.out.println("Os valores formam um triângulo.");
        }
        else {
            System.out.println("Os valores não formam um triângulo.");
        }
    }
}
