public class Produto{
    private String nome;
    private int quantidadeEstoque;
    private float preco;

    public String getNome() {
        return nome;
    }
    public double getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
    public float getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void adicionarEstoque(int quantidade) {
        this.quantidadeEstoque = quantidade;
        System.out.println("Produto adicionado ao estoque!");
    }

    public void  vender(int quantidade){
        if(quantidade > this.quantidadeEstoque){
            System.out.println("Quantidade em estoque insuficiente!");
            return;
        }
        this.quantidadeEstoque -= quantidade;
        System.out.println("Venda confirmada!");
        
    }

    public void setPreco(float preco) {
        if(preco <= 0){
            System.out.println("Preco invalido!");
            return;
        }
        this.preco = preco;
        System.out.println("Preco atualizado!");
    }

    public void mostar(){
        System.out.println("Produto: " + this.nome + 
        "\nPreco: " + this.preco +
        "\nQuantiade em estoque: " + this.quantidadeEstoque);
    }

    
    
}
