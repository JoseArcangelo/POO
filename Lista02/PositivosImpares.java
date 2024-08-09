//Exercicio 12 novo
// 12.Fazer um algoritmo que leia 6 números inteiros escrevendo o 
// percentual de números informados que são
// positivos e ímpares.
import java.util.Scanner;


public class PositivosImpares {
    public static void main(String[] args)
        { 
        Scanner sc = new Scanner(System.in);  
        double PositivosImpares = 0;
        for(int i = 0; i < 6; i++){
          System.out.print("Informe um numero inteiro: ");
          int n = sc.nextInt();
          if(n >= 0 && n % 2 != 0){
            PositivosImpares += 1;
          }
        }
        System.out.println(PositivosImpares);
        double resultado = (PositivosImpares / 6) * 100;
        System.out.println(resultado + "% dos numeros sao positivos impares");

        
    }
}
