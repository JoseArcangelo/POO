import java.util.ArrayList;
import java.util.List;

public class Biblioteca{
  List<Livro> lista;

  public Biblioteca() {
    this.lista = new ArrayList<>();
  }

  public void adicionar_livro(Livro novo_livro){
    this.lista.add(novo_livro);
    System.out.println("Livro adicionado!");
  }

  public void remover(String titulo) {
    for (int i = 0; i < lista.size(); i++) {
        if (lista.get(i).titulo.equals(titulo)) {
            lista.remove(i);
            System.out.println("Livro removido!");
            return; 
        }
    }
    System.out.println("Livro nao encontrado!");
  }

  public void buscarLivro(String autor, String titulo){
    for (int i = 0; i < lista.size(); i++) {
      if (lista.get(i).titulo.equals(autor) || lista.get(i).titulo.equals(autor)) {
          System.out.println("Livro encontrado!\n");
          lista.get(i).mostar();
          return; 
      }
    System.out.println("Livro nao encontrado!");
  }

  }
  
}
