public class Veiculo {
  String marca;
  String modelo;
  String ano;
  Motor motor;

  public Veiculo(String marca, String modelo, String ano, Motor motor){
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
    this.motor = motor;
  }

  public void ligar_motor(){
    if(this.motor.estado == "Desligado"){
      this.motor.estado = "Ligado";
      System.out.println("O motor foi ligado!");
      return;
    }
    System.out.println("O motor ja esta ligado!");

  }

  public void desligar_motor(){
    if(this.motor.estado == "Ligado"){
      this.motor.estado = "Desligado";
      System.out.println("O motor foi desligado!");
      return;
    }
    System.out.println("O motor ja esta desligado!");
  }

  public void mostrar(){
    System.out.println("\nMarca: " + this.marca + 
    "\nModelo: " + this.modelo + 
    "\nAno: " + this.ano + 
    "\n::MOTOR::" + 
    "\nPotencia: " + this.motor.potencia +
    "\nTipo de combustivel: " + this.motor.tipo_combustivel + 
    "\nEstado: " + this.motor.estado);
  }
  
}
