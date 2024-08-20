// Os dois primeiros números da sequência de Fibonacci são 0 e 1. Qualquer outro número desta sequência
// pode ser calculado pela soma dos dois imediatamente anteriores: F0=0 ; F1=1 ; Fn=Fn−1Fn−2
// Os primeiros números de Fibonacci são: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, ...
// Fazer um algoritmo que leia números até que seja informado um negativo (descartá-lo) e escreva o percentual
// de números informados que são da sequência de Fibonacci.

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    int n = 0;
    int total_numeros = 0;
    int total_fibonacci = 0;
    
    while(n >= 0){
      System.out.print("Informe um numero: ");
      n = sc.nextInt();
      if(n >= 0){
        total_numeros++;
      }
      
      int a = 0;
      int b = 1;
      for(int i = 0; i <= n; i++){
        if(b == n || a == n){
          total_fibonacci++;
          break;
        }

        int c = b;
        b = a + b;
        a = c;
        
      }
    }
    double percentual_fibonacci = (total_fibonacci * 100) / total_numeros;
    System.out.println(""); 
    System.out.println("Total de numeros informados: " + total_fibonacci);
    System.out.println("Percentual de numeros que sao da sequncia fibonacci: " + percentual_fibonacci + "%");  

  }
}

