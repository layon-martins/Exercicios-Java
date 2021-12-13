import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        double salario, valorEmprestimo;

        System.out.println("Digite o valor do seu salário:");
        salario = entrada.nextDouble();

        System.out.println("Digite o valor do empréstimo:");
        valorEmprestimo = entrada.nextDouble();

        if((valorEmprestimo)>(0.30*salario))
            System.out.println("Valor fora da margem de empréstimo, tente novamente");
        else
            System.out.println("Você pode fazer o empréstimo :)");
        
        entrada.close();
    }

}
