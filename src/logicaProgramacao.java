import java.util.Scanner;

public class logicaProgramacao {
    public static void main(String[] args) {

        double nota1, nota2, media;
        String resposta = "s";
        Scanner scan = new Scanner(System.in);

        while (resposta.equalsIgnoreCase("s")) {

            System.out.println("Digite a primeira nota (0-10): ");
            nota1 = scan.nextDouble();

            while (nota1 < 0 || nota1 > 10) {
                System.out.println("Dados inválidos, por favor informe o valor da primeira nota (0-10): ");
                nota1 = scan.nextDouble();
            }

            System.out.println("Digite a segunda nota (0-10): ");
            nota2 = scan.nextDouble();

            while (nota2 < 0 || nota2 > 10) {
                System.out.println("Dados inválidos, por favor informe o valor da segunda nota (0-10): ");
                nota2 = scan.nextDouble();
            }

            media = (nota1 + nota2) / 2;
            if (media <= 20 && media >= 0) {
                System.out.println("Sua média é: " + media);
                System.out.println("Deseja repetir o programa? (S/N) ");
                resposta = scan.next();
                if (resposta.equalsIgnoreCase("n")) {
                    System.out.println("Programa finalizado.");
                }
            }
        }
    }
}
