public class Funcionario{
  int codigo;
  float quantidadeHoras;
  float valorHora;
  float valorSalario;
  float quantidadeHorasExtras;

  public Funcionario(int codigo, float quantidadeHoras, float valorHora, float quantidadeHorasExtras){
    this.codigo = codigo;
    this.quantidadeHoras = quantidadeHoras;
    this.valorHora = valorHora;
    this.valorSalario = 0;
    this.quantidadeHorasExtras = quantidadeHorasExtras;
  }

  public double calcularHoraExtra(){
    double hora_extra = this.quantidadeHorasExtras * (this.valorHora * 1.5);
    return hora_extra;
  }

  public float calcularSalario(){
    double valor_total = this.valorHora * this.quantidadeHoras + calcularHoraExtra();
    this.valorSalario = (float) valor_total;
    return (float) valor_total;
  }

  public void exibir(){
    System.out.println("CODIGO FUNCIONARIO: " + this.codigo + 
    "\nSalario do funcionario: " + calcularSalario() + 
    "\nQuantidade de Horas trabalhadas: " + quantidadeHoras + 
    "\nQuantidade de Horas extras trabalhadas: " + quantidadeHorasExtras);
    System.out.println();
  }
  

}
