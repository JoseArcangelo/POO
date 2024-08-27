public class Carro{
  String marca;
  String modelo;
  int ano;
  double kilometragem;

  public Carro(String marca, String modelo, int ano, double kilometragem){
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
    this.kilometragem = kilometragem;
  }

  public void mostrar(){
    System.out.println("\nMarca: " + marca + 
    "\nModelo: " + modelo + 
    "\nAno:  " + ano +
    "\nKilometragem: " + kilometragem);
  }


  public void alterarKilometragem(double nova_kilometragem){
    this.kilometragem = nova_kilometragem;
  }

  public void alterarKilometragem(double distancia_viajem, boolean True){
    this.kilometragem += distancia_viajem;
  }
}
