//Exercicio 23 
//23.Uma pessoa quer enviar cartões natalinos, para isso ela precisa comprar envelopes e selos adicionais, pois os
// que ela já possui não serão suficientes. O custo do envelope é 5 centavos e o custo do selo é 12 centavos. Fazer
// um algoritmo que leia quantos envelopes, quantos selos e quanto dinheiro a pessoa possui, calculando e
// escrevendo a quantidade máxima de cartas que ela conseguirá enviar, e quantos envelopes ou selos irão sobrar.
// Não é permitido converter selos em envelopes ou dinheiro, nem envelopes em selos ou dinheiro.
import java.util.Scanner;

public class Cartoes {
    public static void main(String[] args)
        { 
        Scanner sc = new Scanner(System.in);  

        System.out.print("Informe q quantidade de envelopes: ");
        int qnt_envelopes = sc.nextInt();
        
        System.out.print("Informe q quantidade de selos: ");
        int qnt_selos = sc.nextInt();

        System.out.print("Informe q quantidade de denheiro: ");
        double qnt_dinheiro = sc.nextDouble();
        
        double valor_selos = qnt_selos * 0.05;
        double valor_envelopes = qnt_envelopes * 0.12;
        
        double valor_total = valor_selos + valor_envelopes;

        if(valor_total > qnt_dinheiro){
          System.out.println("DINHEIRO INSUFICIENTE!");
        }

        int envelopes_sobra = 0;
        int selos_sobra = 0;
        int qnt_cartoes = 0;
        if(qnt_envelopes > qnt_selos) {
          envelopes_sobra = qnt_envelopes - qnt_selos;   
          qnt_cartoes = qnt_selos;
        }
        else{
          selos_sobra = qnt_selos - qnt_envelopes;
          qnt_cartoes = qnt_envelopes;
        }

        System.err.println("");
        System.out.print("Poderam ser enviadas " + qnt_cartoes + " cartoes.");
        System.out.println("Sobraram " + envelopes_sobra + " envelopes e " + selos_sobra + " selos." );

        sc.close();  
      }
        

}
