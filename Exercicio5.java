import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args){

      Scanner entrada = new Scanner(System.in);

      int dia, mes;

      String meses[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio","Junho",
        "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

      System.out.println("Digite o dia e o número do mês de seu aniversário: ");
      dia = entrada.nextInt();
      mes = entrada.nextInt();

     
      if ((mes==2)&&((dia>0)&&(dia<=29)))
         System.out.println("Data válida! O mês é "+ meses[mes-1]);
      else if (((dia>0)&&(dia<=30))&&((mes==4)||(mes==6)||(mes==9)||(mes==11)))
         System.out.println("Data válida! O mês é "+ meses[mes-1]);
      else if (((dia>0)&&(dia<=31))&&((mes==3)||(mes==5)||(mes==7)||(mes==8)||(mes==10)||(mes==12)))
         System.out.println("Data válida! O mês é "+ meses[mes-1]);
      else
      System.out.println("Data inválida");
      
      entrada.close();  

    }
      

}

