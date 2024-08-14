//Exercicio 07
// Fazer um algoritmo que leia três notas de um aluno, calcule e escreva a sua média harmônica ponderada
// conforme equação abaixo. Após desenvolver o algoritmo, verificar o que acontece caso um ou mais valores
// lidos forem negativos?

import java.util.Scanner;

public class MediaHarmonica {
    public static void main(String[] args)
        { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a primeira nota: ");
        double n1 = sc.nextDouble();

        System.out.print("Informe a segunda nota: ");
        double n2 = sc.nextDouble();

        System.out.print("Informe a terceira nota: ");
        double n3 = sc.nextDouble();

        double media_harmonica = 6 / (1/n1 + 2/n2 + 3/n3);

        System.out.printf("Media harmonica ponderada: %.2f%n", media_harmonica);
    }
}
