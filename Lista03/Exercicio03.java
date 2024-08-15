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
