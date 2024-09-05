
public class Principal {
    public static void main(String[] args){
        ContaBancaria c1 = new ContaBancaria();
        c1.setNumeroConta(01);
        c1.setSaldo(1000);
        c1.setTitular("Jose");
        c1.mostrar();
        c1.depositar(1000);

        c1.sacar(1000);
        c1.mostrar();


    }   
}
