//Exercicio 07
import java.util.Scanner;

public class ValorMinimoNota {
    public static void main(String[] args)
        { 
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a primeira nota: ");
        double n1 = sc.nextDouble();
        System.out.print("Informe a segunda nota: ");
        double n2 = sc.nextDouble();

        double n3 = 18 - (n1 + n2);
        System.out.println("Valor necessario da terceira nota: " + n3);
    }
}
