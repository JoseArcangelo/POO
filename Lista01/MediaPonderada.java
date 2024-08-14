//Exercicio 14
//Fazer um algoritmo que leia três valores (a,b,c), calcula e escreve a média aritmética ponderada destes
// valores, considerando peso 4 para o maior dos três valores e 3 para os outros dois valores.
import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args)
        { 
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a primeira nota:  ");
        double n1 = sc.nextDouble();

        System.out.print("Informe a primeira nota:  ");
        double n2 = sc.nextDouble();

        System.out.print("Informe a primeira nota:  ");
        double n3 = sc.nextDouble();

        double maior_valor = 0;
        double valor_menor1 = 0;
        double valor_menor2 = 0;
        if (n1 >= n2 && n1 >= n3){
          maior_valor = n1;

          valor_menor1 = n2;
          valor_menor2 = n3;
        }
        else if(n2 > n1 && n2 > n3){
          maior_valor = n2;

          valor_menor1 = n1;
          valor_menor2 = n3;
        }
        else{
          maior_valor = n3;
          valor_menor1 = n1;
          valor_menor2 = n2;
        }

        double media = ((maior_valor * 4) + (valor_menor1 * 3) + (valor_menor2 * 3)) / 10;

        System.out.println("Media: " + media);

        
    }
}
