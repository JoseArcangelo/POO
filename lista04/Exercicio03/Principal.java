public class Principal {
    public static void main(String[] args)
    {
      Produto p1 = new Produto("caneta", 5.50, 500);
      p1.adicionar_produtos(100);
      p1.mostrar();

      p1.remover_produtos(800);
      p1.mostrar();

      p1.ajustar_preco(100);
      p1.mostrar();


    }
}
