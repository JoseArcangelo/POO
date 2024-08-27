import java.util.Scanner;


public class Principal {
    public static void main(String[] args)
    {
      Biblioteca biblioteca = new Biblioteca();
      Livro l1 = new Livro("Titulo", "Autor","29/09/2003");
      biblioteca.adicionar_livro((l1));
      
      Scanner sc = new Scanner(System.in);

      System.out.print("Informe o titulo do livro para remover: ");
      String nome = sc.next();

      biblioteca.remover(nome);

      System.out.print("Informe o titulo do livro para buscar: ");
      String titulo = sc.next();

      System.out.print("Informe o autor do livro para busacar: ");
      String autor = sc.next();

      biblioteca.buscarLivro(titulo, autor);


    }
}
