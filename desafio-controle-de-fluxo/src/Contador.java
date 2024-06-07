import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        // Solicita o primeiro parâmetro ao usuário
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        
        // Solicita o segundo parâmetro ao usuário
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            // Chama o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            // Imprime a mensagem de erro caso a exceção seja lançada
            System.out.println(exception.getMessage());
        }

        // Fecha o scanner
        terminal.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Verifica se o primeiro parâmetro é maior que o segundo
        if (parametroUm > parametroDois) {
            // Lança a exceção personalizada com a mensagem apropriada
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        // Calcula a quantidade de interações
        int contagem = parametroDois - parametroUm;

        // Realiza a contagem e imprime os números incrementados
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
