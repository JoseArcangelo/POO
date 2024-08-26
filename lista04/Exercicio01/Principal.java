
public class Principal {
    public static void main(String[] args)
    {
      Cliente cliente1 = new Cliente("Jose", "123456789-52", "Rua yhuasd");
      Cliente cliente2 = new Cliente("Ana", "987654321-54", "Rua hasdijni");

      ContaBancaria c1 = new ContaBancaria(123, 1500, cliente1);
      ContaBancaria c2 = new ContaBancaria(343, 2000, cliente2);

      c1.depositar(1000);
      c2.sacar(2000);

      c1.transferir(4000, c2);
  
    }
}
