//Exercicio 03 
// 3.Fazer um algoritmo que leia três notas (números com casas decimais) de um aluno e a quantidade de faltas
// (número inteiro) escrevendo o conceito (número inteiro) deste aluno. O algoritmo deverá calcular a média
// aritmética das notas e determinar o conceito a partir da tabela abaixo. Além disto, o aluno, para ser aprovado,
// deverá ter no máximo cinco faltas, caso contrário o conceito será zero.
import java.util.Scanner;

public class NotasAlunos {
    public static void main(String[] args)
        { 
        Scanner sc = new Scanner(System.in);  

        System.out.print("Informe a primeira nota: ");
        double n1 = sc.nextDouble();
        
        System.out.print("Informe a segunda nota: ");
        double n2 = sc.nextDouble();

        System.out.print("Informe a terceira nota: ");
        double n3 = sc.nextDouble();

        System.out.print("Informe a quantidade de faltas: ");
        int faltas = sc.nextInt();

        double media = (n1 + n2 + n3) / 3;
        int conceito = 0;
        
        if (media < 6 || faltas >= 5) {
          conceito = 0;
        }
        else if (media >= 6 && media <7) {
          conceito = 1;
            
        }

        else if(media >= 7 && media < 8){
          conceito = 2;
        }

        else if(media >= 8 && media < 9){
          conceito = 3;
        }

        else {
          conceito = 4;
        }

        System.out.println("Conceito do aluno: " + conceito);
        sc.close();
          
      }
        

        
}
