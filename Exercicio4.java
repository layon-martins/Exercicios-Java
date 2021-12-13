import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int mes;
        String meses[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio","Junho",
        "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        System.out.println("Digite o número referente ao mês desejado:");
        mes = entrada.nextInt();

        if ((mes>=1) && (mes<=12))
            System.out.println("O mês é: "+meses[mes-1]);
        else
            System.out.println("Não existe mês "+mes+" no calendário gregoriano.");

        entrada.close();

    }
}
