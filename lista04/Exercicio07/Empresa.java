import java.util.ArrayList;
import java.util.List;

public class Empresa {
  List<Funcionario> lista = new ArrayList<>();

  public void contratar_funcionario(Funcionario novo_funcionario){
    lista.add(novo_funcionario);
    System.out.println("Funcionario contratado!");
  }

  public void demitir_funcionario(String nome){
    for(int i = 0; i < lista.size(); i++){
      if (lista.get(i).nome == nome){
        lista.remove(i);
        System.out.println("Funcionario demitido!");
      }
    }
  }

  public void calcular_folha(){
    double resultado = 0;
    for(int i = 0; i < lista.size(); i++){
      resultado += lista.get(i).salario;
    }
    System.out.println("Folha de pagamento: R$" + resultado);
  }

}
