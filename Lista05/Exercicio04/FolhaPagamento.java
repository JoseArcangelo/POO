public class FolhaPagamento {
    public static void main(String[] args)
        { 
      main();
      }

      public static void ordenar(Funcionario[] vetFuncionarios){
        for(int x = 0; x < vetFuncionarios.length; x++){
          for(int y = x + 1; y < vetFuncionarios.length; y++){
            if(vetFuncionarios[y].calcularSalario() > vetFuncionarios[x].calcularSalario()){
              Funcionario aux = vetFuncionarios[x];
              vetFuncionarios[x] = vetFuncionarios[y];
              vetFuncionarios[y] = aux;
            }
          }
          
        }
      }

      public static void exibir(Funcionario[] vetFuncionarios){
        for(int i = 0; i < vetFuncionarios.length; i++){
          vetFuncionarios[i].exibir();
        }
      }

      public static void main(){
        Funcionario[] vetFuncionarios;
        vetFuncionarios = new Funcionario[]{
          new Funcionario(1, 160, 20, 10),
          new Funcionario(2, 150, 18, 5),
          new Funcionario(3, 170, 22, 8),
          new Funcionario(4, 180, 25, 12),
          new Funcionario(5, 160, 20, 7),
          new Funcionario(6, 165, 19, 6),
          new Funcionario(7, 175, 21, 9),
          new Funcionario(8, 160, 23, 11),
          new Funcionario(9, 155, 20, 4),
          new Funcionario(10, 162, 22, 10),
          new Funcionario(11, 168, 20, 8),
          new Funcionario(12, 158, 17, 3),
          new Funcionario(13, 172, 24, 14),
          new Funcionario(14, 167, 19, 6),
          new Funcionario(15, 169, 21, 7),
          new Funcionario(16, 163, 18, 4),
          new Funcionario(17, 171, 22, 9),
          new Funcionario(18, 159, 20, 5),
          new Funcionario(19, 174, 23, 10),
          new Funcionario(20, 160, 21, 8),
          new Funcionario(21, 155, 19, 2),
          new Funcionario(22, 178, 24, 13),
          new Funcionario(23, 167, 22, 7),
          new Funcionario(24, 164, 18, 4),
          new Funcionario(25, 170, 20, 9),
          new Funcionario(26, 161, 23, 11),
          new Funcionario(27, 173, 21, 6),
          new Funcionario(28, 157, 18, 3),
          new Funcionario(29, 169, 25, 12),
          new Funcionario(30, 162, 19, 5),
          new Funcionario(31, 176, 20, 9),
          new Funcionario(32, 166, 21, 7),
          new Funcionario(33, 158, 17, 4),
          new Funcionario(34, 180, 24, 14),
          new Funcionario(35, 159, 22, 6),
          new Funcionario(36, 175, 20, 8),
          new Funcionario(37, 163, 19, 5),
          new Funcionario(38, 172, 23, 10),
          new Funcionario(39, 168, 21, 9),
          new Funcionario(40, 154, 18, 3),
          new Funcionario(41, 179, 24, 12),
          new Funcionario(42, 165, 22, 5),
          new Funcionario(43, 160, 19, 6),
          new Funcionario(44, 170, 20, 7),
          new Funcionario(45, 156, 21, 8),
          new Funcionario(46, 177, 25, 15),
          new Funcionario(47, 164, 22, 4),
          new Funcionario(48, 158, 19, 3),
          new Funcionario(49, 174, 23, 11),
          new Funcionario(50, 161, 20, 9)
      };
    
      // exibir(vetFuncionarios);
        ordenar(vetFuncionarios);
        exibir(vetFuncionarios);

      }
}
