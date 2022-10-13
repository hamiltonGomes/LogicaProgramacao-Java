import java.util.Scanner;

public class descontoProdutos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantidade;
        double valor, total, totalDesconto;

        System.out.println("Qual o produto deseja?");
        produto = scan.next();
        System.out.println("Quantos produtos deseja?");
        quantidade = scan.nextInt();
        System.out.println("Qual o preço unitário do produto?");
        valor = scan.nextDouble();

        total = quantidade * valor;

        if (quantidade <= 5) {
            totalDesconto = (total * 0.98);
            System.out.println("O total a pagar é de R$ " + totalDesconto);
        } else if (quantidade <= 10) {
            totalDesconto = (total * 0.97);
            System.out.println("O total a pagar é de R$ " + totalDesconto);
        } else {
            totalDesconto = (total * 0.95);
            System.out.println("O total a pagar é de R$ " + totalDesconto);
        }

    }
}
