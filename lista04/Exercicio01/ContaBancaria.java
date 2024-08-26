public class ContaBancaria{
  int numero_conta;
  double saldo;
  Cliente cliente;

  public ContaBancaria(int numeroConta, double saldo,  Cliente cliente) {
      this.numero_conta = numeroConta;
      this.cliente = cliente;
      this.saldo = saldo;
  }

  public void mostrar(){
    System.out.println("Saldo atual " + this.saldo);
  }

  public void depositar(double valor) {
    this.saldo += valor;
    mostrar();
  }

  public void sacar(double valor) {
    if(valor > this.saldo) {
      System.out.println("SALDO INSUFICIENTRE!");
    }
    else{
      this.saldo -= valor;
      mostrar();
    }
  }

  public void transferir(double valor, ContaBancaria receber){
    if(valor > this.saldo) {
      System.out.println("SALDO INSUFICIENTRE!");
    }
    else{
      this.saldo -= valor;
      receber.depositar(valor);
      System.out.println("TRANSFERENCIA REALIZADA COM SUCESSO!");
    }

    }
    
}
