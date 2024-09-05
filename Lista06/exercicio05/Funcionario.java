public class Funcionario{
    private String nome;
    private double salario;
    private String cargo;

    public void setSalario(double salario) {
        this.salario = salario;
    }

    

    public void setNome(String nome) {
        this.nome = nome;
    }



    public void setCargo(String cargo) {
        this.cargo = cargo;
    }



    public void aumentarSalario(double percentaul){
        double valor_necessario = (20 * this.salario) / 100;
        double valor_aumento = (percentaul * this.salario) / 100;

        if(valor_aumento < valor_necessario){
            System.out.println("Aumento invalido!");
            return;
        }
        this.salario += valor_aumento;

    }

    public void mostrar(){
        System.out.println("Nome: " + this.nome + "\nCargo: " + this.cargo + "\nSalario: " + this.salario);
    }
    
}
