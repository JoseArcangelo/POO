
public class Principal {
    public static void main(String[] args){
        Funcionario f1 = new Funcionario();
        f1.setCargo("Gerente");
        f1.setNome("Jorginho");
        f1.setSalario(1000);
        f1.mostrar();

        f1.aumentarSalario(20);
    }   
}
