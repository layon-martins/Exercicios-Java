import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) throws Exception{

      Scanner entrada = new Scanner(System.in);
      
      String comando;
      int a, b;

      comando = entrada.nextLine();
      String[] termos = comando.split(" ");
      a = Integer.parseInt(termos[1]);
      b = Integer.parseInt(termos[3]);
      
      switch (termos[0]) {
          case "MULTIPLICA":
              System.out.println("RESPOSTA: "+(a*b));
              break;
          case "DIVIDE":
              if(b == 0)
                  System.out.println("ERRO! DIVISAO POR 0!");
              else
                  System.out.println("RESPOSTA: "+(a/b));
              break;
          case "SOMA":
              System.out.println("RESPOSTA: "+(a+b));
              break;
          case "SUBTRAI":
              System.out.println("RESPOSTA: "+(b-a));
              break;
          default:
          System.out.println("COMANDO NÃO ENCONTRADO ,TENTE NOVAMENTE!");
      }

      entrada.close();
    }
}
