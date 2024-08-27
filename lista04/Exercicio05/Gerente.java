public class Gerente extends Funcionario{
  double bonus;

  public Gerente(String nome, String cargo, double salario, double bonus) {
    super(nome,cargo, salario);
    this.bonus = bonus;
  }

  public void calc_salario(){
    double salario_total = salario + bonus;
    System.out.println("\nNome: " + nome + 
    "\nCargo: " + cargo + 
    "\nSalario: " + salario_total);
  }
}
