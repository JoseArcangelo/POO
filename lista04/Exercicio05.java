public class Principal {
    public static void main(String[] args)
    {
      Funcionario f1 = new Funcionario("Jose", "Estagiario", 1000);
      Gerente g1 = new Gerente("Arcangelo", "Gerente", 3000, 500);
      Vendedor v1 = new Vendedor("Garlet", "Vendedor", 2000, 100);

      f1.calc_salario();
      g1.calc_salario();
      v1.calc_salario(10);



    }
}
