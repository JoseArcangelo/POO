//Exercicio 22
//22.Fazer um algoritmo que leia a quantidade de alunos em uma sala de aula, a seguir leia a quantidade de alunos
// desejada por grupo, e finalmente calcule e escreva quantos grupos serão formados e também a quantidade de
// alunos restantes (que não foram suficientes para formar mais um grupo).
import java.util.Scanner;

public class AlunosGrupo {
    public static void main(String[] args)
        { 
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade de alunos: ");
        int qnt_alunos = sc.nextInt();
        System.out.print("Informe a quantidade de alunos por grupo: ");
        int qnt_por_grupos = sc.nextInt();

        int total_grupos = qnt_alunos / qnt_por_grupos;
        int alunos_restantes = qnt_alunos % qnt_por_grupos;
        System.out.println("\nQuantidade de grupos possiveis: " + total_grupos + " grupos \n" + "Alunos restantes: " + alunos_restantes + " alunos");
    }
}
