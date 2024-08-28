import java.util.ArrayList;
import java.util.List;

public class Jogo {
  String nome;
  String data_lancamento;
  List<Jogador> lista;

  public Jogo(String nome, String data_lancamento){
    this.nome = nome;
    this.data_lancamento = data_lancamento;
    this.lista = new ArrayList<>();
  }

  public void add_jogador(Jogador novo_jogador){
    for(int i = 0; i < this.lista.size(); i++){
      if(this.lista.get(i).pontuacao < novo_jogador.pontuacao){
        this.lista.add(i, novo_jogador);
        System.out.println("Jogador adicionado com sucesso!");
        return;
      }
    }
    this.lista.add(novo_jogador);
    System.out.println("Jogador adicionado com sucesso!");
  }

  public void ranking(){
    System.out.println();
    for(int i = 0; i < this.lista.size(); i++){
      System.out.println("Jogador: " + this.lista.get(i).nome + " Pontuacao: " + this.lista.get(i).pontuacao);
    }

  }
}
