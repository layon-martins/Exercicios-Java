import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner(System.in);
        int n, menor = 0, maior = 0, soma=0, pares=0, impares=0;
        System.out.println("Digite um número: ");
        n = entrada.nextInt();
        int numeros[] = new int[n];
        System.out.println("Digite os números: ");
     
        for(int i =0;i<n;i++){
            numeros[i] = entrada.nextInt();
            if (i==0){
                menor = numeros[i];
                maior = numeros[i];
            }
            soma = soma + numeros[i];
            if((numeros[i] % 2) == 0)
                pares++;
            else
                impares++;
            if (numeros[i] < menor)
                menor = numeros[i];
            else if (numeros[i] > maior)
                maior = numeros[i];
        }
        
        System.out.println("O menor é: " + menor);
        System.out.println("O maior é: " + maior);
        System.out.println("A média é: "+ (soma/n));
        System.out.println(pares+" pares");
        System.out.println(impares+" impares");
        
        entrada.close();
    }
}
