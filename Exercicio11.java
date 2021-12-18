import java.io.BufferedReader;
import java.io.FileReader;

public class Exercicio11 {
    public static void main(String[] args) throws Exception{
        
        String path = "Arquivos/file.txt", linha = "";
        int cont = 0;
        String[] dados;
        
        BufferedReader buffRead = new BufferedReader(new FileReader(path));

        while(true){
            if (linha!=null){
                System.out.println(linha);
            }else
                break;
            cont++;
            linha = buffRead.readLine();
            dados = linha.split(" ");
           
            

            
            
        }

        System.out.println("Número de pacientes: "+ cont/5);
        buffRead.close();

    }
}
