public class ContaBancaria{
    private String titular;
    private float saldo;
    private int numeroConta;

    public String getTitular() {
        return titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(float saldo) {
        if (saldo < 0){
            System.out.println("Valor invalido!");
            return;
        }
        this.saldo = saldo;
        System.out.println("Valor depositado!");
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void depositar(float valor){
        this.saldo += valor;
    }

    public void sacar(float valor){
        if(valor > this.saldo){
            System.out.println("Saldo insuficiente");
            return;
        }
        this.saldo -= valor;
        System.out.println("Saque realizado com sucesso!");


    }

    public void mostrar(){
        System.out.println("Titular: " + titular + 
        "\nSaldo: " + saldo + 
        "\nNumero conta: " + numeroConta);
        System.out.println();
    }

    
}
