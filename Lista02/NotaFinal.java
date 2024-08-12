//Exercicio 02
// 2.Fazer um algoritmo que leia a nota final de um aluno e escreva se ele foi aprovado ou não (considerar nota
// final maior ou igual a seis para aprovação).
import java.util.Scanner;

public class NotaFinal {
    public static void main(String[] args)
        { 
        Scanner sc = new Scanner(System.in);  

        System.out.print("Informe a nota final: ");
        double nota_final = sc.nextDouble();

        String situacao = "";
        if (nota_final >= 6){
          situacao = "APROVADO";
        }

        else{
          situacao = "REPROVADO";
        }

        System.out.println("O ALUNO FOI " + situacao);
        
        
      }
        

}
