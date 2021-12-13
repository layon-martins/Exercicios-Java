import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
      
        int numerador, denominador;
        double saida;

        System.out.println("Digite o numerador:");
        numerador = entrada.nextInt();

        System.out.println("Digite o denominador:");
        denominador = entrada.nextInt();

        if(denominador == 0)
            System.out.println("Erro! Divisão por 0!");
        else{
            saida = (double)numerador / (double)denominador;
            System.out.printf("O número real é: %.2f %n",saida); 
        }

        entrada.close();
    }
}
