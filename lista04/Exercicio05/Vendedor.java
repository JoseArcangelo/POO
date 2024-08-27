public class Vendedor extends Funcionario{
  double bonus_venda;

  public Vendedor(String nome, String cargo, double salario, double bonus_venda){
    super(nome, cargo, salario);
    this.bonus_venda = bonus_venda;
  }


  public void calc_salario(int total_vendas){
    double salario_total = salario + (bonus_venda * total_vendas);
    System.out.println("\nNome: " + nome + 
    "\nCargo: " + cargo + 
    "\nSalario: " + salario_total);
  }
  
}
