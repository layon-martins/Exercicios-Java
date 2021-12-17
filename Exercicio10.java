import java.util.Random;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) throws Exception{

      Scanner entrada = new Scanner(System.in);
      Random aleatorio = new Random();

      int num, chute, cont = 1;

      num = aleatorio.nextInt(101) + 1;

      System.out.println("TENTE ADIVINHAR UM NÚMERO DE 1 A 100: ");
      chute = entrada.nextInt();

      while(true){
          if (chute==num){
              System.out.println("PARABÉNS! VOCÊ DESCOBRIU EM "+ cont + " TENTATIVA(S)!");
              break;
          }
          else if (chute > num)
              System.out.println("O NÚMERO É MENOR! TENTE NOVAMENTE:");
          else
              System.out.println("O NÚMERO É MAIOR! TENTE NOVAMENTE:");
          
          chute = entrada.nextInt();
          cont++;
      }

      entrada.close();


    }
}
