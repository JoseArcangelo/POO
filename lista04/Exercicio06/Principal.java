public class Principal {
  public static void main(String[] args)
  {
    Carro c1 = new Carro("Toyota", "Corolla", 2020, 15000.0);
    c1.alterarKilometragem(20000.0);
    c1.mostrar();
    
    c1.alterarKilometragem(100, true);
    c1.mostrar();
  }
}
