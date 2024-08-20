//Fazer um algoritmo que leia um número inteiro N e escreva a soma dos N primeiros números inteiros
//positivos. Exemplo: caso seja lido 10 escreve 55. Veja que 1+2+3+4+5+6+7+8+9+10=55

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args)
        {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero: ");
        int n = sc.nextInt();
        int resultado = 0;
        for(int i = 0; i <= n; i++){
            resultado += i;
        }
        System.out.println(resultado);
        


    }
}
