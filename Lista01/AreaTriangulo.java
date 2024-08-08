// Exercicio 04

import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args)
        { 
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o primeiro lado do triangulo: ");
        double lado1 = sc.nextDouble();

        System.out.print("Informe o segundo lado do triangulo: ");
        double lado2 =  sc.nextDouble();

        System.out.print("Informe o angulo entre os lados: ");
        double angulo = sc.nextDouble();
        double randius = angulo * (3.14 / 180);

        double area = (lado1 * lado2 * Math.sin(randius)) / 2;
        System.out.println("Resultado: " + area);

    }
}
