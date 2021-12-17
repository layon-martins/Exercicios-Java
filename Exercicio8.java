import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) throws Exception{

      Scanner entrada = new Scanner(System.in);

      ArrayList<Integer> numeros = new ArrayList<Integer>();
      String numero ="";
      
      while(true){
            numero = entrada.next();
            if(numero.equals("fim")){
                System.out.println("Fim de entradas");
                break;
            }
            numeros.add(Integer.parseInt(numero));
          }
          
        Collections.sort(numeros); 

         for(int i = 0; i< numeros.size(); i++){
            System.out.println(numeros.get(i));
        }


      entrada.close();
    }
}
