import java.text.DecimalFormat;
import java.util.Scanner;

public class descontoCombustivel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat(".00");

        String resposta;
        int resposta2;
        double litroCombustivel, etanol, gasolina, valor, desconto, valorDesconto;

        System.out.println("Qual tipo de combustível deseja comprar? (Etanol ou Gasolina)");
        resposta = scan.next();
        while (!resposta.equalsIgnoreCase("etanol") && !resposta.equalsIgnoreCase("gasolina")) {
            System.out.println("Dados inválidos, por favor insira se deseja abastecer com gasolina ou etanol.");
            resposta = scan.next();
        }

        do {
            System.out.println("Digite o número que corresponde ao seu interesse: ");
            System.out.println("1 - Abastecer informando, em litros, a quantidade de combustível;");
            System.out.println("2 - Abastecer informando o saldo que será convertido em combustível;");
            System.out.println("3 - Cancelar operação.");
            resposta2 = scan.nextInt();
                if (resposta2 != 1 &&  resposta2 != 2 && resposta2 != 3){
                    System.out.println("O número digitado não é válido.");
                }
        } while (resposta2 != 1 &&  resposta2 != 2 && resposta2 != 3);

        if (resposta2 == 1) {
            System.out.println("Deseja comprar quantos litros?");
            litroCombustivel = scan.nextDouble();

            if (resposta.equalsIgnoreCase("etanol")) {
                if (litroCombustivel <= 20) {
                    etanol = (3.24 * 0.97) * litroCombustivel;
                    System.out.println("O total é de R$ " + df.format(etanol));
                } else if (litroCombustivel > 20) {
                    etanol = (3.24 * 0.95) * litroCombustivel;
                    System.out.println("O total é de R$ " + df.format(etanol));
                }
            } else if (resposta.equalsIgnoreCase("gasolina")) {
                if (litroCombustivel <= 20) {
                    gasolina = (4.02 * 0.96) * litroCombustivel;
                    System.out.println("O total é de R$ " + df.format(gasolina));
                } else if (litroCombustivel > 20) {
                    gasolina = (4.02 * 0.94) * litroCombustivel;
                    System.out.println("O total é de R$ " + df.format(gasolina));
                }
            } else {
                System.out.println("Valores inválidos.");
            }

        } else if (resposta2 == 2) {
            System.out.println("Qual valor deseja abastecer?");
            valor = scan.nextDouble();

            if (resposta.equalsIgnoreCase("etanol")) {
                litroCombustivel = (valor / 3.24);

                if (litroCombustivel <= 20) {
                    desconto = valor - (valor * 0.97);
                    valorDesconto = valor - desconto;
                    System.out.println("Você abastece " + df.format(litroCombustivel) + "L e ainda economiza R$ " + df.format(desconto)+ "!" + " O valor total a ser pago é de R$ " + valorDesconto + ".");
                } else if (litroCombustivel > 20) {
                    desconto = valor - (valor * 0.95);
                    valorDesconto = valor - desconto;
                    System.out.println("Você abastece " + df.format(litroCombustivel) + "L e ainda economiza R$ " + df.format(desconto)+ "!" + " O valor total a ser pago é de R$ " + valorDesconto + ".");
                }
            } else if (resposta.equalsIgnoreCase("gasolina")) {
                litroCombustivel = (valor / 4.02);

                if (litroCombustivel <= 20) {
                    desconto = valor - (valor * 0.96);
                    valorDesconto = valor - desconto;
                    System.out.println("Você abastece " + df.format(litroCombustivel) + "L e ainda economiza R$ " + df.format(desconto)+ "!" + " O valor total a ser pago é de R$ " + valorDesconto + ".");
                } else if (litroCombustivel > 20) {
                    desconto = valor - (valor * 0.94);
                    valorDesconto = valor - desconto;
                    System.out.println("Você abastece " + df.format(litroCombustivel) + "L e ainda economiza R$ " + df.format(desconto) + "!" + " O valor total a ser pago é de R$ " + valorDesconto + ".");
                }
            }
        }
        else {
            System.out.println("Obrigado pelo contato, volte sempre!");
        }
    }
}
