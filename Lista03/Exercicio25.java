// Os dois primeiros números da sequência de Fibonacci são 0 e 1. Qualquer outro número desta sequência
// pode ser calculado pela soma dos dois imediatamente anteriores: F0=0 ; F1=1 ; Fn=Fn−1Fn−2
// Os primeiros números de Fibonacci são: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, ...
// Fazer um algoritmo que leia números até que seja informado um negativo (descartá-lo) e escreva o percentual
// de números informados que são da sequência de Fibonacci.

import java.util.ArrayList;
import java.util.List;

public class Exercicio25 {
    public static void main(String[] args)
    {

    List<Integer> lista = new ArrayList<>();
    int n = 0;
    int contador = 1;
    while(n <=100){
      contador += 1;

      boolean e_primo = true;
      for(int i = contador - 1; i > 1; i--){
        if(contador % i == 0){
          e_primo = false;
        }
      }
      if(e_primo == true){
        lista.add(contador);
      }
      if(lista.size() == 3){
        int soma = 0;
        for(int a = 0; a < lista.size(); a++){
          soma += lista.get(a);
          // System.out.println(lista.get(a));
        }
        lista.remove(0);
        n +=1;
        System.out.println(soma);
      }


    }
 
  }
}
