import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;


public class TratamentoDeExececoes {
    public static void main(String[] args) {

        try {
        // Criando o objeto Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Capturando os dados do usuário
        System.out.print("Digite seu nome: ");
        String nome = scanner.next();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("");

        // Imprimindo os dados capturados
        System.out.println("Olá, meu nome é " + nome.toUpperCase() + " " + sobrenome.toUpperCase() + ".");
        System.out.println("Tenho " + idade + " anos.");
        System.out.println("Minha altura é " + altura + " mts.");  
        scanner.close();
        }
        
        catch (InputMismatchException e){
            System.out.println("Os campos idade e altura devem ser números.");
            System.out.println("Para informar a altura, use ponto (.) ao invés de vírgula (,).");
        }
    }
    
}
