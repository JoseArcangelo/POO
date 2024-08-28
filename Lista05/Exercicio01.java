

public class Exercicio01 {
    public static void main(String[] args)
    {
        int[] matricula = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] nome = {"Joao", "Maria", "Pedro", "Clara", "Jose", "Carla", "Fabio", "Mara", "Cesar", "Ana"};
        int[] idade = {14, 18, 15, 16, 17, 14, 17, 13, 16, 17};
        double[] altura = {1.75, 1.54, 1.62, 1.60, 1.65, 1.62, 1.62, 1.74, 1.61, 1.68};

        
    classe_controle(nome, idade, altura);


    }
    public static void media_idade(int[] idade){
        double media = 0;
        for(int i = 0; i < idade.length; i++){
            media += idade[i];
        }
        media = media / 10;
        System.out.println("\nMedia dos alunos: " + media);
    }

    public static void alunos_mais_jovens(String[] nome, int[] idade){
        int[] mais_novos = {0, 1};
        
        for(int i = 2; i<idade.length; i++){
            if(idade[i] < idade[mais_novos[0]]){
                mais_novos[0] = i;
            } 
        }

        for(int i = 0; i<idade.length; i++){
            if(idade[i] < idade[mais_novos[1]] && i != mais_novos[0]){
                mais_novos[1] = i;
            } 
        }
        System.out.println("\nAlunos mais novos " + nome[mais_novos[0]] + " e " + nome[mais_novos[1]]);
    }

    public static void percentual_mais_16(int[] idade){
        double percentual = 0;
        for(int i = 0; i < idade.length; i++){
            if(idade[i] >= 16){
                percentual += 1;
            }
        }
        percentual = (percentual * 100) / idade.length;
        System.out.println("\nPercentual de alunos com mais de 16 anos: " + percentual + "%");

    }

    public static void idade_menos16_mais_media_altura(int[] idade, double[] altura){
        double media_altura = 0;

        for(int i = 0 ; i < altura.length; i++){
            media_altura += altura[i];
        }
        media_altura = media_altura / altura.length;

        int total_alunos = 0;
        for(int i = 0; i < idade.length; i++){
            if(idade[i] < 16 && altura[i] >= media_altura){
                total_alunos += 1;
            }
        }
        System.out.println("\nTotal alunos com mais de 16 anos e com altura maior que a media das alturas: " + total_alunos);


    }

    public static void classe_controle(String[] nome, int[] idade, double[] altura){
        media_idade(idade);
        alunos_mais_jovens(nome, idade);
        percentual_mais_16(idade);
        idade_menos16_mais_media_altura(idade, altura);
    }

}
