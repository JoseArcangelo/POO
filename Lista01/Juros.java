
//Exercicio 12
import java.util.Scanner;

public class Juros {
    public static void main(String[] args)
        { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o valor inicial: R$ ");
        double valor_inicial = sc.nextDouble();
        System.out.print("Informe o percentual de juros: ");
        double percentual_juros = sc.nextDouble();

        System.out.print("Informe a quantidade de meses: ");
        int qnt_meses = sc.nextInt();

        double resultado = valor_inicial * Math.pow((1 + percentual_juros / 100), qnt_meses);

        System.out.println("Saldo final: R$" + resultado); 

    }
}
