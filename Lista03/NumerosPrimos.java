
public class NumerosPrimos {
    public static void main(String[] args)
    {
    int n = 0;
    int contador = 1;
    while(n <= 10){
      contador += 1;

      boolean e_primo = true;
      for(int i = contador - 1; i > 1; i--){
        if(contador % i == 0){
          e_primo = false;
        }

      }
      if(e_primo == true){
        System.out.println(contador);
        n +=1;
        
      }
        
    }
 
  }
}
