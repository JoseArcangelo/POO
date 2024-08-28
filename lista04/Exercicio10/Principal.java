public class Principal {
  public static void main(String[] args)
  {
    
    Jogador j1 = new Jogador("Jose", 20, 2500);
    Jogador j2 = new Jogador("Arcangelo", 15, 1800);
    Jogador j3 = new Jogador("Ana", 18, 2200);
    Jogador j4 = new Jogador("Pedro", 22, 2800);
    Jogador j5 = new Jogador("Maria", 19, 2450);
    Jogo jogo1 = new Jogo("VALORANT", "02/06/2020");
    
    jogo1.add_jogador(j1);
    jogo1.add_jogador(j2);
    jogo1.add_jogador(j2);
    jogo1.add_jogador(j3);
    jogo1.add_jogador(j4);
    jogo1.add_jogador(j5);
    jogo1.ranking();
  }
}
