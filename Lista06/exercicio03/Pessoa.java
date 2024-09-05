public class Pessoa{
    private String nome;
    private int idade;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if(idade >= 18){
            this.idade = idade;
            return;
        }
        System.out.println("Idade invalida!");
        
    }

    public void setCpf(String cpf) {
        if (this.cpf != null){
            System.out.println("O cpf nao pode ser alterado!");
           return;
        }
        this.cpf = cpf;
    }

    public void mostrar(){
        System.out.println("Nome: " + nome + 
        "\nIdade: " + idade + 
        "\ncpf: " + cpf);
    }

    

}
