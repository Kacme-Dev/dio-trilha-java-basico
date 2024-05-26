import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Exibir mensagem ao usuáro
        System.out.println("---------------------------------------------------------");
        System.out.println("|                                                       |");
        System.out.println("| Olá, bem vindo ao nosso sistema de cadastro bancário. |");
        System.out.println("| Informe os dados solicitados para efetuar o cadastro. |");
        System.out.println("| Ao inserir um novo dado, pressione ENTER!             |");
        System.out.println("|                                                       |");
        System.out.println("---------------------------------------------------------");

        //Captar pela calsse Scanner os dados do usuário digitados no terminal
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine(); //O scanner.nextLine() permite que o usuário digite o nome completo, caso queira
        System.out.print("Nome/Banco: ");
        String nomeBanco = scanner.next();
        System.out.print("Agência nº: ");
        String agencia = scanner.next();
        int numeroConta = 1021;
        double saldoConta = 237.48;
        System.out.println("");        

        //Exibir a mensagem da conta criada
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco "  + nomeBanco + ", sua agência é nº " + agencia + ", sua conta é a nº " +numeroConta + " e seu saldo de R$ " + saldoConta + " reais já está disponível para saque!");
    }
}
