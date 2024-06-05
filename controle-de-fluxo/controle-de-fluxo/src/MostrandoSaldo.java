import java.util.Scanner;

public class MostrandoSaldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 50;
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Exibir saldo");
            System.out.println("0 - Sair");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Ler o valor a ser depositado e atualizar/imprimir o saldo
                    System.out.print("Digite o valor a ser depositado: ");
                    double deposito = scanner.nextDouble();
                    if(deposito > 0){
                        saldo += deposito;
                        System.out.println("Depósito realizado com sucesso!");
                    } else {
                        System.out.println("Valor de depósito inválido.");
                    }
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    // Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente
                    System.out.print("Digite o valor a ser sacado: ");
                    double saque = scanner.nextDouble();
                    if(saque > 0 && saque <= saldo){
                        saldo -= saque;
                        System.out.println("Saque realizado com sucesso!");
                    } else if (saque > saldo) {
                        System.out.println("Saldo insuficiente!");
                    } else {
                        System.out.println("Valor de saque inválido.");
                    }
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 3:
                    // Exibir o saldo atual da conta
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 0:
                    // Encerrar o programa
                    System.out.println("Programa encerrado.");
                    continuar = false;
                    break;
                default:
                    // Opção inválida
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
    
}
