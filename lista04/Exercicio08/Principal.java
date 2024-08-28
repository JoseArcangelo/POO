public class Principal {
  public static void main(String[] args)
  {
    Pedidos p1 = new Pedidos(0001, "29/08/2024");

    ItemPedido i1 = new ItemPedido("Canetas", 10, 2.50);
    
    p1.adicionar_item(i1);
    p1.mostrar();


    p1.calc_valor_total();
    p1.remover_item("Canetas");
    p1.mostrar();

  }
}
