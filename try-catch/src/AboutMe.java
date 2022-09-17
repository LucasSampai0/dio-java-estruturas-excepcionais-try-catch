import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
public class AboutMe {
    public static void main(String[] args) throws Exception {
      
        //O bloco inteiro é submetido a uma exceção
        try{
        
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Digite seu nome: ");
        String nome = sc.next();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = sc.next();

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.print("Digite sua altura: ");
        double altura = sc.nextDouble();


        //Imprimindo os dados obtidos pelo usuario
        System.out.println("Ola, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + "cm");
       
       
        sc.close();
        }
        //exceção pré-existente na biblioteca de exceções Java
        //reconhece se um dado de determinado tipo foi inserido
        //erroneamente, lança uma exceção.
        catch(InputMismatchException e ){
            System.out.println("Os campos idade e altura precisam ser numéricos!"
            +"\n Utilize ponto (.) para separar a altura");
        }
    }
}
