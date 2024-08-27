public class Livro{
  String titulo;
  String autor;
  String ano_publicacao;

  public Livro(String titulo, String autor, String ano_publicacao){
    this.titulo = titulo;
    this.autor = autor;
    this.ano_publicacao = ano_publicacao;
  }


  public void mostar(){
    System.out.println("Titulo: " + this.titulo  + "\nAutor: " + this.autor + "\nAno de publicacao: " + this.ano_publicacao);
  }




}
