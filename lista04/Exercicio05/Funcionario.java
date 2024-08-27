public class Funcionario {
  String nome;
  String cargo;
  double salario;

  public Funcionario(String nome, String cargo, double salario){
    this.nome = nome;
    this.cargo = cargo;
    this.salario = salario;
  }

  public void calc_salario(){
    double salario_total = salario;
    System.out.println("Nome: " + nome + 
    "\nCargo: " + cargo + 
    "\nSalario: " + salario_total);
  }

  
  
}
