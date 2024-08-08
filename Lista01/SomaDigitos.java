// Exercicio 23

import java.util.Scanner;

public class SomaDigitos {
    public static void main(String[] args)
        { 
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um valor de cinco digitos: ");
        int valor = sc.nextInt();
        int v1 = valor / 10000;             
        int v2 = (valor / 1000) % 10;       
        int v3 = (valor / 100) % 10;         
        int v4 = (valor / 10) % 10;        
        int v5 = valor % 10;                 

        int soma = v1 + v2 + v3 + v4 + v5;

        System.out.println("A soma dos digitos de " + valor + "e igual a: " + soma);
    }
}
