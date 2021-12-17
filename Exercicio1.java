import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) throws Exception{

        Scanner entrada = new Scanner(System.in);

        int anoNascimento, anoAtual, idade;

        System.out.println("Digite o ano de seu nascimento:");
        anoNascimento = entrada.nextInt();

        System.out.println("Digite o ano atual:");
        anoAtual = entrada.nextInt();

        idade = anoAtual - anoNascimento;
        System.out.print("A sua idade é: "+idade+" anos");

        entrada.close();
    }
}
