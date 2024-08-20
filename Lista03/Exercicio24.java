// Fazer um algoritmo que leia números inteiros até que sejam informados dez números perfeitos e escreva o
// menor número perfeito informado.
// Um número perfeito é aquele que é igual a soma dos seus divisores. Ex: 6=1+2+3 ; 28=1+2+4+7+14
public class Exercicio03 {
    public static void main(String[] args)
        {
        int contador =0;
        int n = 1;
        
        while (contador != 10){
            int divisores = 0;

            for(int i = n; i >= 1; i--){
                
                if (n % i == 0 && i != n){
                    divisores += i;
                }
            }

            if (n == divisores){
                System.out.println(n);
                contador++;
                
            }
            n += 1;
        }   
    }
}
