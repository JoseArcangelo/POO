public class Principal {
  public static void main(String[] args)
  {
    Motor m1 = new Motor("150cv", "Gasolina", "Ligado");
    Veiculo meu_carro = new Veiculo("Toyota", "Corolla", "2020", m1);

    meu_carro.ligar_motor();


    meu_carro.desligar_motor();

    meu_carro.mostrar();


  }
}
