
public class Principal {
    public static void main(String[] args){
        Produto p1 = new Produto();
        p1.setNome("Caneta");
        p1.setPreco(0);
        p1.adicionarEstoque(40);
        p1.vender(50);
        p1.mostar();



    }   
}
