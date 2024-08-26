import java.util.ArrayList;

public class Aluno{
  String nome;
  int matricula;
  ArrayList<Disciplina> lst;


  public Aluno(String nome, int matricula){
    this.nome = nome;
    this.matricula = matricula;
    this.lst = new ArrayList<>();

  }

  public void matricula(Disciplina novaDisciplina){
    this.lst.add(novaDisciplina);
    System.out.println("Matricula realizada com sucesso!");
  }
  
  public void media(){
    double media = 0;
    for(int i = 0; i < this.lst.size(); i++){
      media += this.lst.get(i).nota;
    }
    media = media / this.lst.size();
    System.out.println(media);
  }
}
