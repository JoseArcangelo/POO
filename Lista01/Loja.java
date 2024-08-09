//Exercicio 20 
// 20.  Uma loja está com um produto em promoção. Para cada três produtos destes adquiridos o cliente paga
// somente dois. Fazer um algoritmo que leia a quantidade comprada deste produto, o valor unitário, calcule e
// escreva o total a ser pago.
import java.util.Scanner;

public class Loja {
    public static void main(String[] args)
        { 
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade de produtos comprados: ");
        int qnt_produtos = sc.nextInt();

        System.out.print("Informe o preco do produto: R$ ");
        double preco = sc.nextDouble();

        if (qnt_produtos >= 3) {
          qnt_produtos -= qnt_produtos / 3;
        }

        double valor_pagamento = qnt_produtos * preco;
        System.out.println("Valor a ser pago: R$ " + valor_pagamento);

        
    }
}
