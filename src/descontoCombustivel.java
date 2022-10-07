import java.util.Scanner;

public class descontoCombustivel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String resposta = null;
        double litroCombustivel, etanol, gasolina;

        System.out.println("Qual tipo de combustível deseja comprar? (E/G)");
        resposta = scan.next();
        while (! resposta.equalsIgnoreCase("e") && ! resposta.equalsIgnoreCase("g")){
            System.out.println("Dados inválidos, por favor insira se deseja abastecer com gasolina (G) ou etanol (E).");
            resposta = scan.next();
        }

        System.out.println("Deseja comprar quantos litros?");
        litroCombustivel = scan.nextDouble();

        // incrementar função para calcular a quantidade de litros pelo valor que o usuário deseja comprar

        if (resposta.equalsIgnoreCase("e")) {
            if (litroCombustivel >= 20) {
                etanol = (3.24 * 0.97) * litroCombustivel;
                System.out.println("O total é de R$ " + etanol);
            } else if (litroCombustivel < 20) {
                etanol = (3.24 * 0.95) * litroCombustivel;
                System.out.println("O total é de R$ " + etanol);
            }
        } else if (resposta.equalsIgnoreCase("g")) {
            if (litroCombustivel >= 20) {
                gasolina = (4.02 * 0.96) * litroCombustivel;
                System.out.println("O total é de R$ " + gasolina);
            } else if (litroCombustivel < 20) {
                gasolina = (4.02 * 0.94) * litroCombustivel;
                System.out.println("O total é de R$ " + gasolina);
            }
        } else {
            System.out.println("Valores inválidos.");
        }

    }
}
