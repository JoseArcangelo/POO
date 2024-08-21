// Um número é dito piramidal quando ele é o resultado da soma de três números primos consecutivos. Fazer
// um algoritmo que calcule e escreva os cem primeiros

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
