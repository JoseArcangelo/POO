import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args){
        
    Scanner sc = new Scanner(System.in);
    System.out.print("Informe os 9 primeiros numeros do cpf: ");
    String digitos_cpf = sc.next();

    for(int x = 10; x < 12; x++){
        int resultado = 0;
        int contador = x;

        for(int i = 0; i < digitos_cpf.length(); i++){
        char digito = digitos_cpf.charAt(i);
        int numero = digito - '0';

        resultado += numero * contador;
        contador--;
        }

        resultado = resultado % 11;
        if(resultado == 1 || resultado == 0){
            resultado = 0;
        }else{
            resultado = 11 - resultado;
        }
        System.out.print(resultado);
        digitos_cpf = digitos_cpf + resultado;
    }
}
}
