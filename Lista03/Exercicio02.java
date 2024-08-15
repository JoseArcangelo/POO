
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args)
        {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero: ");
        int n = sc.nextInt();
        int resultado = 0;
        for(int i = 0; i <= n; i++){
            resultado += i;
        }
        System.out.println(resultado);
        


    }
}
