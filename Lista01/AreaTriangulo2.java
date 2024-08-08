
//Exercicio 02
import java.util.Scanner;

public class AreaTriangulo2 {
    public static void main(String[] args)
        { 
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a base: ");
        double base = sc.nextDouble();
        System.out.print("Informe o lado: ");
        double altura = sc.nextDouble();

        double area = base * altura / 2;
        System.out.println("A area do retangulo: " + area);
    }
}
