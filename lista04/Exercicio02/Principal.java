

public class Principal {
    public static void main(String[] args)
    {
      Disciplina d1 = new Disciplina("Poo", 10);
      Disciplina d2 = new Disciplina("Banco de dados", 4);
      
      Aluno a1 = new Aluno("Jose", 123);
      a1.matricula(d1);
      a1.matricula(d2);
      a1.media();

    }
}
