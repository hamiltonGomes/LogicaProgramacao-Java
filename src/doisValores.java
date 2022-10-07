import java.util.Scanner;

public class doisValores {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        double primeiroNumero, segundoNumero;

        System.out.println("Digite o primeiro número:");
        primeiroNumero = scan.nextDouble();
        System.out.println("Digite o segundo número:");
        segundoNumero = scan.nextDouble();

        if (primeiroNumero==segundoNumero) {
            System.out.println("Números iguais.");
        } else if (primeiroNumero>segundoNumero) {
            System.out.println("Primeiro número é maior.");
        } else if (segundoNumero>primeiroNumero) {
            System.out.println("Segundo número é maior.");
        }
        else {
            System.out.println("Dados inválidos.");
        }


    }
}
