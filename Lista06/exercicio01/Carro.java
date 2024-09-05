public class Carro{
    private String marca;
    private String modelo;
    private int ano;
    private float preco;

    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getAno() {
        return ano;
    }
    public float getPreco() {
        return preco;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public void setPreco(float preco) {
        if (preco < 0){
            System.out.println("Valor abaixo de 0");
            return;
        }
        this.preco = preco;
    }
    
    public void mostrar() {
        System.out.println("Carro marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", preco=" + preco);
    }

        

    
    

}
