// Exercicio 01 da lista 01

import java.util.Scanner;

public class AreaRetangulo {
    public static void main(String[] args)
        { 
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o primeiro lado: ");
        int x = sc.nextInt();
        System.out.print("Informe o segundo lado: ");
        int y = sc.nextInt();

        System.out.println("A area do retangulo é: " + x * y);
    }
}
