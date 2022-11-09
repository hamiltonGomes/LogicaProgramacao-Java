import java.util.Scanner;

public class funcao {
    public static void main(String[] args) {

        double numero;
        String resposta;

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual número deseja verificar?");
        numero = scan.nextDouble();
        resposta = verificar(numero);
        System.out.println("O seu número é " +  resposta);
        System.out.printf("O seu número é %.2f", numero);

        scan.close();

    }

    private static String verificar(double numero) {
        String resposta;
        if (numero % 2 == 0){
            resposta = "Par";
        }
        else {
            resposta = "Ímpar.";
        }
        return resposta;
    }
}
