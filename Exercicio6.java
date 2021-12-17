import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) throws Exception{
        Scanner entrada = new Scanner(System.in);
        int tempo[] = new int[6], horario1 = 0, horario2 = 0;
        System.out.println("Digite as horas, minutos e segundos dos dois horários: ");

        for (int i=0; i<6; i++)
            tempo[i] = entrada.nextInt();
        
        horario1 = (tempo[0]*3600) + (tempo[1]*60) + tempo[2];
        System.out.println(horario1);
        horario2 = (tempo[3]*3600) + (tempo[4]*60) + tempo[5];
        System.out.println(horario2);

        System.out.println("A diferença é: "+(horario1 - horario2));
           
        entrada.close();
    }
}
